package lv1.placing_strings_in_descending_order

class Solution {
    fun solution(s: String): String {
        return s.toList().sortedDescending().joinToString("") { "$it" }
    }
}