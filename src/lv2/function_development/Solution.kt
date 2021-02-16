package lv2.function_development

class Solution {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        val answer = mutableListOf<Int>()
        val progressesList = progresses.toMutableList()
        val speedsList = speeds.toMutableList()
        while (true) {
            var count = 0
            if (speedsList.isEmpty()) break
            speedsList.forEachIndexed { index, i ->
                progressesList[index] = progressesList[index] + i
            }
            if (progressesList[0] >= 100) {
                val tempCopy = mutableListOf<Int>()
                tempCopy.addAll(progressesList)
                run loop@{
                    tempCopy.forEachIndexed { index, i ->
                        if (i >= 100) {
                            progressesList.removeAt(0)
                            speedsList.removeAt(0)
                            count++
                        } else return@loop
                    }
                }
                answer.add(count)
            }
        }
        return answer.toIntArray()
    }
}