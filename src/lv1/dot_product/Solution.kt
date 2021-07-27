package lv1.dot_product

class Solution {
    fun solution(a: IntArray, b: IntArray): Int {
        var answer: Int = 0
        val aa = a.zip(b)
        aa.forEach {
            answer = +it.first * it.second
        }
        return answer
    }
}