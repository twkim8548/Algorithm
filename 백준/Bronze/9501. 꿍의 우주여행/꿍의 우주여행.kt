import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()){
        var token = StringTokenizer(br.readLine())
        val n = token.nextToken().toInt()
        val d = token.nextToken().toInt()

        var cnt = 0
        repeat(n) {
           token = StringTokenizer(br.readLine())
           val v = token.nextToken().toDouble()
           val f = token.nextToken().toInt()
           val c = token.nextToken().toDouble()

           if ((v * f / c) >= d.toDouble()) {
               cnt++
           }
        }
        bw.write("$cnt\n")
    }

    bw.flush()
    bw.close()
}
