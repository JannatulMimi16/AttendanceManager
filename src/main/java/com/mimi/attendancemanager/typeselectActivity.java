package com.mimi.attendancemanager;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class typeselectActivity
  extends AppCompatActivity
{
  protected void onCreate(@Nullable Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(R.layout.typeselect);
    Button localButton1 = (Button)findViewById(R.id.button6);
    Button localButton2 = (Button)findViewById(R.id.button7);
    View.OnClickListener local1 = new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        classtypeActivity.type = "Theory";
        Intent localIntent = new Intent(typeselectActivity.this, timeActivity.class);
        typeselectActivity.this.startActivity(localIntent);
      }
    };
    View.OnClickListener local2 = new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        classtypeActivity.type = "Lab";
        Intent localIntent = new Intent(typeselectActivity.this, timelabActivity.class);
        typeselectActivity.this.startActivity(localIntent);
      }
    };
    localButton1.setOnClickListener(local1);
    localButton2.setOnClickListener(local2);
  }
}
