def sum(x: Int, y: Int): Int = x + y
var total = sum(1, 5)

//定义一个阶乘函数
def jiecheng(x: Int): Int = {
  if (x < 1) {
    1
  } else {
    x * jiecheng(x - 1)
  }
}

//阶乘的结果=720
var result = jiecheng(6)

//for循环
var namelist = List("Mary","Mike","Tom")

println("###第1种写法###")
//<- 提取
for(s<-namelist) println(s)

println("###第2种写法###")
//循加+判断
for{
  s<-namelist
  if(s.length>3)
}println(s)


println("###第3种写法###")
for(s<-namelist if s.length<=3) println(s)

//yield关键字
//创建新的集合，全大写

var newNameList= for{
  s<-namelist
  s1=s.toUpperCase
}yield(s1)


//While循环
var i=0
while (i<namelist.length){
  println(namelist(i))
  i+=1
}
