package com.grarak.kerneladiutor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class ShortcutActivity extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = new Intent(this, com.grarak.kerneladiutor.services.BootService.class);
        startService(intent);
        finish();
    }
}