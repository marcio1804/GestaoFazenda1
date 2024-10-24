package br.unipar.gestaofazenda

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Botão para ir ao Cadastro de Produtos
        val btnCadastro: Button = findViewById(R.id.btnCadastro)
        btnCadastro.setOnClickListener {
            val intent = Intent(this, Cadastro::class.java)
            startActivity(intent)
        }

        // Botão para ir ao Planejamento de Plantio
        val btnPlanejamento: Button = findViewById(R.id.btnPlanejamento)
        btnPlanejamento.setOnClickListener {
            val intent = Intent(this, PlanejamentoActivity::class.java)
            startActivity(intent)
        }
    }
}

