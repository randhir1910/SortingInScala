package edu.knoldus

case class Emp(id: Int, name: String, salary: Double)

class Sorting {
  def sortByName(empList: List[Emp]): List[Emp] = empList.sortBy(_.name)

  def sortWithSalary(empList: List[Emp]): List[Emp] = empList.sortWith(_.salary < _.salary)

  def sortedList(list: List[Int]): List[Int] = list.sorted
}

object Sorting extends App {

  val integerList = List(23, 4, 8, 1, 14)

  val firstEmp = Emp(1, "james", 12000.00)
  val secondEmp = Emp(2, "shaun", 10000.00)
  val thirdEmp = Emp(3, "michael", 15000.00)
  val empList = List(firstEmp, secondEmp, thirdEmp)
  val sorting = new Sorting
  // sort list in ascending order.
  println(sorting.sortedList(integerList))
  // sort name in ascending order using sortBy function.
  println(sorting.sortByName(empList))
  //sort salary in ascending order using sortWith function.
  println(sorting.sortWithSalary(empList))
}
