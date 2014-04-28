package com.example.firstapp;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MenuActivity extends Activity {
	//public final static String EXTRA_MESSAGE = "com.example.firstapp.MESSAGE";
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu);
		//ActionBar actionBar = getActionBar();
	}

	/**
	 * Set up the {@link android.app.ActionBar}, if the API is available.
	 */
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	private void setupActionBar() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			getActionBar().setDisplayHomeAsUpEnabled(true);
		}
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

	/** Called when the user clicks the Profile button */
	public void viewProfile(View view) {
		Intent intent = new Intent(this, ProfileActivity.class);
		startActivity(intent);
	}
	
	/** Called when the user clicks the Workout button */
	public void viewWorkout(View view) {
		Intent intent = new Intent(this, WorkoutActivity.class);
		startActivity(intent);
	}
	
	/** Called when the user clicks the Results button */
	public void viewResults(View view) {
		Intent intent = new Intent(this, ResultsActivity.class);;
		startActivity(intent);
	}
}

