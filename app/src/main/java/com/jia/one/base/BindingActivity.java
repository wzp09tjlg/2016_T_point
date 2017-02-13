package com.jia.one.base;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/**
 * Created by wu on 2017/2/13.
 */
public abstract class BindingActivity<B extends ViewDataBinding>  extends FragmentActivity {
    public B binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, createLayoutId());
    }

    protected abstract int createLayoutId();
}
