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
    'http://localhost:8080/SFear/webresources/restaurants/get/1',
    'http://localhost:8080/SFear/webresources/restaurants/get/2',
    'http://localhost:8080/SFear/webresources/restaurants/get/3',
    'http://localhost:8080/SFear/webresources/restaurants/get/4',
    'http://localhost:8080/SFear/webresources/restaurants/get/5',
    'http://localhost:8080/SFear/webresources/restaurants/get/6',
    'http://localhost:8080/SFear/webresources/restaurants/get/7',
    'http://localhost:8080/SFear/webresources/restaurants/get/8',
    'http://localhost:8080/SFear/webresources/restaurants/get/9',
    'http://localhost:8080/SFear/webresources/restaurants/get/10',
    'http://localhost:8080/SFear/webresources/restaurants/get/11',
    'http://localhost:8080/SFear/webresources/restaurants/get/12',
    'http://localhost:8080/SFear/webresources/restaurants/get/13',
    'http://localhost:8080/SFear/webresources/restaurants/get/14',
    'http://localhost:8080/SFear/webresources/restaurants/get/15',
    'http://localhost:8080/SFear/webresources/restaurants/get/16',
    'http://localhost:8080/SFear/webresources/restaurants/get/17',
]
urlpost = [
    'http://localhost:8080/SFear/webresources/restaurants/post/1',
    'http://localhost:8080/SFear/webresources/restaurants/post/2',
    'http://localhost:8080/SFear/webresources/restaurants/post/3',
    'http://localhost:8080/SFear/webresources/restaurants/post/4',
    'http://localhost:8080/SFear/webresources/restaurants/post/5',
    'http://localhost:8080/SFear/webresources/restaurants/post/6',
    'http://localhost:8080/SFear/webresources/restaurants/post/7',
    'http://localhost:8080/SFear/webresources/restaurants/post/8',
    'http://localhost:8080/SFear/webresources/restaurants/post/9',
    'http://localhost:8080/SFear/webresources/restaurants/post/10',
    'http://localhost:8080/SFear/webresources/restaurants/post/11',
    'http://localhost:8080/SFear/webresources/restaurants/post/12',
    'http://localhost:8080/SFear/webresources/restaurants/post/13',
    'http://localhost:8080/SFear/webresources/restaurants/post/14',
    'http://localhost:8080/SFear/webresources/restaurants/post/15',
    'http://localhost:8080/SFear/webresources/restaurants/post/16',
    'http://localhost:8080/SFear/webresources/restaurants/post/17',
]


def splitter(datas):
    return datas.split(" ")


def main(datar):
    datum = splitter(datar)
    status = requests.post(urlpost[int(datum[0])], headers=content, data=datum[1])
    print(status.json())

while 1:
    data = arduino.readline()
    if data:
        print(data)
        main(data)
    if (time.time()-start) % 120 == 0:
        status_rest = [requests.get(ge) for ge in urlget]
        for stat in status_rest:
            arduino.write(str(stat))
