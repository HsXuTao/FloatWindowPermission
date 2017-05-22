/*
 * Copyright (C) 2016 Facishare Technology Co., Ltd. All Rights Reserved.
 */
package com.android.floatwindowpermission;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.taoxu.library.permission.FloatWindowManager;


/**
 * Description:
 *
 * @author zhaozp
 * @since 2016-10-17
 */

public class FloatWindowActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_show_or_apply).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (FloatWindowManager.getInstance().checkPermission(FloatWindowActivity.this)) {
                    Toast.makeText(getApplicationContext(), "已经获得悬浮窗权限", Toast.LENGTH_SHORT).show();
                } else {
                    FloatWindowManager.getInstance().applyPermission(FloatWindowActivity.this);
                }
            }
        });

    }

}
