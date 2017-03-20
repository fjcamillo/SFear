import json
from pprint import pprint
import serial

ports = ['COM1', 'ttyACM0']
baudrate = [9600]
arduino = serial.Serial(ports[1], baudrate[0], timeout=.1)
urls = [
    'http://localhost:8080/SFear/webresources/houses/get/kitchen',
    'http://localhost:8080/SFear/webresources/houses/get/living',
    'http://localhost:8080/SFear/webresources/houses/get/bedroom',
    'http://localhost:8080/SFear/webresources/houses/get/cr',
]

def splitter(data):
    return data.split(" ")

def main(data):
    datum = splitter(data)

while 1:

    if arduino.readline():
        main()