package lv2.big_number

class Solution {
    fun solution(numbers: IntArray): String {
        val answer = numbers.sortedWith(Comparator { first, second ->
            val a = first.toString()
            val b = second.toString()
            when (a.length) {
                b.length -> b.compareTo(a)
                else -> (b + a).compareTo(a + b)
            }
        }).joinToString("")
        return if(answer[0] != '0') answer else "0"
    }
}