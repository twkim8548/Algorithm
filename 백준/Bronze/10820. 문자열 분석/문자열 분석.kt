import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.min

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        var lowerCnt = 0
        var upperCnt = 0
        var numberCnt = 0
        var spaceCnt = 0
        val string = br.readLine()
        if (string == "" || string == null) break
        string.forEach {
            if (it.code == 32) {
                spaceCnt++
            } else if (it.code in 48..57) {
                numberCnt++
            } else if (it.code in 97..122) {
                lowerCnt++
            } else {
                upperCnt++
            }
        }

        bw.write("$lowerCnt $upperCnt $numberCnt $spaceCnt\n")
    }

    bw.flush()
    bw.close()
}
