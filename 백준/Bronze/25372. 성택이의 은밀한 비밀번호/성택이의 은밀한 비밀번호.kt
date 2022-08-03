import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val pw = br.readLine()
        if (pw.length in 6..9) bw.write("yes\n")
        else bw.write("no\n")
    }
    bw.flush()
    bw.close()

    br.close()
}