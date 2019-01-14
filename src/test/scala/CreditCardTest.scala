import helpers.BaseTestClass

class CreditCardTest extends BaseTestClass{
  "Doubling Function" should "double the input and add the digits of the result" in{
    assert(CreditCard.doubles(6) == 3)
  }
}
