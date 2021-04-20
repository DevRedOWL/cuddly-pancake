package p007at.nineyards.anyline.modules;

import p007at.nineyards.anyline.models.AnylineScanResult;

/* renamed from: at.nineyards.anyline.modules.AnylineModuleResultListener */
public interface AnylineModuleResultListener<T extends AnylineScanResult> {
    void onResult(T t);
}
