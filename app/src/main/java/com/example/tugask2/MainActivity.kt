package com.example.tugask2

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.Locale

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n", "DefaultLocale")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etCelsius = findViewById<EditText>(R.id.etCelsius)
        val btnKonversi = findViewById<Button>(R.id.btnKonversi)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        btnKonversi.setOnClickListener {
            val strCelsius = etCelsius.text.toString()

            val celsius = strCelsius.toDouble()

            val fahrenheit = (celsius * 9 / 5) + 32
            val reamur = celsius * 4 / 5
            val kelvin = celsius + 273.15

            val fFahrenheit = String.format(Locale.getDefault(), "%.2f", fahrenheit)
            val fReamur = String.format(Locale.getDefault(), "%.2f", reamur)
            val fKelvin = String.format(Locale.getDefault(), "%.2f", kelvin)

            tvResult.text = "Hasil Konversi Suhu:\n\n" +
                    "• Fahrenheit: $fFahrenheit °F\n" +
                    "• Reamur: $fReamur °R\n" +
                    "• Kelvin: $fKelvin K"
        }
    }
}