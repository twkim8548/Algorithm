import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val array = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_.".toCharArray()
    while(true) {
        val token = StringTokenizer(br.readLine())
        val n = token.nextToken().toInt()
        if (n == 0) {
            break
        }
        val string = token.nextToken().reversed()
        string.forEach {
            val idx = (array.indexOf(it) + n) % array.size
            bw.write("${array[idx]}")
        }
        bw.write("\n")
    }

    bw.flush()
    bw.close()
}
