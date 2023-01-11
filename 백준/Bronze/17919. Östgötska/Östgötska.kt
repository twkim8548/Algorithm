import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().split(" ")

    var cnt = 0.0
    n.forEach {
        if (it.contains("ae")) {
            cnt++
        }
    }

    if (cnt / n.size >= 0.4) {
        bw.write("dae ae ju traeligt va")
    } else {
        bw.write("haer talar vi rikssvenska")
    }

    bw.flush()
    bw.close()
}
