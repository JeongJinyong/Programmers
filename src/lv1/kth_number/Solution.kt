package lv1.kth_number

class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        val answer = arrayListOf<Int>()
        commands.forEach {
            val i = it[0]-1
            val j = it[1]-1
            val k = it[2]-1
            answer.add(array.filterIndexed { index, _ -> index in i..j }.sorted()[k])
        }
        return answer.toIntArray()
    }
}