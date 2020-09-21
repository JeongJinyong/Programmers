package pick_two_and_add

class Solution {
    fun solution(numbers: IntArray): IntArray {
        val answer = mutableListOf<Int>()
        val tempNumbers = numbers.toMutableList()
        numbers.forEachIndexed { index, i ->
            tempNumbers.removeAt(0)
            tempNumbers.forEach { next ->
                val plus = i + next
                answer.add(plus)
            }
        }
        return answer.distinct().sorted().toIntArray()
    }
}