package com.nure.nure.custom

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.nure.nure.R
import kotlinx.android.synthetic.main.spinner_layout.view.*

class CustomSpinnerAdapter(context: Context, resource: Int, val spinnerItems: Array<String>) :
    ArrayAdapter<String>(context, resource, spinnerItems) {
    val inflater : LayoutInflater = LayoutInflater.from(context)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = inflater.inflate(R.layout.spinner_layout, null)
        view.spinner_item_text.text = spinnerItems[position]
        return view
    }

    //private fun customizeSpinner() {
      //  val customSpinnerAdapter = CustomSpinnerAdapter(this,
      //      android.R.layout.simple_spinner_item, resources.getStringArray(R.array.array_languages))
      //  customSpinnerAdapter.setDropDownViewResource(R.layout.row_spinner)
        //spinner.adapter = customSpinnerAdapter
    //}
}