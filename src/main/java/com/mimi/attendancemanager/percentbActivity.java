package com.mimi.attendancemanager;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class percentbActivity
  extends AppCompatActivity
{
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(R.layout.percentb);
    TextView[] arrayOfTextView = new TextView[65];
    Integer localInteger1 = Integer.valueOf(61);
    for (Integer localInteger2 = Integer.valueOf(1); localInteger1.intValue() <= 120; localInteger2 = Integer.valueOf(1 + localInteger2.intValue()))
    {
      String str4 = "percent" + localInteger1.toString();
      int k = getResources().getIdentifier(str4, "id", getPackageName());
      arrayOfTextView[localInteger2.intValue()] = ((TextView)findViewById(k));
      localInteger1 = Integer.valueOf(1 + localInteger1.intValue());
    }
    int i = 1;
    SQLiteDatabase localSQLiteDatabase = getBaseContext().openOrCreateDatabase("attendance.db", 0, null);
    String str1 = "classes";
    if (percenttypeActivity.type == "Lab") {
      str1 = "labs";
    }
    for (char c1 = 'a'; c1 <= 'n'; c1 = (char)(c1 + '\001'))
    {
      int j = 0;
      for(char c2 = 'A'; c2 <= 'E'; c2++)
      {
        Cursor localCursor2 = localSQLiteDatabase.rawQuery("SELECT " + c1 + " FROM " + str1 + " WHERE year = " + percenttypeActivity.year + " AND section = '" + percenttypeActivity.section + "' AND day = '" + c2 + "'", null);
        if (localCursor2.moveToFirst())
        {
          if (localCursor2.getInt(0) == 1) {
            j++;
          }
        }
        /*for (;;)
        {
          c2 = (char)(c2 + '\001');

          if (localCursor2.moveToNext()) {
            break;
          }
        }*/
      }
      if (j > i) {
        i = j;
      }
    }
    String str2 = "total";
    if (percenttypeActivity.type == "Lab") {
      str2 = "total2";
    }
    Double localDouble = Double.valueOf(14.0D * i);
    Cursor localCursor1 = localSQLiteDatabase.rawQuery("SELECT roll, total  FROM " + str2 + " WHERE year = " + percenttypeActivity.year + " AND section = 'B'", null);
    if (localCursor1.moveToFirst()) {
      do
      {
        Integer localInteger3 = Integer.valueOf(-60 + localCursor1.getInt(0));
        String str3 = String.format("%.2f", new Object[] { Double.valueOf(100.0D * (Integer.valueOf(localCursor1.getInt(1)).intValue() / localDouble.doubleValue())) });
        arrayOfTextView[localInteger3.intValue()].setText(str3);
      } while (localCursor1.moveToNext());
    }
    localCursor1.close();
    localSQLiteDatabase.close();
  }
}