package org.linphone;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.lwansbrough.RCTCamera.RCTCameraModule;
import p035ru.unicorn.ujin.data.realm.SipParametrs;

public class RootTaskActivity extends AppCompatActivity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C5321R.layout.activity_main2);
        getWindow().addFlags(6815872);
        boolean booleanExtra = getIntent().getBooleanExtra("close", false);
        boolean booleanExtra2 = getIntent().getBooleanExtra("finish", false);
        if (booleanExtra) {
            finish();
            Intent intent = new Intent(this, RootTaskActivity.class);
            intent.putExtra("finish", true);
            intent.addFlags(268435456).addFlags(32768).addFlags(67108864).addFlags(65536);
            startActivity(intent);
        } else if (booleanExtra2) {
            finish();
        } else {
            Intent addFlags = new Intent(this, CallIncomingActivity.class).addFlags(65536);
            addFlags.putExtra(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_PREVIEW, getUrlPreview());
            addFlags.putExtra(SipParametrs.MJPEG, getMjpeg());
            addFlags.putExtra(SipParametrs.FPS, getFps());
            addFlags.putExtra(SipParametrs.DTMF, getDtmf());
            addFlags.putExtra("open_door", getDoorUrl());
            addFlags.putExtra(SipParametrs.VIDEO_SOURCE, getVideoSource());
            startActivity(addFlags);
            finish();
        }
    }

    private String getDoorUrl() {
        if (getIntent() == null) {
            return null;
        }
        return getIntent().getStringExtra("open_door");
    }

    private String getDtmf() {
        if (getIntent() == null) {
            return null;
        }
        return getIntent().getStringExtra(SipParametrs.DTMF);
    }

    private String getUrlPreview() {
        if (getIntent() == null) {
            return null;
        }
        return getIntent().getStringExtra(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_PREVIEW);
    }

    private int getFps() {
        if (getIntent() == null) {
            return 100;
        }
        return getIntent().getIntExtra(SipParametrs.FPS, 100);
    }

    private String getMjpeg() {
        if (getIntent() == null) {
            return null;
        }
        return getIntent().getStringExtra(SipParametrs.MJPEG);
    }

    private String getVideoSource() {
        if (getIntent() == null) {
            return null;
        }
        return getIntent().getStringExtra(SipParametrs.VIDEO_SOURCE);
    }
}
