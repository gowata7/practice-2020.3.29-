def chat(name1, name2, age):
    print("%s가 말합니다 %s야.. 몇 살이냐?" % (name1, name2))
    print("%s가 답합니다. %d 살이니까 까불지마" % (name2, age))


chat("알렉스", "윤하", 58)


def dsum(a, b):
    result = a + b
    return result # 결과값을 반환해줘야 함수 호출할 때 사용 가능하다.


d = dsum(2, 4)
print(d)