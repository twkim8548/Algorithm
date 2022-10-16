import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var cnt = 2
    while(true) {
        val string = br.readLine()

        if (string == "Was it a cat I saw?")
            break


        for (i in string.indices step cnt) {
            bw.write("${string[i]}")
        }
        bw.write("\n")
        cnt += 1
    }

    bw.flush()
    br.close()
}
