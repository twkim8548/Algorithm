import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val k = br.readLine().toInt()
        if (k == 1 || k == 2) bw.write("1\n")
        else bw.write("1\n")
    }

    bw.flush()
    br.close()
}