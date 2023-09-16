import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.StringTokenizer
import kotlin.math.pow

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val token = StringTokenizer(br.readLine())
        val total = token.nextToken().toInt()
        val give = token.nextToken().toInt()
        bw.write("You get ${total / give} piece(s) and your dad gets ${total % give} piece(s).\n")
    }

    bw.flush()
    br.close()
}
