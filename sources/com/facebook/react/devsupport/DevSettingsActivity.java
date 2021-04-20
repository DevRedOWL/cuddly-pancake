package com.facebook.react.devsupport;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import com.facebook.react.C1345R;

public class DevSettingsActivity extends PreferenceActivity {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(getApplication().getResources().getString(C1345R.string.catalyst_settings_title));
        addPreferencesFromResource(C1345R.xml.rn_dev_preferences);
    }
}
