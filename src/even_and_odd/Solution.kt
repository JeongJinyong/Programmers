package even_and_odd

class Solution {
    fun solution(num: Int): String {
        return num.let {
            if (it % 2 == 0) "Even" else "Odd"
        }
    }
}