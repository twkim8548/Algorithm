import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val token = StringTokenizer(br.readLine())
        val a = token.nextToken().toInt()
        val b = token.nextToken().toInt()
        if (a == 0 && b == 0) break

        bw.write("${findC(a, b)}\n")
    }


    bw.flush()
    bw.close()

    br.close()
}

fun findC(a: Int, b: Int): Int {
    return (3 * a) - (a + b)
}
