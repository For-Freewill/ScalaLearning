try{
  val words1 = scala.io.Source.fromFile("d:\\temp\\b.txt").mkString
}catch{
  case ex1:java.io.FileNotFoundException =>{println("FileNotFound")}
  case ex2:IllegalArgumentException =>{println("参数")}
  case _:Exception=>{println("Other exception")}
}finally {
  println("Finally")
}