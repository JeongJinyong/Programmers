package lv1.n_numbers_spaced_by_x

class Solution {
    fun solution(x: Int, n: Int): LongArray {
        val answer = arrayListOf<Long>()
        for (i in 1..n) {
            answer.add(x.toLong() * i)
        }
        return answer.toLongArray()
    }
}