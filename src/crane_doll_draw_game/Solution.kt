package crane_doll_draw_game

class Solution {
    fun solution(board: Array<IntArray>, moves: IntArray): Int {
        var answer = 0
        val basket = mutableListOf<Int>()
        val temp = mutableListOf<MutableList<Int>>()
        board.reverse()
        board.forEachIndexed { index, ints ->
            for (i in board.indices) {
                if (temp.size == i) temp.add(mutableListOf())
                val current = board[i][index]
                if(current == 0) continue
                temp[index].add(current)
            }
        }
        moves.forEach {
            val currentLine = temp[it - 1]
            if (currentLine.isEmpty()) return@forEach
            val current = currentLine.last()
            println("index : $it = $temp - $current / basket : $basket")
            temp[it - 1].removeAt(currentLine.size - 1)
            if (basket.isNotEmpty()) {
                val last = basket.last()
                if (last == current) {
                    basket.remove(last)
                    answer += 2
                    return@forEach
                }
            }
            basket.add(current)
        }
        return answer
    }
}