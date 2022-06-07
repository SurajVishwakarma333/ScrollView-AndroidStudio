package com.example.scrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}


//    ScrollView is used to scroll the items in horizontal and vertical direction.
//
//        In android default ScrollView is used to scroll the items in vertical direction and if you want to scroll the items horizontally then you need to implement horizontal ScrollView.
//
//   Attributes Of Scroll View:
//
//        ScrollView(VerticalScrollView) and HorizontalScrollView has same attributes, the only difference is scrollView scroll the child items in vertical direction while horizontal scroll view scroll the child items in horizontal direction.
//
//   1.scrollbars: In android, scrollbars attribute is used to show the scrollbars in horizontal or vertical direction. The possible Value of scrollbars is vertical, horizontal or none. By default scrollbars is shown in vertical direction in scrollView and in horizontal direction in HorizontalScrollView.
//
//   syntax :
//
//      <ScrollView
//        android:layout_width="fill_parent"
//        android:layout_height="fill_parent"
//        android:scrollbars="vertical"/> <!--scrollbars in vertical direction-->
//
//
//  Important Note: Remember ScrollView can hold only one direct child. So we have to jointly put 10 buttons inside Linear Layout to make it one child. And then we put it inside ScrollView.


