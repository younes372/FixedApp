package com.example.fixedapp.kotlin.databinding

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.fixedapp.R
import com.example.fixedapp.java.TextDataJ


class DBActivityKotlin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
     //   setContentView(R.layout.activity_data_kotlin)



    }

    class MyClickHandlersKotlin(var context: Context) {

        fun onToastClicked(view: View?, ac: DBActivityKotlin?) {
            Toast.makeText(ac, "Following is clicked!", Toast.LENGTH_SHORT).show()
        }

        fun onCategoryClick(view: View?, data: TextDataJ) {
           Toast.makeText(context, "", Toast.LENGTH_LONG).show()
            data.des = context.resources.getString(R.string.imamzman)
            Toast.makeText(context, data.des, Toast.LENGTH_SHORT).show()
        }
    }

}