package edu.temple.inclassuiacvitivity

import android.content.Context
import android.graphics.Color
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

@Suppress("UNREACHABLE_CODE")
class TextSizeAdapter (private val context: Context, private val number: Array <Int> ) : BaseAdapter() {


    override fun getCount(): Int {
        return number.size

    }

    override fun getItem(position: Int): Any {
        return number[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
       val textView : TextView

       if (convertView != null) {
           textView = convertView as TextView

       } else {
           textView = TextView(context)

       }

        textView.text = number[position].toString()
        textView.textSize = 22f

        return textView
        }
        override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?): View {
            return super.getDropDownView(position, convertView, parent).apply {

                (this as TextView).textSize = number[position].toFloat()
            }
        }

}