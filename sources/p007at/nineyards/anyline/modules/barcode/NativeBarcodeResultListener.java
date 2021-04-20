package p007at.nineyards.anyline.modules.barcode;

import android.util.SparseArray;
import com.google.android.gms.vision.barcode.Barcode;

/* renamed from: at.nineyards.anyline.modules.barcode.NativeBarcodeResultListener */
public interface NativeBarcodeResultListener {
    void onBarcodesReceived(SparseArray<Barcode> sparseArray);
}
