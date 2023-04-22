package com.zergivs.kotlinapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.zergivs.kotlinapplication.ui.theme.KotlinApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KotlinApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
            text = "Hello $name!",
            modifier = modifier
    )
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KotlinApplicationTheme {
        Greeting("Android")
    }
}

fun main (){

    saludoInicial()

    var a = 10
    var b = 30

    println("$a + $b = ${a + b} is the result.")

    calculator()

}

fun saludoInicial(){
    println("hello")
}

fun calculator() {

        var num1: Double
        var num2: Double
        var operator: Char

        println("Enter the first number:")
        num1 = readLine()!!.toDouble()

        println("Enter the second number:")
        num2 = readLine()!!.toDouble()

        println("Enter the operator (+, -, *, /):")
        operator = readLine()!!.first()

        when (operator) {
            '+' -> println("$num1 + $num2 = ${formatResult(num1 + num2)}")
            '-' -> println("$num1 - $num2 = ${formatResult(num1 - num2)}")
            '*' -> println("$num1 * $num2 = ${formatResult(num1 * num2)}")
            '/' -> {
                if (num2 == 0.0) {
                    println("Error: Cannot divide by zero")
                } else {
                    println("$num1 / $num2 = ${formatResult(num1 / num2)}")
                }
            }
            else -> println("Invalid operator")
        }
    }

    fun formatResult(result: Double): String {
        return if (result % 1 == 0.0) {
            result.toInt().toString()
        } else {
            result.toString().trimEnd('0').trimEnd('.')
        }
    }


