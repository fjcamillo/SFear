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

def getData(url):
    status = requests.get(url)

    # if status ==

def postData():
    pass

def main():
    pass

while 1:
    main()
