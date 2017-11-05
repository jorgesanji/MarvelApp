package com.jorgesanmartin.sample.ui.view.home;

import com.jorgesanmartin.sample.ui.view.base.BaseFragmentActivity;

public class HomeActivity extends BaseFragmentActivity<HomeFragment> {

    @Override
    public Class<HomeFragment> getFragment() {
        return HomeFragment.class;
    }

    @Override
    public int toolbarColor() {
        return android.R.color.white;
    }
}
