package lv1.press_the_keypad

class Solution {
    fun solution(numbers: IntArray, hand: String): String {
        var answer = ""
        val keypad = listOf(arrayOf("1", "4", "7", "*"), arrayOf("2", "5", "8", "0"), arrayOf("3", "6", "9", "#"))
        var leftHand = Pair(0, 3)
        var rightHand = Pair(2, 3)
        numbers.forEach { number ->
            if (number == 3 || number == 6 || number == 9) {
                answer += "R"
                rightHand = rightHand.copy(2, keypad.let {
                    it[2].indexOf(number.toString())
                })
            } else if (number == 1 || number == 4 || number == 7) {
                answer += "L"
                leftHand = leftHand.copy(0, keypad.let {
                    it[0].indexOf(number.toString())
                })
            } else {
                val index = keypad.let {
                    it[1].indexOf(number.toString())
                }
                var leftDifference = (leftHand.first - 1).abs()
                var rightDifference = (rightHand.first - 1).abs()
                leftDifference += (leftHand.second - index).abs()
                rightDifference += (rightHand.second - index).abs()
                when {
                    leftDifference == rightDifference -> {
                        when (hand) {
                            "left" -> {
                                answer += "L"
                                leftHand = leftHand.copy(1, keypad.let {
                                    it[1].indexOf(number.toString())
                                })
                            }
                            "right" -> {
                                answer += "R"
                                rightHand = rightHand.copy(1, keypad.let {
                                    it[1].indexOf(number.toString())
                                })
                            }
                        }
                    }
                    leftDifference > rightDifference -> {
                        answer += "R"
                        rightHand = rightHand.copy(1, keypad.let {
                            it[1].indexOf(number.toString())
                        })
                    }
                    else -> {
                        answer += "L"
                        leftHand = leftHand.copy(1, keypad.let {
                            it[1].indexOf(number.toString())
                        })
                    }
                }
            }
        }
        return answer
    }

    private fun Int.abs():Int{
        return if(this < 0) this * -1
        else this
    }
}