package com.example.ppbm2

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat

class SocialMedia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        WindowCompat.setDecorFitsSystemWindows(
            window, false
        )

        // siapin variable array yang mempunyai nilai
        val namanama = arrayOf<String>(
            "Tiktok",
            "Youtube",
            "Instagram"
        )

        val desc = arrayOf<String>(
            "zaidandye",
            "Zaidandy_",
            "@zaidandy_"
        )

        val fotofoto = arrayOf<Int>(
            R.drawable.tiktok1,
            R.drawable.youtube,
            R.drawable.insta1
        )

        // definisi list view
        val list = findViewById<ListView>(R.id.listview)
        list.adapter = listAdaptor(this, namanama, fotofoto, desc)
        list.setOnItemClickListener { adapterView, view, position, id ->

            if (position == 0) {
                // Handle action for position 1 (open web preview in WebViewActivity)
                val intent = Intent(this, ProfileActivity::class.java)
                startActivity(intent)
            }

            if (position == 1) {
                // Handle action for position 1 (open web preview in WebViewActivity)
                val intent = Intent(this, ProfileActivity2::class.java)
                startActivity(intent)
            }

            if (position == 2) {
                // Handle action for position 1 (open web preview in WebViewActivity)
                val intent = Intent(this, ProfileActivity3::class.java)
                startActivity(intent)
            }

        }


    }

}