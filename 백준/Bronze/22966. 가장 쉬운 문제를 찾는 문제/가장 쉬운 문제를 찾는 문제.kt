import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val map = mutableMapOf<String, Int>()
    repeat(n) {
        val token = StringTokenizer(br.readLine())
        map[token.nextToken()] = token.nextToken().toInt()
    }

    bw.write(map.toList().sortedBy { it.second }.first().first)


    bw.flush()
    br.close()
}
