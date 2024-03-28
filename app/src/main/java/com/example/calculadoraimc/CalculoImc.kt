package com.example.calculadoraimc

import androidx.compose.ui.graphics.Color
import kotlin.math.pow

fun calcularImc(pesoUsuario: Double, alturaUsuario: Double): Double {

    var imc = pesoUsuario / (alturaUsuario / 100).pow(2)

    if (imc >= 100){
        return pesoUsuario / (alturaUsuario * alturaUsuario)
    }
    return imc
}

fun obterStatusImc(imcUsuario: Double): String {
    return if (imcUsuario < 18.5) {
        "Abaixo do Peso"
    } else if (imcUsuario >= 18.5 && imcUsuario < 25.0) {
        "Peso Ideal"
    } else if (imcUsuario >= 25.0 && imcUsuario < 30.0) {
        "Levemente Acima do peso"
    } else if (imcUsuario >= 30.0 && imcUsuario < 35.0) {
        "Obesidade Grau I"
    } else if (imcUsuario >= 35.0 && imcUsuario < 40.0) {
        "Obesidade Grau II"
    } else {
        "Obesidade Grau III"
    }
}

fun obterCardColor(imcUsuario: Double): Color {
    return if (imcUsuario >= 18.5 && imcUsuario < 25.0) {
        Color(0xFF329F6B)
    } else if (imcUsuario >= 25.0 && imcUsuario < 30.0) {
        Color(0xFFFF9800)
    } else {
        Color(0xFFFF0000)
    }
}