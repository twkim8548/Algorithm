import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer
import kotlin.math.max


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val array = IntArray(n)

    repeat(n) {
        val token = StringTokenizer(br.readLine())
        val a = token.nextToken().toInt()
        val b = token.nextToken().toInt()
        val c = token.nextToken().toInt()

        if (a == b && b == c) {
            array[it] = 10000 + (a * 1000)
        } else if (a == b || a == c || b == c) {
            if (a == b || a == c) array[it] = 1000 + (a * 100)
            if (b == c) array[it] = 1000 + (b * 100)
        } else  {
            array[it] = max(max(a,b),max(b,c)) * 100
        }
    }
    bw.write("${array.maxOrNull()}")

    bw.flush()
    bw.close()

    br.close()
}