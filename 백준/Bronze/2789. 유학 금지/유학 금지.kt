import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    bw.write(
        br.readLine()
                .replace("C", "")
                .replace("A", "")
                .replace("M", "")
                .replace("B", "")
                .replace("R", "")
                .replace("I", "")
                .replace("D", "")
                .replace("G", "")
                .replace("E", "")
    )

    bw.flush()
    bw.close()

    br.close()
}