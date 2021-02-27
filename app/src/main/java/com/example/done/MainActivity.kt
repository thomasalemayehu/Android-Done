package com.example.done

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        Animation for SVG Image ( Woman )
        woman_logo.startAnimation(AnimationUtils.loadAnimation(this,R.anim.splash_in))
//        Animation for Start Button
        get_started_button.startAnimation(AnimationUtils.loadAnimation(this,R.anim.button_slide))
        get_started_button.setOnClickListener{
             startActivity(Intent(this,HomeActivity::class.java))
            finish()
        }

    }
}