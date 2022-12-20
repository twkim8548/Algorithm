import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer
import kotlin.math.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val token = StringTokenizer(br.readLine())
        val sum = token.nextToken().toInt() * 0.15 + token.nextToken().toInt() * 0.2 + token.nextToken().toInt() * 0.25
        var final = 100

        if (sum + (final) * 0.4 < 90) {
            bw.write("impossible\n")
        } else {
           final = 0
           while (final <= 100) {
               if (sum + (final) * 0.4 >= 90) {
                   bw.write("$final\n")
                   break
               }
               final++
           }
        }
    }

    bw.flush()
    bw.close()
}
