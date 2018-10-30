package com.shefin.attendancemanager;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class classtypeActivity
        extends AppCompatActivity {
    public static ProgressDialog dialog = null;
    public static String section;
    public static String sem;
    public static String type;
    public static String year = "1";
    String yeartmp = "1";

    static {
        section = "A";
        type = "Theory";
        sem = "Odd";
    }

    protected void onCreate(Bundle paramBundle) {
        super.onCreate(paramBundle);
        setContentView(R.layout.classtype);
        final String[] arrayOfString1 = {"1", "2", "3", "4"};
        final String[] arrayOfString2 = {"A", "B", "C"};
        final String[] arrayOfString3 = {"Odd", "Even"};
        ArrayAdapter localArrayAdapter1 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, arrayOfString1);
        localArrayAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ArrayAdapter localArrayAdapter2 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, arrayOfString2);
        localArrayAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ArrayAdapter localArrayAdapter3 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, arrayOfString3);
        localArrayAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner localSpinner1 = (Spinner) findViewById(R.id.yearsel);
        Spinner localSpinner2 = (Spinner) findViewById(R.id.secsel);
        Spinner localSpinner3 = (Spinner) findViewById(R.id.typesel);
        localSpinner1.setAdapter(localArrayAdapter1);
        localSpinner2.setAdapter(localArrayAdapter2);
        localSpinner3.setAdapter(localArrayAdapter3);
        AdapterView.OnItemSelectedListener local1 = new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong) {
                classtypeActivity.this.yeartmp = arrayOfString1[paramAnonymousInt];
                Integer localInteger = Integer.valueOf(-1 + 2 * Integer.valueOf(Integer.parseInt(arrayOfString1[paramAnonymousInt])).intValue());
                if (classtypeActivity.sem == "Even") {
                    localInteger = Integer.valueOf(1 + localInteger.intValue());
                }
                classtypeActivity.year = localInteger.toString();
            }

            public void onNothingSelected(AdapterView<?> paramAnonymousAdapterView) {
            }
        };
        AdapterView.OnItemSelectedListener local2 = new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong) {
                classtypeActivity.section = arrayOfString2[paramAnonymousInt];
            }

            public void onNothingSelected(AdapterView<?> paramAnonymousAdapterView) {
            }
        };
        AdapterView.OnItemSelectedListener local3 = new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong) {
                classtypeActivity.sem = arrayOfString3[paramAnonymousInt];
                Integer localInteger = Integer.valueOf(-1 + 2 * Integer.valueOf(Integer.parseInt(classtypeActivity.this.yeartmp)).intValue());
                if (classtypeActivity.sem == "Even") {
                    localInteger = Integer.valueOf(1 + localInteger.intValue());
                }
                classtypeActivity.year = localInteger.toString();
            }

            public void onNothingSelected(AdapterView<?> paramAnonymousAdapterView) {
            }
        };
        localSpinner1.setOnItemSelectedListener(local1);
        localSpinner2.setOnItemSelectedListener(local2);
        localSpinner3.setOnItemSelectedListener(local3);
        ((Button) findViewById(R.id.savetype)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View paramAnonymousView) {
                classtypeActivity.dialog = ProgressDialog.show(classtypeActivity.this, "", "Loading. Please wait...", true);
                if (classtypeActivity.section == "A") {
                    Intent localIntent1 = new Intent(classtypeActivity.this, asecActivity.class);
                    classtypeActivity.this.startActivity(localIntent1);
                } else if (classtypeActivity.section == "B") {
                    Intent localIntent2 = new Intent(classtypeActivity.this, bsecActivity.class);
                    classtypeActivity.this.startActivity(localIntent2);

                } else {
                    Intent localIntent3 = new Intent(classtypeActivity.this, csecActivity.class);
                    classtypeActivity.this.startActivity(localIntent3);
                }
            }
        });
    }
}



/* Location:           D:\Android\Apk Editor\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar

 * Qualified Name:     com.shefin.attendancemanager.classtypeActivity

 * JD-Core Version:    0.7.0.1

 */