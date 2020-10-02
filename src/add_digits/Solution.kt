package add_digits

class Solution {
    fun solution(n: Int): Int {
        return n.toString().toCharArray().let {
            var answer = 0
            it.forEach { c->
                answer += c.toString().toInt()
            }
            answer
        }
    }
}