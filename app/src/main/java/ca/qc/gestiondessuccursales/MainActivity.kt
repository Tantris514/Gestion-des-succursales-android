package ca.qc.gestiondessuccursales

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ca.qc.gestiondessuccursales.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //Variable nessesaire pour le binding
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        //Boutton Inscription
        binding.btnInscription.setOnClickListener {
            val intent = Intent(this, inscriptionActivity::class.java)
            startActivity(intent)

        }
    }
}