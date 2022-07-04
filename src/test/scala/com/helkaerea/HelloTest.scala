package scala.com.helkaerea

import org.scalatest.{BeforeAndAfterEach, BeforeAndAfterAll}
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers
import org.junit.runner.RunWith
import org.scalatestplus.junit.JUnitRunner


@RunWith(classOf[JUnitRunner])
class HelloTest extends AnyFunSpec with Matchers with BeforeAndAfterAll with BeforeAndAfterEach {
  describe("first test") {

    it("should add 2 numbers") {

    }

  }

}
