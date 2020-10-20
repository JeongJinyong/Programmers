package base_3_flip

class Solution {
    fun solution(n: Int): Int {
        var base3Array = ""
        var quotient = n
        while (quotient != 0) {
            base3Array += ((quotient % 3))
            quotient /= 3
        }
        return base3Array.toInt(3)
    }
}