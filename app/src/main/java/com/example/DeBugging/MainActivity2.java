package com.example.DeBugging;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



//Setting intent as activityThatCalled
        Intent activityThatCalled = getIntent();

//Setting previousActivity equal to activityThatCalled
        String previousActivity = activityThatCalled.getStringExtra("callingActivity");


//What I left out from the Video Walkthrough
//finding second edit text field and changing name to callingActivityMessage
    //TextView callingActivityMessage = findViewById(R.id.et2);


//Apending previousActivity with a space
    //callingActivityMessage.append(" " + previousActivity);

    }




    public void sendNameClick(View view) {


//What has been left out
  //Setting EditText field to what was typed in on this second activity
    //EditText userNameET = findViewById(R.id.et1);


//Getting the value and changing the name to userName
    //String userName = String.valueOf(userNameET.getText());



//Creating a new intent
        Intent goingBack = new Intent();



//What has been left out
//Setting the data and putting it into userName
    //goingBack.putExtra("UserName", userName);



//Saving result and switching to new intent
        setResult(RESULT_OK, goingBack);


//Finishing onClick event
        finish();


    }
}
