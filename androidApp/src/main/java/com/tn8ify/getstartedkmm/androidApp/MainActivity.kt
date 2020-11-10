package com.tn8ify.getstartedkmm.androidApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tn8ify.getstartedkmm.shared.Greeting
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton

fun greet(): String {
    return Greeting().greeting()
}

fun increment() : Unit {
    Greeting().increment()
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.text_view)
        tv.text = greet()

        val greeting = Greeting()
        val floatingActionButton: FloatingActionButton = findViewById(R.id.floatingActionButton)
        floatingActionButton.setOnClickListener {
            greeting.run {
                increment()
                tv.text =  count.toString()
            }
        }

    }
}
