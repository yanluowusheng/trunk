
import java.time.LocalDate
import spock.lang.*

class HelloSpec extends Specification {
  def "maximum of two numbers"() {
      expect:
      // exercise math method for a few different inputs
      Math.max(1, 3) == 3
      Math.max(7, 4) == 7
      Math.max(0, 0) == 0
  }
}
