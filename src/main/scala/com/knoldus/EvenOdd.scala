package com.knoldus

/**
  * Created by knoldus on 19/9/17.
  */
trait EvenOdd {

  def check(number: Int): String = {
    if (number % 2 == 0)
      "Its Even"
    else "Its Odd"
  }
}
