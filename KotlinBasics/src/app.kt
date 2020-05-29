fun main() {
    // Variables y Constantes
    variablesYConstantes()
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

