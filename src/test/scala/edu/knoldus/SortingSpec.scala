package edu.knoldus

import org.scalatest.FunSuite

class SortingSpec extends FunSuite {

  val integerList = List(23, 4, 8, 1, 14)

  val firstEmp = Emp(1, "james", 12000.00)
  val secondEmp = Emp(2, "shaun", 10000.00)
  val thirdEmp = Emp(3, "michael", 15000.00)
  val empList = List(firstEmp, secondEmp, thirdEmp)
  val sorting = new Sorting

  test("be sort list in ascending order") {
    assert(sorting.sortedList(integerList) === List(1, 4, 8, 14, 23))
  }

  test("be sort name in ascending order") {
    assert(sorting.sortByName(empList) === List(Emp(1, "james", 12000.00), Emp(3, "michael", 15000.00), Emp(2, "shaun", 10000.00)))
  }
  test("be sort salary in ascending order") {
    assert(sorting.sortWithSalary(empList) === List(Emp(2, "shaun", 10000.00), Emp(1, "james", 12000.00), Emp(3, "michael", 15000.00)))
  }

}
