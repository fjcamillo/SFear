import json
from pprint import pprint
import serial
import requests
import time

start = time.time()

ports = ['COM1', '/dev/ttyACM0']
baudrate = [9600]
content = {"Content-type": "application/json"}
arduino = serial.Serial(ports[1], baudrate[0], timeout=.1)
urlget = [
    'http://localhost:8080/SFear/webresources/houses/get/kitchen',
    'http://localhost:8080/SFear/webresources/houses/get/living',
    'http://localhost:8080/SFear/webresources/houses/get/bedroom',
    'http://localhost:8080/SFear/webresources/houses/get/cr',
]
urlpost = [
    'http://localhost:8080/SFear/webresources/houses/post/kitchen',
    'http://localhost:8080/SFear/webresources/houses/post/living',
    'http://localhost:8080/SFear/webresources/houses/post/bedroom',
    'http://localhost:8080/SFear/webresources/houses/post/cr',
]

def splitter(data):
    return data.split(" ")

def getData():
    statusKitchen = requests.get(urlget[0])
    statusLiving = requests.get(urlget[1])
    statusBedRoom = requests.get(urlget[2])
    statusCR = requests.get(urlget[3])
    # datum = []
    return statusKitchen.json()["data"], statusLiving.json()["data"], statusBedRoom.json()["data"], statusCR.json()["data"]


def main(data):
    datum = splitter(data)
    status = requests.post(urlpost[int(datum[0])], headers=content, data=datum[1])


datum = "off"

while 1:
    print(arduino.readline()[:-2])
    # if data:
    #     print(data)
    #     main(data)
    sk, sl, sb, scr = getData()

    arduino.write(str(sk))
    print(sk)
    time.sleep(1)
    arduino.write(str(sl))
    print(sl)
    time.sleep(1)
    arduino.write(str(sb))
    print(sb)
    time.sleep(1)
    arduino.write(str(scr))
    print(scr)
    time.sleep(1)

    # datum = [sk, sl, sb, scr]

    for i in urlpost:
        status = requests.post(i, headers=content, data=datum)
        time.sleep(.25)
        print(status)
    if datum == "on":
        datum = "off"
    else:
        datum = "on"

    # if (time.time()-start)%60 == 0:

    time.sleep(1)