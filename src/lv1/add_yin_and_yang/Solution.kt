package lv1.add_yin_and_yang

class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        return signs.zip(absolutes.toList()).map { if(it.first) it.second else -it.second}.sum()
    }
}