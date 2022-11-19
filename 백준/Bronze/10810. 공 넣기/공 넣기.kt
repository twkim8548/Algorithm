import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var token = StringTokenizer(br.readLine())

    val n = token.nextToken().toInt()
    val m = token.nextToken().toInt()

    var array = IntArray(n)

    repeat(m) {
        token = StringTokenizer(br.readLine())
        val i = token.nextToken().toInt()
        val j = token.nextToken().toInt()
        val k = token.nextToken().toInt()

        for (idx in i-1 until j) {
            array[idx] = k
        }
    }

    array.forEach {
        bw.write("$it ")
    }

    bw.flush()
    bw.close()
}