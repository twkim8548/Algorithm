import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val name = br.readLine().split(" ")
        name.forEachIndexed { index, s ->
            if (index == 0) {
                bw.write("god")
            } else {
                bw.write(s)
            }
        }
        bw.write("\n")
    }

    bw.flush()
    bw.close()

    br.close()
}
