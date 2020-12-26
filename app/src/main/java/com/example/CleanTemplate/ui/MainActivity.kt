package com.example.CleanTemplate.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.lifecycle.ViewModelProvider
import com.example.CleanTemplate.base.App
import com.example.CleanTemplate.R
import com.example.CleanTemplate.viewModel.MainViewModel
import javax.inject.Inject



class MainActivity : AppCompatActivity() {
    @Inject lateinit var modelFactory: ViewModelProvider.Factory

    private lateinit var  mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        App.appComponent.inject(this)
        mainViewModel=ViewModelProvider(this,modelFactory).get(MainViewModel::class.java)
        val btn=findViewById<Button>(R.id.testBtn)
        btn.setOnClickListener {

            val testListMA=mainViewModel.goTest()
            Log.d("test",testListMA.toString())
            btn.text=testListMA.toString()

        }
    }
}