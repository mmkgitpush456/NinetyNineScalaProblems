/**
  * Created by karavangelos on 8/23/16.
  *
  * P01 (*) Find the last element of a list.
Example:
scala> last(List(1, 1, 2, 3, 5, 8))
res0: Int = 8
  *
  */
object LastElement {

  def main(args : Array[String]): Unit = {

    val last = List(1, 1, 2, 3, 5, 8, 76)

    //this is the scala built in way to find the final element in a
    //list
    val defaultLast = last.last


    /*
    Custom implementation using pattern matching.

    In the event that the list is empy(Nil), return -1
    In the case that the element returned following the current
    element is empty, then get that element.
    In the case of everything else, continue to go through the list.
     */
    def finalElement(in: List[Int]) : Int = in match {

      case Nil => -1
      case a :: Nil => a
      case a :: rest => finalElement(rest)

    }

    println("Got the tail: " + defaultLast)
    println("Got the tail: " + finalElement(last) )

  }

}
