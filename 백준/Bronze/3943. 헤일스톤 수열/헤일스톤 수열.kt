import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        var n = br.readLine().toInt()
        var max = n
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2
                if (max < n) max = n
            } else {
                n = 3 * n + 1
                if (max < n) max = n
            }
        }
         bw.write("${max}\n")
    }


    bw.flush()
    bw.close()

    br.close()
}
