import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var s = br.readLine()
    repeat(br.readLine().toInt()) {
        val token = StringTokenizer(br.readLine())
        val a = token.nextToken().toInt()
        val b = token.nextToken().toInt()

        val aTmp = s[a]
        val bTmp = s[b]
        s = s.substring(0, a) + bTmp + s.substring(a + 1)
        s = s.substring(0, b) + aTmp + s.substring(b + 1)
    }

    bw.write(s)

    bw.flush()
    bw.close()
}