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

    val answer = br.readLine().toInt()
    var cnt = 0
    br.readLine().split(" ").forEach {
        if (it.toInt() == answer) {
            cnt++
        }
    }

    bw.write("$cnt")
    bw.flush()
    bw.close()
}
