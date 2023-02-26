/**
 * Example :
 * input
 * arr = [1,1,0,-1,-1]
 *
 * output
 * 0.400000
 * 0.400000
 * 0.200000
 */

fun main() {
    plusMinus(arrayOf(1,1,0,-1,-1))
}

fun plusMinus(arr: Array<Int>) {
    var positive = 0
    var negative = 0
    var zero = 0

    for(number in arr) {
        when{
            number > 0 -> positive++
            number < 0 -> negative++
            else -> zero++
        }
    }

    println("%.6f".format(positive/arr.size.toDouble()))
    println("%.6f".format(negative/arr.size.toDouble()))
    println("%.6f".format(zero/arr.size.toDouble()))
}
