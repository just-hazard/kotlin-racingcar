package calculator

class StringCalculator {

    fun calculation(inputValue: String) : Int {
        // 객체에 넘긴후 값이 비었는지 널인지 확인
        // 넘긴값을 빈공백 기준으로 잘라서 List형태로 리턴
        val list = Value(inputValue).valueSplit()
        // 루프를 돌면서 숫자가 아니면 그값을 기준으로 앞뒤값 가져와서 arithmeticOperationCheck 메서드 호출 (가능한가?)
        var result = valueToInt(list[0])
        for(i in 1 until list.count() step(2)) {
            result = arithmeticOperationCheck(list[i], Pair(result, valueToInt(list[i+1])))
        }
        // 해당값을 누적해서 쌓고 결과값 리턴
        return result
    }

    private fun valueToInt(number: String) : Int {
        return number.toInt()
    }
}
