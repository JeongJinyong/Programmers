package watermelon

class Solution {
    fun solution(n: Int): String {
        return n.let {
            var watermelon = ""
            for (i in 1..n) {
                watermelon += if (i % 2 == 1) "수"
                else "박"
            }
            watermelon
        }
    }
}