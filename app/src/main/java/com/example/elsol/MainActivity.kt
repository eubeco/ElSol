package com.example.elsol

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.*
import androidx.appcompat.widget.Toolbar
import androidx.core.view.get

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val topBar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(topBar)

        val soles = ArrayList<Sol>()
        soles.add(Sol("corona", R.drawable.corona_solar))
        soles.add(Sol("erupcion", R.drawable.erupcionsolar ))
        soles.add(Sol("espiculas", R.drawable.espiculas))
        soles.add(Sol("filamentos", R.drawable.filamentos))
        soles.add(Sol("magnetosfera", R.drawable.magnetosfera))
        soles.add(Sol("manchasolar", R.drawable.manchasolar))

        val lista_soles = findViewById(R.id.gridsoles) as GridView

        val adaptador = SolesAdapter(this, soles)

        lista_soles.adapter=adaptador

        lista_soles.setOnItemClickListener(object : AdapterView.OnItemClickListener {
            override fun onItemClick(parent: AdapterView<*>, v: View, position: Int, id: Long) {
                Toast.makeText(this@MainActivity, soles.get(position).nombre , Toast.LENGTH_SHORT).show()
            }
        })

      /*  val menu_spinner = arrayOf("Renombrar", "Copiar", "Cortar", "Eliminar", "Mover")

        val adaptador_menu = ArrayAdapter(this, android.R.layout.simple_spinner_item, menu_spinner)
*/
        /*val list_menu = findViewById(R.id.action_bar_spinner) as Spinner
        list_menu.adapter = adaptador_menu*/
        /*adaptador_menu.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)*/


    }



    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id=item.getItemId()
        if(id==R.id.action_inf) {
            lanzarComparador()
        }

        return super.onOptionsItemSelected(item)
    }

    fun lanzarComparador(){
        val i = Intent(this@MainActivity, ComparadorActivity::class.java)
        startActivity(i)
    }

}
