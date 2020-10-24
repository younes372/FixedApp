package com.example.fixedapp.java;

public interface DBActivityJavaContract {

    public interface Presenter {
        void onShowData(TextDataJ dataJ);
    }


    public interface View {

     //   public void onToastClicked(View view, DBActivityJava ac );
        public void onToastClicked(View view );

        public void onClick(View view, TextDataJ j);

        public boolean onLongClick(View v);
    }



}
