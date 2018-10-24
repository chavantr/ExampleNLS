package com.mywings.lovesms

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_splash_screen.*


class SplashScreenActivity : AppCompatActivity() {
    private lateinit var rotateAnimation: AnimationDrawable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash_screen)
        imgImages.apply {
            setBackgroundResource(R.drawable.rotatelist)
            rotateAnimation = background as AnimationDrawable
        }
        imgImages.setOnClickListener {
            rotateAnimation.start()
        }
        val nextHandler = Handler()
        nextHandler.postDelayed({
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
        }, 5000)
    }
}
