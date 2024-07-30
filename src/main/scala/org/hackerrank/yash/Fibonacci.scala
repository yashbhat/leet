package org.hackerrank.yash

object Fibonacci {
    class Lazy[T] (expr : => T) {
        lazy val value = expr
        def apply(): T = value
    }
    object Lazy{ def apply[T](expr : => T) = new Lazy(expr) }

    def fib(n: Int): Int = {
        def doFib(i: Int): Lazy[Int] = Lazy {
            if (i <= 2) 1
            else fibs(i - 1)() + fibs(i - 2)()
        }
        lazy val fibs = Array.tabulate[Lazy[Int]](n)(doFib)
        doFib(n)()
    }

    def main(args: Array[String]): Unit = {
        println(fib(8))
    }

}
