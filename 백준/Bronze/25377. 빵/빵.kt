import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val array = mutableListOf<Int>()
    repeat(br.readLine().toInt()) {
        val token= StringTokenizer(br.readLine())
        val a = token.nextToken().toInt()
        val b = token.nextToken().toInt()

        if (a <= b) array.add(b)
    }
    if (array.isEmpty()) bw.write("-1")
    else bw.write("${array.minOrNull()}")

    bw.flush()
    bw.close()

    br.close()
}
