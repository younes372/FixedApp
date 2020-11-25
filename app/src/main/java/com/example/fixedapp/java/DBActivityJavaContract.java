package com.example.fixedapp.java;

public interface DBActivityJavaContract {

    public interface Presenter {
        void onShowData(DataJava dataJ);
    }


    public interface View {

     //   public void onToastClicked(View view, DBActivityJava ac );
        public void onToastClicked();

        public void onClick(DataJava j);

        public boolean onLongClick();
    }



}
