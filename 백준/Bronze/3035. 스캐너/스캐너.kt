import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())
    val r = token.nextToken().toInt()
    val c = token.nextToken().toInt()
    val zr = token.nextToken().toInt()
    val zc = token.nextToken().toInt()

    val array = Array<String>(r) { br.readLine() }

    array.forEach { string ->
        repeat(zr) {
            string.forEach { char ->
                repeat(zc) {
                    bw.write("$char")
                }
            }
            bw.write("\n")
        }
    }

    bw.flush()
    br.close()
}