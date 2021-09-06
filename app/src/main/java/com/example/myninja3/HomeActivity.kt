package com.example.myninja3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        var btnPer : Button = findViewById(R.id.button3)
        var btnPro: Button = findViewById(R.id.button4)

        btnPer.setOnClickListener{
            var i = Intent(this,PerActivity::class.java)
            startActivity(i)
        }

        btnPro.setOnClickListener{
            var i = Intent(this,ProffActivity::class.java)
            startActivity(i)
        }
    }
}