import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val map = mutableMapOf<Int, Boolean>()
        repeat(26) {
            map[it] = false
        }

        var n = br.readLine()
        n = n
            .replace(".", "")
            .replace(",", "")
            .replace("?", "")
            .replace("!", "")
            .replace("\'", "")
            .replace("\"", "")
            .replace(" ", "")
            .lowercase()
        n.forEach {
            map[it.code - 97] = true
        }
        val array = mutableListOf<String>()

        repeat(26) {
            if (!map[it]!!) {
                array.add((it + 97).toChar().toString())
            }
        }
        if (array.size > 0) {
            bw.write("missing ")
            array.forEach {
                bw.write(it)
            }
        } else {
            bw.write("pangram")
        }
        bw.write("\n")

    }
    bw.flush()
    bw.close()
}
