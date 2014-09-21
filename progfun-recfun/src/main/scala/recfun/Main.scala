package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = 
    if( c == r || c == 0 ) 1
    else pascal(c-1,r-1)+pascal(c,r-1)
  

  /**
   * Exercise 2
   * 
   * openParenthNum : the quantity of opening parentheses left unmatched 
   * 
   */
  def balance(chars: List[Char]): Boolean = {
    def listIterate(chars: List[Char], openParenthNum: Int): Int = {
      if(chars.isEmpty || openParenthNum < 0) openParenthNum
      else if( chars.head == '(' ) listIterate( chars.tail, openParenthNum + 1)
      else if( chars.head == ')' ) listIterate( chars.tail, openParenthNum - 1)
      else listIterate(chars.tail, openParenthNum)
    }
    listIterate(chars, 0) == 0
  }
  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = ???
}
