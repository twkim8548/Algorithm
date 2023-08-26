import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.time.LocalDate
import java.util.Date
import java.util.StringTokenizer
import kotlin.math.pow

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val str = br.readLine()
    if(str == "M") {
        bw.write("MatKor")
    }else if (str == "W") {
        bw.write("WiCys")
    }else if (str == "C") {
        bw.write("CyKor")
    } else if (str == "A") {
        bw.write("AlKor")
    } else {
        bw.write("\$clear")
    }


    bw.flush()
    bw.close()
}
