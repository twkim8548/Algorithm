import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.time.OffsetDateTime
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var owner = br.readLine()
    val history = mutableListOf<String>()
    history.add(owner)
    val n = br.readLine().toInt()
    repeat(n) {
        val token = StringTokenizer(br.readLine())
        val z1 = token.nextToken()
        val z2 = token.nextToken()

        if (owner == z2) {
            owner = z1
            if (!history.contains(owner)) {
                history.add(owner)
            }
        }
    }
    bw.write("$owner\n${history.size}")

    bw.flush()
    br.close()
}
