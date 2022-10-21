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

    val array = IntArray(n)

    repeat(n) {
        array[it] = it + 1
    }

    repeat(m) {
        token = StringTokenizer(br.readLine())

        val a = token.nextToken().toInt()
        val b = token.nextToken().toInt()

        val tmp = array[a-1]
        array[a-1] = array[b-1]
        array[b-1] = tmp
    }

    array.forEach {
        bw.write("$it ")
    }

    bw.flush()
    bw.close()
}
