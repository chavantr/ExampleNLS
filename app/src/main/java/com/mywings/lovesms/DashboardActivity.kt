package com.mywings.lovesms

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.activity_dashboard.*

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        MobileAds.initialize(this, "ca-app-pub-6899596860681063~1058123234")
        val adRequest = AdRequest.Builder().build()
        adView.loadAd(adRequest)
        lstCategories.layoutManager = LinearLayoutManager(this)
        lstCategories.adapter = CategoryAdapter()
    }
}
