import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer
import kotlin.math.pow

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val token = StringTokenizer(br.readLine())
        val height = token.nextToken().toDouble()
        val weight = token.nextToken().toInt()
        val bmi = weight / (height / 100).pow(2)

        var grade = 0

        if (height < 140.1) {
            grade = 6
        } else if (height < 146) {
            grade = 5
        } else if (height < 159) {
            grade = 4
        } else if (height < 161) {
            grade = if (bmi >= 16.0 && bmi < 35.0) {
                3
            } else {
                4
            }
        } else if (height < 204) {
            grade = if (bmi >= 20.0 && bmi < 25.0) {
                1
            } else if ((bmi >= 18.5 && bmi < 20.0) || (bmi >= 25.0 && bmi < 30.0)) {
                2

            } else if ((bmi >= 16.0 && bmi < 18.5) || (bmi >= 30.0 && bmi < 35.0)) {
                3
            } else {
                4
            }
        } else {
            grade = 4
        }
    bw.write("$grade\n")
    }


    bw.flush()
    br.close()
}
