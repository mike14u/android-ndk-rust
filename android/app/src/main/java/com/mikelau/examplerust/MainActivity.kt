package com.mikelau.examplerust

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    companion object {
        init {
            System.loadLibrary("examplerust_android")
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rustBridge = RustBridge()
        val sampleText: String = rustBridge.justAnotherFunction("The Secret Code is: ")
        (findViewById<View>(R.id.textView1) as TextView).text = sampleText
    }

}