package p035ru.unicorn.ujin.data.service.location;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import androidx.core.app.NotificationCompat;
import p035ru.mysmartflat.kortros.R;
import p046io.reactivex.disposables.CompositeDisposable;

/* renamed from: ru.unicorn.ujin.data.service.location.BaseService */
public abstract class BaseService extends Service {
    public static String ACTION_STOP_SERVICE = "action_stop_service";
    protected CompositeDisposable disposable = new CompositeDisposable();
    protected Notification notification;

    public IBinder onBind(Intent intent) {
        return null;
    }

    public abstract void onCreateService();

    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel("app_channel", getApplicationInfo().name, 4);
            notificationChannel.setLockscreenVisibility(0);
            ((NotificationManager) getSystemService("notification")).createNotificationChannel(notificationChannel);
            Notification.Builder autoCancel = new Notification.Builder(this, "app_channel").setContentTitle(getString(R.string.app_name_app)).setContentText("").setOngoing(true).setCategory(NotificationCompat.CATEGORY_SERVICE).setAutoCancel(true);
            autoCancel.setSmallIcon(R.mipmap.ic_launcher_app);
            this.notification = autoCancel.build();
            startForeground(101, this.notification);
        }
        onCreateService();
    }

    /* access modifiers changed from: protected */
    public void stopThisService() {
        if (Build.VERSION.SDK_INT >= 24) {
            stopForeground(true);
            stopForeground(2);
            stopForeground(1);
        } else {
            stopForeground(true);
        }
        stopSelf();
    }

    public void onDestroy() {
        super.onDestroy();
        CompositeDisposable compositeDisposable = this.disposable;
        if (compositeDisposable != null && !compositeDisposable.isDisposed()) {
            this.disposable.clear();
        }
    }
}
