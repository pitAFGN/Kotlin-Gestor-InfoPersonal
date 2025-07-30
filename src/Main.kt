//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Hola, bienvenido a los pollos rosas, porfavor llene la siguiente informacion para continuar con el acceso: ")
    println()

    println("Porfavor ingresar su nombre completo: ")
    val nombre: String = readLine() ?: ""

    var edad : Int

    while (true) {

        println("Ingrese su edad: ")
        edad = (readLine() ?: "0").toInt()

        if (edad>=18) {
            println("Usted es mayor de edad, puede continuar con el acceso")
            break
        }else {
            println("usted es menor de edad, trateme serio")
        }
    }
    var altura : Double
    var peso : Double

    while (true){
        println("Ingresar su altura: ")
        altura = readLine()?.toDouble() ?: 0.0

        println("Ingresar su peso: ")
        peso = readLine() ?.toDouble() ?: 0.0

        if (altura >0 && peso > 0){
            println("Datos validos,puedes continuar con el acceso")
            break
        }else {
            println("datos invalidos")
        }
    }
    var correo : String

    while (true) {
        println("Ingresar su Email: ")
         correo = readLine() ?: ""


        if (correo.contains("@") && correo.contains(".") ) {
            print("correo valido $correo")
            break
        } else {
            println("su corre es invalido: ")
        }

    }
    println()
    println("Ingresar tu actual Ciudad de residencia: ")
    var residencia : String = readLine() ?: ""

    println()
    println("Teniendo en cuenta sus datos, tu IMC es: ")
    var imc : Double = peso / (altura * altura)
    println("$imc")

    println("Segun los datos obtenidos tu nombre es: ")
    println()
    println("Mayusculas")
    println(nombre.uppercase())
    println("Minusculas")
    println(nombre.lowercase())
    println()
    println("Dominio usado en el email: ")

    val dominio = correo.substringAfter("@")
    println("$dominio")

    println()
    val resumen = """
        Resumen: 
    Nombre: $nombre
    Edad: $edad
    Correo: $correo
    IMC: $imc
    """.trimIndent()

    println(resumen)

    println("Datos correctamente registrados, Bienvenido a los pollos rosas")
}


