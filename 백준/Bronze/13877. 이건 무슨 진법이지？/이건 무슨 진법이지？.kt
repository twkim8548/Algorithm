import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val token = StringTokenizer(br.readLine())
        val t = token.nextToken().toInt()
        val k = token.nextToken()
        bw.write("$t ")
        var eight = 0
        if (k.contains('8') || k.contains('9')) {
            eight = 0
        } else {
            eight = k.toInt(8)
        }
        bw.write("$eight ${k.toInt(10)} ${k.toInt(16)}\n")
    }

    bw.flush()
    br.close()
}