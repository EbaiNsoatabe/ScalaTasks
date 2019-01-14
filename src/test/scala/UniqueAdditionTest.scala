import helpers.BaseTestClass

class UniqueAdditionTest extends BaseTestClass{
  "Add function" should "only add unique numbers to each other" in{
    assert(UniqueAddition.add(4, 5, 4) == print(5))
    assert(UniqueAddition.add(3, 3, 3) == print(0))
  }
}
