package search

import org.scalatest.{ Matchers, FunSuite }

class SearchSuite extends FunSuite with Matchers {
    test("Binary Search") {
        val ori = IndexedSeq(10, 20, 30, 30, 20, 10, 10, 20)
        val arr = ori.sortWith((x, y) => x < y)
        val tag = 20;
        val res = Search.binarySearch(arr, tag)
        println(res)
    }

    test("Lower Bound") {
        val ori = IndexedSeq(10, 20, 30, 30, 20, 10, 10, 10, 10, 20)
        val arr = ori.sortWith((x, y) => x < y)
        println(arr)

        val tags = Seq(5,10,18,20,25,30,35);
        val exps = Seq(0,0,5,5,8,8,10);
        for((t,e) <- tags zip exps){
            withClue ("tag: " + t + ", exp: " + e + "\n"){
                Search.lowerBound(arr, t) should be(e)
            }
        }
    }

    test("Upper Bound") {
        val ori = IndexedSeq(10, 20, 30, 30, 20, 10, 10, 10, 10, 20)
        val arr = ori.sortWith((x, y) => x < y)
        println(arr)

        val tags = Seq(5,10,18,20,25,30,35);
        val exps = Seq(0,5,5,8,8,10,10);
        for((t,e) <- tags zip exps){
            withClue ("tag: " + t + ", exp: " + e + "\n"){
                Search.upperBound(arr, t) should be(e)
            }
        }
    }
}