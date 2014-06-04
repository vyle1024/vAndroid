import com.lampertandlee.learningfun.R;
import com.lampertandlee.learningfun.SecondActivity;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.content.Intent;
//import android.view.Menu;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity implements View.OnClickListener{

	Button mButton;
	Button mButton1;
	View.OnClickListener myListener = new View.OnClickListener() {
		
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub

		}
	};


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mButton=(Button)findViewById(R.id.button1);
		mButton.setOnClickListener(this);
		mButton=(Button)findViewById(R.id.button2);
		mButton.setOnClickListener(this);
		
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	public void onClick(View v){
//		if(v.getId()==mButton.getId()){
//			Intent intent= new Intent(this, SecondActivity.class);
//			startActivity(intent);
//		}
//		if(v.getId()==mButton1.getId()){
//			Intent intent= new Intent(this, ThirdActivity.class);
//			startActivity(intent);
//		}
		switch(v.getId()) {
        case R.id.button1:
        // do stuff;
        	Intent intent= new Intent(this, SecondActivity.class);
        	startActivity(intent);
        break;
        case R.id.button2:
        	Intent intent1= new Intent(this, ThirdActivity.class);
			startActivity(intent1);
        // do stuff;
        break;
	}

}
}
