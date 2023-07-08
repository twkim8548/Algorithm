import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import kotlin.math.pow

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while(true) {
        val n = br.readLine().toDouble()
        if (n == 0.0) {
            break
        }

        var overhang = 0.0
        var cnt = 0
        while (overhang < n) {
            cnt++
            overhang += 1.0 / (cnt + 1)
        }

        bw.write("${cnt} card(s)\n")
    }

    bw.flush()
    bw.close()
}
