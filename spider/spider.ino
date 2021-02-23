#include <Wire.h>
#include <Adafruit_PWMServoDriver.h>

Adafruit_PWMServoDriver pwm=Adafruit_PWMServoDriver();
int count = 0;
void setup() {
  Serial.begin(9600);
  pwm.begin();
  pwm.setOscillatorFrequency(27000000);
  pwm.setPWMFreq(50); //오작동 한다면 50Hz에서 조금씩 바꿔보기 
   delay(10);
  pwm.setPWM(1,1,150);
   
}
void intit(){
for(int i=0; i<12; i++){
    pwm.setPWM(i,i,375);
    }
}
void loop() {
  int a = Serial.parseInt(); //시리얼 통신으로 값을 받아옴
  if(count<1)
    intit();
  if (Serial.available()) {
    count++;
    int ra = constrain(map(a, 0, 180, 150, 600), 150, 600); //받은 값의 범위 0~180을 펄스길이150~600으로 매핑해주고, ra의 최소,최대를 150,600을 넘지 않게 해준다.
    //pwm.setPWM(9,9,ra); //pca9685모듈의 0번 포트에 연결된 서보를 ra만큼 회전
    //pwm.setPWM(0,0,ra);
   // pwm.setPWM(2,0,ra);
    //pwm.setPWM(4,0,(100-ra));
    //pwm.setPWM(8,0,ra);
    //pwm.setPWM(10,0,ra);
  
    pwm.setPWM(1,0,475); // 우올림
    pwm.setPWM(5,0,225); // 우내림
    pwm.setPWM(9,0,475); // 우올림
    pwm.setPWM(3,0, 225); // 왼내림
    pwm.setPWM(7,0,475); // 왼올림
    pwm.setPWM(11,0,225); // 왼내림
    delay(200);
    pwm.setPWM(2,0,275); // 왼후진
    pwm.setPWM(6,0,200); // 왼전진
    pwm.setPWM(10,0,275); // 왼후진
    pwm.setPWM(0,0, 200); // 우전진
    pwm.setPWM(4,0,275); // 우후진
    pwm.setPWM(8,0,200); // 우전진
    delay(200);
    pwm.setPWM(1,0,225); // 우내림
    pwm.setPWM(5,0,475); // 우올림
    pwm.setPWM(9,0,225); // 우내림
    pwm.setPWM(3,0, 475); // 왼올림
    pwm.setPWM(7,0,225); // 왼내림
    pwm.setPWM(11,0,475); // 왼올림
    delay(200);
    pwm.setPWM(2,0,200); // 왼전진
    pwm.setPWM(6,0,275); // 왼후진
    pwm.setPWM(10,0,200); // 왼전진
    pwm.setPWM(0,0, 275); // 우후진
    pwm.setPWM(4,0,200); // 우전진
    pwm.setPWM(8,0,275); // 우후진
    delay(200);
    intit();
    Serial.print('(');
    Serial.print(a);
    Serial.print(',');
    Serial.print(ra);
    Serial.println(')');
    delay(10);
  }
}
