package com.fernandoguima.profiler.login;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.fernandoguima.profiler.R;

public class LoginActivity extends AppCompatActivity {

    private static final String LOGIN_FRAGMENT = "LOGIN_FRAGMENT";
    private FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }
}
