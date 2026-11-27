package ma.ofppt.ista.alamal

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.view.ActionMode

// MODE COURS (Playground) : écran VIDE pour tester en direct les exemples montrés en cours.
// Écrivez le layout dans res/layout/activity_playground.xml et le code Kotlin ci-dessous, dans onCreate.
class PlaygroundActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_playground)

        // Votre code ici
//        val spPoste = findViewById<Spinner>(R.id.spPoste)
//        val txtPoste = findViewById<TextView>(R.id.txtPoste)
//
//
//        spPoste.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
//            override fun onItemSelected(
//                parent: AdapterView<*>?,
//                view: View?,
//                position: Int,
//                id: Long
//            ) {
//                txtPoste.text = parent?.getItemAtPosition(position).toString()
//            }
//
//            override fun onNothingSelected(parent: AdapterView<*>?) {}
//        }
//        val spPosteCode = findViewById<Spinner>(R.id.spPosteCode)
//        val txtPosteCode = findViewById<TextView>(R.id.txtPosteCode)
//        val btnVider = findViewById<Button>(R.id.btnVider)
//
//        val mutableList = mutableListOf<String>("poste 01", "poste 02", "poste 03")
//        val adapterSp02 = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, mutableList)
//        spPosteCode.adapter = adapterSp02
//        // le text view doit afficher le poste choisit
//        spPosteCode.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
//            override fun onItemSelected(
//                parent: AdapterView<*>?,
//                view: View?,
//                position: Int,
//                id: Long
//            ) {
//                txtPosteCode.text = parent?.getItemAtPosition(position).toString()
//            }
//
//            override fun onNothingSelected(parent: AdapterView<*>?) {
//                txtPosteCode.text = "Aucun poste choisi"
//            }
//        }
//        btnVider.setOnClickListener {
//            //vider le spinner et ecrire dans le text aucun poste choisit
//            adapterSp02.clear()
//        }
//    }
        //menu options
//    override fun onCreateOptionsMenu(menu: Menu): Boolean {
//        menuInflater.inflate(R.menu.s02_menu_principal, menu)
//        return true
//    }
//
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        val txtMenu = findViewById<TextView>(R.id.txtMenu)
//        when (item.itemId) {
//            R.id.menu_tarifs -> txtMenu.text = "Le tarif est : 10dh / h"
//            R.id.menu_aide -> txtMenu.text = "aide"
//            R.id.menu_apropos -> txtMenu.text = "a propos"
//        }
//        return true

        //fin
        // menu contextuelle

//        val txtPoste3 = findViewById<TextView>(R.id.txtPoste3)
//        registerForContextMenu(txtPoste3)
//
//    }
//    override fun onCreateContextMenu(
//        menu: ContextMenu?,
//        v: View?,
//        menuInfo: ContextMenu.ContextMenuInfo?
//    ) {
//        menuInflater.inflate(R.menu.s02_menu_poste, menu)
//    }
//
//    override fun onContextItemSelected(item: MenuItem): Boolean {
//        val txtContexte = findViewById<TextView>(R.id.txtContexte)
//        when (item.itemId) {
//            R.id.poste_prolonger -> txtContexte.text = "Prolonger de 30 min"
//            R.id.poste_liberer -> txtContexte.text = "Libérer le poste"
//        }
//        return true
        //   fin
        // menu d'actions contexteulle
        val textRes = findViewById<TextView>(R.id.txtResa)
        val txtContexte = findViewById<TextView>(R.id.txtAction)
        textRes.setOnLongClickListener {
            startSupportActionMode(RapRes(textRes, txtContexte))
            //on selectionner le text de reservation
            true
        }
    }
}

class RapRes(val textRes: TextView, val txtContexte: TextView) : ActionMode.Callback {
    override fun onActionItemClicked(mode: ActionMode?, item: MenuItem?): Boolean {

        when (item?.itemId) {
            R.id.action_partager -> txtContexte.text = "${item.title}"
            R.id.action_supprimer -> txtContexte.text = "${item.title}"
        }
        mode?.finish()
        return true
    }

    override fun onCreateActionMode(
        mode: ActionMode?,
        menu: Menu?
    ): Boolean {
        mode?.menuInflater?.inflate(R.menu.s02_menu_action, menu)
        mode?.title = "1 reservation"
        return true
    }

    override fun onDestroyActionMode(mode: ActionMode?) {
        return
    }

    override fun onPrepareActionMode(
        mode: ActionMode?,
        menu: Menu?
    ): Boolean {
        //unselect le text
        return false
    }

}
// casting entre les types de base
// types de casting