# tuple은 immutable sequence이다.
# 즉, 바꿀 수 없다는 얘기
days = ("Mon","Tue","Wed","Thur","Fri","Sat","Sun")

print(type(days))

# dictionary에는 튜플, 리스트 등을 저장할 수 있다.
nico = {
  "name" : "KBJ",
  "age" : 23,
  "Korean" : True,
  "fav_food" : ["KIMCHI", "GOGI"]
}
print(type(nico))
print(nico)
nico["handsome"] = True
print(nico)
