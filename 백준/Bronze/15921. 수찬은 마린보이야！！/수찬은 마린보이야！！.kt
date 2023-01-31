import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    if (n == 0) {
        bw.write("divide by zero")
    } else {
        val token = StringTokenizer(br.readLine())
        val array = IntArray(n) { token.nextToken().toInt() }

        val average = array.average()
        var expected = 0.0
        array.distinct().forEach { num ->
            expected += (num * (array.count { it == num }).toDouble() / array.size.toDouble())
        }
        bw.write(String.format( "%.2f" ,average / expected))
    }


    bw.flush()
    bw.close()
}


