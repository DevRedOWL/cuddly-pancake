package p035ru.unicorn.ujin.view.service;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Environment;
import android.os.IBinder;
import android.widget.Toast;
import java.util.Map;
import java.util.TreeMap;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.service.location.BaseService;

/* renamed from: ru.unicorn.ujin.view.service.DownloadService */
public class DownloadService extends BaseService {
    public static String ARG_FILE_NAME = "arg_file_name";
    public static String ARG_URL = "arg_url";
    Map<Long, String> fileList = new TreeMap();
    public String fileName;
    public String fileUrl;
    DownloadManager manager;
    BroadcastReceiver onComplete = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            long longExtra = intent.getLongExtra("extra_download_id", 0);
            if (DownloadService.this.fileList.containsKey(Long.valueOf(longExtra))) {
                DownloadService downloadService = DownloadService.this;
                downloadService.createPushForDownloadedFIle(context, downloadService.fileList.get(Long.valueOf(longExtra)));
            }
            DownloadService.this.fileList.remove(Long.valueOf(longExtra));
            if (DownloadService.this.fileList.isEmpty()) {
                DownloadService.this.stopSelf();
            }
        }
    };

    public void onCreateService() {
        registerReceiver(this.onComplete, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"));
    }

    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        this.fileName = intent.getStringExtra(ARG_FILE_NAME);
        this.fileUrl = intent.getStringExtra(ARG_URL);
        starti();
        return super.onStartCommand(intent, i, i2);
    }

    private void starti() {
        Uri parse = Uri.parse(this.fileUrl);
        Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).mkdirs();
        DownloadManager.Request request = new DownloadManager.Request(parse);
        request.setAllowedNetworkTypes(3).setAllowedOverRoaming(false).setNotificationVisibility(1).setTitle(getString(R.string.download_file_title, new Object[]{this.fileName})).setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, this.fileName);
        this.fileList.put(Long.valueOf(((DownloadManager) getSystemService("download")).enqueue(request)), this.fileName);
    }

    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.onComplete);
    }

    /* access modifiers changed from: private */
    public void createPushForDownloadedFIle(Context context, String str) {
        Toast.makeText(context, getString(R.string.download_file_title, new Object[]{str}), 0).show();
    }
}
