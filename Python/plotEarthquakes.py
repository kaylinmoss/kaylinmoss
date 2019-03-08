import urllib.request
import cTurtle
 
#int, int, int, int, int, int -> boolean
def dateLessThan(month1,day1,yr1,month2,day2,yr2):
    """Returns true if first date comes before second date"""
    return ((yr1 < yr2) or ((yr1 == yr2) and (month1 < month2))
        or (yr1 == yr2) and (month1 == month2) and (day1 < day2))

#str, str, str -> boolean
def betweenDates(date1,date2,date3): 
    """Returns true if first date is on/after the second date, and
     before the third date"""

    date1month = int(date1[5:7])
    date1day = int(date1[8:10])
    date1yr = int(date1[0:4])

    date2month = int(date2[5:7])
    date2day = int(date2[8:10])
    date2yr = int(date2[0:4])

    date3month = int(date3[5:7])
    date3day = int(date3[8:10])
    date3yr = int(date3[0:4])

    return (not dateLessThan(date1month,date1day,date1yr,date2month,date2day,date2yr) and
            dateLessThan(date1month,date1day,date1yr,date3month,date3day,date3yr))


#str. str, -> list of list of num
def parseEarthquakeData(date1,date2):
    """If an earthquake's date is between date1, and date2, return a list of lists of nums.
    Each num represents the earthquale's latitude, longitude, magnitude, and depth"""
    allData = []
    finalData = []
    
    data = urllib.request.urlopen("http://www.choongsoo.info/teach/mcs177-sp12/projects/earthquake/earthquakeData-02-23-2012.txt")
    data.readline().decode("ascii")
    
    for line in data:
        decodedLine = line.decode("ascii")
        allData.append(decodedLine.split(","))
    
    finalData = [allData[i] for i in range(len(allData)) if (betweenDates(allData[i][0],date1,date2))]
            
    for i in range(len(finalData)):
        finalData[i].pop(0)
        finalData[i].pop(0)
        finalData[i][3] = finalData[i][3].strip()
     
    return finalData

#num -> str
def colorCode(depth):
    """Returns an Earthquake's corresponding color for its depth"""
    color = ""
    if(depth >= 0 and depth <= 33):
        color = "orange"
    elif(depth >= 34 and depth <= 70):
        color = "yellow"
    elif(depth >= 71 and depth <= 150):
        color = "green"
    elif(depth >= 151 and depth <= 300):
        color = "blue"
    elif(depth >= 301 and depth <= 500):
        color = "purple"
    elif(depth >= 501 and depth <= 900):
        color = "red"
    return color

#str, str -> void
def plotEarthquakeData(date1, date2):
    """Plots all earthquake data from USGS between given dates on a map """
    myTurtle = cTurtle.Turtle()
    myTurtle.bgpic("worldmap.gif")
    data = parseEarthquakeData(date1,date2)    
    myTurtle.setWorldCoordinates(-180,-90,180,90)
    myTurtle.speed(10)
    myTurtle.hideturtle()
    myTurtle.up()
    
    for eachList in data:
        latitude = float(eachList[0])
        longitude = float(eachList[1])
        magnitude = float(eachList[2])
        depth = float(eachList[3])
    
        myTurtle.goto(longitude,latitude)
        myTurtle.dot(4 * magnitude,colorCode(depth))


def main():
    try:
        date1, date2 = input("Enter two dates in the format YYYY/MM/DD, with a space between each date: ").split()
        plotEarthquakeData(date1,date2)
    except:
        print("Invalid input")

##try:
##    main()
##except:
##    print("Invalid input")
main()
