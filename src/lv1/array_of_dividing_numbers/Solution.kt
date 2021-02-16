package lv1.array_of_dividing_numbers

class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        var answer = mutableListOf<Int>()
        if (divisor == 1) return arr.sorted().toIntArray()
        answer = arr.filter { it % divisor == 0 }.toMutableList()
        return if (answer.isEmpty()) {
            answer.add(-1)
            answer.toIntArray()
        } else {
            answer.sorted().toIntArray()
        }
    }
}