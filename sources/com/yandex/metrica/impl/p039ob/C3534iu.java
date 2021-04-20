package com.yandex.metrica.impl.p039ob;

import com.drew.metadata.exif.makernotes.NikonType2MakernoteDirectory;
import com.facebook.react.modules.appstate.AppStateModule;

/* renamed from: com.yandex.metrica.impl.ob.iu */
public class C3534iu extends C3533it {
    C3534iu(C3391en enVar, C3549jc jcVar) {
        this(enVar, jcVar, new C3556jg(enVar.mo40041y(), AppStateModule.APP_STATE_BACKGROUND));
    }

    C3534iu(C3391en enVar, C3549jc jcVar, C3556jg jgVar) {
        super(enVar, jcVar, jgVar, C3546jb.m3562a(C3557jh.BACKGROUND).mo40272a((int) NikonType2MakernoteDirectory.TAG_NIKON_SCAN).mo40273a());
    }
}
