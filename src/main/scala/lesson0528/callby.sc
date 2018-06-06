//call by value：对函数的实参求值，并且仅求一次
//call by name：函数的实参每次在函数体内部被调用的时候，都会进行求值
//call by value:  x:Int
//call by name :  x:=>Int

//call by value
def test1(x:Int,y:Int):Int = x+x
test1(3+4,8)
//过程
//test1(7,8)
//7+7
//14

//call by name
def test2(x: => Int,y: =>Int):Int = x+x
test2(3+4,8)
//过程
//test1(3+4,8)
//(3+4)+(3,4)
//7+7
//14

def test3(x:Int,y: =>Int):Int = 1
def loop():Int = loop

test3(1,loop) //loop 是int,但是是call by name，所有没有计算loop的值
test3(loop,1)//loop 是call by value,需要先计算loop的值，此时死循环
