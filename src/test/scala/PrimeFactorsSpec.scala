import org.scalatest.matchers.ShouldMatchers
import org.scalatest.PropSpec

class PrimeFactorsSpec extends PropSpec with ShouldMatchers {
  property("Prime Factors for 1") {
    PrimeFactors of 1 should equal(List())
  }
  property("Prime Factors for 2") {
    PrimeFactors of 2 should equal(List(2))
  }
  property("Prime Factors for 4") {
    PrimeFactors of 4 should equal(List(2, 2))
  }
  property("Prime Factors for 9") {
    PrimeFactors of 9 should equal(List(3, 3))
  }
  property("Prime Factors for 3528") {
    PrimeFactors of 3528 should equal(List(2, 2, 2, 3, 3, 7, 7))
  }
}
