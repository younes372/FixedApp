package com.example.fixedapp.java;

public class DBActivityJavaPresenter {

    private DBActivityJavaContract.View view;

  //  private DBActivityJava ac;
/*
    public DBActivityJavaPresenter(DBActivityJavaContract.View view,DBActivityJava ac) {
        this.view = view;
        this.ac = ac;
    }*/

    public DBActivityJavaPresenter(DBActivityJavaContract.View view ) {
        this.view = view;
    }

    public void onClick(DataJava dataJ) {
        view.onClick(dataJ);
    }

    public boolean onLongClick() {
        view.onLongClick();
        return false;
    }

    public void onToastClickedp() {
        view.onToastClicked();
    }

}