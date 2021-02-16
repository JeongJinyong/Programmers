package lv1.hide_cell_phone_number

class Solution {
    fun solution(phone_number: String): String {
        return phone_number.mapIndexed { index, c ->
            if (index < phone_number.length - 4) "*"
            else c.toString()
        }.joinToString("")
    }
}