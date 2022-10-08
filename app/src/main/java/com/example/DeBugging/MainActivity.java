package com.example.DeBugging;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


//What has been added to the intent video WalkThrough
//Setting button as btnCount, and count to an integer that is equal to zero



    Button btnCount;
    int count = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




//What has been added to the intent video WalkThrough

                //Initializing and Finding the button by ID
                          btnCount = findViewById(R.id.btn);

                        //setting the initial text to display zero
                                btnCount.setText(String.valueOf(0));




    }

    public void getNameClick(View view) {


    //Creating intent and setting it as getNameScreenIntent and specifying the different jave files, or activities we will use
        Intent getNameScreenIntent = new Intent(MainActivity.this, MainActivity2.class);

        //setting result equal to one
            final int result = 1;

            //Putting value into new Intent
                getNameScreenIntent.putExtra("callingActivity", "MainActivity");

             //Starting the getNameScreenIntent and defining the result
                startActivityForResult(getNameScreenIntent, result);
                //startActivity(getNameScreenIntent);


//What has been added to the intent video WalkThrough

        //Incrementing the count variable that starts at zero with each onClick iteration
        count ++;

        //Putting new count in the button every click
        btnCount.setText(String.valueOf(count));



    }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


    //Creating the text view
    //        TextView userNameMessage = findViewById(R.id.tv2);

        //Naming a string and getting data back as UserName
        //        String nameSentBack = data.getStringExtra("UserName");

            //Appending new string variable with a space
            //        userNameMessage.append(" " + nameSentBack);

    }
}