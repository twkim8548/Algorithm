import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val r = br.readLine().toInt()
    val c = br.readLine().toInt()

    for (i in 0 until r) {
        for (i in 0 until c) {
            bw.write("*")
        }
        bw.write("\n")
    }
    

    bw.flush()
    bw.close()

    br.close()


}