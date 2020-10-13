package hashad_number

class Solution {
    fun solution(x: Int): Boolean {
        var sum = 0
        x.toString().forEach {
            sum += it.toString().toInt()
        }
        return x % sum == 0
    }
}