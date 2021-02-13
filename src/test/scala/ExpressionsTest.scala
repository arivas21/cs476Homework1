import Functions.Expressions.Scope1
import org.scalatest._

import collection.mutable.Stack
import org.scalatest.flatspec.AnyFlatSpec

import scala.Console.in


class ExpressionsTest extends AnyFlatSpec {

  "Scope1 should add two variables together and print their sum" {

    def add(a: Int, b: Int): Assertion = {

    val a: Int = 5
    val b: Int = 2
      var result = a + b
    assertResult(7) {
    }
  }

    "Scope2 should subtract two variables and print their difference" {

      def add(a: Int, b: Int): Assertion = {

        val a: Int = 5
        val b: Int = 2
        var result = a - b
        assertResult(3) {
        }
      }


      "Scope3 should multiply two variables and print their product" {

        def add(a: Int, b: Int): Assertion = {

          val a: Int = 5
          val b: Int = 2
          var result = a * b
          assertResult(10) {
          }
        }

        "Macros should multiply two variables together to find the area." {

          def add(a: Int, b: Int): Assertion = {

            val l: Int = 5
            val w: Int = 2
            var result = l * w
            assertResult(10) {
            }
          }
        }





