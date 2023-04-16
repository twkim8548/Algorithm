import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer
import kotlin.math.pow

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var token = StringTokenizer(br.readLine())
    val n = token.nextToken().toInt()
    val x = token.nextToken().toInt()
    val k = token.nextToken().toInt()

    val array = BooleanArray(n)
    array[x - 1] = true

    repeat(k) {
        token = StringTokenizer(br.readLine())

        val a = token.nextToken().toInt()
        val b = token.nextToken().toInt()

        val temp = array[a-1]
        array[a-1] = array[b-1]
        array[b-1] = temp
    }

    bw.write("${array.indexOf(true) + 1}")

    bw.flush()
    br.close()
}
