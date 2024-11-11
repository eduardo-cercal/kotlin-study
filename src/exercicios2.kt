import kotlin.math.pow


fun main() {
    yearTranslate(2)

    println(stringLength("batata"))

    println(calcCube(3.0))

    println(convertMiles(2.0))

    changeLetter("batata")
}

fun yearTranslate(year: Int) {
    println("$year ano(s) equivale a:")
    println("${year.times(12)} meses")
    println("${year.times(365)} dias")
    println("${(year.times(365).times(24))} horas")
    println("${((year.times(365).times(24))).times(60)} minutos")
    println("${(((year.times(365).times(24))).times(60)).times(60)} segundos")
}

fun stringLength(string: String) = string.length

fun calcCube(number: Double) = number.pow(3.0)

fun convertMiles(miles: Double) = miles.times(1.6)

fun changeLetter(word: String) {
    val changedWord = word.replace('a', 'x', true)

    println(changedWord.uppercase())
}