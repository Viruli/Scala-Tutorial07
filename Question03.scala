package LabSheet07

object Question03 {
  def filterPrime(numbers: List[Int]): List[Int] = {
    def isPrime(num: Int): Boolean = {
      if (num <= 1) false
      else if (num == 2) true
      else !(2 to Math.sqrt(num).toInt).exists(i => num % i == 0)
    }

    numbers.filter(isPrime)
  }

  def main(args: Array[String]): Unit = {
    val inputList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val outputList = filterPrime(inputList)
    println(outputList)
  }

}
