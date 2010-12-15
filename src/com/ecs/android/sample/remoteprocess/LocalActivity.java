package com.ecs.android.sample.remoteprocess;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LocalActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.local);
        
		Button btnLaunchRemote = (Button) findViewById(R.id.btn_launch_remote_activity);
		btnLaunchRemote.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				startActivity(new Intent().setClass(v.getContext(),
						RemoteActivity.class));
			}
		});        
    }
}