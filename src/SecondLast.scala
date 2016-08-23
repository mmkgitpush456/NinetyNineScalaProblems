/**
  * Created by karavangelos on 8/23/16.
  *
  * P02 (*) Find the last but one element of a list.
Example:
scala> penultimate(List(1, 1, 2, 3, 5, 8))
res0: Int = 5
  */
object SecondLast {

  def main(args : Array[String]): Unit = {

    val last = List(1,66, 76)

    val nextToLast = last(last.size - 2)

    println("next to last is " + nextToLast)
    println("next to last is " + getNextToLast(last) )
    println("next to last is " + ternaryGetNextToLast(last) )

  }

  /*
  Once again, the example is pretty cut and dry.
  We use pattern matching in order to generate a matching
  representation of the list.  If the element after the 2nd
  recieved element is Nil, then we must be at the 2nd to last
  element and, therefore, return it.
   */
  def getNextToLast(li : List[Int]) : Int = li match {

    case Nil => -1
    case a :: b :: Nil => a
    case a :: rest => getNextToLast(rest)
  }

  /*
  * This example is the Scala equivalent of a ternary
  * solution for getting the 2nd to last element within a list.
  * */
  def ternaryGetNextToLast(li : List[Int]) : Int = {

    if(li.size < 2) li(0) else li(li.size - 2)

  }


}
