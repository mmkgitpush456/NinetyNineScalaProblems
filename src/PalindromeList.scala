/**
  * Created by karavangelos on 8/23/16.
  *
  * P06 (*) Find out whether a list is a palindrome.
Example:
scala> isPalindrome(List(1, 2, 3, 2, 1))
res0: Boolean = true
  *
  */
object PalindromeList {


  def main(args : Array[String]): Unit = {

    val palindrome = List(1,2,7,2,1)

    val isPalindrome = isPalindromeMatch(palindrome)
    println(isPalindrome)

   // println(palindrome.tail.dropRight(1))
  }


  def isPalindromeMatch(li : List[Int]) : Boolean = li match {

    case Nil => true
    case head :: Nil => true
    case head :: tail if head == tail.last => isPalindromeMatch(tail.dropRight(1))
    case head :: tail if head != tail.last => false

  }



}
