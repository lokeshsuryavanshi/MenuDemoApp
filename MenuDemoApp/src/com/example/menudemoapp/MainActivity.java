package com.example.menudemoapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	void newGame(){
		Toast.makeText(MainActivity.this,"hiii imr",Toast.LENGTH_LONG).show();
	}
	void showHelp1() {
		Toast.makeText(MainActivity.this,"hii frndss",Toast.LENGTH_LONG).show();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
	    switch (item.getItemId()) {
        case R.id.action_home:
            newGame();
            return true;
        case R.id.action_settings:
            showHelp1();
            return true;
        default:
            return super.onOptionsItemSelected(item);
  
	    }
	}
}
	
	


