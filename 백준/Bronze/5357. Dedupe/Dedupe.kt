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

        var char = string[0]
        bw.write("$char")
        for (i in 1 until string.length) {
            if (char != string[i]) {
                bw.write("${string[i]}")
            }
            char = string[i]
        }
        bw.write("\n")
    }


    bw.flush()
    bw.close()
}