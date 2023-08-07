package LabSheet07

object Question02 {
  def calculateSquare(numbers: List[Int]): List[Int] = {
    numbers.map(num => num * num)
  }

  def main(args: Array[String]): Unit = {
    val inputList = List(1, 2, 3, 4, 5)
    val outputList = calculateSquare(inputList)
    println(outputList)
  }

}
