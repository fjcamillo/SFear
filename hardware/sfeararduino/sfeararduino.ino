
int rooms[] = {0,1,2,3};
String signals[] = {"on", "off"};

String firstnum, secondnum;

void setup() {
  // put your setup code here, to run once:
Serial.begin(9600);
pinMode(rooms[0], OUTPUT);
pinMode(rooms[1], OUTPUT);
pinMode(rooms[2], OUTPUT);
pinMode(rooms[3], OUTPUT);
}

void loop() {
//   firstnum = Serial.readString(); 
//   firstnum = Serial.readStringUntil(" ");
//   Serial.read();
//   secondnum = Serial.readStringUntil("\n");
//   Serial.println("Hi: "+firstnum +","+ secondnum);
//   Serial.println(firstnum);
  if(Serial.available()>0){
    firstnum = Serial.read();
    Serial.println(firstnum);     
  }     
  
     
  if(secondnum=="off"){
    digitalWrite(rooms[firstnum.toInt()],LOW);
    }
  if(secondnum=="on"){
    digitalWrite(rooms[firstnum.toInt()],HIGH);
    }

}

void debugger(){
  Serial.println("0 on");
  delay(2000);
  Serial.println("0 off");
  delay(2000);  
  digitalWrite(rooms[0], HIGH);
digitalWrite(rooms[1], HIGH);
digitalWrite(rooms[2], HIGH);
digitalWrite(rooms[3], HIGH);
}

void readFromSerial(){
 
}



