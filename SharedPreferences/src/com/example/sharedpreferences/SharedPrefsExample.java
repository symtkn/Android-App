package com.example.sharedpreferences;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class SharedPrefsExample extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		SharedPreferences mSharedPrefs = getSharedPreferences("xmlFile", MODE_PRIVATE);
		SharedPreferences.Editor mPrefsEditor = mSharedPrefs.edit();
		 
	    int mCounter = mSharedPrefs.getInt("counter", 0);
		 
	    TextView tv = (TextView) findViewById(R.id.tvSampleTv);
	    tv.setText("Uygulama daha �nce " + String.valueOf(mCounter) + " defa �al��t�r�ld�.");
		 
	    mPrefsEditor.putInt("counter", ++mCounter);
		mPrefsEditor.commit();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		
		return true;
	}

}
