package com.example.m5ei06

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val cuentas = mutableMapOf<Int, CuentaBancaria>()
    var contadorCuentas = 0

    var salir = false

    while (!salir) {
        println("\n********* Bienvenidos a la Banca Individual 6.0 *********")
        println("---- Ingrese la opción que desea")
        println("1 - Ingresar a su Cuenta")
        println("2 - Crear nueva cuenta")
        println("3 - Salir")

        when (scanner.nextInt()) {
            1 -> {
                println("Ingrese el número de su cuenta:")
                val numeroCuenta = scanner.nextInt()
                if (cuentas.containsKey(numeroCuenta)) {
                    val cuentaSeleccionada = cuentas[numeroCuenta]!!
                    gestionarCuenta(cuentaSeleccionada, scanner)
                } else {
                    println("Cuenta no encontrada.")
                }
            }
            2 -> {
                println("Ingrese su nombre para crear una nueva cuenta:")
                val nombreUsuario = scanner.next()
                contadorCuentas += 1
                val numeroCuenta = contadorCuentas
                val nuevaCuenta = CuentaBancaria(nombreUsuario, numeroCuenta, 1000.0)
                cuentas[numeroCuenta] = nuevaCuenta
                println("Cuenta creada para $nombreUsuario con el número de cuenta $numeroCuenta y un depósito inicial de 1,000.")
                gestionarCuenta(nuevaCuenta, scanner)
            }
            3 -> {
                println("Gracias por Preferir la Banca Individual 6.0")
                salir = true
            }
            else -> println("Opción no válida, por favor intente nuevamente.")
        }
    }
}

fun gestionarCuenta(cuenta: CuentaBancaria, scanner: Scanner) {
    var salirSistema = false
    while (!salirSistema) {
        println("\n---- ¿Qué operación desea realizar?")
        println("1 - Mostrar saldo")
        println("2 - Realizar depósito")
        println("3 - Realizar un retiro")
        println("4 - Ver historial de transacciones")
        println("5 - Volver al menú principal")
        println("6 - Salir del sistema")

        when (scanner.nextInt()) {
            1 -> println("El saldo disponible es: ${cuenta.mostrarSaldo()}")
            2 -> {
                println("Ingrese la cantidad a depositar:")
                val monto = scanner.nextDouble()
                cuenta.deposito(monto)
                println("Depósito realizado con éxito.")
            }
            3 -> {
                println("Ingrese la cantidad a retirar:")
                val monto = scanner.nextDouble()
                cuenta.retiro(monto)
            }
            4 -> cuenta.mostrarHistorial()
            5 -> salirSistema = true
            6 -> {
                println("Saliendo del sistema. Gracias por usar la Banca Individual 6.0.")
                salirSistema = true
                System.exit(0) // Finaliza el programa
            }
            else -> println("Opción no válida, por favor intente nuevamente.")
        }
    }
}
