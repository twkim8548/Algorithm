import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val str = br.readLine()
    var ans = ""
    var idx = 0
    while (true) {
        val now = str[idx]
        ans += now
        idx += now.code - 'A'.code + 1
        if (idx > str.length - 1) break
    }
    bw.write(ans)

    bw.flush()
    bw.close()
}