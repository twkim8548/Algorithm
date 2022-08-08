import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.collections.ArrayList


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val string = br.readLine()
    val array = ArrayList<String>()
    var n = 1

    for (i in 1 .. string.length - 2) {
        for (j in i+1 .. string.length - 1) {
            array.add(string.substring(0 until i).reversed() + string.substring(i until j).reversed() + string.substring(j).reversed())
        }
    }

    array.sort()
    bw.write("${array[0]}")


    bw.flush()
    bw.close()

    br.close()
}