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

    var n = br.readLine().toInt()

    while (true) {
        var sum = 0
        n.toString().forEach {
            sum += it.toString().toInt()
        }

        if (n % sum == 0) {
            break
        }

        n++
    }

    bw.write("$n")
    bw.flush()
    bw.close()
}
