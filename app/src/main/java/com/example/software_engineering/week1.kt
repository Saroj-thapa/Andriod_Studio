package com.example.software_engineering

fun main(){
    // println("Hello world")

    // mutable variable
    var name = "kritan"
    name = "ram"
    var firstName = "kritan"
    var lastName = "thapa"
    println("$firstName $lastName") // if we want to use variable we should use $
    println("${firstName.length}") // if we want too use variable with property use{}

    var name1 : String = "Ajay" // deceleration of variable

    //immutable varaible
    val a = 10
    val age : Int = 18

    //array
    var address = arrayOf("Ktm","Pokhara","Nuwakot")
//    address[3] = "jhapa"
//    println(address[3]) it gives error
    // capital array list
    var data = ArrayList<Any>() // it cannot be initialized // any is used for any data type
    data.add(1)
    data.add(2)
    data.add("ram")

    var address1 = arrayListOf("ktm","chitwan") // it can be initialized
    address1.add("jhapa")

    // there are two types of arraylist in capital array we can't initialized but in small it can
    // be initialized

    // dictionary
    var dictionary = mapOf(
        "Apple" to "This is fruit",
        "Samsung" to "This is brand"
    )
    println("The value of Apple $dictionary[Apple]")

    // in kotlin the switchcase is refered to when function
    // for function
    for(i in 0 until  5){
        print(i)
    }
    // making function
//    public int calculate (int a, int b){ this of java
//
//    }
    //mutable Variable
    var age = 100;
    age = 20

//immutable Varibale
    val speed = 100
    //speed = 10

//Data types
    /*
    var a : Boolean = true;
    var b : Char = 'R'
    var c : Byte = 12
    var d : Short = - 344
    var e : Int = 12332
    var f : Long = -231231L
    var i : Float = 5.12312F
    var h : Double = 7.2123123


    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
    println(i)
    println(h)
     */


    // Type conversion in Kotlin
    /*
    var x : Double = 132.22
    var y : Int = x.toInt()
    var z : Byte = y.toByte()
    println(x)
    println(y)
    println(z)
    */

    //String Data Types in Kotlin

    //- length() - returns the length of a string
    //-equals() - compares the string with the specified string and return true or false
    //-isEmpty() - returns true if the given string as 0 length otherwise false
    //-plus("..")-
    //lowercase() - returns a string in lowercase
    //uppercase() - returns a string in uppercase
    //trim() - resmoves spaces at the begenning and end of the word

    var a : String = "Hello world"
    var i : Int = a.length
    var x : Boolean = a.equals("Hello world")
    var username : String = " Sofwarica "

    println(username.trim())
    println(a);
    println(i)
    println(a.isEmpty())
    println(a.lowercase())
    println(a.uppercase())
    println(x)
    println(a.plus("How are you"))

    var u : Int = 10
    println(u.plus(2))
    var age = arrayOf(1,2,3)
    println(age)
    println("The first element of age is " + age[0])
    println("The second element of age is " + age[1])
    println("The third element of age is " + age[2])

    var name = arrayOf("Ram" ,"Shyam" ,"Hari")
    name[1] = "sandis"
    println("The first element of name is "+ name[0])
    println("The second element of name is "+ name[1])
    println("The third element of name is "+ name[2])

    println(name.size)


    //ArrayList
    //Can add value only after our array is initialize
    var age1 = ArrayList<Int>()
    age1.add(1)
    age1.add(5)
    age1.add(5)
    age1.add(2,20)


    println(age1)

    //Can add value directly in array while initializing variables
    var age2 = arrayListOf<Int>(1,20,3)

    var age3 = arrayListOf<String>("abhiraj","Praman" ,"Shyam")
    age3.add("devi")
    age3.add(4,"Hari")

    age3.remove("Shyam")
    age3.removeAt(0)

    println(age3)

    var mixArrayList = arrayListOf<Any>("hello",2,1.2)
    println(mixArrayList[0])
    println(mixArrayList[1])
    println(mixArrayList[2])
    displaylist()
    set()
    map()

    //List
    //dislaylist
    val numbers :List<String> = listOf("one","two","three","four")

    println("Number of element: ${numbers.size} ")
    println("Third element : ${numbers.get(2)}")
    println("fourth element : ${numbers[3]}")
    println("Index of the element /two/ : ${numbers.indexOf("two")}")

    //immutable
    val lst = listOf("one","two","three")
    println("immutable")
    for(i in lst.indices){
        println(lst[i])
    }
    println()

    //mutable
    val mutlst  = mutableListOf("one","two","three")
    mutlst.add("four")
    println("mutable")
    for(i in mutlst.indices) {
        println(mutlst[i])
    }



}

fun displaylist() {
    val numbers: List<String> = listOf("one", "two", "three", "four")
    println("Number of elements : ${numbers.size}")

}


fun set(){
    val set1 = setOf(1,2,4,5)
    for(elments in set1){
        println(elments)
    }
    val setBackwards = setOf(4,3,2,1)
    println("The sets are equal : ${set1 == setBackwards}")

}

