# 이런식으로 함수() 괄호 안에 인자값을 넣도록 되어 있는데 default값을 넣어줄 수 있다.

def say_Hello(name="anonymous"):
  print("hello", name)

say_Hello()
say_Hello("KBJ")

def plus(a,b):
  print(a+b)
def minus(a,b=0):
  print(a-b)

plus(2,5)
minus(2)
