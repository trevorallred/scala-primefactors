import org.scalatest.matchers.ShouldMatchers
import org.scalatest.PropSpec

class PrimeFactorsSpec extends PropSpec with ShouldMatchers {
  property("Prime Factors for 1") {
    PrimeFactors of 1 should equal(List())
  }
}
