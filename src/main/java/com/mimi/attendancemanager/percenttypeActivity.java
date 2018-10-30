package com.mimi.attendancemanager;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class percenttypeActivity
  extends AppCompatActivity
{
  public static String section;
  public static String semester = "Odd";
  public static String type;
  public static String year = "1";
  public String tmpyear = "";
  
  static
  {
    section = "A";
    type = "Theory";
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(R.layout.percenttype);
    final String[] arrayOfString1 = { "1", "2", "3", "4" };
    final String[] arrayOfString2 = { "A", "B", "C" };
    final String[] arrayOfString3 = { "Theory", "Sessional" };
    final String[] arrayOfString4 = { "Odd", "Even" };
    ArrayAdapter localArrayAdapter1 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, arrayOfString1);
    localArrayAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    ArrayAdapter localArrayAdapter2 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, arrayOfString2);
    localArrayAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    ArrayAdapter localArrayAdapter3 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, arrayOfString3);
    localArrayAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    ArrayAdapter localArrayAdapter4 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, arrayOfString4);
    localArrayAdapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    Spinner localSpinner1 = (Spinner)findViewById(R.id.yearsel2);
    Spinner localSpinner2 = (Spinner)findViewById(R.id.secsel2);
    Spinner localSpinner3 = (Spinner)findViewById(R.id.typesel2);
    Spinner localSpinner4 = (Spinner)findViewById(R.id.semsel);
    localSpinner1.setAdapter(localArrayAdapter1);
    localSpinner2.setAdapter(localArrayAdapter2);
    localSpinner3.setAdapter(localArrayAdapter3);
    localSpinner4.setAdapter(localArrayAdapter4);
    AdapterView.OnItemSelectedListener local1 = new AdapterView.OnItemSelectedListener()
    {
      public void onItemSelected(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        percenttypeActivity.this.tmpyear = arrayOfString1[paramAnonymousInt];
        Integer localInteger = Integer.valueOf(-1 + 2 * Integer.valueOf(Integer.parseInt(percenttypeActivity.this.tmpyear)).intValue());
        if (percenttypeActivity.semester == "Even") {
          localInteger = Integer.valueOf(1 + localInteger.intValue());
        }
        percenttypeActivity.year = localInteger.toString();
      }
      
      public void onNothingSelected(AdapterView<?> paramAnonymousAdapterView) {}
    };
    AdapterView.OnItemSelectedListener local2 = new AdapterView.OnItemSelectedListener()
    {
      public void onItemSelected(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        percenttypeActivity.section = arrayOfString2[paramAnonymousInt];
      }
      
      public void onNothingSelected(AdapterView<?> paramAnonymousAdapterView) {}
    };
    AdapterView.OnItemSelectedListener local3 = new AdapterView.OnItemSelectedListener()
    {
      public void onItemSelected(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        percenttypeActivity.type = arrayOfString3[paramAnonymousInt];
        if (paramAnonymousInt == 1) {
          percenttypeActivity.type = "Lab";
        }
      }
      
      public void onNothingSelected(AdapterView<?> paramAnonymousAdapterView) {}
    };
    AdapterView.OnItemSelectedListener local4 = new AdapterView.OnItemSelectedListener()
    {
      public void onItemSelected(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        percenttypeActivity.semester = arrayOfString4[paramAnonymousInt];
        Integer localInteger = Integer.valueOf(-1 + 2 * Integer.valueOf(Integer.parseInt(percenttypeActivity.this.tmpyear)).intValue());
        if (percenttypeActivity.semester == "Even") {
          localInteger = Integer.valueOf(1 + localInteger.intValue());
        }
        percenttypeActivity.year = localInteger.toString();
      }
      
      public void onNothingSelected(AdapterView<?> paramAnonymousAdapterView) {}
    };
    localSpinner1.setOnItemSelectedListener(local1);
    localSpinner2.setOnItemSelectedListener(local2);
    localSpinner3.setOnItemSelectedListener(local3);
    localSpinner4.setOnItemSelectedListener(local4);
    ((Button)findViewById(R.id.savetype2)).setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        if (percenttypeActivity.section == "A")
        {
          Intent localIntent1 = new Intent(percenttypeActivity.this, percentaActivity.class);
          percenttypeActivity.this.startActivity(localIntent1);
        }
        if (percenttypeActivity.section == "B")
        {
          Intent localIntent2 = new Intent(percenttypeActivity.this, percentbActivity.class);
          percenttypeActivity.this.startActivity(localIntent2);
        }
        if (percenttypeActivity.section == "C")
        {
          Intent localIntent3 = new Intent(percenttypeActivity.this, percentcActivity.class);
          percenttypeActivity.this.startActivity(localIntent3);
        }
      }
    });
  }
}