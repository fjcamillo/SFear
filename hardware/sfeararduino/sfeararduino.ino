
int rooms[] = {2,3,4,5};
String signals[] = {"on", "off"};
int start, finish = 0;
String firstnum, secondnum;
int led2 = 2;
int led3 = 3;
int led4 = 4;
int led5 = 5;
void setup() {
  // put your setup code here, to run once:
Serial.begin(9600);

pinMode(0, OUTPUT);
pinMode(1, OUTPUT);
pinMode(2, OUTPUT);
pinMode(3, OUTPUT);
}

void loop() {
digitalWrite(rooms[0], HIGH);
digitalWrite(rooms[1], HIGH);
digitalWrite(rooms[2], HIGH);
digitalWrite(rooms[3], HIGH);
//    act();
}     
//}
int y = 0;
void act(){
//  Serial.println("Test");
  if (Serial.available() > 0) {
    firstnum = Serial.readString();  
//    Serial.println(firstnum+":kasjdl");
    String x = firstnum;
//    secondnum = x.substring(1,2);
//    if(secondnum=="0"){
//      digitalWrite(rooms[x],LOW);
//      }
//    if(secondnum=="1"){
//      digitalWrite(rooms[x],HIGH);
//      }
      if(x=="1"){
        digitalWrite(rooms[0],HIGH);
        y=0;
        }
      else if(x=="0"){
        digitalWrite(rooms[0],LOW);
        y=1;
        }
      delay(50);
      
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



