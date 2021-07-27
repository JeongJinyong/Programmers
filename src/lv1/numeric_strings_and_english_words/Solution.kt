package lv1.numeric_strings_and_english_words

class Solution {
    fun solution(s: String): Int {
        var ss = s
        ss = ss.replace("zero","0")
        ss = ss.replace("one","1")
        ss = ss.replace("two","2")
        ss = ss.replace("three","3")
        ss = ss.replace("four","4")
        ss = ss.replace("five","5")
        ss = ss.replace("six","6")
        ss = ss.replace("seven","7")
        ss = ss.replace("eight","8")
        ss = ss.replace("nine","9")
        return ss.toInt()
    }
}