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
        br.readLine().forEach {
            when(it) {
                'A' -> cnt += 1
                'B' -> cnt += 2
                'D' -> cnt += 1
                'O' -> cnt += 1
                'Q' -> cnt += 1
                'P' -> cnt += 1
                'R' -> cnt += 1
            }
        }
        bw.write("$cnt\n")

    }
    bw.flush()
    br.close()
}
