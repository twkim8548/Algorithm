import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.*
import kotlin.math.ceil
import kotlin.math.pow
import kotlin.math.roundToInt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var answer = 0
    repeat(br.readLine().toInt()) {
        val string = br.readLine()
        var isWin = true
        for (i in 1 until string.length) {
            if (string[i-1] == 'C' && string[i] == 'D') {
                isWin = false
            }
        }
        if (isWin) {
            answer++
        }
    }
        bw.write("$answer")
    bw.flush()
    bw.close()
}
