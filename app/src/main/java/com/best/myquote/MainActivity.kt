package com.best.myquote

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.best.myquote.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    companion object{
        private val TAG = MainActivity::class.java.simpleName
    }

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        getRandomQuote()
    }

    private fun getRandomQuote() {

    }
}