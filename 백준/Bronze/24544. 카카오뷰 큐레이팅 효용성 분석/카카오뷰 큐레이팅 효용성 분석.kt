import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val token = StringTokenizer(br.readLine())
    val array = IntArray(n) { token.nextToken().toInt() }
    var all = 0
    var new = 0
    br.readLine().split(" ").forEachIndexed { index, s ->
        if (s.toInt() == 0) {
            new += array[index]
        }
        all += array[index]
    }
    bw.write("$all\n$new")

    bw.flush()
    bw.close()

    br.close()
}
