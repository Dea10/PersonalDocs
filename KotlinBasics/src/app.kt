fun main() {
    // variablesYConstantes()
    tiposDeDatos()
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