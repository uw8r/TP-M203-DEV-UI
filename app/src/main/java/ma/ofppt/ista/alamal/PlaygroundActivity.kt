package ma.ofppt.ista.alamal

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.ToggleButton
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import com.google.android.material.materialswitch.MaterialSwitch

// MODE COURS (Playground) : écran VIDE pour tester en direct les exemples montrés en cours.
// Écrivez le layout dans res/layout/activity_playground.xml et le code Kotlin ci-dessous, dans onCreate.
class PlaygroundActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_playground)

        // Votre code ici
        val tglClim = findViewById<ToggleButton>(R.id.tglClim)
        val swSilence = findViewById<MaterialSwitch>(R.id.swSilence)
        val txtEtat = findViewById<TextView>(R.id.txtEtat)
        tglClim.setOnCheckedChangeListener { _, bool ->
            if (bool) {
                txtEtat.text = "Clim ON !!"
            } else {
                txtEtat.text = "Clim OFF !!"
            }
        }

        swSilence.setOnCheckedChangeListener { _, bool ->
            if (bool) {
                txtEtat.text = "Mode silencieux ON !!"
            } else {
                txtEtat.text = "Mode silencieux OFF !!"
            }
        }

    }
}
