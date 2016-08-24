/**
  * Created by karavangelos on 8/23/16.
  */
object EliminateDuplicates {

  def main(args: Array[String]): Unit = {

    val theList = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')

    val eliminatedList = eliminateDuplicatesMatch(theList)
    println(eliminatedList)

   // val foldedList = compressFunctional(theList)
   // println(foldedList)


  }


  /*
  This is my solution using matching.  The main portions are:
  If the first is equal to the tail's head, then call the function again only
  we will drop the first found element and keep the tail.
  Other case, if there is a head and a tail but no tail, call the function again,
  but retain the head.
   */
  def eliminateDuplicatesMatch(li: List[Char]) : List[Char] = li match {

    case Nil => Nil
    case first :: Nil => li
    case first :: tail if first == tail.head => eliminateDuplicatesMatch(tail)
    case first :: tail => first :: eliminateDuplicatesMatch(tail)

  }

  /*
  Next we come to folding, which we will have to do a lot of in Scala.
  In this case, we fold right, meaning that we start on the right side of
  the list and work our way over.  The conditional operations are shown to hold
  the list with r being a list and h being the element of subject.
   */
  def compressFunctional[A](ls: List[A]): List[A] =
    ls.foldRight( List[A]() ) { (h, r) => println("h = " + h + ", r = " + r); if (r.isEmpty || r.head != h) h :: r else r }





}
