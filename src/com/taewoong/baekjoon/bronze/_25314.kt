import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
     
    val n = br.readLine().toInt()
    
    repeat(n/4){
        bw.write("long ")
    }
    bw.write("int")
    bw.flush()
    bw.close()

}
