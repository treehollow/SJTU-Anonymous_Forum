///*
// * Copyright (C) 2019 xuexiangjys(xuexiangjys@163.com)
// *
// * Licensed under the Apache License, Version 2.0 (the "License");
// * you may not use this file except in compliance with the License.
// * You may obtain a copy of the License at
// *
// *       http://www.apache.org/licenses/LICENSE-2.0
// *
// * Unless required by applicable law or agreed to in writing, software
// * distributed under the License is distributed on an "AS IS" BASIS,
// * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// * See the License for the specific language governing permissions and
// * limitations under the License.
// *
// */
//
//package com.xuexiang.templateproject.activity;
//
//import android.os.Bundle;
//import android.util.Log;
//import android.view.KeyEvent;
//
//import com.xuexiang.templateproject.core.BaseActivity;
//import com.xuexiang.templateproject.fragment.LoginFragment;
//import com.xuexiang.templateproject.fragment.RegisterFragment;
//import com.xuexiang.xui.utils.KeyboardUtils;
//import com.xuexiang.xui.utils.StatusBarUtils;
//import com.xuexiang.xutil.display.Colors;
//
///**
// * 登录页面
// *
// * @author xuexiang
// * @since 2019-11-17 22:21
// */
//public class RegisterActivity extends BaseActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        Log.d("RegisterActivity", "这里是测试");
//        openPage(RegisterFragment.class, getIntent().getExtras());
//    }
//
//    @Override
//    protected void initStatusBarStyle() {
//        StatusBarUtils.initStatusBarStyle(this, false, Colors.TRANSPARENT);
//    }
//
//    @Override
//    public boolean onKeyDown(int keyCode, KeyEvent event) {
//        return KeyboardUtils.onDisableBackKeyDown(keyCode) && super.onKeyDown(keyCode, event);
//    }
//}
