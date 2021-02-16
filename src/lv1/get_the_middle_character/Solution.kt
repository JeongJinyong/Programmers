package lv1.get_the_middle_character

import kotlin.math.roundToInt

class Solution {
    fun solution(s: String): String {
        var answer = ""
        val middle = (s.length.toFloat() / 2).roundToInt()
        answer = if(s.length % 2 == 0){
            "${s[middle-1]}${s[middle]}"
        }else{
            "${s[middle-1]}"
        }
        return answer
    }
}