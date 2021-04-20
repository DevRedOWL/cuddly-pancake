package p046io.anyline.plugin.meter;

import android.content.Context;
import android.graphics.PointF;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p007at.nineyards.anyline.ImageProvider;
import p007at.nineyards.anyline.models.AnylineImage;
import p007at.nineyards.anyline.models.AnylineRawResult;
import p046io.anyline.plugin.AbstractScanPlugin;

/* renamed from: io.anyline.plugin.meter.MeterScanPlugin */
public class MeterScanPlugin extends AbstractScanPlugin<MeterScanResult> {

    /* renamed from: a */
    private MeterScanMode f5744a = MeterScanMode.ANALOG_METER;

    public MeterScanPlugin(Context context, String str, String str2, ImageProvider imageProvider) {
        super(context, str, str2, (String) null, (String) null, (String) null, imageProvider);
        this.anylineController.setAssetJsonPaths("anyline/module_energy/anyline_assets.json", "anyline/module_barcode/anyline_assets.json");
        setScanMode(this.f5744a);
    }

    /* access modifiers changed from: protected */
    public void onFinishedWithOutput(Object obj) {
        String result;
        AnylineImage lastImageWithFullSize = this.f5744a != MeterScanMode.BARCODE ? getLastImageWithFullSize() : null;
        if (C45051.f5745a[this.f5744a.ordinal()] != 1) {
            result = ((AnylineRawResult) obj).getResult("$result");
        } else {
            result = ((AnylineRawResult) obj).getResult("ean");
        }
        invokeOnResult(new MeterScanResult(this.f5713id, (List<PointF>) null, this.currentConfidence, this.currentImage.clone(), lastImageWithFullSize, result, this.f5744a));
    }

    public void start() {
        this.anylineController.reportIncludeValues(m6749a());
        super.start();
    }

    public void setScanMode(MeterScanMode meterScanMode) {
        synchronized (this.lock) {
            this.f5744a = meterScanMode;
            switch (meterScanMode) {
                case BARCODE:
                    this.anylineController.loadCmdFile("ean", "anyline/module_barcode");
                    break;
                case ANALOG_METER:
                    this.anylineController.loadCmdFile("analog_meter", "anyline/module_energy");
                    break;
                case SERIAL_NUMBER:
                    this.anylineController.loadCmdFile("energy_serial", "anyline/module_energy");
                    break;
                case AUTO_ANALOG_DIGITAL_METER:
                    this.anylineController.loadCmdFile("analog_digital_auto_mode", "anyline/module_energy");
                    break;
                case DIGITAL_METER:
                    this.anylineController.loadCmdFile("digital_meter", "anyline/module_energy");
                    break;
                case HEAT_METER_4:
                    m6750a(4);
                    break;
                case HEAT_METER_5:
                    m6750a(5);
                    break;
                case HEAT_METER_6:
                    m6750a(6);
                    break;
                case DIAL_METER:
                    this.anylineController.loadCmdFile("dial_meter", "anyline/module_energy");
                    break;
                case DOT_MATRIX_METER:
                    this.anylineController.loadCmdFile("dot_matrix_meter", "anyline/module_energy");
                    break;
            }
        }
    }

    public MeterScanMode getScanMode() {
        return this.f5744a;
    }

    /* renamed from: a */
    private void m6750a(int i) {
        this.anylineController.loadCmdFile("digital_heat_meter", "anyline/module_energy");
        this.anylineController.setStartVariable("$regexGroupBeforeAndAfterThePointString", "^(\\d{" + i + "})(\\d{0,3})");
        this.anylineController.setStartVariable("$validationRegexString", "^(\\d{" + i + "})\\.(\\d{0,3})");
    }

    /* renamed from: a */
    private String m6749a() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("scanMode", this.f5744a.toString());
            jSONObject.put("debugConfig", jSONObject2.toString());
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }
}
