object PrimeFactors {
  def of(number: Int): List[Int] = {
    def breakdown(number: Int, divisor: Int): List[Int] = {
      if (number == 1) {
        List()
      } else {
        if (number % divisor == 0) {
          List(divisor) ::: of(number / divisor)
        } else {
          List(number)
        }
      }
    }
    breakdown(number, 2)
  }
}
