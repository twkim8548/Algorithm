import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.min


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())
    val a = token.nextToken().toInt()
    val b = token.nextToken().toInt()

    for (i in 1 ..min(a, b)) {
        if ( a % i == 0 && b % i == 0) {
            bw.write("$i ${a/i} ${b/i}\n")
        }
    }


    bw.flush()

    br.close()
}
