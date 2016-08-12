package com.example.virtualcr;



import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	
	 final EditText pass = (EditText) findViewById(R.id.editText1);

		Button mainmenu=(Button)findViewById(R.id.button1);
		mainmenu.setOnClickListener(new View.OnClickListener() {
			
	  
		
			@Override
			public void onClick(View v) {
				
				 if (pass.getText() != null)
			        {
			            
			            if("1".equals(pass.getText().toString()))
			            {
			            	Intent openbuttonMenu=new Intent(getApplicationContext(),batches.class);
							startActivity(openbuttonMenu);
							
							finish();
			            }
			        else
			           {
			        	Toast.makeText(MainActivity.this, "Your password is not correct! Please insert again",
		                        Toast.LENGTH_SHORT).show();
			            }
			        }
				
					 
					 else
			           {
			        	Toast.makeText(MainActivity.this, "Please enter the password.",
		                        Toast.LENGTH_SHORT).show();
			            }
				 
				 }
				
				
			        
		});
	}

	
}

