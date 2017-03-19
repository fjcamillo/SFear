import requests

status = requests.get('http://localhost:8080/SFear/webresources/test')
print(status.json())
