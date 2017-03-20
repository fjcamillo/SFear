import requests
import json
from pprint import pprint
import serial

ports = [
    'COM1',
    'ttyACM0'
]

baudrate = [
    9600
]


arduino = serial.Serial(ports[1], baudrate[0], timeout=.1)


urlget = 'http://localhost:8080/SFear/webresources/changes/get'
urlpost = 'http://localhost:8080/SFear/webresources/changes/post'
content = {"Content-type": "application/json"}

houselights = [


]

def splitter(data):
    return data.split(" ")

def getData(url):
    status = requests.get(url)

    # if status ==
    
def postData(data):
    status = requests.post(houselights, headers=content, data=data)

def main(data):
    datum=splitter(data)

    

while 1:
    if arduino.readline:
        main()
