package com.example.fixedapp.java;

import android.database.Observable;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableArrayMap;
import androidx.databinding.ObservableField;

import com.example.fixedapp.BR;

public class DataJava extends BaseObservable {

    //Observable objects
    String text;
    String des;
    String age = "0";


    // Observable fields
    public ObservableField<String> nameauthor;



    //Observable collections
    public ObservableArrayMap<String, Object> user2 = new ObservableArrayMap<>();
    public ObservableArrayList<Object> user1 = new ObservableArrayList<>();


    public DataJava() {
        nameauthor=new ObservableField<>();

        user2.put("firstName", "younes1");
        user2.put("lastName", "Aliabadi1");
        user2.put("age", 28);


        user1.add("younes2");
        user1.add("Aliabadi2");
        user1.add(27);

    }


    public ObservableField<String> getNameauthor() {
        return nameauthor;
    }

    @Bindable
    public String getDes() {
        return des;
    }

    @Bindable
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
        notifyPropertyChanged(BR.age);
    }

    public void setDes(String des) {
        this.des = des;
        notifyPropertyChanged(BR.des);
    }


    @Bindable
    public String getText() {
        return text;

    }

    @Bindable
    public void setText(String text) {
        this.text = text;
        notifyPropertyChanged(BR.text);
    }

}
