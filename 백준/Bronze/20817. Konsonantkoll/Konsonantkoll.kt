import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.*
import kotlin.math.abs
import kotlin.math.ceil
import kotlin.math.pow
import kotlin.math.roundToInt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val string = br.readLine()
    val consonant = "bcdfghjklmnpqrstvwxz"

    var answer = ""

    var cnt = 0
    var beforeString = ""
    string.forEach {
        if (consonant.contains(it.toString())) {
            if (beforeString == it.toString()) {
                cnt++
            } else {
                cnt = 0
            }
            if (cnt < 2) {
                answer += it.toString()
            }
        } else {
            answer += it.toString()
        }
        beforeString = it.toString()
    }
    bw.write(answer)

    bw.flush()
    bw.close()
}
