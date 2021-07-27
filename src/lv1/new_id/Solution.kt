package lv1.new_id

class Solution {
    fun solution(new_id: String): String? {
        var answer = new_id.toLowerCase() //1
            .replace("[^a-z0-9\\-_\\.]".toRegex(), "") //2
            .replace("\\.\\.+".toRegex(), ".") //3
            .replace("\\.$".toRegex(), "").replace("^\\.".toRegex(), "") //4
        if (answer == "") {
            answer = "a" //5
        }
        val length = answer.length
        if (length >= 16) {
            answer = answer.substring(0, 15).replace("\\.$".toRegex(), "") // 6
        } else if (length <= 2) {
            answer += answer.substring(length - 1).repeat(3 - length)
        }
        return answer
    }
}