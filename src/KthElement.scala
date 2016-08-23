/**
  * Created by karavangelos on 8/23/16.
  * By convention, the first element in the list is element 0.
Example:

scala> nth(2, List(1, 1, 2, 3, 5, 8))
res0: Int = 2
  */
object KthElement {


  def main(args : Array[String]): Unit = {

    val last = List(1, 1, 2, 3, 5, 8, 76)


   // println(last.tail)
    println(getKth(5, last))
    println(getKthRecursive(5, last))
    println(getKthMatch(10, last))
  }

  /*
  Somewhat built-in function that returns the element
  from the list based on the parameters built in.
   */
  def getKth(k: Int, li: List[Int]) : Int = {
    li(k)
  }

  /*
  This example shows how recursion can be used to obtain
  an element within a list.

  The statement is as follows in English:

  if the value of k is greater than 0, then call the function
  again with 1 subtracted from K and the tail list of the li
  parameter.
  Otherwise, return the head element of the list.
   */
  def getKthRecursive(k: Int, li : List[Int] ) : Int = {
    if(k > 0) getKthRecursive(k-1, li.tail) else li.head
  }

  /*
  Finally, we display a matching function as to how the kth
  element can be obtained.  The logic is similar to that provided
  from the kthRecursive function as if the k element is greater
  than 0, we call the function again with k-1 and the list's tail
  as the parameters.
   */
  def getKthMatch(k : Int, li: List[Int]) : Int = k match {

    case k if(k < 0) => -1
    case k if(k > li.length) => -2
    case 0 => li.head
    case k if(k > 0) => getKthMatch(k-1, li.tail)

  }

}
