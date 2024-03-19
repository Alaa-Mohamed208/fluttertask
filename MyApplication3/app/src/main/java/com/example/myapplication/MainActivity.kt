package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
//Alaa Mohamed AbdelGhaffar -- G1

class MainActivity : AppCompatActivity(), model_view {
    lateinit var  presenter: Presenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter=Presenter(this)
        button.setOnClickListener{
            presenter.pass_model_to_view()
        }
    }
        fun Get_Model_View(model_value: TaskModel) {
        text_id.text = model_value.id
        text_name.text = model_value.name
        text_address.text = model_value.address
    }
}
