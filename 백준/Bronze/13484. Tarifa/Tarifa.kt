import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import kotlin.math.pow

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val x = br.readLine().toInt()
    val n = br.readLine().toInt()
    var answer= 0
    repeat(n) {
        val pi = br.readLine().toInt()
        answer += pi
    }

    bw.write("${x * (n + 1) - answer}")


    bw.flush()
    bw.close()
}
