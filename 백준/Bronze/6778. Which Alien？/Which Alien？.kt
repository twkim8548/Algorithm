import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.time.OffsetDateTime
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val a = br.readLine().toInt()
    val b = br.readLine().toInt()

    if (a >= 3 && b <= 4) {
        bw.write("TroyMartian\n")
    }
    if (a <= 6 && b >= 2) {
        bw.write("VladSaturnian\n")
    }
    if (a <= 2 && b <= 3) {
        bw.write("GraemeMercurian\n")
    }

    bw.flush()
    bw.close()
}