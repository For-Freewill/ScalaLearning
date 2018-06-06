//函数的参数：默认参数、代名参数、可变参数

//默认参数
def fun1(name:String="Defaultname"):String="Hello "+name
fun1("Tom")
fun1()


//代名参数:如果一个函数具有多个默认参数，使用代名参数来区别不同参数.否则默认是第一个
def fun2(str:String="Hello ",name:String="Mike",age:Int=20)=
  str+name+" the age of "+name+" is "+age
fun2("Tom")
fun2(name="Tom")


//可变参数：类似java中的...。 使用*
def sum(args:Int*):Int={
  var result=0
  for(arg<-args) result+=arg
  result
}

sum(1,2,3,4,5)
sum(1,2,3)