# p_plus는 a+b라는 값을 출력하고, r_plus는 a+b라는 값을 리턴하여 r_result에 넣어준다. 
# 따라서 p_result라는 변수에는 값이 없으며 r_result라는 변수에는 return값인 5가 출력되는 것이다.
# 값을 리턴하는 순간 그 함수는 종료된다.

def p_plus(a, b):
  print(a+b)

def r_plus(a, b):
  return a+b
  print("blablabaghblahlabalghabl")

p_result = p_plus(2,3) # 5가 출력됨
r_result = r_plus(2,3) # r_result = 5 
print(p_result, r_result)
