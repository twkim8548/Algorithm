import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer
import kotlin.math.pow
import kotlin.math.round

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val s = br.readLine().toInt()

    val array = br.readLine().toCharArray()

    var cntE = array.count { it == 'e' }
    var cnt2 = array.count { it == '2' }


    if (cnt2 > cntE){
        bw.write("2")
    } else if (cntE > cnt2) {
        bw.write("e")
    } else {
        bw.write("yee")
    }

    bw.flush()
    bw.close()
}
