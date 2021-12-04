import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val answer = br.readLine()[0].toInt() - 44031
    
   	bw.write("$answer")
    bw.flush()
    bw.close()
    br.close()
}
