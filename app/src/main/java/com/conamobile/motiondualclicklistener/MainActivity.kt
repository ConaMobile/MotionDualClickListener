package com.conamobile.motiondualclicklistener

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.conamobile.motiondualclicklistener.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        click()
    }

    private fun click() {
        binding.button.setOnClickListener {
            binding.motion.transitionToEnd()
            Toast.makeText(this, "click", Toast.LENGTH_SHORT).show()
        }
    }

}