import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.time.OffsetDateTime
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val string = br.readLine()
        var answer = 0

        for (i in string.indices) {
            if (string[i] == 'U') {
                answer ++
            }else if (string[i] == 'D'){
                break
            }
        }
        
        bw.write("$answer\n")
    }

    bw.flush()
    bw.close()
}