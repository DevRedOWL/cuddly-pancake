package p046io.anyline.plugin.barcode;

import p007at.nineyards.anyline.modules.barcode.BarcodeScanView;

/* renamed from: io.anyline.plugin.barcode.BarcodeFormat */
public enum BarcodeFormat {
    AZTEC("AZTEC"),
    CODABAR("CODABAR"),
    CODE_39("CODE_39"),
    CODE_93("CODE_93"),
    CODE_128("CODE_128"),
    DATA_MATRIX("DATA_MATRIX"),
    EAN_8("EAN_8"),
    EAN_13("EAN_13"),
    ITF("ITF"),
    PDF_417("PDF_417"),
    QR_CODE("QR_CODE"),
    RSS_14("RSS_14"),
    RSS_EXPANDED("RSS_EXPANDED"),
    UPC_A("UPC_A"),
    UPC_E("UPC_E"),
    UPC_EAN_EXTENSION("UPC_EAN_EXTENSION"),
    UNKNOWN("UNKNOWN");
    

    /* renamed from: a */
    private final String f5716a;

    private BarcodeFormat(String str) {
        this.f5716a = str;
    }

    public final String toString() {
        return this.f5716a;
    }

    public static BarcodeFormat fromBarcodeScanViewBarcodeFormat(BarcodeScanView.BarcodeFormat barcodeFormat) {
        switch (barcodeFormat) {
            case AZTEC:
                return AZTEC;
            case CODABAR:
                return CODABAR;
            case CODE_39:
                return CODE_39;
            case CODE_93:
                return CODE_93;
            case CODE_128:
                return CODE_128;
            case DATA_MATRIX:
                return DATA_MATRIX;
            case EAN_8:
                return EAN_8;
            case EAN_13:
                return EAN_13;
            case ITF:
                return ITF;
            case PDF_417:
                return PDF_417;
            case QR_CODE:
                return QR_CODE;
            case RSS_14:
                return RSS_14;
            case RSS_EXPANDED:
                return RSS_EXPANDED;
            case UPC_A:
                return UPC_A;
            case UPC_E:
                return UPC_E;
            case UPC_EAN_EXTENSION:
                return UPC_EAN_EXTENSION;
            default:
                return UNKNOWN;
        }
    }

    public final BarcodeScanView.BarcodeFormat toBarcodeScanViewBarcodeFormat() {
        switch (this) {
            case AZTEC:
                return BarcodeScanView.BarcodeFormat.AZTEC;
            case CODABAR:
                return BarcodeScanView.BarcodeFormat.CODABAR;
            case CODE_39:
                return BarcodeScanView.BarcodeFormat.CODE_39;
            case CODE_93:
                return BarcodeScanView.BarcodeFormat.CODE_93;
            case CODE_128:
                return BarcodeScanView.BarcodeFormat.CODE_128;
            case DATA_MATRIX:
                return BarcodeScanView.BarcodeFormat.DATA_MATRIX;
            case EAN_8:
                return BarcodeScanView.BarcodeFormat.EAN_8;
            case EAN_13:
                return BarcodeScanView.BarcodeFormat.EAN_13;
            case ITF:
                return BarcodeScanView.BarcodeFormat.ITF;
            case PDF_417:
                return BarcodeScanView.BarcodeFormat.PDF_417;
            case QR_CODE:
                return BarcodeScanView.BarcodeFormat.QR_CODE;
            case RSS_14:
                return BarcodeScanView.BarcodeFormat.RSS_14;
            case RSS_EXPANDED:
                return BarcodeScanView.BarcodeFormat.RSS_EXPANDED;
            case UPC_A:
                return BarcodeScanView.BarcodeFormat.UPC_A;
            case UPC_E:
                return BarcodeScanView.BarcodeFormat.UPC_E;
            case UPC_EAN_EXTENSION:
                return BarcodeScanView.BarcodeFormat.UPC_EAN_EXTENSION;
            default:
                return BarcodeScanView.BarcodeFormat.UNKNOWN;
        }
    }
}
