package com.hannabennett.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by HannaBennett on 10/7/17.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_masterdetail;
    }
}
