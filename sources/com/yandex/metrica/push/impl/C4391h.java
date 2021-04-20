package com.yandex.metrica.push.impl;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.yandex.metrica.push.impl.h */
public class C4391h {

    /* renamed from: a */
    private final Context f5536a;

    /* renamed from: b */
    private final String f5537b;

    public C4391h(Context context) {
        this(context, ".STORAGE");
    }

    public C4391h(Context context, String str) {
        this.f5536a = context;
        this.f5537b = this.f5536a.getPackageName() + str;
    }

    /* renamed from: a */
    public SharedPreferences mo42054a() {
        return this.f5536a.getSharedPreferences(this.f5537b, 0);
    }

    /* renamed from: a */
    public C4391h mo42055a(int i) {
        return mo42058a("pending_intent_id", i);
    }

    /* renamed from: b */
    public int mo42063b(int i) {
        return mo42065b("pending_intent_id", i).intValue();
    }

    /* renamed from: a */
    public C4391h mo42057a(String str) {
        return mo42071c("refated_push_notification_ids", str);
    }

    /* renamed from: b */
    public String mo42068b(String str) {
        return mo42076d("refated_push_notification_ids", str);
    }

    /* renamed from: c */
    public C4391h mo42070c(String str) {
        return mo42071c("refated_push_notification_info_list", str);
    }

    /* renamed from: d */
    public String mo42075d(String str) {
        return mo42076d("refated_push_notification_info_list", str);
    }

    /* renamed from: a */
    public C4391h mo42060a(String str, String str2) {
        return mo42071c("shown_times_millis_by_channel_id".concat(String.valueOf(str)), str2);
    }

    /* renamed from: b */
    public String mo42069b(String str, String str2) {
        return mo42076d("shown_times_millis_by_channel_id".concat(String.valueOf(str)), str2);
    }

    /* renamed from: c */
    public C4391h mo42071c(String str, String str2) {
        mo42054a().edit().putString(str, str2).apply();
        return this;
    }

    /* renamed from: d */
    public String mo42076d(String str, String str2) {
        return mo42054a().getString(str, str2);
    }

    /* renamed from: a */
    public C4391h mo42058a(String str, int i) {
        mo42054a().edit().putInt(str, i).apply();
        return this;
    }

    /* renamed from: b */
    public Integer mo42065b(String str, int i) {
        return Integer.valueOf(mo42054a().getInt(str, i));
    }

    /* renamed from: a */
    public C4391h mo42059a(String str, long j) {
        mo42054a().edit().putLong(str, j).apply();
        return this;
    }

    /* renamed from: b */
    public Long mo42066b(String str, long j) {
        return Long.valueOf(mo42054a().getLong(str, j));
    }

    /* renamed from: a */
    public C4391h mo42061a(String str, boolean z) {
        mo42054a().edit().putBoolean(str, z).apply();
        return this;
    }

    /* renamed from: e */
    public Boolean mo42077e(String str) {
        if (mo42054a().contains(str)) {
            return Boolean.valueOf(mo42054a().getBoolean(str, false));
        }
        return null;
    }

    /* renamed from: f */
    public C4391h mo42078f(String str) {
        return mo42071c("com.yandex.metrica.push.token", str);
    }

    /* renamed from: b */
    public String mo42067b() {
        return mo42076d("com.yandex.metrica.push.token", (String) null);
    }

    /* renamed from: a */
    public C4391h mo42056a(long j) {
        return mo42059a("com.yandex.metrica.push.token.last.update.time", j);
    }

    /* renamed from: c */
    public Long mo42073c() {
        return mo42066b("com.yandex.metrica.push.token.last.update.time", -1);
    }

    /* renamed from: a */
    public C4391h mo42062a(boolean z) {
        return mo42061a("app_notification_status", z);
    }

    /* renamed from: d */
    public Boolean mo42074d() {
        return mo42077e("app_notification_status");
    }

    /* renamed from: b */
    public C4391h mo42064b(String str, boolean z) {
        return mo42061a("notification_channel_".concat(String.valueOf(str)), z);
    }

    /* renamed from: g */
    public Boolean mo42079g(String str) {
        return mo42077e("notification_channel_".concat(String.valueOf(str)));
    }

    /* renamed from: c */
    public C4391h mo42072c(String str, boolean z) {
        return mo42061a("notification_group_".concat(String.valueOf(str)), z);
    }

    /* renamed from: h */
    public Boolean mo42080h(String str) {
        return mo42077e("notification_group_".concat(String.valueOf(str)));
    }
}
