# 계산기 프로그램
# +, -, *, /, //, 나머지
def plus(a,b):
  return int(a)+int(b)
def minus(a,b):
  return int(a)-int(b)
def mul(a,b):
  return int(a)*int(b)
def div(a,b): # 결과값이 실수형
  return int(a)/int(b)
def div2(a,b): # 결과값이 정수형 
  return int(a)//int(b)
def res(a,b):
  return int(a)%int(b)
def pow(a,b):  # a^b 연산
  return int(a)**int(b)

print(plus(7,"3"))
print(minus("7",3))
print(mul(7,"3"))
print(div("7",3))
print(div2(7,"3"))
print(res("7",3))
print(pow(7,"3"))
