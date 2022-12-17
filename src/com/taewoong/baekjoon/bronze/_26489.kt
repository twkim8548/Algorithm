import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.min

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var cnt = 0
while(true){
    val string =br.readLine()
    
    if(string == null || string.length == 0) {
        break
    }
   cnt++
}
    bw.write("$cnt")
    bw.flush()
    bw.close()
}
