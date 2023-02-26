fun main() {
    minMaxSum(arrayOf(1,3,5,7,9))
}

fun minMaxSum(array: Array<Int>): Unit {
    var min: Long = array[0].toLong()
    var max: Long = 0
    var total: Long = 0

    for(i in 0 until array.size) {
        var item = array[i].toLong()
        total += item

        if(item < min) {
            min = item
        }
        if(item > max) {
            max = item
        }
    }
    println("${total - max} ${total - min}")
}

