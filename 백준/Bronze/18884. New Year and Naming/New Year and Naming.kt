import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var token = StringTokenizer(br.readLine())
    val n = token.nextToken().toInt()
    val m = token.nextToken().toInt()

    token = StringTokenizer(br.readLine())
    val array = Array<String>(n) { token.nextToken() }

    token = StringTokenizer(br.readLine())
    val array2 = Array<String>(m) { token.nextToken() }

    val q = br.readLine().toInt()

    repeat(q) {
        val y = br.readLine().toInt()
        bw.write("${if(y % n == 0) array[n - 1] else array[(y % n) - 1]}${if(y % m == 0) array2[m - 1] else array2[(y % m) - 1]}\n")
    }

    bw.flush()
    bw.close()
}
