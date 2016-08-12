package com.example.virtualcr;







import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class batches extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.batches);
		
Button firstYr=(Button)findViewById(R.id.button1);
		
		firstYr.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent opencounter=new Intent(getApplicationContext(),FirstYr.class);
				startActivity(opencounter);
				
				finish();
				
			}
		});
	

	
	
}

	public void onBackPressed()
	{
		super.onBackPressed();
		startActivity(new Intent(this,MainActivity.class));
		finish();
		
		
	}
	
}