package ma.ofppt.ista.alamal.tp.s01

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import ma.ofppt.ista.alamal.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tp01_activity_main)

        val edtPrenom = findViewById<EditText>(R.id.edtPrenom)
        val btnEntrer = findViewById<Button>(R.id.btnEntrer)
        val txtSalut = findViewById<TextView>(R.id.txtSalut)

        btnEntrer.setOnClickListener {
            val prenom = edtPrenom.text.toString().trim()

            if (prenom.isEmpty()) {
                edtPrenom.error = getString(R.string.tp01_erreur_prenom)
                edtPrenom.requestFocus()
                txtSalut.text = ""
            } else {
                txtSalut.text = getString(R.string.tp01_bonjour, prenom)
            }
        }
    }
}