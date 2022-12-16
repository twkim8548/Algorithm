import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        var cnt = 0
        val n = br.readLine().toInt()
        val answer = br.readLine().toCharArray()
        val submit = br.readLine().toCharArray()

        for (i in 0 until n) {
            if (answer[i] != submit[i]) {
                cnt++
            }
        }
        bw.write("Case ${it+1}: $cnt\n")
    }

    bw.flush()
    bw.close()
}
