package com.geno1024.daily2;

import android.app.*;
import android.os.*;
import android.content.*;
import android.preference.*;
import android.widget.*;

public class MainActivity extends Activity 
{
    SharedPreferences sp;
    SharedPreferences.Editor e;
    
    LinearLayout.LayoutParams mw;
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        sp = PreferenceManager.getDefaultSharedPreferences(this);
        e = sp.edit();
        mw = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        int today = sp.getInt("progress", 0);
        if (today == 0)
            init();
        update();
    }
    
    public void init()
    {
        LinearLayout main = new LinearLayout(this);
        main.setOrientation(LinearLayout.VERTICAL);
        setContentView(main);
        
        TextView t = new TextView(this);
        main.addView(t, mw);
        
    }
    
    public void update()
    {

    }
}
