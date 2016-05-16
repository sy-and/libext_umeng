package org.zsy.frame.libext.umeng.demo.analytics;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import org.zsy.frame.libext.umeng.demo.R;
import org.zsy.frame.libext.umeng.demo.analytics.game.GameAnalyticsHomeAct;
import org.zsy.frame.libext.umeng.demo.analytics.normal.AnalyticsHomeAct;

public class AnalyticsMainAct extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.analytics_main_act);
    }

    public void onClick(View v) {
        int id = v.getId();
        Intent in = null;
        if (id == R.id.normal) {
            in = new Intent(this, AnalyticsHomeAct.class);
        } else if (id == R.id.game) {
            in = new Intent(this, GameAnalyticsHomeAct.class);
        }

        startActivity(in);
    }

}
