import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer
import kotlin.math.floor
import kotlin.math.sqrt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    bw.write("Latitude ${br.readLine().trim().length}:${br.readLine().trim().length}:${br.readLine().trim().length}\n")
    bw.write("Longitude ${br.readLine().trim().length}:${br.readLine().trim().length}:${br.readLine().trim().length}")

    bw.flush()
    br.close()
}
