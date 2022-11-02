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
    val q = token.nextToken().toInt()

    val array = BooleanArray(n)

    repeat(q) {
        token = StringTokenizer(br.readLine())
        val l = token.nextToken().toInt()
        val i = token.nextToken().toInt()

        for (k in l-1 until n step i) {
            array[k] = true
        }
    }
    var answer = 0
    array.forEach {
        if (!it) answer++
    }
    bw.write("$answer")

    bw.flush()
    bw.close()
}
