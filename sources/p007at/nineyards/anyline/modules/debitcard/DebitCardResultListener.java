package p007at.nineyards.anyline.modules.debitcard;

import p007at.nineyards.anyline.models.AnylineImage;
import p007at.nineyards.anyline.modules.AnylineModuleResultListener;

/* renamed from: at.nineyards.anyline.modules.debitcard.DebitCardResultListener */
public interface DebitCardResultListener extends AnylineModuleResultListener {
    void onResult(DebitCardResult debitCardResult, AnylineImage anylineImage);
}
