import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())

    val wc = token.nextToken().toInt()
    val hc = token.nextToken().toInt()
    val ws = token.nextToken().toInt()
    val hs = token.nextToken().toInt()

    if (wc > ws + 1 && hc > hs + 1) bw.write("1")
    else bw.write("0")

    bw.flush()
    bw.close()

    br.close()
}
