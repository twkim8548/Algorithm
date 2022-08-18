import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    for (i in 0 until n + 2) {
        if (i == 0 || i == n + 1) {
            for (j in 0 until n+2) {
                bw.write("@")
            }
        } else {
            bw.write("@")
            repeat(n) {
                bw.write(" ")
            }
            bw.write("@")
        }
        bw.write("\n")
    }
    
    bw.flush()
    bw.close()

    br.close()
}