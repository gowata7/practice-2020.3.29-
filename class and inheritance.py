# 클래스와 상속!!

class Person:
  def __init__(self, name, age):
    self.name = name
    self.age = age

  def say_hello(self, to_name):
    print("안녕! " + to_name + " 나는 " + self.name)

  def introduce(self):
    print("내 이름은 " + self.name + " 이고 나는 " + str(self.age) + "살이야.")

class Police(Person): # Police가 Person을 상속한다.(police가 person을 물려받는다.))
  def arrest(self, to_arrest):
    print("꼼짝마! 걸리면 고시원 행일줄 알아 " + to_arrest)
  
class Programmer(Person): # Programmer가 Person을 상속한다.(Programmer가 person을 물려받는다.)
  def program(self, to_program):
    print("뭘 또 만들까? 이걸 만들래? >> " + to_program)
  
kbj = Person("김범준", 23)
kkp = Police("김경표", 22)
sua = Programmer("김수아", 21)

kbj.introduce()
kkp.introduce() # 경찰인 경표도 소개가 가능하다. Person을 상속 받았기 때문
sua.introduce() # 프로그래머인 수아도 소개가 가능, Person을 상속 받았기 때문

kkp.arrest("박규용")
sua.program("자바 어플리케이션")

  
