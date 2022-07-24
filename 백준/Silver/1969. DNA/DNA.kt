import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())

    val n = token.nextToken().toInt()
    val m = token.nextToken().toInt()

    val array = Array<String>(n) { br.readLine() }
    val cntMap = mutableMapOf<String, Int>()
    cntMap["A"] = 0
    cntMap["C"] = 0
    cntMap["G"] = 0
    cntMap["T"] = 0

    var answer = ""
    var diffCnt = 0

    for (i in 0 until m) {
        for (j in array.indices) {
            if (array[j][i] == 'A') cntMap["A"] = cntMap["A"]!!.plus(1)
            if (array[j][i] == 'C') cntMap["C"] = cntMap["C"]!!.plus(1)
            if (array[j][i] == 'G') cntMap["G"] = cntMap["G"]!!.plus(1)
            if (array[j][i] == 'T') cntMap["T"] = cntMap["T"]!!.plus(1)
        }
        val answerNucleotide = cntMap.toList().maxByOrNull { it.second }!!.first
        answer += answerNucleotide

        cntMap["A"] = 0
        cntMap["C"] = 0
        cntMap["G"] = 0
        cntMap["T"] = 0

        for (j in array.indices) {
            if (array[j][i].toString() != answerNucleotide) diffCnt++
        }
    }
    bw.write("$answer\n$diffCnt")


    bw.flush()
    bw.close()

    br.close()
}
