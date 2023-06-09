import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.time.OffsetDateTime
import java.util.StringTokenizer
import kotlin.math.min

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    bw.write("  ___  ___  ___\n" +
            "  | |__| |__| |\n" +
            "  |           |\n" +
            "   \\_________/\n" +
            "    \\_______/\n" +
            "     |     |\n" +
            "     |     |\n" +
            "     |     |\n" +
            "     |     |\n" +
            "     |_____|\n" +
            "  __/       \\__\n" +
            " /             \\\n" +
            "/_______________\\")

    bw.flush()
    bw.close()
}