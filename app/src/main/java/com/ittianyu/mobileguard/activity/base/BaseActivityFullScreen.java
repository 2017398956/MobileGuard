package com.ittianyu.mobileguard.activity.base;

import com.ittianyu.mobileguard.utils.WindowsUtils;

/**
 * Created by yu.
 * base template activity full screen.
 */
public abstract class BaseActivityFullScreen extends BaseActivity {

    /**
     * set full screen on start
     * if you override this method, remember call super.onStart().
     */
    @Override
    protected void onStart() {
        super.onStart();
        WindowsUtils.hideActionBar(this);
        WindowsUtils.setFullScreen(this);
    }
}
