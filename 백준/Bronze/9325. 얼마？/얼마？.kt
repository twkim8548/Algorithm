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

    repeat(br.readLine().toInt()) {
        var s = br.readLine().toInt()
        repeat(br.readLine().toInt()) {
            val token = StringTokenizer(br.readLine())
            s += (token.nextToken().toInt() * token.nextToken().toInt())
        }
        bw.write("$s\n")
    }

    bw.flush()
    bw.close()
}
