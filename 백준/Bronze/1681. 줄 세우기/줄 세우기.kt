import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())
    val n = token.nextToken().toInt()
    val l = token.nextToken().toInt()
    val array = mutableListOf<Int>()
    var i = 0
    while (true) {
        i++
        if (i.toString().contains(l.toString())) {
            continue
        }
        array.add(i)
        if (array.size == n) {
            break
        }
    }

    bw.write("${array.last()}")

    bw.flush()
    br.close()
}
