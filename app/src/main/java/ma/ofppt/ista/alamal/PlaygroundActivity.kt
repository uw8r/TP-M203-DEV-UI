package ma.ofppt.ista.alamal

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

// MODE COURS (Playground) : écran VIDE pour tester en direct les exemples montrés en cours.
// Écrivez le layout dans res/layout/activity_playground.xml et le code Kotlin ci-dessous, dans onCreate.
class PlaygroundActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_playground)

        // Votre code ici
        val chkImpression = findViewById<CheckBox>(R.id.chkImpression)
        val chkCasque = findViewById<CheckBox>(R.id.chkCasque)
        val chkScanner = findViewById<CheckBox>(R.id.chkScanner)
        val btnCalculer = findViewById<Button>(R.id.btnCalculer)
        val txtResultat = findViewById<TextView>(R.id.txtResultat)


        btnCalculer.setOnClickListener {
            var prix = 0
            var options = 0
            if(chkImpression.isChecked){
                prix += 2
                options++
            }
            if(chkCasque.isChecked){
                prix += 2
                options++
            }
            if(chkScanner.isChecked){
                prix += 2
                options++
            }
            txtResultat.text = "$options option(s): $prix DH"
            }
        }
    }

