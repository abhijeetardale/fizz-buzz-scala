import scala.collection.mutable

class FizzBuzz {

  def getNumbers(numbers:Option[List[Int]]=None) : List[String] = {

    val list = new mutable.ListBuffer[String]
    numbers.getOrElse(List.range(1, 100)).map{
      number =>
        (number%3, number%5)  match {
          case (0, 0) => list += "FizzBuzz"
          case (0, _) => list += "Fizz"
          case (_, 0) => list += "Buzz"
          case _ => list += number.toString
        }
    }
    list.toList
  }

}
