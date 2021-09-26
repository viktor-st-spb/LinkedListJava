 package com.example.linkedlistjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create a new instance of LinkList
        LinkedList list = new LinkedList();
        list.insert(5);
    }
}