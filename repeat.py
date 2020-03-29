# for, while

for i in range(3):
  print(i)
  print("준호: 지금 뭐해?")
  print("규용: 넌 뭐해?")

i=0
while i<3:
  print(i)
  print("준호: 지금 뭐해?")
  print("규용: 넌 뭐해?")
  i=i+1

# 무한루프 방법
# i=0
# while True: 
# print("따라갈게")
# i = i+1
#
# if i>30:
#  break

for i in range(3):
  print(i)
  print("준호: 애들아 뭐해?")
  print("범준: 걍 있어.")

  if i==1:
    continue # 밑으로 안가고 위로 계속

  print("규용: 넌 뭐해?")



