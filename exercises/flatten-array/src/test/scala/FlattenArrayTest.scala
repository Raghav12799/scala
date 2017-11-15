import org.scalatest.{Matchers, FunSuite}

class FlattenArrayTest extends FunSuite with Matchers {
  test("empty list") {
    FlattenArray.flatten(List()) should equal(List())
  }

  test("no nesting") {
    pending
    FlattenArray.flatten(List(0, 1, 2)) should equal(List(0, 1, 2))
  }

  test("flattens array with just integers present") {
    pending
    FlattenArray.flatten(List(1, List(2, 3, 4, 5, 6, 7), 8)) should equal(
      List(1, 2, 3, 4, 5, 6, 7, 8))
  }

  test("5 level nesting") {
    pending
    FlattenArray.flatten(List(0,
                              2,
                              List(List(2, 3), 8, 100, 4, List(List(List(50)))),
                              -2)) should equal(
      List(0, 2, 2, 3, 8, 100, 4, 50, -2))
  }

  test("6 level nesting") {
    pending
    FlattenArray.flatten(List(
      1,
      List(2, List(List(3)), List(4, List(List(5))), 6, 7),
      8)) should equal(List(1, 2, 3, 4, 5, 6, 7, 8))
  }

  test("6 level nest list with null values") {
    pending
    FlattenArray.flatten(
      List(0,
           2,
           List(List(2, 3), 8, List(List(100)), null, List(List(null))),
           -2)) should equal(List(0, 2, 2, 3, 8, 100, -2))
  }

  test("all values in nested list are null") {
    pending
    FlattenArray.flatten(
      List(null,
           List(List(List(null))),
           null,
           null,
           List(List(null, null), null),
           null)) should equal(List())
  }
}
