/**
  * Created by Administrator on 05/06/2017.
  */
object Main {

  def displayEndOfStringCharacters(text : String, amount : Int): Unit ={
    println(text.takeRight(amount))
  }

  def main(args : Array[String]) : Unit ={
    displayEndOfStringCharacters("Hello", 3)

  }
}
