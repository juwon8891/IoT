#include <SoftwareSerial.h>
SoftwareSerial s(D5,D6) //rx,tx

void setup() {
  s.begin(9600);
}

void loop() {
  if(s.available())
  { //indexOf, substring(x,y), length
    String tds =s.readStringUntil("\n");
    String temp =s.readStringUntil("\n");
    String hum =s.readStringUntil("\n");
    Serial.println(tds);
    Serial.println(temp);
    Serial.println(hum);
  }
}
