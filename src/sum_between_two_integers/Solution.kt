package sum_between_two_integers

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun solution(a: Int, b: Int): Long {
        return min(a,b).toLong().rangeTo(max(a,b)).sum()
    }
}