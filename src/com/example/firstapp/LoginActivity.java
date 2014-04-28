package com.example.firstapp;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class LoginActivity extends Activity {
	public final static String EXTRA_MESSAGE = "com.example.firstapp.MESSAGE";
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		//ActionBar actionBar = getActionBar();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
	    // Inflate the menu items for use in the action bar
	    MenuInflater inflater = getMenuInflater();
	    inflater.inflate(R.menu.main_activity_actions, menu);
	    return super.onCreateOptionsMenu(menu);
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    // Handle presses on the action bar items
	    switch (item.getItemId()) {
	        case R.id.action_search:
	            openSearch();
	            return true;
	        case R.id.action_settings:
	            openSettings();
	            return true;
	        default:
	            return super.onOptionsItemSelected(item);
	    }
	}
	
	private void openSettings() {
		// TODO Auto-generated method stub
		
	}

	private void openSearch() {
		// TODO Auto-generated method stub
		
	}

	/** Called when the user clicks the login button */
	public void checkLogin(View view) {
		Intent intent = new Intent(this, MenuActivity.class);
		EditText editText = (EditText) findViewById(R.id.edit_message);
		String message = editText.getText().toString();
		if(message.equals("test")){ //check login (username only) REFINE LATER 
			startActivity(intent);
		}else{
			message = "Failed";
			intent.putExtra(EXTRA_MESSAGE, message);
			startActivity(intent);
		}
	}

}
