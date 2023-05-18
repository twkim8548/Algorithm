import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var apple = 0
    var banana = 0

    apple += br.readLine().toInt() * 3
    apple += br.readLine().toInt() * 2
    apple += br.readLine().toInt() * 1

    banana += br.readLine().toInt() * 3
    banana += br.readLine().toInt() * 2
    banana += br.readLine().toInt() * 1

    if (apple > banana) {
        bw.write("A")
    } else if (apple < banana) {
        bw.write("B")
    } else{
        bw.write("T")
    }
    bw.flush()
    bw.close()
}