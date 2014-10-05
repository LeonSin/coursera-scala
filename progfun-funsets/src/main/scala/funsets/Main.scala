package funsets

object Main extends App {
  import FunSets._
  printSet(singletonSet(1))
  println(contains(singletonSet(1), 1))
  println(contains(singletonSet(1), 2))
  printSet(union(singletonSet(1), singletonSet(2)))
  printSet(intersect(union(singletonSet(1), singletonSet(2)), union(singletonSet(1), singletonSet(3))))
  printSet(diff(union(singletonSet(1), singletonSet(2)), union(singletonSet(1), singletonSet(3))))
}
