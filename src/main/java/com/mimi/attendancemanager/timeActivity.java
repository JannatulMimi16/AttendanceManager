package com.mimi.attendancemanager;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class timeActivity
  extends AppCompatActivity
{
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(R.layout.time);
    Button localButton1 = (Button)findViewById(R.id.theory1);
    Button localButton2 = (Button)findViewById(R.id.theory2);
    Button localButton3 = (Button)findViewById(R.id.theory3);
    Button localButton4 = (Button)findViewById(R.id.theory4);
    Button localButton5 = (Button)findViewById(R.id.theory5);
    Button localButton6 = (Button)findViewById(R.id.theory6);
    Button localButton7 = (Button)findViewById(R.id.theory7);
    Button localButton8 = (Button)findViewById(R.id.theory8);
    Button localButton9 = (Button)findViewById(R.id.theory9);
    View.OnClickListener local1 = new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        Intent localIntent = new Intent(timeActivity.this, classtypeActivity.class);
        timeActivity.this.startActivity(localIntent);
      }
    };
    localButton1.setOnClickListener(local1);
    localButton2.setOnClickListener(local1);
    localButton3.setOnClickListener(local1);
    localButton4.setOnClickListener(local1);
    localButton5.setOnClickListener(local1);
    localButton6.setOnClickListener(local1);
    localButton7.setOnClickListener(local1);
    localButton8.setOnClickListener(local1);
    localButton9.setOnClickListener(local1);
  }
}