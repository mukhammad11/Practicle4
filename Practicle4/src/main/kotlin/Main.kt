fun main(args: Array<String>) {
    //Задание 1
    fun printFullName(firstName : String, lastName : String){
        println(firstName + " " + lastName)
    }
    printFullName("Mukhammad", "Soltukiev")
    //Конец 1 задания

    //Задание 2
    val firstName = "Mukhammad"
    val lastName = "Soltukiev"
    printFullName(firstName, lastName)
    //Конец 2 задания

    //Задание 3
    fun calculateFullName(): String {
        return "Mukhammad Soltukiev"
    }
    val fullName = calculateFullName()
    println(fullName)
    //Конец 3 задания

    //Задание 4
    fun calculateFullName2(firstName : String, lastName : String): Pair<String, Int>{
        return Pair(fullName, fullName.length-1)
    }
    //Конец 4 задания

    //Задание 5
    fun primeNumber(p: Int):Boolean{
        if (p < 2) return false
        for (i in 2..p - 1) {
            if (p % i == 0) return false
        }
        return true
    }
    println(primeNumber(4))
    //Конец 5 задания

    //Задание 6
    fun fibonacci(n: Int) : Int{
        var num1 = 0
        var num2 = 1
        var num3: Int
        if (n == 0) return 0
        else if (n == 1) return 1
        else
            for (i in 2 until n+1)
            {
                num3 = num1 + num2
                num1 = num2
                num2 = num3
            }
        return num2
    }
    println(fibonacci(9))
    //Конец 5 задания
}