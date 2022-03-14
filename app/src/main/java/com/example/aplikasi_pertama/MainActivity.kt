package com.example.aplikasi_pertama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.aplikasi_pertama.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

//    fun isNumber(s: String): Boolean { //cek if inputs are integer or not
//        return when(s.toFloatOrNull())
//        {
//            null -> false
//            else -> true
//        }
//    }

    fun hitung(view: View) {
        val bb = binding.editBerat.text.toString().toFloat()
        val tb = binding.editTinggi.text.toString().toFloat()/100

        val result = bb/(tb*tb)
        binding.index.text = "result : $result"

        var status = ""
        if(result >= 30.0) status = "Kegemukan"
            else if(result >= 25.0) status = "Kelebihan berat badan"
            else if(result >= 18.5)  status = "Normal"
                else status = "Kekurangan berat badan"

        binding.status.text = "status : $status"
    }
}