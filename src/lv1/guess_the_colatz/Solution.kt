package lv1.guess_the_colatz

class Solution {
    fun solution(num: Int): Int {
        var temp = num.toLong()
        var answer = 0
        while (temp != 1L && answer != 500) {
            temp = if (temp % 2L == 0L) even(temp) else odd(temp)
            answer++
        }
        return if (answer >= 500) -1 else answer
    }

    private fun even(n: Long) = n / 2

    private fun odd(n: Long) = (n * 3) + 1
}