x = 1
y = 2
z = 1.2

print(x + y)
print(x - y)
print(x * y)
print(x % y)  # mod
print(x**y)  # 제곱

x = "hello"
y = 'bye'
z = """
안녕하세요
김범준이라고합니다
"""

print(x + y + z)

x = 4
y = "4"
print(str(x) + y)
print("너 혹시 몇 살이니?" + str(4))

if not 2 < 1:
    print("Hello")

if 1 > 0 and 2 > 1:
    print("hi")

x = 3

if x > 5:
    print("hell")
elif x == 3:
    print("bbye")
else:
    print("HIHIHI")


def chat(name1, name2, age):
    print("%s:가 말합니다 %s야.. 몇 살이냐?" % (name1, name2))
    print("%s:가 답합니다. %d 살이니까 까불지마" % (name2, age))


chat("알렉스", "윤하", 58)


def dsum(a, b):
    result = a + b
    return result


d = dsum(2, 4)
print(d)