fun map(){
    val countriesCapitals = mapOf(
        "Nepal" to "Kathmandu",
        "China" to "Beijung",
        "India" to "New Delhi"
    )

    println("All Keys : ${countriesCapitals.keys}")
    println("All values : ${countriesCapitals.values}")

    println("Capital of Nepal is ${countriesCapitals["Nepal"]}")

    //immutable map

    val studentMarks = mapOf(
        "ram" to 50,
        "shyam" to 56,
        "hari" to 45,
        "gita" to 45,
    )
    println("Enter student name :")
    val input : String = readln().lowercase()
    println(studentMarks[input])
    var num1: Double = 10.6
    var num2 : Double = 5.0
    var result :Double = 0.0

    result = num1 + num2
    println("num1 + num2 is $result")

    result = num1 - num2
    println("num1 - num2 is $result")

    result = num1 * num2
    println("num1 * num2 is $result")

    result = num1 / num2
    println("num1 / num2 is $result")

    result = num1 % num2
    println("num1 % num2 is $result")

    //Assignment Operator

    var x:Int = 20
    var y:Int = 10
    var z:Int = 0

    z = x+y
    println("z = x + y = $z")

    z += x
    println("z += x $z")

    z -= x
    println("z -= x $z")

    z *= x
    println("z *= x $z")

    z %= x
    println("z %= x $z")

    //Unary Operator

    var number :Double = 7.6
    var isCheck :Boolean = true;
    println("+number = ${+number}");
    println("-number = ${+number}");
    println("++number = ${+number}");
    println("--number = ${+number}");
    println("+!ischeck = ${!isCheck}");

    var isresult:Double = 4.7
    println("result :$result")

    println("result++ : " + isresult++)

    //Equality and Relational Operators

    var a:Int = 5
    var b:Int = 5

    println("a == b :" + (a == b))
    println("a != b :" + (a != b))
    println("a < b :" + (a < b))
    println("a > b :" + (a > b))
    println("a >= b :" + (a >= b))
    println("a <+ b :" + (a <+ b))

    //Conditional Operators

    var number1 : Int = 5
    var number2 : Int = 8
    var number3 : Int = 12
    var result1 : Boolean = false;

    result1 = (number1 > number2) && (number3 > number2)
    println(result1)

    result1 =(number1 > number2) || (number3 > number2)
    println(result1)

    //Operator Precedence

    //BODMAS

    var result01 : Int = 5+2*4
    println("Result +" +result01)
    result01 = (5+2) *4
    println("Result =" +result01)
    var c : Int = 8
    var v : Int = 4
    var n : Int = 2
    var sum :Int = 0;
    sum = x + --y + --z
    println("x + --y + --z ::: $sum")

    //rangeTo()Function and "in" operator
    var myCharRange = 'a'.rangeTo('j')
    var testCharRange = 'a'

    var check = 'Z' in testCharRange
    println("mycharRange has z : $check")
    println(myCharRange)
    println(testCharRange)

    //console Input in Android App Development

    println("Enter name :: ")
    var name:String? = readln();

    println("Enter age :: ")
    var age:Int = readln()!!.toInt();











fun calculate(a:Int,b:Int): Unit {

    }
    // condition
    println("Please enter a number :")

    var number:Any = readln()!!.toInt()

    if(number.toString().toInt() % 2 ==0){
        println("$number is even")
    }else{
        println("$number is odd")
    }

    //if else -ilabber statment

    println("Please enter your age :: ")
    var yourAge: Int = readln()!!.toInt()
    if(yourAge < 13) {
        println("You are a chile")
    }else if (yourAge < 19){
        println("your are a teenager")
    }else{
        if(yourAge < 50){
            println("You are an adult")
        }else{
            println("You are a senior")
        }
    }

    //Nested if statement

    println("Please enter 3 number :")
    var number1 : Int = readln()!!.toInt()
    var number2 : Int = readln()!!.toInt()
    var number3 : Int = readln()!!.toInt()
    var largestNumber: Int
    if(number1 >= number2){
        if(number1 >= number3){
            largestNumber = number1
        }else{
            largestNumber = number3
        }
    }else{
        if(number2 >= number3){
            largestNumber = number3
        }else{
            largestNumber = number3
        }
    }
    println("The largest number is $largestNumber")


    //When statement

    println("Please enter a day number of week : ")
    var dayNumber :Int = readln()!!.toInt()
    var day:String
    when(dayNumber)
    {
        1 -> day = "Sundey"
        2 -> day = "Monday"
        3 -> day = "Tuesday"
        4 -> day = "Wednesday"
        5 -> day = "Thurday"
        6 -> day = "Friday"
        7 -> day = "Saturday"
        else -> day = "Invalid dat choice"
    }
    println(day)


    //For loop

    for (i in 1..9){
        println(i)
    }

    var sum:Int = 0
    for(x in 0 .. 5){
        println(x)
        sum += x // sum = sum + x
    }

    var sum1:Int = 0
    for (x in 0..10){
        println(x)
        sum += x
    }
}