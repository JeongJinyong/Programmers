package two_thousand_sixteen

import java.util.*

class Solution {
    fun solution(a: Int, b: Int): String {
        val answer = listOf("SUN","MON","TUE","WED","THU","FRI","SAT")
        val calendar = Calendar.getInstance(Locale.KOREA)
        calendar.set(2016,a,b)
        println(calendar)
        return answer[calendar.get(Calendar.DAY_OF_WEEK)-1]
    }
}