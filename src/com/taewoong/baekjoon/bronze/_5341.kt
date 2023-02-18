import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    while(true) {
        
    val n = br.readLine().toInt()
        if (n == 0) {
            break
        }
        var answer = 0
        for (i in 1 .. n) {
            answer += i
        }
    

        bw.write("$answer\n")
    }
    bw.flush()
    bw.close()
}
