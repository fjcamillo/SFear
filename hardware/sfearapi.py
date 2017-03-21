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
    return statusKitchen, statusLiving, statusBedRoom, statusCR


def main(data):
    datum = splitter(data)
    status = requests.post(urlpost[int(datum[0])], headers=content, data=datum[1])




while 1:
    data = arduino.readline()
    if data:
        print(data)
        main(data)
    if (time.time()-start)%120 == 0:
        sk, sl, sb, scr = getData()
        arduino.write(str(sk))
        arduino.write(str(sl))
        arduino.write(str(sb))
        arduino.write(str(scr))