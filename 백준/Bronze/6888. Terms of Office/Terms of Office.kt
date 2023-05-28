import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.time.OffsetDateTime
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val x = br.readLine().toInt()
    val y = br.readLine().toInt()

    for (i in x..y) {
        if ((i - x )% 60 == 0) {
            bw.write("All positions change in year ${i}\n")
        }
    }

    bw.flush()
    bw.close()
}