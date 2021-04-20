package com.yandex.metrica.impl.p039ob;

import com.yandex.metrica.impl.p039ob.C3125af;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.gp */
public class C3467gp extends C3470gr<C3489hd> {

    /* renamed from: a */
    private final C3520ig f3321a;

    /* renamed from: b */
    private final Map<C3125af.C3126a, C3511hz<C3489hd>> f3322b = m3380b();

    /* renamed from: c */
    private C3508hw<C3489hd> f3323c = new C3507hv(this.f3321a);

    /* renamed from: d */
    private C3508hw<C3489hd> f3324d;

    public C3467gp(C3391en enVar) {
        this.f3321a = new C3520ig(enVar);
    }

    /* renamed from: b */
    private HashMap<C3125af.C3126a, C3511hz<C3489hd>> m3380b() {
        HashMap<C3125af.C3126a, C3511hz<C3489hd>> hashMap = new HashMap<>();
        hashMap.put(C3125af.C3126a.EVENT_TYPE_ACTIVATION, new C3506hu(this.f3321a));
        hashMap.put(C3125af.C3126a.EVENT_TYPE_START, new C3523ij(this.f3321a));
        hashMap.put(C3125af.C3126a.EVENT_TYPE_REGULAR, new C3517id(this.f3321a));
        C3515ib ibVar = new C3515ib(this.f3321a);
        hashMap.put(C3125af.C3126a.EVENT_TYPE_EXCEPTION_USER, ibVar);
        hashMap.put(C3125af.C3126a.EVENT_TYPE_EXCEPTION_USER_PROTOBUF, ibVar);
        hashMap.put(C3125af.C3126a.EVENT_TYPE_SEND_REFERRER, ibVar);
        hashMap.put(C3125af.C3126a.EVENT_TYPE_STATBOX, ibVar);
        hashMap.put(C3125af.C3126a.EVENT_TYPE_CUSTOM_EVENT, ibVar);
        hashMap.put(C3125af.C3126a.EVENT_TYPE_APP_OPEN, new C3519if(this.f3321a));
        hashMap.put(C3125af.C3126a.EVENT_TYPE_PURGE_BUFFER, new C3516ic(this.f3321a));
        C3125af.C3126a aVar = C3125af.C3126a.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH;
        C3520ig igVar = this.f3321a;
        hashMap.put(aVar, new C3522ii(igVar, igVar.mo40205l()));
        hashMap.put(C3125af.C3126a.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH, new C3510hy(this.f3321a));
        hashMap.put(C3125af.C3126a.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE, new C3525il(this.f3321a));
        C3524ik ikVar = new C3524ik(this.f3321a);
        hashMap.put(C3125af.C3126a.EVENT_TYPE_EXCEPTION_UNHANDLED, ikVar);
        hashMap.put(C3125af.C3126a.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF, ikVar);
        hashMap.put(C3125af.C3126a.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT, ikVar);
        hashMap.put(C3125af.C3126a.EVENT_TYPE_ANR, ibVar);
        hashMap.put(C3125af.C3126a.EVENT_TYPE_IDENTITY, new C3514ia(this.f3321a));
        hashMap.put(C3125af.C3126a.EVENT_TYPE_SET_USER_INFO, new C3521ih(this.f3321a));
        C3125af.C3126a aVar2 = C3125af.C3126a.EVENT_TYPE_REPORT_USER_INFO;
        C3520ig igVar2 = this.f3321a;
        hashMap.put(aVar2, new C3522ii(igVar2, igVar2.mo40200g()));
        C3125af.C3126a aVar3 = C3125af.C3126a.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        C3520ig igVar3 = this.f3321a;
        hashMap.put(aVar3, new C3522ii(igVar3, igVar3.mo40202i()));
        C3125af.C3126a aVar4 = C3125af.C3126a.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        C3520ig igVar4 = this.f3321a;
        hashMap.put(aVar4, new C3522ii(igVar4, igVar4.mo40203j()));
        hashMap.put(C3125af.C3126a.EVENT_TYPE_SEND_USER_PROFILE, ibVar);
        C3125af.C3126a aVar5 = C3125af.C3126a.EVENT_TYPE_SET_USER_PROFILE_ID;
        C3520ig igVar5 = this.f3321a;
        hashMap.put(aVar5, new C3522ii(igVar5, igVar5.mo40208o()));
        hashMap.put(C3125af.C3126a.EVENT_TYPE_SEND_REVENUE_EVENT, ibVar);
        hashMap.put(C3125af.C3126a.EVENT_TYPE_IDENTITY_LIGHT, ibVar);
        hashMap.put(C3125af.C3126a.EVENT_TYPE_CLEANUP, ibVar);
        return hashMap;
    }

    /* renamed from: a */
    public void mo40161a(C3125af.C3126a aVar, C3511hz<C3489hd> hzVar) {
        this.f3322b.put(aVar, hzVar);
    }

    /* renamed from: a */
    public C3520ig mo40160a() {
        return this.f3321a;
    }

    /* renamed from: a */
    public C3466go<C3489hd> mo40158a(int i) {
        LinkedList linkedList = new LinkedList();
        C3125af.C3126a a = C3125af.C3126a.m1967a(i);
        C3508hw<C3489hd> hwVar = this.f3323c;
        if (hwVar != null) {
            hwVar.mo40181a(a, linkedList);
        }
        C3511hz hzVar = this.f3322b.get(a);
        if (hzVar != null) {
            hzVar.mo40180a(linkedList);
        }
        C3508hw<C3489hd> hwVar2 = this.f3324d;
        if (hwVar2 != null) {
            hwVar2.mo40181a(a, linkedList);
        }
        return new C3465gn(linkedList);
    }
}
