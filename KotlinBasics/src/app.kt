fun main() {
    // variablesYConstantes()
    // tiposDeDatos()
    // sentenciaIf()
    // sentenciaWhen()
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