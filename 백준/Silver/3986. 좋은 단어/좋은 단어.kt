import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var answer = 0

    repeat(br.readLine().toInt()) {
        val array = mutableListOf<Char>()

        val string = br.readLine()

        string.forEach {
            if (!array.isEmpty() && array.last() == it) {
                array.removeAt(array.lastIndex)
            } else {
                array.add(it)
            }
        }
        if (array.isEmpty()) answer++
    }

    bw.write("$answer")
    bw.flush()
    bw.close()

    br.close()
}
