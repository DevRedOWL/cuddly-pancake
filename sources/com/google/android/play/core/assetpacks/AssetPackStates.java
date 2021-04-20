package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AssetPackStates {
    /* renamed from: a */
    public static AssetPackStates m818a(long j, Map<String, AssetPackState> map) {
        return new C2144az(j, map);
    }

    /* renamed from: b */
    public static AssetPackStates m819b(Bundle bundle, C2159bn bnVar) {
        return m820c(bundle, bnVar, new ArrayList());
    }

    /* renamed from: c */
    public static AssetPackStates m820c(Bundle bundle, C2159bn bnVar, List<String> list) {
        return m822e(bundle, bnVar, list, C2137as.f1557a);
    }

    /* renamed from: d */
    public static AssetPackStates m821d(Bundle bundle, C2159bn bnVar, C2136ar arVar) {
        return m822e(bundle, bnVar, new ArrayList(), arVar);
    }

    /* renamed from: e */
    private static AssetPackStates m822e(Bundle bundle, C2159bn bnVar, List<String> list, C2136ar arVar) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        HashMap hashMap = new HashMap();
        int size = stringArrayList.size();
        for (int i = 0; i < size; i++) {
            String str = stringArrayList.get(i);
            hashMap.put(str, AssetPackState.m816c(bundle, str, bnVar, arVar));
        }
        for (String next : list) {
            hashMap.put(next, AssetPackState.m815b(next, 4, 0, 0, 0, Utils.DOUBLE_EPSILON, 1));
        }
        return m818a(bundle.getLong("total_bytes_to_download"), hashMap);
    }

    public abstract Map<String, AssetPackState> packStates();

    public abstract long totalBytes();
}
