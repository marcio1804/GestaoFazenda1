package br.unipar.gestaofazenda

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Planejamento : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_planejamento)

        findViewById<Button>(R.id.btnRelatorios).setOnClickListener {
            // Lógica para ir à tela de relatórios (não implementada aqui)
            // Você pode criar uma nova activity para relatórios
        }
    }
}
