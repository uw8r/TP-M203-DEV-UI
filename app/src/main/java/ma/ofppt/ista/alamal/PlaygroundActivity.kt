package ma.ofppt.ista.alamal

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
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
//        val zone = findViewById<LinearLayout>(R.id.main)
//        var txtJour = TextView(this)
//        txtJour.text = "Message du jour"
//        txtJour.textSize = 24f
//        txtJour.setTextColor(Color.parseColor("#C0392B"))
//        txtJour.setMinLines(3)
//        txtJour.append("\nWI-FI gratuit pour les etudiants")
//        txtJour.append("\nde 9 h a 12 h !")
//
//        zone.addView(txtJour)
        val edtPrenom = findViewById<EditText>(R.id.edtPrenom)
        val btnEntrer = findViewById<Button>(R.id.btnEntrer)
        val txtsalut = findViewById<TextView>(R.id.txtSalut)

        btnEntrer.setOnClickListener {
            val prenom = edtPrenom.text.toString().trim()

            if (prenom.isEmpty()) {
                edtPrenom.error = "Prenom est vide !!"
                edtPrenom.requestFocus()
                txtsalut.text = ""
            }else
            txtsalut.text = "bonjour $prenom"
        }



//        val imgLogo = findViewById<ImageView>(R.id.imgLogo)
//        val txtInfo = findViewById<TextView>(R.id.txtInfo)
//
//        imgLogo.setOnClickListener {
//            txtInfo.text = "8 postes, imprimante et scanner"
//        }
//        var btnImprimer = findViewById<Button>(R.id.btnImprimer)
//        var txtPages = findViewById<TextView>(R.id.txtPages)
//
//        var pages = 0
//        var prix = 0
//        btnImprimer.setOnClickListener {
//            pages += 1
//            prix += 2
//            txtPages.text = "$pages page(s) : $prix DH"
//
//        }5

        var txtClients = findViewById<TextView>(R.id.txtSalut)
        var fabNouveau = findViewById<FloatingActionButton>(R.id.fabNouveau)
        var clt = 0
        fabNouveau.setOnClickListener {
            edtPrenom.error = null
            edtPrenom.clearFocus()
            clt++
            txtClients.text = "Clients presents : $clt"
        }

    }
//    var nbrCafes = 0
//    var prix = 0
//    fun commanderCafe(view: View) {
//        nbrCafes++
//        prix += 5
//        findViewById<TextView>(R.id.txtcommande).text = "Cafes commandes : $nbrCafes ($prix DH)"
//    }




}
