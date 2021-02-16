package lv1.practice_test

class Solution {
    fun solution(answers: IntArray): IntArray {
        val first = listOf(1, 2, 3, 4, 5)
        val second = listOf(2, 1, 2, 3, 2, 4, 2, 5)
        val third = listOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)
        return scoring(answers, listOf(first, second, third))
    }

    private fun scoring(answers: IntArray, mathLosers: List<List<Int>>): IntArray {
        val answerArray = mutableListOf<Pair<Int, Int>>()
        mathLosers.forEachIndexed { index, list ->
            val answer = answers.filterIndexed { answersIndex, i ->
                list[answersIndex % (list.size)] == i
            }
            if (answer.isNotEmpty()) answerArray.add(Pair(index + 1, answer.size))
        }
        answerArray.sortByDescending { it.second }
        println(answerArray)
        return answerArray.map { it.first }.toIntArray()
    }
}