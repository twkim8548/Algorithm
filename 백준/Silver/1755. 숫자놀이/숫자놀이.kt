import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())

    val n = token.nextToken().toInt()
    val m = token.nextToken().toInt()

    var map = mutableMapOf<Int, String>()

    for (i in n .. m) {
        map[i] = getStringToNumber(i)
    }

    map = map.toList().sortedBy { it.second }.toMap().toMutableMap()

    var cnt = 0
    map.forEach {
        bw.write("${it.key} ")
        cnt++
        if (cnt == 10) {
            cnt = 0
            bw.write("\n")
        }
    }

    bw.flush()
    br.close()
}

fun getStringToNumber(n: Int): String {
    var string = ""
    n.toString().forEach {
        when(it) {
            '0' -> string +="zero"
            '1' -> string +="one"
            '2' -> string +="two"
            '3' -> string +="three"
            '4' -> string +="four"
            '5' -> string +="five"
            '6' -> string +="six"
            '7' -> string +="seven"
            '8' -> string +="eight"
            '9' -> string +="nine"
        }
    }

    return string

}
