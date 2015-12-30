package hi.braincol.example.iphoneAlert;


import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class MainScreenActivity extends Activity {
    Button buttonOk,buttonOkCancel;
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		buttonOk = (Button)findViewById(R.id.button1);
		buttonOk.setOnClickListener(new Button.OnClickListener()
	{

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			showCustomMessageOK("Confirmation","Just click OK to continue !");
			
		}
			
	});
		 buttonOkCancel = (Button)findViewById(R.id.button2);       
	        buttonOkCancel.setOnClickListener(new Button.OnClickListener() { 

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					showCustomMessage("Alert","Are you sure you want continue?");	
				}
				});
	}

	private void showCustomMessage(String pTitle, final String pMsg) {
		final Dialog lDialog = new Dialog(MainScreenActivity.this,
				android.R.style.Theme_Translucent_NoTitleBar);
		lDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
		lDialog.setContentView(R.layout.r_okcanceldialogview);
		((TextView) lDialog.findViewById(R.id.dialog_title)).setText(pTitle);
		((TextView) lDialog.findViewById(R.id.dialog_message)).setText(pMsg);
		((Button) lDialog.findViewById(R.id.ok)).setText("Ok");
		((Button) lDialog.findViewById(R.id.cancel))
				.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						// write your code to do things after users clicks CANCEL
						lDialog.dismiss();
					}
				});
		((Button) lDialog.findViewById(R.id.ok))
				.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						// write your code to do things after users clicks OK
					 
						lDialog.dismiss();
					}
				});
		lDialog.show();

	}
	

	protected void showCustomMessageOK(String pTitle, String pMsg) {
		// TODO Auto-generated method stub
		final Dialog lDialog = new Dialog(MainScreenActivity.this,android.R.style.Theme_Translucent_NoTitleBar);
		lDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
		lDialog.setContentView(R.layout.r_okdialogview);
		((TextView)lDialog.findViewById(R.id.dialog_title)).setText(pTitle);
		((TextView)lDialog.findViewById(R.id.dialog_message)).setText(pMsg);
		((Button)lDialog.findViewById(R.id.ok)).setText("ok");
		((Button)lDialog.findViewById(R.id.ok)).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				lDialog.dismiss();
			}
		});
		lDialog.show();
	}

	
}
