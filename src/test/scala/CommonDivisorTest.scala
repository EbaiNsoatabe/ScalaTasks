import helpers.BaseTestClass

class CommonDivisorTest extends BaseTestClass{
  "Divides by function" should "return true where number is a factor" in{
    assert(CommonDivisor.dividesBy(65, 9) == false)
  }
}
