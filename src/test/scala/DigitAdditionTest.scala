import helpers.BaseTestClass

class DigitAdditionTest extends BaseTestClass {
  "Separation function" should "separate each digit in a given integer" in {
    assert(DigitAddition.separationTwoDigit(62) == 8)
    assert(DigitAddition.separationThreeDigit(621) == 9)
    assert(DigitAddition.separationFourDigit(6521) == 14)
    assert(DigitAddition.separationFiveDigit(75821) == 23)
    assert(DigitAddition.separationSixDigit(758721) == 30)
    assert(DigitAddition.separationSevenDigit(1275821) == 26)
  }

}
