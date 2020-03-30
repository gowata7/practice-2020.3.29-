x = [1,2,3,4]
#    0,1,2,3번 째순
y = ["hello", "world"]
z = ["hello", 1,2,3]

print(x+y+z)
print(x[3-1])

print("===============")

num_elements = len(x) # 요소의 갯수를 알 수 있다.
print(num_elements)

print("===============")

x = [4,2,3,1]
y = sorted(x) # 요소를 정렬해준다.(오름차순)
print(y)

print("===============")

x = [4,2,3,1]
z = sum(x) # 각 요소들의 합을 출력한다.
print(z)

print("===============")

x = [4,2,3,1]
y = ["hello", "there"]
for n in x:
  print(n)
for c in y:
  print(c)

print("===============")

x = [4,2,3,1]
y = ["hello", "there"]
print(x.index(3)) # x리스트에서 3이라는 요소가 몇 번째에 있는가?
print(y.index("hello")) # y리스트에서 "hello"라는 요소가 몇 번째에 있는가?

