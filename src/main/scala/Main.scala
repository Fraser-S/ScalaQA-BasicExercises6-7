/**
  * Created by Administrator on 05/06/2017.
  */
object Main {

  def displayEndOfStringCharacters(text : String, amount : Int): Unit ={
    println(text.takeRight(amount))
  }

  def concatenateStringsAndSwapCharacters(text1 : String, text2 : String, oldChar : Char, newChar : Char): Unit ={
    var concatenatedString : String = text1.concat(text2)
    var replacedString : String = concatenatedString.replace(oldChar, newChar)
    println(replacedString)
  }

  def main(args : Array[String]) : Unit ={
    displayEndOfStringCharacters("Hello", 3)
    concatenateStringsAndSwapCharacters("Ha", "llo", 'a', 'e')
  }
}
