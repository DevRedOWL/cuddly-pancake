package p035ru.unicorn.ujin.data.service.location;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import p035ru.mysmartflat.kortros.R;
import p051me.leolin.shortcutbadger.ShortcutBadger;

/* renamed from: ru.unicorn.ujin.data.service.location.NotificationHelper */
public class NotificationHelper {
    /* access modifiers changed from: private */
    public static int DEFAULT_PUSH_ID = 100;
    private final int actionIcon;
    private final PendingIntent actionPendingIntent;
    private final String actionTitle;
    private final Boolean autoCancel;
    private final String body;
    private final PendingIntent contentPendingIntent;
    private final Context context;
    private PendingIntent fullscreeenintent;
    private final int importance;
    private Intent intent;
    private final boolean isCallPush;
    private final PushActions[] pushActionsSettings;
    private final Integer pushIcon;
    private final int pushId;
    private long timeOutInMillis;
    private final String title;

    /* renamed from: ru.unicorn.ujin.data.service.location.NotificationHelper$Builder */
    public static class Builder {
        /* access modifiers changed from: private */
        public int actionIcon;
        /* access modifiers changed from: private */
        public PendingIntent actionPendingIntent;
        /* access modifiers changed from: private */
        public String actionTitle;
        /* access modifiers changed from: private */
        public Boolean autoCancel = true;
        /* access modifiers changed from: private */
        public String body;
        /* access modifiers changed from: private */
        public PendingIntent contentPendingIntent;
        /* access modifiers changed from: private */
        public Context context;
        /* access modifiers changed from: private */
        public PendingIntent fullscreeenintent;
        private Boolean hasTimeOut = false;
        /* access modifiers changed from: private */
        public int importance = 4;
        /* access modifiers changed from: private */
        public boolean isCallPush = false;
        private Notification notification;
        private Notification.Action notificationAction;
        /* access modifiers changed from: private */
        public PushActions[] pushActionsSettings;
        /* access modifiers changed from: private */
        public Integer pushIcon = Integer.valueOf(R.drawable.ic_push);
        /* access modifiers changed from: private */
        public int pushId;
        /* access modifiers changed from: private */
        public long timeOutInMillis;
        /* access modifiers changed from: private */
        public String title;

        public Builder(Context context2) {
            this.context = context2;
            this.body = context2.getString(R.string.app_name_app);
            this.actionTitle = context2.getString(R.string.app_name_app);
            this.actionIcon = R.drawable.ic_push;
            this.autoCancel = true;
            this.hasTimeOut = false;
            this.pushId = NotificationHelper.DEFAULT_PUSH_ID;
            this.isCallPush = false;
        }

        public Builder contentPendingIntent(PendingIntent pendingIntent) {
            this.contentPendingIntent = pendingIntent;
            return this;
        }

        public Builder fullScrenIntent(PendingIntent pendingIntent) {
            this.fullscreeenintent = pendingIntent;
            return this;
        }

        public Builder actionPendingIntent(PendingIntent pendingIntent) {
            this.actionPendingIntent = pendingIntent;
            return this;
        }

        public Builder actionsPendingIntent(PushActions... pushActionsArr) {
            this.pushActionsSettings = pushActionsArr;
            return this;
        }

        public Builder title(String str) {
            this.title = str;
            return this;
        }

        public Builder body(String str) {
            this.body = str;
            return this;
        }

        public Builder pushIcon(Integer num) {
            this.pushIcon = num;
            return this;
        }

        public Builder isCallPush(boolean z) {
            this.isCallPush = z;
            return this;
        }

        public Builder importance(Integer num) {
            this.importance = num.intValue();
            return this;
        }

        public Builder timeOutInMillis(long j) {
            this.hasTimeOut = true;
            this.timeOutInMillis = j;
            return this;
        }

        public Builder autoCancel(Boolean bool) {
            this.autoCancel = bool;
            return this;
        }

        public Builder pushId(Integer num) {
            this.pushId = num.intValue();
            return this;
        }

        public Builder actionTitle(String str) {
            this.actionTitle = str;
            return this;
        }

        public Builder actionIcon(Integer num) {
            this.actionIcon = num.intValue();
            return this;
        }

        public void build() {
            NotificationHelper notificationHelper = new NotificationHelper(this);
            if (this.notification == null) {
                Log.d("TAG", "XXX notification null");
                this.notification = notificationHelper.createNotification();
            }
            notificationHelper.showPush(this.notification);
        }
    }

    private NotificationHelper(Builder builder) {
        this.context = builder.context;
        this.pushId = builder.pushId;
        this.contentPendingIntent = builder.contentPendingIntent;
        this.pushActionsSettings = builder.pushActionsSettings;
        this.actionPendingIntent = builder.actionPendingIntent;
        this.title = builder.title;
        this.body = builder.body;
        this.pushIcon = builder.pushIcon;
        this.importance = builder.importance;
        this.autoCancel = builder.autoCancel;
        this.actionIcon = builder.actionIcon;
        this.actionTitle = builder.actionTitle;
        this.timeOutInMillis = builder.timeOutInMillis;
        this.fullscreeenintent = builder.fullscreeenintent;
        this.isCallPush = builder.isCallPush;
    }

    public static void showAppBadgeCount(int i, Context context2) {
        if (i <= -1) {
            return;
        }
        if (i == 0) {
            ShortcutBadger.removeCount(context2);
        } else {
            ShortcutBadger.applyCount(context2, i);
        }
    }

