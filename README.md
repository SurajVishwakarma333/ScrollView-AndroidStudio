# ScrollView-AndroidStudio.


I. ScrollView is used to scroll the items in horizontal and vertical direction.

II. In android default ScrollView is used to scroll the items in vertical direction and if you want to scroll the items horizontally then you need to implement horizontal ScrollView.
 
• Important Note : Remember ScrollView can hold only one direct child. So we have to jointly put 10 buttons inside Linear Layout to make it one child. And then we put it inside ScrollView. 
 
• Important attributes Of Scroll View is scrollbars :

scrollbars : In android, scrollbars attribute is used to show the scrollbars in horizontal or vertical direction. The possible Value of scrollbars is vertical, horizontal or none. By default scrollbars is shown in vertical direction in scrollView and in horizontal direction in HorizontalScrollView.

ScrollView(VerticalScrollView) and HorizontalScrollView has same attributes, the only difference is scrollView scroll the child items in vertical direction while horizontal scroll view scroll the child items in horizontal direction.

• syntax :

     <ScrollView
        android:layout_width="fill_parent"
        android:layout_height="fill_parent"
        android:scrollbars="vertical"> <!--scrollbars in vertical direction-->
     </ScrollView>
     
     
     
.xml file

      <?xml version="1.0" encoding="utf-8"?>
      <androidx.constraintlayout.widget.ConstraintLayout
        xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        xmlns:tools="http://schemas.android.com/tools"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity">

       <ScrollView
         android:layout_width="match_parent"
         android:layout_height="match_parent"
         android:scrollbars="vertical">

          <LinearLayout
            android:layout_width="fill_parent"
            android:layout_height="fill_parent"
            android:layout_margin="20dp"
            android:orientation="vertical">

            <Button
                android:layout_width="fill_parent"
                android:layout_height="wrap_content"
                android:layout_gravity="center"
                android:background="#f00"
                android:text="Button 1"
                android:textColor="#fff"
                android:textSize="20sp" />
            <Button
                android:layout_width="fill_parent"
                android:layout_height="wrap_content"
                android:layout_gravity="center"
                android:layout_marginTop="20dp"
                android:background="#0f0"
                android:text="Button 2"
                android:textColor="#fff"
                android:textSize="20sp" />
            <Button
                android:layout_width="fill_parent"
                android:layout_height="wrap_content"
                android:layout_gravity="center"
                android:layout_marginTop="20dp"
                android:background="#00f"
                android:text="Button 3"
                android:textColor="#fff"
                android:textSize="20sp" />
            <Button
                android:layout_width="fill_parent"
                android:layout_height="wrap_content"
                android:layout_gravity="center"
                android:layout_marginTop="20dp"
                android:background="#ff0"
                android:text="Button 4"
                android:textColor="#fff"
                android:textSize="20sp" />
            <Button
                android:layout_width="fill_parent"
                android:layout_height="wrap_content"
                android:layout_gravity="center"
                android:layout_marginTop="20dp"
                android:background="#f0f"
                android:text="Button 5"
                android:textColor="#fff"
                android:textSize="20sp" />
            <Button
                android:layout_width="fill_parent"
                android:layout_height="wrap_content"
                android:layout_gravity="center"
                android:layout_marginTop="20dp"
                android:background="#f90"
                android:text="Button 6"
                android:textColor="#fff"
                android:textSize="20sp" />
            <Button
                android:layout_width="fill_parent"
                android:layout_height="wrap_content"
                android:layout_gravity="center"
                android:layout_marginTop="20dp"
                android:background="#f00"
                android:text="Button 7"
                android:textColor="#ff9"
                android:textSize="20sp" />
            <Button
                android:layout_width="fill_parent"
                android:layout_height="wrap_content"
                android:layout_gravity="center"
                android:layout_marginTop="20dp"
                android:background="#444"
                android:text="Button 8"
                android:textColor="#fff"
                android:textSize="20sp" />
            <Button
                android:layout_width="fill_parent"
                android:layout_height="wrap_content"
                android:layout_gravity="center"
                android:layout_marginTop="20dp"
                android:background="#ff002211"
                android:text="Button 9"
                android:textColor="#fff"
                android:textSize="20sp" />
            <Button
                android:layout_width="fill_parent"
                android:layout_height="wrap_content"
                android:layout_gravity="center"
                android:layout_marginTop="20dp"
                android:background="#0f0"
                android:text="Button 10"
                android:textColor="#fff"
                android:textSize="20sp" />
            <Button
                android:layout_width="fill_parent"
                android:layout_height="wrap_content"
                android:layout_gravity="center"
                android:layout_marginTop="20dp"
                android:background="#1D5D68"
                android:text="Button 11"
                android:textColor="#fff"
                android:textSize="20sp" />
            <Button
                android:layout_width="fill_parent"
                android:layout_height="wrap_content"
                android:layout_gravity="center"
                android:layout_marginTop="20dp"
                android:background="#831A69"
                android:text="Button 12"
                android:textColor="#fff"
                android:textSize="20sp" />
            <Button
                android:layout_width="fill_parent"
                android:layout_height="wrap_content"
                android:layout_gravity="center"
                android:layout_marginTop="20dp"
                android:background="#E15454"
                android:text="Button 13"
                android:textColor="#fff"
                android:textSize="20sp" />
            <Button
                android:layout_width="fill_parent"
                android:layout_height="wrap_content"
                android:layout_gravity="center"
                android:layout_marginTop="20dp"
                android:background="#8219DD"
                android:text="Button 14"
                android:textColor="#fff"
                android:textSize="20sp" />
            <Button
                android:layout_width="fill_parent"
                android:layout_height="wrap_content"
                android:layout_gravity="center"
                android:layout_marginTop="20dp"
                android:background="#2B0325"
                android:text="Button 15"
                android:textColor="#fff"
                android:textSize="20sp" />
            <Button
                android:layout_width="fill_parent"
                android:layout_height="wrap_content"
                android:layout_gravity="center"
                android:layout_marginTop="20dp"
                android:background="#FF19F3"
                android:text="Button 16"
                android:textColor="#fff"
                android:textSize="20sp" />
            <Button
                android:layout_width="fill_parent"
                android:layout_height="wrap_content"
                android:layout_gravity="center"
                android:layout_marginTop="20dp"
                android:background="#ECCC00"
                android:text="Button 17"
                android:textColor="#fff"
                android:textSize="20sp" />
            <Button
                android:layout_width="fill_parent"
                android:layout_height="wrap_content"
                android:layout_gravity="center"
                android:layout_marginTop="20dp"
                android:background="#F65220"
                android:text="Button 18"
                android:textColor="#fff"
                android:textSize="20sp" />

        </LinearLayout>
    </ScrollView>

   </androidx.constraintlayout.widget.ConstraintLayout>

https://user-images.githubusercontent.com/101108540/172356272-cee62147-29df-4116-b274-83a2e250eb51.mp4

