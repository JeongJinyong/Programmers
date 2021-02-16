package lv1.matrix_addition

class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        val answer = arrayListOf<IntArray>()
        arr1.forEachIndexed { index, ints ->
            val intArray = arrayListOf<Int>()
            ints.forEachIndexed { index2, i ->
                intArray.add(arr2[index][index2] + i)
            }
            answer.add(intArray.toIntArray())
        }
        return answer.toTypedArray()
    }
}