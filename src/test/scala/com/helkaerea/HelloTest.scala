package scala.com.helkaerea

import org.scalatest.{BeforeAndAfterEach, BeforeAndAfterAll, FunSpec}
import org.scalatest.matchers.ShouldMatchers
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import org.scalatest._

@RunWith(classOf[JUnitRunner])
class HelloTest extends FunSpec with ShouldMatchers with BeforeAndAfterAll with BeforeAndAfterEach {
  describe("first test") {

    it("should add 2 numbers") {

    }

  }

}
