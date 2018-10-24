package com.mywings.lovesms

import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.category_row.view.*

class CategoryAdapter : RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {

    companion object {
        var category: List<String> = listOf(
            "सर्व",
            "प्रेम",
            "मैत्री",
            "आठवण",
            "जीवलग",
            "भावना",
            "विरह",
            "वेलेंटाईन डे",
            "विनोदी",
            "कविता",
            "प्रेमविचार",
            "तू आणि मी",
            "फिल्मी",
            "लग्न",
            "पाऊस",
            "गुलाबी थंडी",
            "शायरी",
            "चारोली"
        )
    }


    override fun onCreateViewHolder(parent: ViewGroup, position: Int): CategoryViewHolder {
        return CategoryViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.category_row, parent, false))
    }

    override fun getItemCount(): Int {
        return category.size
    }

    override fun onBindViewHolder(viewHolder: CategoryViewHolder, position: Int) {
        viewHolder.txtCategoryName.text = category.get(position)
        viewHolder.container.setOnClickListener {
            val intent = Intent(viewHolder.container.context,SmsDetailsActivity::class.java)
            viewHolder.container.context.
        }

    }


    inner class CategoryViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val txtCategoryName = view.txtCategoryName
        val container = view.container
    }

}