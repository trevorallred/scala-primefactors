object PrimeFactors {
  def of(number: Int): List[Int] = {
    if (number == 1) {
      List()
    } else {
      List(number)
    }
  }
}
