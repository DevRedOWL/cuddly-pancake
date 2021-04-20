package com.google.android.play.core.assetpacks;

import android.os.ParcelFileDescriptor;
import com.google.android.play.core.tasks.Task;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.play.core.assetpacks.s */
interface C2220s {
    /* renamed from: a */
    Task<AssetPackStates> mo33613a(List<String> list, List<String> list2, Map<String, Long> map);

    /* renamed from: b */
    void mo33614b(List<String> list);

    /* renamed from: c */
    Task<List<String>> mo33615c(Map<String, Long> map);

    /* renamed from: d */
    Task<AssetPackStates> mo33616d(List<String> list, C2136ar arVar, Map<String, Long> map);

    /* renamed from: e */
    void mo33617e(int i, String str, String str2, int i2);

    /* renamed from: f */
    void mo33618f(int i, String str);

    /* renamed from: g */
    void mo33619g(int i);

    /* renamed from: h */
    Task<ParcelFileDescriptor> mo33620h(int i, String str, String str2, int i2);

    /* renamed from: i */
    void mo33621i(String str);

    /* renamed from: j */
    void mo33622j();
}
