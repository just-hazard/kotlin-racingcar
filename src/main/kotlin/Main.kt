typealias justhis = Int
fun main() {
    val justhis = 10

    fun night(i:Int = 5) {
        println(i);
    }

    night(10);

    fun vararg(vararg postion:Int) {
        for (a: Int in postion)
            println(a)
    }

    vararg(1,2,3,4)

}
