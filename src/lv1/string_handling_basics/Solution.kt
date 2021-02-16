package lv1.string_handling_basics

class Solution {
    fun solution(s: String): Boolean {
        return s.length == 4 || s.length == 6 && s.toIntOrNull() != null
    }
}