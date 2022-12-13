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
    val hate = IntArray(n) {token.nextToken().toInt()}

    var cnt = 0

    repeat(br.readLine().toInt()) {
        token = StringTokenizer(br.readLine())
        val array = IntArray(token.nextToken().toInt()) {token.nextToken().toInt()}

        var isHate = false
        array.forEach {i ->
            hate.forEach { j ->
                if (i == j ) {
                    isHate = true
                }
            }
        }

        if (!isHate) cnt++
    }

    bw.write("$cnt")



    bw.flush()
    bw.close()
}
