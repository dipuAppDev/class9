fun main(args: Array<String>) {
    /**
     * for loop
     */
//    for(i in 10 downTo 1 step 2){
//        println(i)
//    }

    /**
     * when expression practice
     */
    //program-1
//    var a:Int = readLine()!!.toInt()
//    var b:Int = readLine()!!.toInt()
//    var operator = readLine()
//    var result = when(operator){
//        "+" -> {
//            a+b
//        }
//        "-" -> {
//            a-b
//        }
//        "*" -> {
//            a*b
//        }
//        "/" -> {
//            a/b
//        }
//        "%" -> {
//            a%b
//        }
//        else -> {
//            "$operator is not valid"
//        }
//    }
//    println("Result is = $result")


    /**
     * class-work//problem-1//swapping program
     */
//    var a = 10
//    var b = 12
//    var temp=a
//    a=b
//    b=temp
//    println("a = $a and b = $b")

    /**
     * Normal factorial program
     */
//    print("Enter a number : ")
//    var n = readLine()!!.toLong()
//    var fact: Long = 1
//    for (i in 1..n) {
//        fact *= i
//    }
//    println("Factorial is : $fact")

    /**
     * fibonacci series program
     */
    var n = 20
    var a = 0
    var b = 1

    for (i in 1..n) { // i=1->2
        print("$a ")//0//1
        var next = a + b//0+1=1//1+1=2
        a = b//1>1
        b = next//1->2

    }

}