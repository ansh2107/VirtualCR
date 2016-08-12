package com.example.virtualcr;

import android.os.AsyncTask;




import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.ListActivity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.content.Context;
public class FourthYearParser extends AsyncTask<String, String, String> {

	JSONParser jParser = new JSONParser();
	// url to get all products list
	private static String url = "http://192.168.43.8/connect/ipg4.php";	// JSON Node names, 2 for counter, add data
	private static final String TAG_CITY = "ipg1";
	
	//String TAG_NAME = "name";

	// products JSONArray
	
	private Context parent;
	private TextView username,credits;
	private ProgressDialog pDialog;
	public ArrayAdapter<String> dataAdapter;
	public HashMap<String,String> userInfo;
	public HashMap<String,String> userInfo1;
	public HashMap<String,String> userInfo3;
	public HashMap<String,String> userInfo4;
	JSONArray user = null;
	String output;
	int i = 0;
	public FourthYearParser(Context parent,String output) {
				
	            this.parent=parent;
	             this.output= output;
	}

			/**
			 * Before starting background thread Show Progress Dialog
			 * */
			@Override
			protected void onPreExecute() {
				
			}

			/**
			 * getting All products from url
			 * */
			protected String doInBackground(String... args) {
				// Building Parameters
				List<NameValuePair> params = new ArrayList<NameValuePair>();
				params.add(new BasicNameValuePair("Output", this.output));
	            
				
				JSONObject json = jParser.makeHttpRequest(url, "GET", params);
				
				
				Log.d("userINfo: ", json.toString());

				try {
					// Checking for SUCCESS TAG
					
					String s = ""; int twocounter; int twoamount; int totalamount = 0;
					String s1= ""; int fourcounter; int fouramount;
					String s2="";
					String s3="";
					String s4="";
					 userInfo = new HashMap<String,String>();
				//	 userInfo1 = new HashMap<String,String>();
				//	 userInfo3 = new HashMap<String,String>();
				//	 userInfo4 = new HashMap<String,String>();
				//	ArrayList<String> list =new ArrayList<String>();
						JSONArray account= json.getJSONArray("ipg1");
				        for(int i = 0; i < account.length(); i++){
				        	json =account.getJSONObject(i);
				        	//totalamount=20*json.getInt("two_cntr") + 40*json.getInt("four_cntr");
				        	s = s +  " "+" "+" " +"\n"+"\n"+"9-10 : "+ " "+" "+" "+" "+json.getString("9-10")+"\n"+"\n"+"10-11 : "+ " "+" "+" "+" "+json.getString("10-11")+"\n"+"\n"+"11-12 : "+ " "+" "+" "+" "+json.getString("11-12")+"\n"+"\n"+"12-1 : "+ " "+" "+" "+" "+json.getString("12-1")+"\n"+"\n"+"1-2 : "+ " "+" "+" "+" "+json.getString("1-2")+"\n"+"\n"+"2-3 : "+ " "+" "+" "+" "+json.getString("2-3")+"\n"+"\n"+"3-4 : "+ " "+" "+" "+" "+json.getString("3-4")+"\n"+"\n"+"4-5 : "+ " "+" "+" "+" "+json.getString("4-5")+"\n"+"\n";//two_cntr
				       
				        	break;
				       
				         
				        }
				        
				        
				        
				      /*  for(int i = 0; i < account.length(); i++){
				        	json =account.getJSONObject(i);
				        	
				        	s1 = s1 +  ""+json.getInt("number")+ "\n"; //four_cntr
				        	//s2 = s2 +  ""+json.getInt("dt");
				        	
				       
				         
				        }
				        for(int i = 0; i < account.length(); i++){
				        	json =account.getJSONObject(i);
				        	twocounter=json.getInt("port"); //two_cntr
				        	twoamount=20*twocounter;
				        		
				        	s3 = s3 + twoamount + "\n";
				        	
									 
				           // String card_no = account.getJSONObject(i).getString("NAME");
				       
				         
				        }
				        for(int i = 0; i < account.length(); i++){
				        	json =account.getJSONObject(i);
				        	fourcounter=json.getInt("number"); //four_cntr
				        	fouramount=40*fourcounter;
				        	s4 = s4 + fouramount + "\n";
				         
				        }
				       */ 
			            Log.d("name",s);
			          //   list.add(card_no);
			            userInfo.put("name", s);
			           Log.d("name",userInfo.get("s"));
			           
			        /*   //modified from here
			           Log.d("name1",s1);
				          //   list.add(card_no);
				            userInfo1.put("name1", s1);
				           Log.d("name1",userInfo1.get("s1")); 
				           
				           Log.d("name3",s3);
					          //   list.add(card_no);
					            userInfo3.put("name3", s3);
					           Log.d("name3",userInfo3.get("s3")); 
					           
					           Log.d("name4",s4);
						          //   list.add(card_no);
						            userInfo4.put("name4", s4);
						           Log.d("name4",userInfo4.get("s4"));
			           */
           
				} catch (Exception e) {
					e.printStackTrace();
				}
				i=1;
				return null;
			}
			
			
			public HashMap<String,String> getUserInfo()
			{
				while(i==0);
				return userInfo;
				
			}
		
		/*	public HashMap<String,String> getUserInfo3()
			{
				while(i==0);
				return userInfo3;
				
			}
			public HashMap<String,String> getUserInfo4()
			{
				while(i==0);
				return userInfo4;
				
			}
			*/
			/**
			 * After completing background task Dismiss the progress dialog
			 * **/
			
			
			protected void onPostExecute(String file_url) {
				
				
				

			}

		//	public HashMap<String, String> getUserInfo1() {
			//	// TODO Auto-generated method stub
		//		while(i==0);
			//	return userInfo1;
		//	}

		

		

	
		
	

}
