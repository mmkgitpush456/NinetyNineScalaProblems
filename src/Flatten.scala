/**
  * Created by karavangelos on 8/23/16.
  *
  * P07 (**) Flatten a nested list structure.
Example:
scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
res0: List[Any] = List(1, 1, 2, 3, 5, 8)
  *
  */
object Flatten {

  def main(args : Array[String]): Unit = {

    val theList = List(List(1, 1), 2, List(3, List(5, 8)))

    val simpleList = List(4,5, List(5,7,4,2) )


    val flattened = flatten(theList)
    println(flattened)
  }


  /*
  def flattenList[A](li : List[A]) : List[A] = {
    li.flatten
  }
  */


  /*
  This sequence is actually much easier than it appears.
  Use the flatmap structure.
  flatMap works by applying a function that returns a sequence for each element in the list,
  and flattening the results into the original list.
  In this case, the function is that if the head of the list is a list of any values,
  we flatten it.
  Once the flattening is done (case e), return the flattened list
   */
  def flatten(ls: List[Any]): List[Any] = ls flatMap {
    case ms: List[_] => flatten(ms)
    case e => List(e)
  }





}
