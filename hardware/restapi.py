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

content = {"Content-type":"application/json"}

def getData(url):
    status = requests.get(url)

    # if status ==
    
def postData(data):
    status = requests.post(url, headers=content, data=data)

def main():
    pass

while 1:
    main()
