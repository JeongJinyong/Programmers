package lv1.lottos

class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        var zeroSize = 0
        var equalsSize = 0
        lottos.sort()
        win_nums.sort()
        lottos.forEach {
            if (it == 0) zeroSize++
            else {
                if (win_nums.contains(it)) equalsSize++
            }
        }
        answer = intArrayOf(rankLottos(equalsSize + zeroSize), rankLottos(equalsSize))
        return answer
    }

    private fun rankLottos(size: Int): Int {
        return when (size) {
            6 -> 1
            5 -> 2
            4 -> 3
            3 -> 4
            2 -> 5
            else -> 6
        }
    }
}