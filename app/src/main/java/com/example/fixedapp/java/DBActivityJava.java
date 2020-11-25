package com.example.fixedapp.java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableArrayMap;
import androidx.databinding.ObservableBoolean;


import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fixedapp.R;
import com.example.fixedapp.databinding.ActivityDataJavaBinding;
import com.example.fixedapp.utils.AgeYab;


//public class DBActivityJava extends AppCompatActivity implements DBActivityJavaContract.View{
public class DBActivityJava extends AppCompatActivity {



    //public final ObservableBoolean showView = new ObservableBoolean(true);




    private DataJava data;
    private Button button;
    private TextView textView;
    private MyClickHandlersJava handlers;
    //private DBActivityJavaPresenter handlers;
    ActivityDataJavaBinding binding;
    private boolean h=true;



/*

   public ObservableArrayList<Object> user1 = new ObservableArrayList<>();

    public void updateName() {
        user1.add("younes1");
        user1.add("Aliabadi1.");
        user1.add(27);


    }*/






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //  setContentView(R.layout.activity_data_java);

         binding = DataBindingUtil.setContentView(this, R.layout.activity_data_java);
         handlers = new MyClickHandlersJava();
        // handlers = new DBActivityJavaPresenter(this);

        initViews();




        data = new DataJava();
        data.setText(getResources().getString(R.string.start));
        data.setDes(getResources().getString(R.string.imamali));
        data.setAge("imam ali");

        binding.setData(data);
        binding.setPresenter(handlers);

        binding.setUser1(data.user1);
        binding.setUser2(data.user2);
      //  binding.setUser2(user2);
      //  binding.setMyAgeYabJ(new AgeYabJ());

     //   binding.setAc(this);
    //    binding.setCallbackOnclick(handlers);
    //    binding.setPresenter(handlers);






    }

    private void initViews() {

    //    button = findViewById(R.id.button);
    //    textView = findViewById(R.id.textView);
    //    button =binding.button;
    //    textView =binding.textView;
    }

/*    @Override
    public void onToastClicked() {
        Toast.makeText(DBActivityJava.this, "onToastClicked", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(DataJava j) {
       data.setDes(getResources().getString(R.string.imamzman));
            data.setDes( getResources().getString(R.string.imamzman));
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                @Override
                public void run() {


                    data.nameauthor.set("Younes");
                    final String name = data.nameauthor.get();

                    Toast.makeText(DBActivityJava.this, name, Toast.LENGTH_SHORT).show();

                }
            }, 50000);
    }

    @Override
    public boolean onLongClick() {
           Toast.makeText(DBActivityJava.this, AgeYab.Companion.ageFind("imam zaman"), Toast.LENGTH_LONG).show();
            data.setAge(getResources().getString(R.string.Jesus));
            data.nameauthor.set("Younes Aliabadi");
        return false;
    }*/


    public class MyClickHandlersJava {

        public MyClickHandlersJava( ) {
        }

        public void onToastClicked() {
            Toast.makeText(DBActivityJava.this, "onToastClicked", Toast.LENGTH_SHORT).show();

        }


        public void onClick(DataJava dataJ) {
            data.setDes( getResources().getString(R.string.imamzman));
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                @Override
                public void run() {


                    data.nameauthor.set("Younes Aliabadi ajimaji  hoooora");
                    final String name = data.nameauthor.get();

                    Toast.makeText(DBActivityJava.this, name, Toast.LENGTH_SHORT).show();

                }
            }, 50000);


        }


        public boolean onLongClick() {
            Toast.makeText(DBActivityJava.this, AgeYab.Companion.ageFind("imam zaman"), Toast.LENGTH_LONG).show();
            data.setAge("imam zaman");
            data.nameauthor.set("Younes Aliabadi");
            return false;
        }





    }

}