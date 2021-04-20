package com.yandex.metrica.impl.p039ob;

import android.net.Uri;
import com.yandex.metrica.impl.p039ob.C4061sw;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.bo */
public abstract class C3208bo<T extends C4061sw> {

    /* renamed from: a */
    protected String f2719a;

    /* renamed from: b */
    protected int f2720b = 1;

    /* renamed from: c */
    protected final Map<String, List<String>> f2721c = new HashMap();

    /* renamed from: d */
    protected byte[] f2722d;

    /* renamed from: e */
    protected int f2723e;

    /* renamed from: f */
    protected byte[] f2724f;

    /* renamed from: g */
    protected Map<String, List<String>> f2725g;

    /* renamed from: h */
    protected int f2726h = -1;

    /* renamed from: i */
    protected final T f2727i;

    /* renamed from: j */
    private List<String> f2728j;

    /* renamed from: k */
    private Boolean f2729k;

    /* renamed from: l */
    private boolean f2730l;

    /* renamed from: m */
    private Long f2731m;

    /* renamed from: n */
    private Integer f2732n;

    /* renamed from: C */
    public void mo39650C() {
    }

    /* renamed from: D */
    public void mo39651D() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo39654a(Uri.Builder builder);

    /* renamed from: a */
    public void mo39659a(Throwable th) {
    }

    /* renamed from: a */
    public abstract boolean mo39664a();

    /* renamed from: b */
    public abstract boolean mo39666b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo39667b(int i) {
        return (i == 400 || i == 500) ? false : true;
    }

    /* renamed from: f */
    public void mo39671f() {
    }

    /* renamed from: o */
    public boolean mo39680o() {
        return false;
    }

    public C3208bo(T t) {
        this.f2727i = t;
    }

    /* renamed from: c */
    public C3822pj mo39668c() {
        return new C3825pl().mo40842a(mo39673h());
    }

    /* renamed from: d */
    public void mo39669d() {
        mo39686u();
        mo39670e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo39670e() {
        Uri.Builder buildUpon = Uri.parse(mo39683r()).buildUpon();
        mo39654a(buildUpon);
        mo39657a(buildUpon.build().toString());
    }

    /* renamed from: g */
    public void mo39672g() {
        this.f2729k = false;
    }

    /* renamed from: h */
    public String mo39673h() {
        return this.f2719a;
    }

    /* renamed from: a */
    public void mo39657a(String str) {
        this.f2719a = str;
    }

    /* renamed from: i */
    public int mo39674i() {
        return this.f2720b;
    }

    /* renamed from: j */
    public byte[] mo39675j() {
        return this.f2722d;
    }

    /* renamed from: a */
    public void mo39663a(byte[] bArr) {
        this.f2720b = 2;
        this.f2722d = bArr;
    }

    /* renamed from: k */
    public int mo39676k() {
        return this.f2723e;
    }

    /* renamed from: a */
    public void mo39652a(int i) {
        this.f2723e = i;
    }

    /* renamed from: l */
    public byte[] mo39677l() {
        return this.f2724f;
    }

    /* renamed from: b */
    public void mo39665b(byte[] bArr) {
        this.f2724f = bArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public Map<String, List<String>> mo39678m() {
        return this.f2725g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo39661a(Map<String, List<String>> map) {
        this.f2725g = map;
    }

    /* renamed from: n */
    public String mo39679n() {
        return getClass().getName();
    }

    /* renamed from: a */
    public void mo39660a(List<String> list) {
        this.f2728j = list;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public boolean mo39681p() {
        return mo39676k() == 400;
    }

    /* renamed from: q */
    public int mo39682q() {
        return this.f2726h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public String mo39683r() {
        return this.f2728j.get(mo39682q());
    }

    /* renamed from: s */
    public List<String> mo39684s() {
        return this.f2728j;
    }

    /* renamed from: t */
    public boolean mo39685t() {
        return !mo39687v() && mo39682q() + 1 < this.f2728j.size();
    }

    /* renamed from: u */
    public void mo39686u() {
        this.f2726h++;
    }

    /* renamed from: v */
    public boolean mo39687v() {
        return this.f2730l;
    }

    /* renamed from: w */
    public void mo39688w() {
        this.f2730l = true;
    }

    /* renamed from: a */
    public void mo39662a(boolean z) {
        this.f2729k = Boolean.valueOf(z);
    }

    /* renamed from: x */
    public boolean mo39689x() {
        Boolean bool = this.f2729k;
        return bool != null && bool.booleanValue();
    }

    /* renamed from: y */
    public boolean mo39690y() {
        return this.f2729k != null;
    }

    /* renamed from: z */
    public Long mo39691z() {
        return this.f2731m;
    }

    /* renamed from: A */
    public Integer mo39648A() {
        return this.f2732n;
    }

    /* renamed from: a */
    public void mo39656a(Long l) {
        this.f2731m = l;
    }

    /* renamed from: a */
    public void mo39655a(Integer num) {
        this.f2732n = num;
    }

    /* renamed from: a */
    public void mo39658a(String str, String... strArr) {
        this.f2721c.put(str, Arrays.asList(strArr));
    }

    /* renamed from: B */
    public Map<String, List<String>> mo39649B() {
        return this.f2721c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo39653a(long j) {
        mo39656a(Long.valueOf(j));
        mo39655a(Integer.valueOf(C4229wi.m6027a(TimeUnit.MILLISECONDS.toSeconds(j))));
    }
}
