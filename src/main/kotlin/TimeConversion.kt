import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.Date

/**
 * Example :
 * input
 * 12:01:00AM
 *
 * output
 * 00:01:00
 */



fun main() {
    timeConvert("12:01:00AM")
}

fun timeConvert(time: String) {

    var inFormat = SimpleDateFormat( "hh:mm:ssaa")
    var outFormat = SimpleDateFormat( "HH:mm:ss")

    var date: Date ?= null
    var updateTime = ""

    try {
        date = inFormat.parse(time)
    }catch (e: ParseException){
        e.printStackTrace()
    }
    if( date != null ){
        updateTime = outFormat.format(date)

    }

    println(updateTime)
}