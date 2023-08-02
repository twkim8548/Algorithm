import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.*
import kotlin.math.abs

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    var char = ""
    var cnt = 0
    repeat(n) {
        var tmp =  br.readLine()
        if (char != tmp) {
            cnt++
        }
        char = tmp
    }
    bw.write("${cnt + 1}")
    bw.flush()
    bw.close()
}
