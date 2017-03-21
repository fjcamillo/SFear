
int rooms[] = {0,1,2,3};
String signals[] = {"on", "off"};

void setup() {
  // put your setup code here, to run once:
Serial.begin(9600);
pinMode(rooms[0], OUTPUT);
pinMode(rooms[1], OUTPUT);
pinMode(rooms[2], OUTPUT);
pinMode(rooms[3], OUTPUT);
}

void loop() {
  // put your main code here, to run repeatedly:
  debugger();
}

void debugger(){
  Serial.println("0 on");
  delay(2000);
  Serial.println("0 off");
  delay(2000);  
}

void readFromSerial(){
  
}

void printToSerial(roomnumber, signal){
  
}
