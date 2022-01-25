package com.mogga.quizapp

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.mogga.quizapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var name:Editable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      binding = ActivityMainBinding.inflate(layoutInflater)
        val  view = binding.root
        setContentView(view)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        name= binding.inputText.text!!
      binding.btnNext.setOnClickListener {
          if(binding.inputText.text.toString().isEmpty()){
              Toast.makeText(this,"please Enter Your Name",Toast.LENGTH_SHORT).show()


          }else{
              val intent = Intent(this,Question::class.java)
              intent.type = "text_input"
              startActivity(intent)
              finish()

          }

      }
    }
}