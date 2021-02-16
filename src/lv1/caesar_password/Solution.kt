package lv1.caesar_password

class Solution {
    fun solution(s: String, n: Int): String {
        val lower = "abcdefghijklmnopqrstuvwxyz"
        val upper = lower.toUpperCase()
        return s.toCharArray().map {
            when {
                it.isUpperCase() -> {
                    var index = upper.indexOf(it) + n
                    index = if (index > upper.length - 1) index - upper.length else index
                    upper[index]
                }
                it.isLowerCase() -> {
                    var index = lower.indexOf(it) + n
                    index = if (index > lower.length - 1) index - lower.length else index
                    lower[index]
                }
                else -> {
                    it
                }
            }
        }.joinToString("") { "$it" }
    }
}