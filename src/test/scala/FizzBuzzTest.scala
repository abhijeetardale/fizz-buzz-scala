import org.scalatest.{Matchers, WordSpec}


class FizzBuzzTest extends WordSpec with Matchers {

 val fizzBuzz = new FizzBuzz()

  "FizzBuzz" should {

    "return the Fizz for all numbers multiples of three" in {
      fizzBuzz.getNumbers(Some(List(3,6,9))) shouldBe List("Fizz", "Fizz", "Fizz")

    }

    "return the Fizz for all numbers multiples of three and other" in {
      fizzBuzz.getNumbers(Some(List(1,3,6,9,11))) shouldBe List("1", "Fizz", "Fizz", "Fizz", "11")

    }

    "return the Buzz for all numbers multiples of Five" in {
      fizzBuzz.getNumbers(Some(List(5,10,20))) shouldBe List("Buzz", "Buzz", "Buzz")

    }

    "return the Buzz for all numbers multiples of Five with other and not having multiples of three" in {
      fizzBuzz.getNumbers(Some(List(1,5,10,20,22))) shouldBe List("1", "Buzz", "Buzz", "Buzz", "22")

    }

    "return the Buzz for all numbers multiples of Five with other and having multiples of three" in {
      fizzBuzz.getNumbers(Some(List(1,5,10,20,21))) shouldBe List("1", "Buzz", "Buzz", "Buzz", "Fizz")

    }

    "return the FizzBuzz for all numbers multiples of three and Five" in {
      fizzBuzz.getNumbers(Some(List(15,30,45))) shouldBe List("FizzBuzz", "FizzBuzz", "FizzBuzz")
    }

    "return the FizzBuzz for all numbers multiples of three and Five with other " in {
      fizzBuzz.getNumbers(Some(List(1,15,30,45))) shouldBe List("1", "FizzBuzz", "FizzBuzz", "FizzBuzz")
    }

    "return the FizzBuzz for all numbers multiples of three and Five with other and multiples of three" in {
      fizzBuzz.getNumbers(Some(List(1, 3, 15,30,45))) shouldBe List("1", "Fizz", "FizzBuzz", "FizzBuzz", "FizzBuzz")
    }

    "return the FizzBuzz for all numbers multiples of three and Five with other, multiples of three and multiples of five" in {
      fizzBuzz.getNumbers(Some(List(1,3,5,15,30,45))) shouldBe List("1", "Fizz", "Buzz", "FizzBuzz", "FizzBuzz", "FizzBuzz")
    }

    "return the correct phrase for all numbers" in {
      fizzBuzz.getNumbers() shouldBe List("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz", "Fizz", "22", "23", "Fizz", "Buzz", "26", "Fizz", "28", "29", "FizzBuzz", "31", "32", "Fizz", "34", "Buzz", "Fizz", "37", "38", "Fizz", "Buzz", "41", "Fizz", "43", "44", "FizzBuzz", "46", "47", "Fizz", "49", "Buzz", "Fizz", "52", "53", "Fizz", "Buzz", "56", "Fizz", "58", "59", "FizzBuzz", "61", "62", "Fizz", "64", "Buzz", "Fizz", "67", "68", "Fizz", "Buzz", "71", "Fizz", "73", "74", "FizzBuzz", "76", "77", "Fizz", "79", "Buzz", "Fizz", "82", "83", "Fizz", "Buzz", "86", "Fizz", "88", "89", "FizzBuzz", "91", "92", "Fizz", "94", "Buzz", "Fizz", "97", "98", "Fizz")
    }

  }

}
