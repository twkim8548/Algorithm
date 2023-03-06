import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.pow
import kotlin.math.round

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    
    val a = br.readLine().toInt()
    val b = br.readLine().toInt()
    
    if (a < b) {
    bw.write("-1")
  } else if (a > b) {
        bw.write("1")
    } else {
    bw.write("0")
}

    bw.flush()
    bw.close()
}