    private void setTimeOut(Notification.Builder builder) {
        if (Build.VERSION.SDK_INT >= 26) {
            builder.setTimeoutAfter(getTimeOutInMillis());
            return;
        }
        NotificationManager notificationManager = getNotificationManager(this.context);
        if (notificationManager != null) {
            new Handler().postDelayed(new Runnable(notificationManager) {
                private final /* synthetic */ NotificationManager f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    NotificationHelper.this.lambda$setTimeOut$0$NotificationHelper(this.f$1);
                }
            }, (long) ((int) getTimeOutInMillis()));
        }
    }

    public /* synthetic */ void lambda$setTimeOut$0$NotificationHelper(NotificationManager notificationManager) {
        notificationManager.cancel(this.pushId);
    }

    private NotificationManager getNotificationManager(Context context2) {
        return (NotificationManager) context2.getSystemService("notification");
    }

    private void createNotificationChannel(NotificationManager notificationManager) {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel("kortros", "kortros", 4);
            if (this.isCallPush) {
                notificationChannel.setLockscreenVisibility(2);
            }
            notificationChannel.setDescription("kortros");
            notificationChannel.enableVibration(true);
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    public static void cancelNotificationById(Context context2, int i) {
        NotificationManager notificationManager = (NotificationManager) context2.getSystemService("notification");
        if (notificationManager != null) {
            notificationManager.cancel(i);
        }
    }

    public static void cancelNotificationAll(Context context2) {
        NotificationManager notificationManager = (NotificationManager) context2.getSystemService("notification");
        if (notificationManager != null) {
            notificationManager.cancelAll();
        }
    }

    public Intent getIntent() {
        return this.intent;
    }

    public String getTitle() {
        return this.title;
    }

    public String getBody() {
        return this.body;
    }

    public Integer getPushIcon() {
        return this.pushIcon;
    }

    public long getTimeOutInMillis() {
        return this.timeOutInMillis;
    }

    public int getPushId() {
        return this.pushId;
    }

    private boolean hasContentPendingIntent() {
        return this.contentPendingIntent != null;
    }

    public Boolean getAutoCancel() {
        return this.autoCancel;
    }

    public PendingIntent getContentPendingIntent() {
        return this.contentPendingIntent;
    }

    public PendingIntent getActionPendingIntent() {
        return this.actionPendingIntent;
    }

    public int getActionIcon() {
        return this.actionIcon;
    }

    public String getActionTitle() {
        return this.actionTitle;
    }

    public Boolean hasNotificationAction() {
        return Boolean.valueOf(this.actionPendingIntent != null);
    }

    public Notification createNotification() {
        Notification.Builder builder = new Notification.Builder(this.context);
        NotificationManager notificationManager = getNotificationManager(this.context);
        builder.setContentTitle(getTitle());
        builder.setContentText(getBody());
        builder.setSmallIcon(getPushIcon().intValue());
        builder.setAutoCancel(getAutoCancel().booleanValue());
        builder.setStyle(new Notification.BigTextStyle().bigText(getBody()));
        if (this.isCallPush) {
            builder.setPriority(2);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            builder.setCategory("call");
        }
        builder.setSound(RingtoneManager.getDefaultUri(1));
        if (Build.VERSION.SDK_INT >= 21) {
            builder.setVisibility(1);
        }
        if (this.isCallPush) {
            builder.setFullScreenIntent(this.contentPendingIntent, true);
        }
        if (hasContentPendingIntent()) {
            builder.setContentIntent(this.contentPendingIntent);
        }
        PendingIntent pendingIntent = this.fullscreeenintent;
        if (pendingIntent != null) {
            builder.setFullScreenIntent(pendingIntent, true);
        }
        if (hasNotificationAction().booleanValue()) {
            if (Build.VERSION.SDK_INT >= 20) {
                builder.addAction(new Notification.Action.Builder(getActionIcon(), getActionTitle(), getActionPendingIntent()).build());
            } else if (getActionPendingIntent() != null) {
                builder.setContentIntent(getActionPendingIntent());
            }
        }
        if (this.pushActionsSettings != null) {
            if (Build.VERSION.SDK_INT >= 20) {
                for (PushActions pushActions : this.pushActionsSettings) {
                    if (pushActions != null) {
                        String actionButtonTitle = pushActions.getActionButtonTitle();
                        int actionButtonDrawable = pushActions.getActionButtonDrawable();
                        PendingIntent actionButtonClickpendingIntent = pushActions.getActionButtonClickpendingIntent();
                        if (actionButtonClickpendingIntent != null) {
                            builder.addAction(new Notification.Action.Builder(actionButtonDrawable, actionButtonTitle, actionButtonClickpendingIntent).build());
                        }
                    }
                }
            } else if (getActionPendingIntent() != null) {
                builder.setContentIntent(getActionPendingIntent());
            }
        }
        if (getTimeOutInMillis() > 0) {
            setTimeOut(builder);
        }
        createNotificationChannel(notificationManager);
        if (Build.VERSION.SDK_INT >= 26) {
            builder.setChannelId("kortros");
        }
        return builder.build();
    }

    public void showPush(Notification notification) {
        getNotificationManager(this.context).notify(getPushId(), notification);
    }
}
