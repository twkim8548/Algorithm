import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var map = mutableMapOf<String, Int>()

    repeat(br.readLine().toInt()) {
        val token = StringTokenizer(br.readLine())
        map[token.nextToken()] = token.nextToken().toInt()
    }
    map = map.toList().sortedBy { it.first }.sortedByDescending { it.second }.toMap().toMutableMap()

    bw.write(map.toList()[0].first)

    bw.flush()
    bw.close()

    br.close()
}
