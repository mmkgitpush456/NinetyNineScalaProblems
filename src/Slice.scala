/**
  * Created by karavangelos on 8/23/16.
  *
  * P18 (**) Extract a slice from a list.
Given two indices, I and K, the slice is the list containing the elements from and
including the Ith element up to but not including the Kth element of the original list.
Start counting the elements with 0.
Example:

scala> slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res0: List[Symbol] = List('d, 'e, 'f, 'g)
  *
  */
object Slice {

  def main(args: Array[String]): Unit = {

    val theList = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)

    println(sliceTheList(3,7, theList))

  }

  /*
  Scala has an easy and convenient way of slicing lists as shown below.
   */
  def sliceTheList[A](start: Int, stop: Int, li: List[A]) : List[A] = {
    li.slice(start, stop)
  }





}
