package org.linphone;

import android.app.IntentService;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.linphone.core.LinphoneCoreException;
import org.linphone.core.PayloadType;

public class MyIntentService extends IntentService {
    ServiceWaitThread serviceWaitThread;

    public MyIntentService() {
        super("MyIntentService");
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        Log.d("TAG", "XXX driver update start");
        try {
            String str = getFilesDir().toString() + "/" + "libopenh264.so";
            byte[] bArr = new byte[4096];
            InputStream open = getAssets().open("libopenh264.so");
            FileOutputStream fileOutputStream = new FileOutputStream(str);
            while (true) {
                int read = open.read(bArr);
                if (read <= 0) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
            }
            open.close();
            fileOutputStream.close();
            System.load(str);
            if (LinphoneManager.isInstanciated()) {
                enabledH264(true);
                return;
            }
            this.serviceWaitThread = new ServiceWaitThread();
            this.serviceWaitThread.run();
        } catch (FileNotFoundException e) {
            Log.d("TAG", "XXX onHandleIntent: 1" + e.getMessage());
        } catch (IOException e2) {
            Log.d("TAG", "XXX onHandleIntent: 2" + e2.getMessage());
        } catch (UnsatisfiedLinkError e3) {
            Log.d("TAG", "XXX onHandleIntent: 3 " + e3.getMessage());
            e3.getCause();
        }
    }

    private void enabledH264(boolean z) {
        boolean z2 = false;
        PayloadType payloadType = null;
        for (PayloadType payloadType2 : LinphoneManager.getLc().getVideoCodecs()) {
            Log.d("TAG", "XXX onHandleIntent: PayloadType = " + payloadType2.getMime());
            if (payloadType2.getMime().equals("H264")) {
                payloadType = payloadType2;
            }
        }
        if (("XXX onHandleIntent: h264 = " + payloadType) != null) {
            z2 = true;
        }
        Log.d("TAG", String.valueOf(z2));
        if (payloadType != null) {
            try {
                LinphoneManager.getLc().enablePayloadType(payloadType, z);
            } catch (LinphoneCoreException e) {
                Log.d("TAG", "XXX onHandleIntent: LinphoneCoreException = " + e.getMessage());
                e.printStackTrace();
            } catch (Throwable th) {
                Log.d("TAG", "XXX sendFinishUpdateDriverBroadcast() finally");
                throw th;
            }
            Log.d("TAG", "XXX sendFinishUpdateDriverBroadcast() finally");
            return;
        }
        Log.d("TAG", "XXX sendFinishUpdateDriverBroadcast() else");
    }

    private class ServiceWaitThread extends Thread {
        Handler handler;

        private ServiceWaitThread() {
            this.handler = new Handler();
        }

        public void run() {
            while (!LinphoneManager.isInstanciated()) {
                try {
                    sleep(30);
                } catch (InterruptedException unused) {
                    throw new RuntimeException("waiting thread sleep() has been interrupted");
                }
            }
            this.handler.post(new Runnable() {
                public void run() {
                    MyIntentService.this.onServiceReady();
                }
            });
            MyIntentService.this.serviceWaitThread = null;
        }
    }

    /* access modifiers changed from: private */
    public void onServiceReady() {
        Log.d("TAG", "XXX driver update broadcast");
        enabledH264(true);
    }

    private void sendFinishUpdateDriverBroadcast() {
        Intent intent = new Intent(this, LinphoneService.class);
        intent.setAction(getString(C5321R.string.action_driver_update));
        if (Build.VERSION.SDK_INT >= 26) {
            startForegroundService(intent);
        } else {
            startService(intent);
        }
    }
}
