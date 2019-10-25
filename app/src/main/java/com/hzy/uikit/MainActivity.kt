package com.hzy.uikit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hzy.nim.fragment.P2PSessionFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction()
            .replace(R.id.frameLayout, P2PSessionFragment()).commit()
    }
}
