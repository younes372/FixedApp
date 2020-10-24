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
    //    data.setDes(getResources().getString(R.string.imamali));
        binding.setData(data);
        binding.setPresenter(handlers);
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

    }

    @Override
    public void onClick(DBActivityJavaContract.View view, TextDataJ j) {
        Toast.makeText(DBActivityJava.this, j.text, Toast.LENGTH_LONG).show();
    //    Toast.makeText(((Context)view), j.text, Toast.LENGTH_SHORT).show();

    }

    @Override
    public boolean onLongClick(DBActivityJavaContract.View v) {
        Toast.makeText(DBActivityJava.this, "onLongClick", Toast.LENGTH_LONG).show();

        return false;
    }


    public class MyClickHandlersJava {

        Context context;

        public MyClickHandlersJava(Context context) {
            this.context = context;
        }


        public void onToastClicked(View view, DBActivityJava ac ) {
            Toast.makeText(ac, "Following is clicked!", Toast.LENGTH_SHORT).show();
        }

        public void onChangeTextClick(View view, TextDataJ j) {
          //  data.setDes(getResources().getString(R.string.imamzman));
        }



        public boolean onLongClickOnHeading(View v) {
            Toast.makeText(v.getContext(),AgeYab.Companion.ageFind("imam ali"), Toast.LENGTH_LONG).show();
         //   data.setAge("imam ali");
            return false;
        }


    }

}