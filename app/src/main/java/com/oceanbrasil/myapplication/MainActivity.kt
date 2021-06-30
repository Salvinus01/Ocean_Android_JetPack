package com.oceanbrasil.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.oceanbrasil.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
/*

        val textView: TextView = findViewById(R.id.textView)
        val textViewModel = ViewModelProvider(this).get(TextViewModel::class.java)

        //Persistencia dos parâmetros no View Model, quando alterado conteudo
        //  atualiza controles
        textViewModel.text.observe(this, {
            textView.text = it
        })

        //Manipulador do Evento Click
        textView.setOnClickListener {
            textViewModel.text.value = "Elemento clicado"
        }
*/

/*        val cronometroViewModel = ViewModelProvider(this).get(CronometroViewModel::class.java)
        val textView: TextView = findViewById(R.id.textView)

        cronometroViewModel.elapsedTime.observe(this,{
            textView.text = "$it segundo(s) se passaram"
        })*/

        //val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

    }
}

