package calculator

class Value(private var value: String?) {
    companion object {
        private const val BLACK_SPACE = " "
    }

    init {
        require(value!!.isNotEmpty()) {
            "입력값은 필수입니다."
        }
    }

    fun valueSplit(): List<String> {
        return value!!.split(BLACK_SPACE)
    }
}
