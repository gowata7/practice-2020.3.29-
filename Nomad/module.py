# 파이썬에는 module이라는 것이 내장되어있다. 
# 기본적으로 제공되는 module이기 때문에 이 모듈을 import만 해주면 사용이 가능하다
# 파이썬에서 가장 많이 쓰임!!
# https://docs.python.org/3.6/library/index.html 

from math import ceil
from math import fabs
from math import fsum as Sexy

print(ceil(1.5)) # 반올림
print(fabs(-1.5)) # 절대값
print(Sexy([1, 2, 3, 4, 5, 6, 7]))
