package create_weird_characters

class Solution {
    fun solution(s: String): String {
        return s.split(" ").map {
            it.mapIndexed { index, c ->
                if (index % 2 == 0) c.toUpperCase()
                else c.toLowerCase()
            }
        }.joinToString(" ") { it.joinToString("") { answer -> "$answer" } }
    }
}