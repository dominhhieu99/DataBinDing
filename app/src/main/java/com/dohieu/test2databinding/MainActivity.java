package com.dohieu.test2databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.dohieu.test2databinding.databinding.ActivityMainBinding;
import com.dohieu.test2databinding.model.Welcome;

public class MainActivity extends AppCompatActivity {

    private Welcome welcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        welcome = new Welcome("detel", "conten", "creatacount", "loign");
        binding.setWelcome(welcome);
    }

}
