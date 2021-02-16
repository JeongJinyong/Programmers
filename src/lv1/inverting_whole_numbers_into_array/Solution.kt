package lv1.inverting_whole_numbers_into_array

class Solution {
    fun solution(n: Long): IntArray {
        return n.toString().toList().reversed().map {
            it.toString().toInt()
        }.toIntArray()
    }
}