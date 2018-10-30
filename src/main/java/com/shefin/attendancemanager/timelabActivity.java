package com.shefin.attendancemanager;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class timelabActivity
  extends AppCompatActivity
{
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(R.layout.timelab);
    Button localButton1 = (Button)findViewById(R.id.lab1);
    Button localButton2 = (Button)findViewById(R.id.lab2);
    Button localButton3 = (Button)findViewById(R.id.lab3);
    View.OnClickListener local1 = new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        Intent localIntent = new Intent(timelabActivity.this, classtypeActivity.class);
        timelabActivity.this.startActivity(localIntent);
      }
    };
    localButton1.setOnClickListener(local1);
    localButton2.setOnClickListener(local1);
    localButton3.setOnClickListener(local1);
  }
}



/* Location:           D:\Android\Apk Editor\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar

 * Qualified Name:     com.shefin.attendancemanager.timelabActivity

 * JD-Core Version:    0.7.0.1

 */