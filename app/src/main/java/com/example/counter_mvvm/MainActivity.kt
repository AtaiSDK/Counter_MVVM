package com.example.counter_mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.counter_mvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    private val nameViewModel : NameViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClickers()

        nameViewModel.lives.observe(this, Observer {
            binding.count.text = it.toString()
        })
    }

    private fun initClickers() {
        with(binding){
            incrementBtn.setOnClickListener {
                nameViewModel.increment()
            }
            decrementBtn.setOnClickListener {
                nameViewModel.decrement()
            }
        }
    }
}