package lv1.gym_suit

class Solution {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        var answer = n
        val reserveList = reserve.toMutableList()
        val lostList = lost.toMutableList()
        reserve.forEach {
            if (lost.contains(it)) {
                reserveList.remove(it)
                lostList.remove(it)
            }
        }
        lostList.forEach {
            if(reserveList.isEmpty()) {
                answer--
                return@forEach
            }
            val plus = it + 1
            val minus = it - 1
            when {
                reserveList.contains(plus) -> {
                    reserveList.remove(plus)
                    return@forEach
                }
                reserveList.contains(minus) -> {
                    reserveList.remove(minus)
                    return@forEach
                }
            }
            answer--
        }
        return answer
    }
}