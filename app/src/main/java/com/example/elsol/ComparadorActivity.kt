package com.example.elsol

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.*

import androidx.appcompat.app.AppCompatActivity
import android.widget.AutoCompleteTextView as AutoCompleteTextView
import androidx.appcompat.widget.Toolbar
import androidx.core.view.get
import android.util.SparseBooleanArray
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.util.Log


class ComparadorActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.comparador)


        val topBar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(topBar)

        val planetas =  ArrayList<Planeta>()
        planetas.add(Planeta("Mercurio", 0.382, 0.387, 5400))
        planetas.add(Planeta("Venus", 0.949, 0.723, 5250))
        planetas.add(Planeta("Tierra", 1.0, 1.0, 5520))
        planetas.add(Planeta("Marte", 0.53, 1.542, 3960))
        planetas.add(Planeta("Júpiter", 11.2, 5.203, 1350))
        planetas.add(Planeta("Saturno", 9.41, 9.539, 700))
        planetas.add(Planeta("Urano", 3.38, 19.81, 1200))
        planetas.add(Planeta("Neptuno", 3.81, 30.07, 1500))
        planetas.add(Planeta("Plutón", 0.0, 39.44, 5))

        val planetasNombres = ArrayList<String>()
        planetasNombres.add("Mercurio")
        planetasNombres.add("Venus")
        planetasNombres.add("Tierra")
        planetasNombres.add("Marte")
        planetasNombres.add("Júpiter")
        planetasNombres.add("Saturno")
        planetasNombres.add("Urano")
        planetasNombres.add("Neptuno")
        planetasNombres.add("Plutón")


        val adaptador1 =  ArrayAdapter<String> (this, android.R.layout.simple_dropdown_item_1line, planetasNombres)
        val list_planetas1 = findViewById(R.id.autoCompleteTextView1) as AutoCompleteTextView
        list_planetas1.setAdapter(adaptador1)
        list_planetas1.threshold = 1
        val list_planetas2 = findViewById(R.id.autoCompleteTextView2) as AutoCompleteTextView
        val adaptador2 = ArrayAdapter<String> (this, android.R.layout.simple_dropdown_item_1line, planetasNombres)
        list_planetas2.threshold = 1
        list_planetas2.setAdapter(adaptador2)


        val textview_diametro1 = findViewById(R.id.TextViewDiametro1) as TextView
        val textview_distancia1 = findViewById(R.id.TextViewDistancia1) as TextView
        val textview_densidad1 = findViewById(R.id.TextViewDensidad1) as TextView


        list_planetas1.setOnItemClickListener(object : AdapterView.OnItemClickListener {
            override fun onItemClick(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {

                if (list_planetas1.text.toString() == "Mercurio") {
                    textview_diametro1.setText(planetas[0].diametro.toString())
                    textview_distancia1.setText(planetas[0].distancia.toString())
                    textview_densidad1.setText(planetas[0].densidad.toString())
                }
                if (list_planetas1.text.toString() == "Venus") {
                    textview_diametro1.setText(planetas[1].diametro.toString())
                    textview_distancia1.setText(planetas[1].distancia.toString())
                    textview_densidad1.setText(planetas[1].densidad.toString())
                }
                if (list_planetas1.text.toString() == "Tierra") {
                    textview_diametro1.setText(planetas[2].diametro.toString())
                    textview_distancia1.setText(planetas[2].distancia.toString())
                    textview_densidad1.setText(planetas[2].densidad.toString())
                }
                if (list_planetas1.text.toString() == "Marte") {
                    textview_diametro1.setText(planetas[3].diametro.toString())
                    textview_distancia1.setText(planetas[3].distancia.toString())
                    textview_densidad1.setText(planetas[3].densidad.toString())
                }
                if (list_planetas1.text.toString() == "Júpiter") {
                    textview_diametro1.setText(planetas[4].diametro.toString())
                    textview_distancia1.setText(planetas[4].distancia.toString())
                    textview_densidad1.setText(planetas[4].densidad.toString())
                }
                if (list_planetas1.text.toString() == "Saturno") {
                    textview_diametro1.setText(planetas[5].diametro.toString())
                    textview_distancia1.setText(planetas[5].distancia.toString())
                    textview_densidad1.setText(planetas[5].densidad.toString())
                }
                if (list_planetas1.text.toString() == "Urano") {
                    textview_diametro1.setText(planetas[6].diametro.toString())
                    textview_distancia1.setText(planetas[6].distancia.toString())
                    textview_densidad1.setText(planetas[6].densidad.toString())
                }
                if (list_planetas1.text.toString() == "Neptuno") {
                    textview_diametro1.setText(planetas[7].diametro.toString())
                    textview_distancia1.setText(planetas[7].distancia.toString())
                    textview_densidad1.setText(planetas[7].densidad.toString())
                }
                if (list_planetas1.text.toString() == "Plutón") {
                    textview_diametro1.setText(planetas[8].diametro.toString())
                    textview_distancia1.setText(planetas[8].distancia.toString())
                    textview_densidad1.setText(planetas[8].densidad.toString())
                }
            }
        })
        val textview_diametro2 = findViewById(R.id.TextViewDiametro2) as TextView
        val textview_distancia2 = findViewById(R.id.TextViewDistancia2) as TextView
        val textview_densidad2 = findViewById(R.id.TextViewDensidad2) as TextView


        list_planetas2.setOnItemClickListener(object : AdapterView.OnItemClickListener {
            override fun onItemClick(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {

                if (list_planetas2.text.toString() == "Mercurio") {
                    textview_diametro2.setText(planetas[0].diametro.toString())
                    textview_distancia2.setText(planetas[0].distancia.toString())
                    textview_densidad2.setText(planetas[0].densidad.toString())
                }
                if (list_planetas2.text.toString() == "Venus") {
                    textview_diametro2.setText(planetas[1].diametro.toString())
                    textview_distancia2.setText(planetas[1].distancia.toString())
                    textview_densidad2.setText(planetas[1].densidad.toString())
                }
                if (list_planetas2.text.toString() == "Tierra") {
                    textview_diametro2.setText(planetas[2].diametro.toString())
                    textview_distancia2.setText(planetas[2].distancia.toString())
                    textview_densidad2.setText(planetas[2].densidad.toString())
                }
                if (list_planetas2.text.toString() == "Marte") {
                    textview_diametro2.setText(planetas[3].diametro.toString())
                    textview_distancia2.setText(planetas[3].distancia.toString())
                    textview_densidad2.setText(planetas[3].densidad.toString())
                }
                if (list_planetas2.text.toString() == "Júpiter") {
                    textview_diametro2.setText(planetas[4].diametro.toString())
                    textview_distancia2.setText(planetas[4].distancia.toString())
                    textview_densidad2.setText(planetas[4].densidad.toString())
                }
                if (list_planetas2.text.toString() == "Saturno") {
                    textview_diametro2.setText(planetas[5].diametro.toString())
                    textview_distancia2.setText(planetas[5].distancia.toString())
                    textview_densidad2.setText(planetas[5].densidad.toString())
                }
                if (list_planetas2.text.toString() == "Urano") {
                    textview_diametro2.setText(planetas[6].diametro.toString())
                    textview_distancia2.setText(planetas[6].distancia.toString())
                    textview_densidad2.setText(planetas[6].densidad.toString())
                }
                if (list_planetas2.text.toString() == "Neptuno") {
                    textview_diametro2.setText(planetas[7].diametro.toString())
                    textview_distancia2.setText(planetas[7].distancia.toString())
                    textview_densidad2.setText(planetas[7].densidad.toString())
                }
                if (list_planetas2.text.toString() == "Plutón") {
                    textview_diametro2.setText(planetas[8].diametro.toString())
                    textview_distancia2.setText(planetas[8].distancia.toString())
                    textview_densidad2.setText(planetas[8].densidad.toString())
                }
            }
        })

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main,menu)
        return true
    }




}