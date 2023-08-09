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

    val array = br.readLine().split(" ")
    var cnt = 0
    array.forEach {
        if (it.toInt() > 0)
            cnt++
    }

    bw.write("$cnt")

    bw.flush()
    bw.close()
}
