package org.mobileid.time_key.util;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\b\b\u0018\u0000 0:\u00010BI\u0012\u0006\u0010\r\u001a\u00020\u0001\u0012\u0006\u0010\u000e\u001a\u00020\u0001\u0012\u0006\u0010\u000f\u001a\u00020\u0001\u0012\u0006\u0010\u0010\u001a\u00020\u0001\u0012\u0006\u0010\u0011\u001a\u00020\u0001\u0012\u0006\u0010\u0012\u001a\u00020\u0001\u0012\u0006\u0010\u0013\u001a\u00020\u0001\u0012\b\b\u0001\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b.\u0010/J\u0010\u0010\u0002\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0004\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\u0003J\u0010\u0010\b\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\b\u0010\u0003J\u0010\u0010\t\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\u0003J\u0010\u0010\u000b\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ`\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00012\b\b\u0003\u0010\u0014\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001c\u0010\fJ\u0017\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0000¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\u0001HÖ\u0001¢\u0006\u0004\b#\u0010\u0003R\u0019\u0010\u0013\u001a\u00020\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010$\u001a\u0004\b%\u0010\u0003R\u0019\u0010\u0010\u001a\u00020\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010$\u001a\u0004\b&\u0010\u0003R\u0019\u0010\u0014\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010'\u001a\u0004\b(\u0010\fR\u0019\u0010\u0012\u001a\u00020\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010$\u001a\u0004\b)\u0010\u0003R\u0019\u0010\r\u001a\u00020\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010$\u001a\u0004\b*\u0010\u0003R\u0019\u0010\u000e\u001a\u00020\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b+\u0010\u0003R\u0019\u0010\u0011\u001a\u00020\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010$\u001a\u0004\b,\u0010\u0003R\u0019\u0010\u000f\u001a\u00020\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010$\u001a\u0004\b-\u0010\u0003¨\u00061"}, mo51343d2 = {"Lorg/mobileid/time_key/util/TimeKeyParams;", "", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "", "component8", "()I", "notificationChannelId", "notificationTitle", "startNotification", "endNotification", "receivedKeyNotification", "keyRemovedNotification", "defaultKeyIsNotSetNotification", "iconId", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lorg/mobileid/time_key/util/TimeKeyParams;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "Landroid/content/Context;", "context", "", "save$aclib_api2_6826_release", "(Landroid/content/Context;)V", "save", "toString", "Ljava/lang/String;", "getDefaultKeyIsNotSetNotification", "getEndNotification", "I", "getIconId", "getKeyRemovedNotification", "getNotificationChannelId", "getNotificationTitle", "getReceivedKeyNotification", "getStartNotification", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "Companion", "aclib-api2-6826_release"}, mo51344k = 1, mo51345mv = {1, 1, 15}, mo51346pn = "", mo51347xi = 0, mo51348xs = "")
public final class TimeKeyParams {
    public static final C5514a Companion = new C5514a();
    public static final String DEFAULT_KEY_IS_NOT_SET_NOTIFICATION = "DEFAULT_KEY_IS_NOT_SET_NOTIFICATION";
    public static final String END_NOTIFICATION = "END_NOTIFICATION";
    public static final String ICON_ID = "ICON_ID";
    public static final String KEY_REMOVED_NOTIFICATION = "KEY_REMOVED_NOTIFICATION";
    public static final String NOTIFICATION_CHANNEL_ID = "NOTIFICATION_CHANNEL_ID";
    public static final String NOTIFICATION_TITLE = "NOTIFICATION_TITLE";
    public static final String RECEIVED_KEY_NOTIFICATION = "RECEIVED_KEY_NOTIFICATION";
    public static final String START_NOTIFICATION = "START_NOTIFICATION";
    public static final String TIME_KEY_PARAMS = "TIME_KEY_PARAMS";
    public final String defaultKeyIsNotSetNotification;
    public final String endNotification;
    public final int iconId;
    public final String keyRemovedNotification;
    public final String notificationChannelId;
    public final String notificationTitle;
    public final String receivedKeyNotification;
    public final String startNotification;

    /* renamed from: org.mobileid.time_key.util.TimeKeyParams$a */
    public static final class C5514a {
        /* renamed from: a */
        public final TimeKeyParams mo60138a(Context context) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            Intrinsics.checkNotNullParameter(context, "context");
            SharedPreferences sharedPreferences = context.getSharedPreferences(TimeKeyParams.TIME_KEY_PARAMS, 0);
            String string = sharedPreferences.getString(TimeKeyParams.NOTIFICATION_CHANNEL_ID, "");
            if (string != null) {
                str = string;
            } else {
                str = "";
            }
            Intrinsics.checkNotNullExpressionValue(str, "timeKeyParamsPreferences…                    ?: \"\"");
            String string2 = sharedPreferences.getString(TimeKeyParams.NOTIFICATION_TITLE, "");
            if (string2 != null) {
                str2 = string2;
            } else {
                str2 = "";
            }
            Intrinsics.checkNotNullExpressionValue(str2, "timeKeyParamsPreferences…                    ?: \"\"");
            String string3 = sharedPreferences.getString(TimeKeyParams.START_NOTIFICATION, "");
            if (string3 != null) {
                str3 = string3;
            } else {
                str3 = "";
            }
            Intrinsics.checkNotNullExpressionValue(str3, "timeKeyParamsPreferences…T_NOTIFICATION, \"\") ?: \"\"");
            String string4 = sharedPreferences.getString(TimeKeyParams.END_NOTIFICATION, "");
            if (string4 != null) {
                str4 = string4;
            } else {
                str4 = "";
            }
            Intrinsics.checkNotNullExpressionValue(str4, "timeKeyParamsPreferences…D_NOTIFICATION, \"\") ?: \"\"");
            String string5 = sharedPreferences.getString(TimeKeyParams.RECEIVED_KEY_NOTIFICATION, "");
            if (string5 != null) {
                str5 = string5;
            } else {
                str5 = "";
            }
            Intrinsics.checkNotNullExpressionValue(str5, "timeKeyParamsPreferences…                    ?: \"\"");
            String string6 = sharedPreferences.getString(TimeKeyParams.KEY_REMOVED_NOTIFICATION, "");
            if (string6 != null) {
                str6 = string6;
            } else {
                str6 = "";
            }
            Intrinsics.checkNotNullExpressionValue(str6, "timeKeyParamsPreferences…                    ?: \"\"");
            String string7 = sharedPreferences.getString(TimeKeyParams.DEFAULT_KEY_IS_NOT_SET_NOTIFICATION, "");
            if (string7 != null) {
                str7 = string7;
            } else {
                str7 = "";
            }
            Intrinsics.checkNotNullExpressionValue(str7, "timeKeyParamsPreferences…                    ?: \"\"");
            return new TimeKeyParams(str, str2, str3, str4, str5, str6, str7, sharedPreferences.getInt(TimeKeyParams.ICON_ID, 0));
        }
    }

    public TimeKeyParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
        Intrinsics.checkNotNullParameter(str, "notificationChannelId");
        Intrinsics.checkNotNullParameter(str2, "notificationTitle");
        Intrinsics.checkNotNullParameter(str3, "startNotification");
        Intrinsics.checkNotNullParameter(str4, "endNotification");
        Intrinsics.checkNotNullParameter(str5, "receivedKeyNotification");
        Intrinsics.checkNotNullParameter(str6, "keyRemovedNotification");
        Intrinsics.checkNotNullParameter(str7, "defaultKeyIsNotSetNotification");
        this.notificationChannelId = str;
        this.notificationTitle = str2;
        this.startNotification = str3;
        this.endNotification = str4;
        this.receivedKeyNotification = str5;
        this.keyRemovedNotification = str6;
        this.defaultKeyIsNotSetNotification = str7;
        this.iconId = i;
    }

    public static /* synthetic */ TimeKeyParams copy$default(TimeKeyParams timeKeyParams, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, int i2, Object obj) {
        TimeKeyParams timeKeyParams2 = timeKeyParams;
        int i3 = i2;
        return timeKeyParams.copy((i3 & 1) != 0 ? timeKeyParams2.notificationChannelId : str, (i3 & 2) != 0 ? timeKeyParams2.notificationTitle : str2, (i3 & 4) != 0 ? timeKeyParams2.startNotification : str3, (i3 & 8) != 0 ? timeKeyParams2.endNotification : str4, (i3 & 16) != 0 ? timeKeyParams2.receivedKeyNotification : str5, (i3 & 32) != 0 ? timeKeyParams2.keyRemovedNotification : str6, (i3 & 64) != 0 ? timeKeyParams2.defaultKeyIsNotSetNotification : str7, (i3 & 128) != 0 ? timeKeyParams2.iconId : i);
    }

    public final String component1() {
        return this.notificationChannelId;
    }

    public final String component2() {
        return this.notificationTitle;
    }

    public final String component3() {
        return this.startNotification;
    }

    public final String component4() {
        return this.endNotification;
    }

    public final String component5() {
        return this.receivedKeyNotification;
    }

    public final String component6() {
        return this.keyRemovedNotification;
    }

    public final String component7() {
        return this.defaultKeyIsNotSetNotification;
    }

    public final int component8() {
        return this.iconId;
    }

    public final TimeKeyParams copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
        Intrinsics.checkNotNullParameter(str, "notificationChannelId");
        Intrinsics.checkNotNullParameter(str2, "notificationTitle");
        Intrinsics.checkNotNullParameter(str3, "startNotification");
        Intrinsics.checkNotNullParameter(str4, "endNotification");
        Intrinsics.checkNotNullParameter(str5, "receivedKeyNotification");
        String str8 = str6;
        Intrinsics.checkNotNullParameter(str8, "keyRemovedNotification");
        String str9 = str7;
        Intrinsics.checkNotNullParameter(str9, "defaultKeyIsNotSetNotification");
        return new TimeKeyParams(str, str2, str3, str4, str5, str8, str9, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeKeyParams)) {
            return false;
        }
        TimeKeyParams timeKeyParams = (TimeKeyParams) obj;
        return Intrinsics.areEqual((Object) this.notificationChannelId, (Object) timeKeyParams.notificationChannelId) && Intrinsics.areEqual((Object) this.notificationTitle, (Object) timeKeyParams.notificationTitle) && Intrinsics.areEqual((Object) this.startNotification, (Object) timeKeyParams.startNotification) && Intrinsics.areEqual((Object) this.endNotification, (Object) timeKeyParams.endNotification) && Intrinsics.areEqual((Object) this.receivedKeyNotification, (Object) timeKeyParams.receivedKeyNotification) && Intrinsics.areEqual((Object) this.keyRemovedNotification, (Object) timeKeyParams.keyRemovedNotification) && Intrinsics.areEqual((Object) this.defaultKeyIsNotSetNotification, (Object) timeKeyParams.defaultKeyIsNotSetNotification) && this.iconId == timeKeyParams.iconId;
    }

    public final String getDefaultKeyIsNotSetNotification() {
        return this.defaultKeyIsNotSetNotification;
    }

    public final String getEndNotification() {
        return this.endNotification;
    }

    public final int getIconId() {
        return this.iconId;
    }

    public final String getKeyRemovedNotification() {
        return this.keyRemovedNotification;
    }

    public final String getNotificationChannelId() {
        return this.notificationChannelId;
    }

    public final String getNotificationTitle() {
        return this.notificationTitle;
    }

    public final String getReceivedKeyNotification() {
        return this.receivedKeyNotification;
    }

    public final String getStartNotification() {
        return this.startNotification;
    }

    public int hashCode() {
        String str = this.notificationChannelId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.notificationTitle;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.startNotification;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.endNotification;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.receivedKeyNotification;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.keyRemovedNotification;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.defaultKeyIsNotSetNotification;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return ((hashCode6 + i) * 31) + this.iconId;
    }

    public final void save$aclib_api2_6826_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (Companion != null) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(this, "timeKeyParams");
            context.getSharedPreferences(TIME_KEY_PARAMS, 0).edit().putString(NOTIFICATION_CHANNEL_ID, getNotificationChannelId()).putString(NOTIFICATION_TITLE, getNotificationTitle()).putString(START_NOTIFICATION, getStartNotification()).putString(END_NOTIFICATION, getEndNotification()).putString(RECEIVED_KEY_NOTIFICATION, getReceivedKeyNotification()).putString(KEY_REMOVED_NOTIFICATION, getKeyRemovedNotification()).putString(DEFAULT_KEY_IS_NOT_SET_NOTIFICATION, getDefaultKeyIsNotSetNotification()).putInt(ICON_ID, getIconId()).apply();
            return;
        }
        throw null;
    }

    public String toString() {
        return "TimeKeyParams(notificationChannelId=" + this.notificationChannelId + ", notificationTitle=" + this.notificationTitle + ", startNotification=" + this.startNotification + ", endNotification=" + this.endNotification + ", receivedKeyNotification=" + this.receivedKeyNotification + ", keyRemovedNotification=" + this.keyRemovedNotification + ", defaultKeyIsNotSetNotification=" + this.defaultKeyIsNotSetNotification + ", iconId=" + this.iconId + ")";
    }
}
