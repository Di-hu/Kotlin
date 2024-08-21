fun main(){
    //Array of Integers
    var numbers=arrayOf(1,2,3,4,5)
    //Array of strings
    var words:Array<String> =arrayOf("Kotlin","Java","Python")
    //Array of Arrays
    var multi= arrayOf(arrayOf(1,2,3,4,5), arrayOf(5,6,7,8,9,10), arrayOf(11,12,13,14,15))
    // Array of squares using lambda function
    val squares=Array(5) {i->i*i}
    var firstNumber=numbers[0]
    var secondWord=words[1]
    println("First number: $firstNumber")
    println("Second word: $secondWord")
    numbers[2]=30
    println("Modified third number: ${numbers[2]}")
}