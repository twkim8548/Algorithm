import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.StringBuilder

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    bw.write("${fibonacci(br.readLine().toInt())}")
    bw.flush()
    bw.close()

    br.close()
}

fun fibonacci(n: Int): Int {

    if (n < 2) {
        return n
    } else {
        return fibonacci(n - 1) + fibonacci(n - 2)
    }

}