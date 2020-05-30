fun main() {
    // variablesYConstantes()
    // tiposDeDatos()
    // sentenciaIf()
    // sentenciaWhen()
    // arrays()
    // maps()
    // loops()
    // nullSafety()
    funciones()
}

private fun variablesYConstantes() {
    println("*** Variables y Constantes ***")

    var myFirstVar = "Hello World!"
    println(myFirstVar)

    myFirstVar = "Hello Danniel"
    println(myFirstVar)

    // myVar = 1 No se puede asignar un valor Int a una var de tipo String

    var mySecondVar = "Espinosa"
    println(mySecondVar)

    mySecondVar = myFirstVar
    println(mySecondVar)

    println("*** Constantes ***")

    val myFirstConst = "Daniel Espinosa"
    println(myFirstConst)
    // myFirstConst = "Daniel Espinosa Arias" No se puede cambiar el valor de una constante

    val mySecondConst = myFirstVar
    println(mySecondConst)
}

private fun tiposDeDatos() {
    println("*** Tipos de Datos ***")

    // String
    val myString : String = "Hello"
    val myString02 = "Daniel Espinosa"
    val myString03 = myString + " " + myString02
    val myString04 = "${myString} ${myString02}"
    println(myString03)
    println(myString04)

    // Enteros (Byte, Short, Int, Long)
    val myInt : Int = 1
    val myInt02 = 2
    val myInt03 = myInt + myInt02
    println(myInt03)
    println("${myInt} + ${myInt02} = ${myInt + myInt02}")

    // Decimales (Float, Double)
    val myFloat : Float = 1.5f
    val myDouble : Double = 1.5
    val myDouble02 = 2.6
    val myDouble03 = 1 // Este es Int, pero al momento de operar lo convierte en Double
    println("${myDouble} + ${myDouble02} + ${myDouble03} = ${myDouble + myDouble02 + myDouble03}")

    // Boolean (Bool)
    val myBool : Boolean = true
    val myBool02 = false
    //val myBool03 = myBool + myBool02 Operaci[on no permitida con Bool
    println("${myBool} == ${myBool02} = ${myBool == myBool02}")
    println("${myBool} || ${myBool02} = ${myBool || myBool02}")
}

private fun sentenciaIf() {
    val myNumber = 0
    if(myNumber < 10) {
        println("${myNumber} es menor que 10")
    } else {
        println("${myNumber} es mayor o igual a 10")
    }

    if(myNumber > 0) {
        println("${myNumber} > 0")
    } else if(myNumber > 5) {
        println("${myNumber} > 5")
    } else if(myNumber > 10) {
        println("${myNumber} > 10")
    } else {
        println("${myNumber} <= 0")
    }

    // En el momento de entrar a uno de los bloques if, termina y ya no continúa evaluando
}

private fun sentenciaWhen() {
    val country = "Argentina"

    when(country) {
        "Spain", "Argentina" -> { println("Spanish") }
        "USA", "UK" -> { println("English") }
        else -> { println("Error") }
    }

    val age = 0

    when(age) {
        in 0 .. 17 -> { println("(0, 17)") }
        in 18 .. 69 -> { println("(18, 69)") }
        else -> { println("Error") }
    }
}

private fun arrays() {
    val name = "Daniel"
    val surname = "Espinosa"
    val company = "RC"
    val age = "27"

    val myArray : ArrayList<String> = arrayListOf<String>()

    myArray.add(name)
    myArray.add(surname)
    myArray.add(company)
    myArray.add(age)

    println(myArray)

    // Añadir conjunto de datos
    myArray.addAll(listOf("hola", "hola2"))
    println(myArray)

    // Acceso a datos
    println(myArray[0])

    myArray[myArray.size -1] = "adiós"
    println(myArray)

    myArray.removeAt(myArray.size -1)
    println(myArray)

    // Recorrer datos
    myArray.forEach {
        println(it)
    }

    println(myArray.last())
}

private fun maps() {
    var myMap : Map<String, Int> = mapOf()
    println(myMap)

    // Añadir elementos
    myMap = mapOf("Daniel" to 1, "Pedro" to 2)
    println(myMap)

    // Añadir un solo valor
    // myMap["Ana"] = 7 No podemos agregar nuevos valores porque no es un Map Mutable

    var myMutableMap  = mutableMapOf<String, Int>()
    myMutableMap = mutableMapOf("Daniel" to 1, "Pedro" to 2)
    println(myMutableMap)
    myMutableMap["Ana"] = 7
    myMutableMap.put("Maria", 8)
    println(myMutableMap)

    // Actualizar un dato
    myMutableMap.put("Daniel", 3)
    myMutableMap.put("Pedro", 3)
    println(myMutableMap)

    // Acceso a un dato
    println(myMutableMap["Daniel"])

    // Borrado de datos
    myMutableMap.remove("Daniel")
    println(myMutableMap)
}

private fun loops() {
    val myArray : List<String> = listOf<String>("Daniel", "Espinosa", "Arias")
    val myMap : MutableMap<String, Int> = mutableMapOf("Daniel" to 1, "Espinosa" to 2, "Arias" to 5)

    // for
    for (myString in myArray) {
        println(myString)
    }

    for (myElement in myMap) {
        println("${myElement.key} - ${myElement.value}")
    }

    for (x : Int in 0 .. 10) {
        println(x)
    }

    for (x : Int in 0 until 10) {
        println(x)
    }

    for (x : Int in 0 .. 10 step 2) {
        println(x)
    }

    for (x : Int in 10 downTo 0 step 2) {
        println(x)
    }

    val myNumericArray = (0 .. 5)
    for (myElement in myNumericArray) {
        println(myElement)
    }

    // while
    println(" *** while *** ")
    var x = 0
    while (x<10) {
        println(x)
        x++
    }
}

private fun nullSafety() {
    var myString = "Daniel"
    // myString = null Null pointer exception
    println(myString)

    // variable nullSafety
    var mySafetyString : String?= "Daniel null safety"
    mySafetyString = null
    println(mySafetyString)

    mySafetyString = "Espinosa"
    // println(mySafetyString)

    // println(mySafetyString!!)

    /*
    if(mySafetyString != null) {
        println(mySafetyString!!)
    } else {
        println(mySafetyString)
    }
    */

    // safe call
    println(mySafetyString?.length)

    mySafetyString?.let {
        println(it)
    } ?: run {
        println(mySafetyString)
    }
}

private fun funciones() {
    sayHello("Daniel", 27)
    val result = sum(1,2)
    println("result = ${result}")
}

private fun sayHello(name : String, age : Int) {
    println("Hi ${name} - ${age}")
}

private fun sum(num1 : Int, num2 : Int) : Int {
    return num1 + num2
}