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

    val token = StringTokenizer(br.readLine())
    val x = token.nextToken().toInt()
    val y = token.nextToken().toInt()

    var xNum = 0
    var yNum = 0
    while (xNum < x || yNum < y) {
        if (xNum < x) {
            xNum++
            bw.write("$xNum:$yNum\n")
        }
        if (yNum < y) {
            yNum++
            bw.write("$xNum:$yNum\n")
        }
    }

    bw.flush()
    bw.close()
}
