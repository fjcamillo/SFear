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

urls = [

]