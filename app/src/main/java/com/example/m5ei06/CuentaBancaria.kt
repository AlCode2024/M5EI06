package com.example.m5ei06

import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.util.Locale

class CuentaBancaria(val nombreUsuario: String, val numeroCuenta: Int, saldoInicial: Double) {
    private var saldoDisponible: Double = saldoInicial
    private val historial: MutableList<String> = mutableListOf()

    init {
        historial.add(String.format("%-20s %-20s %-20s", "Cuenta creada", "", formatearMoneda(saldoInicial)))
    }

    fun deposito(monto: Double) {
        saldoDisponible += monto
        historial.add(String.format("%-20s %-20s %-20s", "Depósito", formatearMoneda(monto), formatearMoneda(saldoDisponible)))
    }

    fun retiro(monto: Double) {
        if (saldoDisponible >= monto) {
            saldoDisponible -= monto
            historial.add(String.format("%-20s %-20s %-20s", "Retiro", formatearMoneda(monto), formatearMoneda(saldoDisponible)))
        } else {
            historial.add(String.format("%-20s %-20s %-20s", "Retiro fallido", formatearMoneda(monto), formatearMoneda(saldoDisponible)))
            println("El monto señalado sobrepasa el saldo disponible.")
        }
    }

    fun mostrarSaldo(): String {
        return formatearMoneda(saldoDisponible)
    }

    fun mostrarHistorial() {
        println("\nHistorial de transacciones para $nombreUsuario (Cuenta $numeroCuenta):")
        println(String.format("%-20s %-20s %-20s", "Transacción", "Monto", "Saldo restante"))
        println("------------------------------------------------------------")
        for (transaccion in historial) {
            println(transaccion)
        }
    }

    private fun formatearMoneda(monto: Double): String {
        val symbols = DecimalFormatSymbols(Locale.GERMANY).apply {
            decimalSeparator = ','
            groupingSeparator = '.'
        }
        val df = DecimalFormat("#,##0.00", symbols)
        return "$${df.format(monto)}"
    }
}
