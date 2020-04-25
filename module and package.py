# 모듈과 패키지
# animal package(폴더를 만들면 그 폴더가 곧 패키지)
# dog, cat modules
# dog, cat modules can say "hi"

from animal import dog # animal 패키지에서 dog를 불러와줘
from animal import cat # animal 패키지에서 cat를 불러와줘
from animal import * 
# 이걸 쓰면 패키지가 갖고있는 모든 모듈을 불러옴.
# 소스도 d = Dog(), c = Cat() 이렇게 사용가능

d = dog.Dog()
c = cat.Cat()

d.hi()
c.hi()
