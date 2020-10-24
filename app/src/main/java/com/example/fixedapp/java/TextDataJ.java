package com.example.fixedapp.java;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.example.fixedapp.BR;

public class TextDataJ extends BaseObservable {

    String text;
    String des;
    String age = "0";

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
