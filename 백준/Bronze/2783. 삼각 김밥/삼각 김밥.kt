import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var token = StringTokenizer(br.readLine())
    var x = token.nextToken().toDouble()
    var y = token.nextToken().toDouble()
    var min = x / y * 1000.00

    repeat(br.readLine().toInt()) {
       token = StringTokenizer(br.readLine())
         x = token.nextToken().toDouble()
         y = token.nextToken().toDouble()
       if (x/y * 1000 < min) {
           min = x/y * 1000.00
       }
    }

    bw.write(String.format("%.2f", min))

    bw.flush()
    bw.close()
}
