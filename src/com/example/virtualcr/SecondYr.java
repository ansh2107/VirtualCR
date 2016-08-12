package com.example.virtualcr;



import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
 









import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
//import org.apache.http.entity.mime.HttpMultipartMode;
//import org.apache.http.entity.mime.MultipartEntity;
//import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
 









import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.app.Activity;
 









import java.util.Calendar;
import java.util.HashMap;


//import com.example.parksys.postDate.PostDataAsyncTask;









import android.support.v7.app.ActionBarActivity;
import android.os.AsyncTask;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;
 
public class SecondYr extends Activity {
 
	
	
	  private static final String TAG = "datePicker.java";
    private TextView Output;
    private Button changeDate;
  int i=0;
    private int year;
    private int month;
    private int day;
	public TextView twotextview;
	public TextView twoamounttextview;
	public TextView fourtextview;
	public TextView fouramounttextview;
	
 
    static final int DATE_PICKER_ID = 1111; 
 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.time_table);
        
       
      //  final TextView logme = (TextView)findViewById(R.id.textView3);
        this.twotextview = (TextView) findViewById(R.id.textView1);
       // Context whis=this;
       // this.twoamounttextview = (TextView) findViewById(R.id.textView3);
       // this.fourtextview = (TextView) findViewById(R.id.textView5);
      //  this.fouramounttextview = (TextView) findViewById(R.id.textView4);

       
		
		
		
	
	 //   HashMap<String,String> user1 = userinfo.getUserInfo1();
	  //  HashMap<String,String> user3 = userinfo.getUserInfo3();
	   // HashMap<String,String> user4 = userinfo.getUserInfo4();
	    
		//this.twotextview.setText(user.get("name"));
		//this.fourtextview.setText(user1.get("name1"));
		//this.twoamounttextview.setText(user3.get("name3"));
		//this.fouramounttextview.setText(user4.get("name4"));
        

        
 
        Output = (TextView) findViewById(R.id.textView1);
        changeDate = (Button) findViewById(R.id.button1);
 
        // Get current date by calendar
         
        final Calendar c = Calendar.getInstance();
        year  = c.get(Calendar.YEAR);
        month = c.get(Calendar.MONTH);
       // day   = c.get(Calendar.DAY_OF_WEEK);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);

        String weekDay = ""; 
		if (c.get(Calendar.MONDAY) == dayOfWeek) weekDay  = "MONDAY";
        else if (c.get(Calendar.TUESDAY) == dayOfWeek) weekDay = "TUESDAY";
        else if (c.get(Calendar.WEDNESDAY) == dayOfWeek) weekDay = "WEDNESDAY";
        else if (c.get(Calendar.THURSDAY) == dayOfWeek) weekDay = "THURSDAY";
        else if (c.get(Calendar.FRIDAY) == dayOfWeek) weekDay = "FRIDAY";
        else if (c.get(Calendar.SATURDAY) == dayOfWeek) weekDay = "SATURDAY";
        else if (c.get(Calendar.SUNDAY) == dayOfWeek) weekDay = "SUNDAY";
        // Show current date
         
        Output.setText(new StringBuilder()
                // Month is 0 based, just add 1
                .append(weekDay));
        Log.d("DAY : ", Output.getText().toString());
        
        SecondYearParser userinfo = new SecondYearParser(getBaseContext(),Output.getText().toString());
    	userinfo.execute();
    	 HashMap<String,String> user = userinfo.getUserInfo();
    	 twotextview.setText(user.get("name"));
  
        // Button listener to show date picker dialog
      
    }
        public void onBackPressed()
    	{
    		super.onBackPressed();
    		startActivity(new Intent(this,batches.class));
    		finish();
    		
    		
    	}
}