package com.jia.one;

import android.os.Bundle;

import com.jia.one.base.BindingActivity;
import com.jia.one.databinding.ActivityMainBinding;

public class MainActivity extends BindingActivity<ActivityMainBinding> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initViews();
    }

    @Override
    protected int createLayoutId() {
        return R.layout.activity_main;
    }

    private void initViews(){
        binding.textHello.setText("this is a DataBinding Demo");
    }
}
