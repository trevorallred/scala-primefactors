import org.scalatest.matchers.ShouldMatchers
import org.scalatest.PropSpec

class PrimeFactorsSpec extends PropSpec with ShouldMatchers {
  property("Prime Factors for 1") {
    PrimeFactors of 1 should equal(List())
  }
  property("Prime Factors for 2") {
    PrimeFactors of 2 should equal(List(2))
  }
}
