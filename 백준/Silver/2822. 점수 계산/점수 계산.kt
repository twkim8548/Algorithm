import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val map = mutableMapOf<Int, Int>()

    repeat(8) {
        map[it + 1] = br.readLine().toInt()
    }
    var array = map.toList().sortedByDescending { it.second }
    val scoreArray = IntArray(5)
    var sum = 0

    repeat(5) {
        sum += array[it].second
        scoreArray[it] = array[it].first
    }
    bw.write("$sum\n")

    scoreArray.sort()
    repeat(5) {
        bw.write("${scoreArray[it]} ")
    }

    bw.flush()
    br.close()
}