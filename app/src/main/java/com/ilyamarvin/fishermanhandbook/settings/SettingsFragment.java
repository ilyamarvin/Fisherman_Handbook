package com.ilyamarvin.fishermanhandbook.settings;

import android.os.Bundle;
import android.preference.PreferenceFragment;

import androidx.annotation.Nullable;

import com.ilyamarvin.fishermanhandbook.R;

public class SettingsFragment extends PreferenceFragment {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.settings_screen);
    }
}
