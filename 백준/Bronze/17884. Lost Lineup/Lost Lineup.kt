import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val token = StringTokenizer(br.readLine())

    val array = IntArray(n - 1){token.nextToken().toInt()}

    val map = mutableMapOf<Int, Int>()

    array.forEachIndexed { index, i ->
        map[index + 1] = i
    }

    val sortedMap = map.toList().sortedBy { it.second }.toMap()

    bw.write("1 ")
    sortedMap.forEach{
        bw.write("${it.key + 1} ")
    }

    bw.flush()
    bw.close()
}