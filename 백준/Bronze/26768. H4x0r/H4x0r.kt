import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    bw.write("${br.readLine().replace("a", "4").replace("e", "3").replace("i", "1").replace("o", "0").replace("s", "5")}\n")

    bw.flush()
    bw.close()
}