# 튜플과 리스트의 가장 큰 차이점은
# 가변이냐 불변이냐의 차이다.
# 리스트는 가변, 튜플은 불변이다.
# 튜플은 안에 요소값을 바꿀 수 없다.

x = (1,2,3)
y = ('a', 'b', 'c')
z = (1,"hello","there")

print(x+y)
print('a' in y)
print(z.index(1))

# x[0] = 10 실행오류!!
