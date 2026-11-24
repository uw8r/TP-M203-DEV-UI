package ma.ofppt.ista.alamal

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

// MODE COURS (Playground) : écran VIDE pour tester en direct les exemples montrés en cours.
// Écrivez le layout dans res/layout/activity_playground.xml et le code Kotlin ci-dessous, dans onCreate.
class PlaygroundActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_playground)

        // Votre code ici
        val group = findViewById<RadioGroup>(R.id.grpForfait)
        val rad30 = findViewById<RadioButton>(R.id.rad30)
        val rad60 = findViewById<RadioButton>(R.id.rad60)
        val rad120 = findViewById<RadioButton>(R.id.rad120)
        val total = findViewById<TextView>(R.id.total)
        group.setOnCheckedChangeListener { group, i ->
            when (i) {
                R.id.rad30 -> total.text = "A payer : 6DH"
                R.id.rad60 -> total.text = "A payer : 10DH"
                R.id.rad120 -> total.text = "A payer : 18DH"
            }
        }

    }
}
