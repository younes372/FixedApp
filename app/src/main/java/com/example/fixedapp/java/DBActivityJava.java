package com.example.fixedapp.java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;


import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fixedapp.R;
import com.example.fixedapp.databinding.ActivityDataJavaBinding;
import com.example.fixedapp.utils.AgeYab;
import com.example.fixedapp.utils.AgeYabJ;


public class DBActivityJava extends AppCompatActivity implements DBActivityJavaContract.View{

    private TextDataJ data;
    private Button button;
    private TextView textView;
//    private MyClickHandlersJava handlers;
    private DBActivityJavaPresenter handlers;
    ActivityDataJavaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //  setContentView(R.layout.activity_data_java);

         binding = DataBindingUtil.setContentView(this, R.layout.activity_data_java);
         // handlers = new MyClickHandlersJava(this);
         handlers = new DBActivityJavaPresenter(this);

        initViews();


        data = new TextDataJ();
        data.setText(getResources().getString(R.string.start));
        data.setDes(getResources().getString(R.string.imamali));
        data.setAge("imam ali");

        binding.setData(data);
        binding.setPresenter(handlers);
      //  binding.setMyAgeYabJ(new AgeYabJ());

     //   binding.setAc(this);
    //    binding.setCallbackOnclick(handlers);
    //    binding.setPresenter(handlers);


    }

    private void initViews() {
    //    button = findViewById(R.id.button);
      //  textView = findViewById(R.id.textView);
     //   button =binding.button;
    //    textView =binding.textView;
    }

    @Override
    public void onToastClicked(DBActivityJavaContract.View view) {
        Toast.makeText(DBActivityJava.this, "onToastClicked", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(DBActivityJavaContract.View view, TextDataJ j) {
        data.setDes(getResources().getString(R.string.imamzman));
    }

    @Override
    public boolean onLongClick(DBActivityJavaContract.View v) {
        data.setAge(getResources().getString(R.string.Jesus));
        return false;
    }


    public class MyClickHandlersJava {

        Context context;

        public void MyClickHandlersJava(DBActivityJavaContract.View view) {
            this.context = context;
        }


        public void onToastClicked(DBActivityJavaContract.View view) {
            Toast.makeText(DBActivityJava.this, "onToastClicked", Toast.LENGTH_SHORT).show();
        }

        public void onClick(DBActivityJavaContract.View view, TextDataJ j) {
          //  data.setDes(getResources().getString(R.string.imamzman));
        }



        public boolean onLongClick(DBActivityJavaContract.View v) {
            Toast.makeText(DBActivityJava.this,AgeYab.Companion.ageFind("imam ali"), Toast.LENGTH_LONG).show();
         //   data.setAge("imam ali");
            return false;
        }


    }

}