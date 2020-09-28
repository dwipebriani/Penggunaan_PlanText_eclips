package com.example.dwipebriani;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.app.AlertDialog;
import android.content.DialogInterface;

public class MainActivity extends Activity implements OnClickListener{
	EditText NIM;
	Button OK,keluar,Hapus;
	TextView hNim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        NIM =(EditText)findViewById(R.id.NIM);
        hNim =(TextView)findViewById(R.id.hNim);
        
        OK =(Button)findViewById(R.id.ok);
        keluar =(Button)findViewById(R.id.keluar);
        Hapus =(Button)findViewById(R.id.hapus);
        
        OK.setOnClickListener(this);
        keluar.setOnClickListener(this);
        Hapus.setOnClickListener(this);
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    public void hapus(){
    	hNim.setText("");
    	NIM.setText("");
    	NIM.requestFocus();
    	
    }
    public void validasi(){
    	AlertDialog.Builder bValid = new AlertDialog.Builder(this)
    	.setMessage("Forun Belum Lengkap").setTitle("Warning")
    	.setPositiveButton("OK",new DialogInterface.OnClickListener() {
 
    	
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				// TODO Auto-generated method stub
				
			}
    	});bValid.show();
    }
    
    public void onClick(View v){
    	if(v==OK){
    		if(NIM.getText().length()==0){
    			validasi();
    			return;
    			
    		}
    		String nim=NIM.getText().toString();
    		hNim.setText("Yang anda ketik :"+nim);
				
			}else if(v==Hapus){
				hapus();
		}else if(v==keluar){
			AlertDialog.Builder bExit = new AlertDialog.Builder(this)
	    	.setMessage("Yakin ingin keluar").setTitle("Konfirmasi keluar")
	    	.setPositiveButton("Sekarang",new DialogInterface.OnClickListener() {
	    		@Override
				public void onClick(DialogInterface arg0, int arg1) {
					// TODO Auto-generated method stub
	    			finish();
	    		}
		    	
			})
	    	    	.setNegativeButton("Nanti",new DialogInterface.OnClickListener(){
	    	    		public void onClick(DialogInterface arg0, int arg1) {
	    					// TODO Auto-generated method stub
	    	    			
	    	    		}
	    	    	});bExit.show();
	    	    	}
			
    }
    }
    
