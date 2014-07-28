package com.example.android.BluetoothChat;


import android.app.Activity;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class instructions extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.instructions);
        
        Button btn1 = (Button) findViewById(R.id.button1);
    	btn1.setOnClickListener(this);
  
    }
    
    public void onClick(View v) 
   	{
    	switch (v.getId()) 
    	{
    	case R.id.button1:
    		finish();
            break;
    	}
   	}
    
}