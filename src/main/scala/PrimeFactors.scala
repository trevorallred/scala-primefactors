object PrimeFactors {
  def of(number: Int): List[Int] = {
    def breakdown(number: Int, divisor: Int): List[Int] = {
      if (number == 1) {
        List()
      } else if (number == divisor) {
        List(number)
      } else if (number % divisor == 0) {
        List(divisor) ::: breakdown(number / divisor, divisor)
      } else {
        breakdown(number, divisor + 1)
      }
    }
    breakdown(number, 2)
  }
}
