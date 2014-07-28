package com.example.android.BluetoothChat;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Start extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen);
        
        Button btn1 = (Button) findViewById(R.id.button1);
    	btn1.setOnClickListener(this);
    	
    	Button btn2 = (Button) findViewById(R.id.button2);
    	btn2.setOnClickListener(this);
    	
    	Button btn3 = (Button) findViewById(R.id.button3);
    	btn3.setOnClickListener(this);
    	
    	Button btn4 = (Button) findViewById(R.id.button4);
    	btn4.setOnClickListener(this);
    	
    	Button btn5 = (Button) findViewById(R.id.button5);
    	btn5.setOnClickListener(this);
    	
    	
    }

    
   
    public void onClick(View v) 
   	{
    	
    	switch (v.getId()) 
    	{
    	
    	case R.id.button1:
        	Toast.makeText(this," Starting the app", Toast.LENGTH_SHORT).show();
    		Intent i1 = new Intent (this,BluetoothChat.class);
            startActivity(i1);
            break;
            
    	case R.id.button2:
    		Intent i2 = new Intent (this, instructions.class);
            startActivity(i2);
            break;
    	case R.id.button3:
    		Intent i3 = new Intent (this, about.class);
            startActivity(i3);
            break;
    	
    	case R.id.button4:
    		Intent i4 = new Intent (this, contact_us.class);
            startActivity(i4);
            break;
    		
    	case R.id.button5:
    		Toast.makeText(this," Quitting the app", Toast.LENGTH_SHORT).show();
    		finish();
    	
   	 	}
   	}
   	
}