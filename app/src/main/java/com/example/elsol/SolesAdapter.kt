package com.example.elsol



import android.content.Context
import android.widget.TextView
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ImageView


class SolesAdapter(context: Context, private val soles: ArrayList<Sol>) : ArrayAdapter<Sol>(context, R.layout.list_item, soles)
{
    private val mInflater: LayoutInflater

    init {
        this.mInflater = LayoutInflater.from(context)
    }

    override fun getCount(): Int {
        return soles.size
    }

    override fun getItem(position: Int): Sol? {
        return soles[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var convertView = convertView
        var holder: ViewHolder? = null

        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.list_item, null)
            holder = ViewHolder()
            holder.hNombre = convertView.findViewById(R.id.idNombre) as TextView
            holder.hImage = convertView.findViewById(R.id.idFoto) as ImageView
            convertView.tag = holder
        }
        else {
            holder = convertView!!.tag as ViewHolder?
        }
        val sol = getItem(position)
        holder!!.hNombre!!.text = sol!!.nombre
        holder!!.hImage!!.setImageResource(sol!!.logo)
        return convertView!!
    }

    internal inner class ViewHolder {
        var hNombre: TextView? = null
        var hImage: ImageView? = null
    }
}