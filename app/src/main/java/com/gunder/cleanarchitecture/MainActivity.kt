package com.gunder.cleanarchitecture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.gunder.cleanarchitecture.databinding.ActivityMainBinding
import com.gunder.cleanarchitecture.presentation.MainViewModel
import com.gunder.cleanarchitecture.presentation.MainViewModelFactory

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val factory = MainViewModelFactory.getInstance()
        val viewModel = ViewModelProvider(this, factory)[MainViewModel::class.java]

        viewModel.setName("gunder")
        viewModel.message.observe(this, Observer {
            binding.tvWelcome.text = it.welcomeMsg
        })
    }
}