package lv1.failure_rate

class Solution {
    fun solution(N: Int, stages: IntArray): IntArray {
        val group = stages.groupBy { it }.mapValues { it.value.size }
        val failureRate: MutableMap<Int, Double> = mutableMapOf()
        var userCount = stages.size
        for (i in 1..N) {
            if (group.containsKey(i)) {
                failureRate[i] = (group.getValue(i) / userCount.toDouble())
                userCount -= group.getValue(i)
            } else failureRate[i] = 0.0
        }
        return failureRate.toList().sortedByDescending { it.second }.map {
            it.first
        }.toIntArray()
    }

}