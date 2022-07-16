import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        var token = StringTokenizer(br.readLine())
        val n = token.nextToken().toInt()
        val m = token.nextToken().toInt()

        token = StringTokenizer(br.readLine())
        val array = mutableListOf<Pair<Int, Int>>()
        repeat(n) {
            array.add(Pair(token.nextToken().toInt(), it))
        }

        var cnt = 0
        while (array.isNotEmpty()) {
            if (array[0].first >= Collections.max(array.map { it.first })!!) {
                cnt++
                if (array[0].second == m) {
                    break
                }
                array.removeAt(0)
            } else {
                array.add(array[0])
                array.removeAt(0)
            }
        }

        bw.write("$cnt\n")
    }

    bw.flush()
    bw.close()

    br.close()
}
