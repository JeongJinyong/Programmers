package lv1.greatest_common_factor_and_least_common_multiple


class Solution {
    fun solution(n: Int, m: Int): IntArray {
        val gcb = n.toBigInteger().gcd(m.toBigInteger()).toInt()
        return intArrayOf(gcb,((n * m) / gcb))
    }
}