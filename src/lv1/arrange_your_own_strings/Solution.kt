package lv1.arrange_your_own_strings

class Solution {
    fun solution(strings: Array<String>, n: Int): Array<String> {
        strings.sort()
        strings.sortBy {
            it[n]
        }
        return strings
    }
}