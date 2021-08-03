package com.example.databindingexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.databindingexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val myInfo:MyInfo = MyInfo("Zaid Kamil")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.info = myInfo
        binding.btnSubmit.setOnClickListener {
            val name = binding.editName.text.toString()
            binding.textUsername.text = name
            binding.editName.visibility = View.GONE
            binding.btnSubmit.visibility = View.GONE
        }
    }
}