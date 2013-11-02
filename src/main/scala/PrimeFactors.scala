object PrimeFactors {
  def of(number: Int): List[Int] = {
    if (number == 1) {
      List()
    } else {
      if (number % 2 == 0) {
        List(2) ::: of(number / 2)
      } else {
        List(number)
      }
    }
  }
}
