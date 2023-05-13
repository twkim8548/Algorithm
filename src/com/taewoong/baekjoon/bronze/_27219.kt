import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    for(i in 0 until n/5) {
        bw.write("V")
    } 
    for(i in 0 until n%5) {
        bw.write("I")
    }

    bw.flush()
    bw.close()
}
