import com.lampertandlee.learningfun.R;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
//import android.content.Intent;
//import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.media.MediaPlayer;


public class SecondActivity extends Activity implements View.OnClickListener{
Button mButton1;
Button mButton2;
Button mButton3;
Button mButton4;
Button mButton5;
Button mButton6;
Button mButton7;
Button mButton8;
Button mButton9;
Button mButton10;
Button mButton11;
Button mButton12;
Button mButton13;
Button mButton14;
Button mButton15;
Button mButton16;
Button mButton17;
Button mButton18;
Button mButton19;
Button mButton20;
Button mButton21;
Button mButton22;
Button mButton23;
Button mButton24;
Button mButton25;
Button mButton26;

MediaPlayer mp1;
MediaPlayer mp2;
MediaPlayer mp3;
MediaPlayer mp4;
MediaPlayer mp5;
MediaPlayer mp6;
MediaPlayer mp7;
MediaPlayer mp8;
MediaPlayer mp9;
MediaPlayer mp10;
MediaPlayer mp11;
MediaPlayer mp12;
MediaPlayer mp13;
MediaPlayer mp14;
MediaPlayer mp15;
MediaPlayer mp16;
MediaPlayer mp17;
MediaPlayer mp18;
MediaPlayer mp19;
MediaPlayer mp20;
MediaPlayer mp21;
MediaPlayer mp22;
MediaPlayer mp23;
MediaPlayer mp24;
MediaPlayer mp25;
MediaPlayer mp26;


View.OnClickListener myListener = new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

	}
};
	protected void onCreate(Bundle savedInstanceState){
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_abcs);
		mp1= MediaPlayer.create(this, R.raw.apple);
		mp2= MediaPlayer.create(this, R.raw.boat);
		mp3= MediaPlayer.create(this, R.raw.cat);
		mp4= MediaPlayer.create(this, R.raw.dog);
		mp5= MediaPlayer.create(this, R.raw.egg);
		mp6= MediaPlayer.create(this, R.raw.fire);
		mp7= MediaPlayer.create(this, R.raw.gil);
		mp8= MediaPlayer.create(this, R.raw.hart);
		mp9= MediaPlayer.create(this, R.raw.igloo);
		mp10= MediaPlayer.create(this, R.raw.jesus);
		mp11= MediaPlayer.create(this, R.raw.kangaroo);
		mp12= MediaPlayer.create(this, R.raw.lemon);
		mp13= MediaPlayer.create(this, R.raw.monkey);
		mp14= MediaPlayer.create(this, R.raw.nail);
		mp15= MediaPlayer.create(this, R.raw.octopus);
		mp16= MediaPlayer.create(this, R.raw.poop);
		mp17= MediaPlayer.create(this, R.raw.queen);
		mp18= MediaPlayer.create(this, R.raw.run);
		mp19= MediaPlayer.create(this, R.raw.sleep);
		mp20= MediaPlayer.create(this, R.raw.tie);
		mp21= MediaPlayer.create(this, R.raw.unicorn);
		mp22= MediaPlayer.create(this, R.raw.velociraptor);
		mp23= MediaPlayer.create(this, R.raw.wagon);
		mp24= MediaPlayer.create(this, R.raw.xray);
		mp25= MediaPlayer.create(this, R.raw.yato);
		mp26= MediaPlayer.create(this, R.raw.zebra);
		
		mButton1 =(Button)findViewById(R.id.button1);
		mButton1.setOnClickListener(this);
		mButton2 =(Button)findViewById(R.id.button2);
		mButton2.setOnClickListener(this);
		mButton3 =(Button)findViewById(R.id.button3);
		mButton3.setOnClickListener(this);
		mButton4 =(Button)findViewById(R.id.button4);
		mButton4.setOnClickListener(this);
		mButton5 =(Button)findViewById(R.id.button5);
		mButton5.setOnClickListener(this);
		mButton6 =(Button)findViewById(R.id.button6);
		mButton6.setOnClickListener(this);
		mButton7 =(Button)findViewById(R.id.button7);
		mButton7.setOnClickListener(this);
		mButton8 =(Button)findViewById(R.id.button8);
		mButton8.setOnClickListener(this);
		mButton9 =(Button)findViewById(R.id.button9);
		mButton9.setOnClickListener(this);
		mButton10 =(Button)findViewById(R.id.button10);
		mButton10.setOnClickListener(this);
		mButton11 =(Button)findViewById(R.id.button11);
		mButton11.setOnClickListener(this);
		mButton12 =(Button)findViewById(R.id.button12);
		mButton12.setOnClickListener(this);
		mButton13 =(Button)findViewById(R.id.button13);
		mButton13.setOnClickListener(this);
		mButton14 =(Button)findViewById(R.id.button14);
		mButton14.setOnClickListener(this);
		mButton15 =(Button)findViewById(R.id.button15);
		mButton15.setOnClickListener(this);
		mButton16 =(Button)findViewById(R.id.button16);
		mButton16.setOnClickListener(this);
		mButton17 =(Button)findViewById(R.id.button17);
		mButton17.setOnClickListener(this);
		mButton18 =(Button)findViewById(R.id.button18);
		mButton18.setOnClickListener(this);
		mButton19 =(Button)findViewById(R.id.button19);
		mButton19.setOnClickListener(this);
		mButton20 =(Button)findViewById(R.id.button20);
		mButton20.setOnClickListener(this);
		mButton21 =(Button)findViewById(R.id.button21);
		mButton21.setOnClickListener(this);
		mButton22 =(Button)findViewById(R.id.button22);
		mButton22.setOnClickListener(this);
		mButton23 =(Button)findViewById(R.id.button23);
		mButton23.setOnClickListener(this);
		mButton24 =(Button)findViewById(R.id.button24);
		mButton24.setOnClickListener(this);
		mButton25 =(Button)findViewById(R.id.button25);
		mButton25.setOnClickListener(this);
		mButton26 =(Button)findViewById(R.id.button26);
		mButton26.setOnClickListener(this);
		
		
	
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu){
		getMenuInflater().inflate(R.menu.second, menu);
		return true;
	}
	public void onClick(View v) {
        switch(v.getId()) {
        case R.id.button1:
            mp1.start();
            break;
        case R.id.button2:
            mp2.start();
            break;
        case R.id.button3:
            mp3.start();
            break;
        case R.id.button4:
            mp4.start();
            break;
        case R.id.button5:
            mp5.start();
            break;
        case R.id.button6:
            mp6.start();
            break;
        case R.id.button7:
            mp7.start();
            break;
        case R.id.button8:
            mp8.start();
            break;
        case R.id.button9:
            mp9.start();
            break;
        case R.id.button10:
            mp10.start();
            break;
        case R.id.button11:
            mp11.start();
            break;
        case R.id.button12:
            mp12.start();
            break;
        case R.id.button13:
            mp13.start();
            break;
        case R.id.button14:
            mp14.start();
            break;
        case R.id.button15:
            mp15.start();
            break;
        case R.id.button16:
            mp16.start();
            break;
        case R.id.button17:
            mp17.start();
            break;
        case R.id.button18:
            mp18.start();
            break;
        case R.id.button19:
            mp19.start();
            break;
        case R.id.button20:
            mp20.start();
            break;
        case R.id.button21:
            mp21.start();
            break;
        case R.id.button22:
            mp22.start();
            break;
        case R.id.button23:
            mp23.start();
            break;
        case R.id.button24:
            mp24.start();
            break;
        case R.id.button25:
            mp25.start();
            break;
        case R.id.button26:
            mp26.start();
            break;
      
        }
    }

    

	}
