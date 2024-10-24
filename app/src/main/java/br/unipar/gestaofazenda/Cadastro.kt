package br.unipar.gestaofazenda

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class Cadastro: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        val edtNome = findViewById<EditText>(R.id.edtNome)
        val edtTipo = findViewById<EditText>(R.id.edtTipo)
        val edtQuantidade = findViewById<EditText>(R.id.edtQuantidade)

        findViewById<Button>(R.id.btnSalvar).setOnClickListener {
            // Lógica para salvar os dados (pode ser no banco de dados ou em SharedPreferences)
            val nome = edtNome.text.toString()
            val tipo = edtTipo.text.toString()
            val quantidade = edtQuantidade.text.toString()

            // Aqui você pode adicionar a lógica para armazenar esses dados

            finish() // Retorna à tela anterior
        }
    }
}
