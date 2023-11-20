package ca.qc.gestiondessuccursales

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Boutton Inscription
        val btnInscription: Button = findViewById(R.id.btnInscription)


        btnInscription.setOnClickListener {
            val intent = Intent(this, inscription::class.java)
            startActivity(intent)


        }
    }
}