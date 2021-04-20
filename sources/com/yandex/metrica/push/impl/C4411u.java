package com.yandex.metrica.push.impl;

import p035ru.unicorn.ujin.view.dialogs.dataEntry.Actions;

/* renamed from: com.yandex.metrica.push.impl.u */
public enum C4411u {
    CLEAR("clear"),
    CLICK(Actions.JsonFields.click),
    ADDITIONAL_ACTION("additional");
    

    /* renamed from: d */
    private final String f5649d;

    private C4411u(String str) {
        this.f5649d = str;
    }

    /* renamed from: a */
    public String mo42213a() {
        return this.f5649d;
    }

    /* renamed from: a */
    public static C4411u m6705a(String str) {
        for (C4411u uVar : values()) {
            if (uVar.f5649d.equals(str)) {
                return uVar;
            }
        }
        return null;
    }
}
