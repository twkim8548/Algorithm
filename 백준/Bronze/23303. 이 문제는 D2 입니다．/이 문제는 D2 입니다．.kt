import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val string = br.readLine()

    if (string.contains("d2") || string.contains("D2")) bw.write("D2")
    else bw.write("unrated")
    bw.flush()
    bw.close()

    br.close()
}
