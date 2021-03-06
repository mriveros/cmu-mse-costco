package cmu.costco.simplifiedcheckout.nfc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {
	private static final String TAG = "nfc_exp";
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
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
			case R.id.action_settings:
            	Intent intent = new Intent(Settings.ACTION_NFCSHARING_SETTINGS);
                startActivity(intent);
                return true;
            default:
            	return super.onOptionsItemSelected(item);
		}
	}
	
	
	/**
	 * Called when a user presses the Customer Mode button on the main page
	 * @param view
	 */
	public void customerMode(View view) {
		Intent intent = new Intent(this, CustomerActivity.class);
		startActivity(intent);
	}
	
	/**
	 * Called when a user presses the Cashier Mode button on the main page
	 * @param view
	 */
	public void cashierMode(View view) {
		Intent intent = new Intent(this, CashierActivity.class);
		startActivity(intent);
	}

}
