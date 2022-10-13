import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val string = br.readLine()
        if (string == "#") break
        val answer = mutableListOf<Char>()
        string.uppercase().toCharArray().distinct().forEach {
            if (it.code in 65 .. 90) {
                answer.add(it)
            }
        }
        bw.write("${answer.size}\n")
    }

    bw.flush()
    bw.close()
}