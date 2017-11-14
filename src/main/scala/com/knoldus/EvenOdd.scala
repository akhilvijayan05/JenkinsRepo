package com.knoldus


trait EvenOdd {

  def check(number: Int): String = {
    if (number % 2 == 0)
      "Its Even"
    else "Its Odd"
  }
}
