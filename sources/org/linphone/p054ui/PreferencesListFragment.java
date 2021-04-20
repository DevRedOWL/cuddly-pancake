package org.linphone.p054ui;

import android.app.Activity;
import android.app.ListFragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.preference.Preference;
import android.preference.PreferenceManager;
import android.preference.PreferenceScreen;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ListView;
import android.widget.RelativeLayout;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.linphone.C5321R;
import org.linphone.mediastream.Log;

/* renamed from: org.linphone.ui.PreferencesListFragment */
public class PreferencesListFragment extends ListFragment {
    private static final int FIRST_REQUEST_CODE = 100;
    private static final int MSG_BIND_PREFERENCES = 0;
    private Handler mHandler = new Handler() {
        public void handleMessage(Message message) {
            if (message.what == 0) {
                PreferencesListFragment.this.bindPreferences();
            }
        }
    };
    private PreferenceManager mPreferenceManager;
    private ListView preferencesList;
    private int xmlResID;

    public PreferencesListFragment(int i) {
        this.xmlResID = i;
    }

    public PreferencesListFragment() {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C5321R.layout.settings, (ViewGroup) null);
        ViewParent parent = this.preferencesList.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeView(this.preferencesList);
        }
        ((RelativeLayout) inflate.findViewById(C5321R.C5324id.topLayout)).addView(this.preferencesList);
        postBindPreferences();
        return inflate;
    }

    public void onDestroyView() {
        super.onDestroyView();
        ViewParent parent = this.preferencesList.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeView(this.preferencesList);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.xmlResID = bundle.getInt("xml");
        }
        this.mPreferenceManager = onCreatePreferenceManager();
        this.preferencesList = (ListView) LayoutInflater.from(getActivity()).inflate(C5321R.layout.preference_list_content, (ViewGroup) null);
        this.preferencesList.setScrollBarStyle(0);
        addPreferencesFromResource(this.xmlResID);
        postBindPreferences();
    }

    public void onStop() {
        super.onStop();
        try {
            Method declaredMethod = PreferenceManager.class.getDeclaredMethod("dispatchActivityStop", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(this.mPreferenceManager, new Object[0]);
        } catch (Exception e) {
            Log.m6903e("[PreferencesListFragment] onStop " + e);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.preferencesList = null;
        try {
            Method declaredMethod = PreferenceManager.class.getDeclaredMethod("dispatchActivityDestroy", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(this.mPreferenceManager, new Object[0]);
        } catch (Exception e) {
            Log.m6903e("[PreferencesListFragment] onDestroy " + e);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("xml", this.xmlResID);
        super.onSaveInstanceState(bundle);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Class<PreferenceManager> cls = PreferenceManager.class;
        try {
            Method declaredMethod = cls.getDeclaredMethod("dispatchActivityResult", new Class[]{Integer.TYPE, Integer.TYPE, Intent.class});
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(this.mPreferenceManager, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent});
        } catch (Exception e) {
            Log.m6903e("[PreferencesListFragment] onActivityResult " + e);
        }
    }

    private void postBindPreferences() {
        if (!this.mHandler.hasMessages(0)) {
            this.mHandler.obtainMessage(0).sendToTarget();
        }
    }

    /* access modifiers changed from: private */
    public void bindPreferences() {
        ListView listView;
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null && (listView = this.preferencesList) != null) {
            preferenceScreen.bind(listView);
        }
    }

    private PreferenceManager onCreatePreferenceManager() {
        Class<PreferenceManager> cls = PreferenceManager.class;
        try {
            Constructor<PreferenceManager> declaredConstructor = cls.getDeclaredConstructor(new Class[]{Activity.class, Integer.TYPE});
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(new Object[]{getActivity(), 100});
        } catch (Exception e) {
            Log.m6903e("[PreferencesListFragment] onCreatePreferenceManager " + e);
            return null;
        }
    }

    public PreferenceManager getPreferenceManager() {
        return this.mPreferenceManager;
    }

    public void setPreferenceScreen(PreferenceScreen preferenceScreen) {
        try {
            Method declaredMethod = PreferenceManager.class.getDeclaredMethod("setPreferences", new Class[]{PreferenceScreen.class});
            declaredMethod.setAccessible(true);
            if (((Boolean) declaredMethod.invoke(this.mPreferenceManager, new Object[]{preferenceScreen})).booleanValue() && preferenceScreen != null) {
                postBindPreferences();
            }
        } catch (Exception e) {
            Log.m6903e("[PreferencesListFragment] setPreferenceScreen " + e);
        }
    }

    public PreferenceScreen getPreferenceScreen() {
        try {
            Method declaredMethod = PreferenceManager.class.getDeclaredMethod("getPreferenceScreen", new Class[0]);
            declaredMethod.setAccessible(true);
            return (PreferenceScreen) declaredMethod.invoke(this.mPreferenceManager, new Object[0]);
        } catch (Exception e) {
            Log.m6903e("[PreferencesListFragment] getPreferenceScreen " + e);
            return null;
        }
    }

    public void addPreferencesFromResource(int i) {
        Class<PreferenceManager> cls = PreferenceManager.class;
        try {
            Method declaredMethod = cls.getDeclaredMethod("inflateFromResource", new Class[]{Context.class, Integer.TYPE, PreferenceScreen.class});
            declaredMethod.setAccessible(true);
            setPreferenceScreen((PreferenceScreen) declaredMethod.invoke(this.mPreferenceManager, new Object[]{getActivity(), Integer.valueOf(i), getPreferenceScreen()}));
        } catch (Exception e) {
            Log.m6903e("[PreferencesListFragment] addPreferencesFromResource " + e);
        }
    }

    public Preference findPreference(CharSequence charSequence) {
        PreferenceManager preferenceManager = this.mPreferenceManager;
        if (preferenceManager != null) {
            return preferenceManager.findPreference(charSequence);
        }
        Log.m6903e("[PreferencesListFragment] PreferenceManager is null !");
        return null;
    }
}
