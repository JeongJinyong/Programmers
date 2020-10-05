package integer_square_root_discrimination

import kotlin.math.pow
import kotlin.math.sqrt

class Solution {
    fun solution(n: Long): Long {
        if(n <= 1) return 4
        return (sqrt(n.toDouble()).toLong()).let {
            if (it * it == n) it.plus(1).toDouble().pow(2).toLong() else -1
        }
    }
}