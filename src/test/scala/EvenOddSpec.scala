import org.scalatest.{AsyncWordSpecLike, MustMatchers}

/**
  * Created by knoldus on 19/9/17.
  */
class EvenOddSpec extends AsyncWordSpecLike with MustMatchers with EvenOdd{

  val even = 2
  val odd = 3
  val evenResult = "Its Even"
  val oddResult = "Its Odd"

  "EvenOdd" should{
    "check number is even" in {
      assert(check(even) == evenResult)
    }

    "check number is odd" in {
      assert(check(odd) == oddResult)
    }
  }
}
