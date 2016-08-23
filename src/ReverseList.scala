/**
  * Created by karavangelos on 8/23/16.
  *
  * P05 (*) Reverse a list.
Example:
scala> reverse(List(1, 1, 2, 3, 5, 8))
res0: List[Int] = List(8, 5, 3, 2, 1, 1)
  */
object ReverseList {


  def main(args : Array[String]): Unit ={

    val theList = List(1, 1, 2, 3, 5, 8)

    val theNewList = theList.dropRight(1)

    //println(theNewList)


    println(reverseListMatch(theList))
  }


  /*
  Pattern matching way of reversing the list
  If the element after the head is Nil, it means we have reached the end
  and we can return the list
  If there is a head and a tail, we take the last element from the remainder
  of the list and then call the function again while dropping the right most
  element on the list.
   */
  def reverseListMatch(li: List[Int]) : List[Int] = li match {
    case Nil => Nil
    case head :: Nil => li
    case head :: rest => rest.last :: reverseListMatch(li.dropRight(1))
  }

}
