package arranging_in_descending_integer_order

class Solution {
    fun solution(n: Long): Long {
        return n.toString().toCharArray().sortedDescending().let {
            it.joinToString("") { "$it" }.toLong()
        }
    }
}