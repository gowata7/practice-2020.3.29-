# 딕셔너리의 키값은 불변해야한다.
# 리스트는 가변이기 때문에 딕셔너리의 key로 쓸 수 없다.

x = dict()
y = {}
print(x)
print(y)

print("===============")

# dict 구문
x = {
  0: "KBJ",
  "name": "워니",
  "age" : 20,
}
print(x[0])
print(x["name"])
print(x["age"])
print("name" in x)
print("hobby" in x)
print(x.keys())
print(x.values())

for key in x:
  print("key: " + str(key))
  print("value: " + str(x[key]))

# 이런 식으로  value 값을 바꿀 수 있음
x[0] = "범준"
print(x)

# 이런 식으로 새 키값이 들어오면 새로 추가가 된다.
x["school"] = "한빛"
print(x)
