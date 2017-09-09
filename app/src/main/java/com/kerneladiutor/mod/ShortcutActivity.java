package com.kerneladiutor.mod;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class ShortcutActivity extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = new Intent(this, com.kerneladiutor.mod.services.BootService.class);
        startService(intent);
        finish();
    }
}