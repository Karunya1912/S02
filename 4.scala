object demo {

def attendees(price: Double): Double = {
     120+(15-price)/5*20
  }

  def revenue(price: Double): Double = {
    attendees(price) * price
  }

  def cost(price: Double): Double = {
    500 + 3 * attendees(price)
  }

  def calProfit(price: Double): Double = {
     revenue(price)- cost(price)
  }

  def main(args: Array[String]): Unit = {
    println(calProfit(5),calProfit(10),calProfit(15),calProfit(20),calProfit(25),calProfit(30),calProfit(35),calProfit(40))

  }
}
