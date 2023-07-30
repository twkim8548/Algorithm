import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer
import kotlin.math.pow

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    when (br.readLine()) {
        "SONGDO" -> bw.write("HIGHSCHOOL")
        "CODE" -> bw.write("MASTER")
        "2023" -> bw.write("0611")
        "ALGORITHM" -> bw.write("CONTEST")
    }
    bw.flush()
    br.close()
}
