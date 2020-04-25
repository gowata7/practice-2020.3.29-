# list는 mutable sequence이다.
# mutable이라는 것은 바꿀 수있다는 것임
days = ["Mon","Tue","Wed","Thur","Fri","Sat","Sun"]

print(type(days))
print("Mon" in days)
print("man" in days)
print(days[3])
print(len(days))

days.append("anymore")
print(days)
days.reverse()
print(days)
