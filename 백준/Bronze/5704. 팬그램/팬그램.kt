import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.time.OffsetDateTime
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while(true) {
        val map = mutableMapOf<Int, Boolean>()
        val string = br.readLine()
        if (string == "*" ) {
            break
        }
        repeat(26) {
            map[it] = false
        }

        string.replace(" ", "").forEach {
            map[it.toInt() - 97] = true
        }

        var isPangram = true
        map.forEach {
            if (!it.value) {
                isPangram = false
            }
        }

        if (isPangram) {
            bw.write("Y\n")
        } else {
            bw.write("N\n")
        }
    }


    bw.flush()
    br.close()
}
