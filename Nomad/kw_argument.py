# String 인자값을 받기 위해 앞에 f를 붙이고 인자를 {} 안에 넣으면 된다. 참고로 f는 format이다.
def say_hello(name,age,w_from,food):
  return f"Hello {name} you are {age} years old, you are from {w_from} you like {food}"
# 또는 return "hello "+name+" you are "+age+" years old" 도 가능하다. 그러나 파이썬에서는 좋지 않은 방법이다.

#keyword argument를 사용하면 함수 호출 시 인자값 순서를 신경쓰지 않아도 됨
hello = say_hello(w_from="KOREA", food="KIMCHI",age=23, name="kbj")
print(hello)
