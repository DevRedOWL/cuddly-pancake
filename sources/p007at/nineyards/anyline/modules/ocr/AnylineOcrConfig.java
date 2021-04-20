package p007at.nineyards.anyline.modules.ocr;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007at.nineyards.anyline.modules.ocr.C0804a;
import p007at.nineyards.anyline.util.AssetUtil;

/* renamed from: at.nineyards.anyline.modules.ocr.AnylineOcrConfig */
public class AnylineOcrConfig {
    private static final String TAG = AnylineOcrConfig.class.getSimpleName();
    private static final Pattern lowercasePattern = Pattern.compile(".*[a-z].*");
    private boolean allowLowercase = false;
    private int charCountX = 1;
    private int charCountY = 1;
    private double charPaddingXFactor = 1.0d;
    private double charPaddingYFactor = 1.0d;
    private String customCmdFile;
    private String customScript;
    private boolean isBrightTextOnDark = false;
    private List<C0804a> languages = new ArrayList();
    private int maxCharHeight = -1;
    private int minCharHeight = -1;
    private int minConfidence = -1;
    private int minSharpness = 0;
    private boolean removeSmallContours = false;
    private boolean removeWhitespaces = false;
    private ScanMode scanMode = ScanMode.LINE;
    private Map<String, String> tesseractParameters = new HashMap();
    private String validationRegex = "";

    /* renamed from: at.nineyards.anyline.modules.ocr.AnylineOcrConfig$ScanMode */
    public enum ScanMode {
        LINE,
        GRID,
        AUTO
    }

    /* renamed from: at.nineyards.anyline.modules.ocr.AnylineOcrConfig$AnylineOcrRegex */
    public enum AnylineOcrRegex {
        URL("((([A-Za-z]{3,9}:(?:\\/\\/)?)(?:[\\-;:&=\\+\\$,\\w]+@)?[A-Za-z0-9\\.\\-]+|(?:www\\.|[\\-;:&=\\+\\$,\\w]+@)[A-Za-z0-9\\.\\-]+)((?:\\/[\\+~%\\/\\.\\w\\-\\_]*)?\\??(?:[\\-\\+=&;%@\\.\\w\\_]*)#?(?:[\\.\\!\\/\\\\\\w]*))?)", "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZÄÜÖ0123456789./:@%_+-~#?&="),
        EMAIL("^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$", "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZÄÜÖ0123456789.@_-"),
        ISBN("^ISBN((-)?\\s*(13|10))?:?\\s*((978|979){1}-?\\s*)*[0-9]{1,5}-?\\s*[0-9]{2,7}-?\\s*[0-9]{2,7}-?\\s*[0-9X]$", "ISBN0123456789<>-X"),
        VIN("^[ABCDEFGHJKLMNPRSTUVWXYZ0123456789]{8}[0123456789X][ABCDEFGHJKLMNPRSTUVWXYZ0123456789]{8}$", "ABCDEFGHJKLMNPRSTUVWXYZ0123456789"),
        IMEI("^[0-9]{15}$", "-/0123456789"),
        PRICE("^(€|$)?( )?([0-9]{1,3}[\\.|\\,])*[0-9]{1,3}([\\.\\,]( )?([0-9]{2}|[-]))?( )?(€|$)?$", "0123456789.,-€$");
        

        /* renamed from: a */
        private final String f699a;

        /* renamed from: b */
        private final String f700b;

        private AnylineOcrRegex(String str, String str2) {
            this.f699a = str;
            this.f700b = str2;
        }

        public final String getRegex() {
            return this.f699a;
        }

        public final String getWhiteList() {
            return this.f700b;
        }
    }

    public AnylineOcrConfig() {
    }

    public AnylineOcrConfig(Context context, String str) {
        try {
            initFromJsonObject(AssetUtil.getAnylineAssetsJson(context, str));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public AnylineOcrConfig(JSONObject jSONObject) {
        initFromJsonObject(jSONObject);
    }

    private void initFromJsonObject(JSONObject jSONObject) {
        String upperCase = jSONObject.optString("scanMode").toUpperCase();
        if (upperCase.equals(ScanMode.GRID.toString())) {
            setScanMode(ScanMode.GRID);
        } else if (upperCase.equals(ScanMode.LINE.toString())) {
            setScanMode(ScanMode.LINE);
        } else if (upperCase.equals(ScanMode.AUTO.toString())) {
            setScanMode(ScanMode.AUTO);
        } else {
            throw new IllegalArgumentException("scanMode may only be GRID or LINE or AUTO");
        }
        String optString = jSONObject.optString("customCmdFile");
        if (!optString.isEmpty()) {
            setCustomCmdFile(optString);
        }
        String optString2 = jSONObject.optString("customScript");
        if (!optString2.isEmpty()) {
            setCustomScript(optString2);
        }
        setMinCharHeight(jSONObject.optInt("minCharHeight", this.minCharHeight));
        setMaxCharHeight(jSONObject.optInt("maxCharHeight", this.maxCharHeight));
        JSONArray optJSONArray = jSONObject.optJSONArray("tesseractLanguages");
        int i = 0;
        if (optJSONArray != null) {
            String[] strArr = new String[optJSONArray.length()];
            int i2 = 0;
            while (i2 < optJSONArray.length()) {
                try {
                    strArr[i2] = (String) optJSONArray.get(i2);
                    i2++;
                } catch (Exception unused) {
                    throw new IllegalArgumentException("The tesseractLanguages must be provided in an JsonArray that only consists of String-Objects.");
                }
            }
            setTesseractLanguages(strArr);
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("languages");
        if (optJSONArray2 != null) {
            String[] strArr2 = new String[optJSONArray2.length()];
            while (i < optJSONArray2.length()) {
                try {
                    strArr2[i] = (String) optJSONArray2.get(i);
                    i++;
                } catch (Exception unused2) {
                    throw new IllegalArgumentException("The languagePaths must be provided in an JsonArray that only consists of String-Objects.");
                }
            }
            setLanguages(strArr2);
        }
        setCharWhitelist(jSONObject.optString("charWhitelist", (String) null));
        setValidationRegex(jSONObject.optString("validationRegex", (String) null));
        setMinConfidence(jSONObject.optInt("minConfidence", this.minConfidence));
        setRemoveSmallContours(jSONObject.optBoolean("removeSmallContours", this.removeSmallContours));
        setRemoveWhitespaces(jSONObject.optBoolean("removeWhitespaces", this.removeWhitespaces));
        setCharCountX(jSONObject.optInt("charCountX", this.charCountX));
        setCharCountY(jSONObject.optInt("charCountY", this.charCountY));
        setCharPaddingXFactor(jSONObject.optDouble("charPaddingXFactor", this.charPaddingXFactor));
        setCharPaddingYFactor(jSONObject.optDouble("charPaddingYFactor", this.charPaddingYFactor));
        setIsBrightTextOnDark(jSONObject.optBoolean("isBrightTextOnDark", this.isBrightTextOnDark));
        setMinSharpness(jSONObject.optInt("minSharpness", this.minSharpness));
    }

    public String getCustomCmdFile() {
        return this.customCmdFile;
    }

    public void setCustomCmdFile(String str) {
        this.customCmdFile = str;
        this.customScript = null;
    }

    public String getCustomScript() {
        return this.customScript;
    }

    public void setCustomScript(String str) {
        this.customScript = str;
        this.customCmdFile = null;
    }

    public int getMinCharHeight() {
        return this.minCharHeight;
    }

    public void setMinCharHeight(int i) {
        this.minCharHeight = i;
    }

    public int getMaxCharHeight() {
        return this.maxCharHeight;
    }

    public void setMaxCharHeight(int i) {
        this.maxCharHeight = i;
    }

    public String[] getTesseractLanguages() {
        return getLanguageNames();
    }

    public String[] getLanguages() {
        ArrayList arrayList = new ArrayList();
        for (C0804a a : this.languages) {
            arrayList.add(a.mo12767a());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public String[] getLanguageNames() {
        ArrayList arrayList = new ArrayList();
        for (C0804a b : this.languages) {
            arrayList.add(b.mo12770b());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public String[] getLanguageFilenames() {
        ArrayList arrayList = new ArrayList();
        for (C0804a d : this.languages) {
            arrayList.add(d.mo12772d());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public void setTesseractLanguages(String... strArr) {
        this.languages = new ArrayList();
        for (String a : strArr) {
            C0804a aVar = new C0804a();
            aVar.mo12769a(a);
            aVar.mo12768a(C0804a.C0805a.TESSERACT);
            this.languages.add(aVar);
        }
    }

    public void setLanguages(String... strArr) throws IllegalArgumentException {
        this.languages = new ArrayList();
        for (String aVar : strArr) {
            this.languages.add(new C0804a(aVar));
        }
    }

    public void addLanguage(String str) throws IllegalArgumentException {
        this.languages.add(new C0804a(str));
    }

    public boolean areAllLanguagesAnyFiles() {
        List<C0804a> list = this.languages;
        if (list == null || list.size() == 0) {
            return false;
        }
        for (C0804a c : this.languages) {
            if (c.mo12771c() != C0804a.C0805a.ANY) {
                return false;
            }
        }
        return true;
    }

    public String getCharWhitelist() {
        return this.tesseractParameters.get("tessedit_char_whitelist");
    }

    public void setCharWhitelist(String str) {
        if (str != null) {
            this.tesseractParameters.put("tessedit_char_whitelist", str);
            this.allowLowercase = containsLowercaseCharacters(str);
            return;
        }
        this.tesseractParameters.remove("tessedit_char_whitelist");
    }

    private boolean containsLowercaseCharacters(String str) {
        return lowercasePattern.matcher(str).matches();
    }

    public boolean isAllowLowercase() {
        return this.allowLowercase;
    }

    public String getValidationRegex() {
        return this.validationRegex;
    }

    public void setValidationRegex(String str) {
        if (str == null) {
            str = "";
        }
        this.validationRegex = str;
    }

    public int getMinConfidence() {
        return this.minConfidence;
    }

    public void setMinConfidence(int i) {
        this.minConfidence = i;
    }

    public ScanMode getScanMode() {
        return this.scanMode;
    }

    public void setScanMode(ScanMode scanMode2) {
        this.scanMode = scanMode2;
        int i = C07991.f697a[scanMode2.ordinal()];
        if (i == 1) {
            this.tesseractParameters.put("tessedit_pageseg_mode", "7");
            if (this.removeWhitespaces) {
                this.tesseractParameters.put("tessedit_minimal_rej_pass1", "1");
            } else {
                this.tesseractParameters.remove("tessedit_minimal_rej_pass1");
            }
        } else if (i == 2) {
            this.tesseractParameters.put("tessedit_pageseg_mode", "6");
            this.tesseractParameters.put("tessedit_minimal_rej_pass1", "1");
        } else if (i == 3) {
            this.tesseractParameters.put("tessedit_pageseg_mode", "6");
            this.tesseractParameters.remove("tessedit_minimal_rej_pass1");
        }
    }

    /* renamed from: at.nineyards.anyline.modules.ocr.AnylineOcrConfig$1 */
    static /* synthetic */ class C07991 {

        /* renamed from: a */
        static final /* synthetic */ int[] f697a = new int[ScanMode.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                at.nineyards.anyline.modules.ocr.AnylineOcrConfig$ScanMode[] r0 = p007at.nineyards.anyline.modules.ocr.AnylineOcrConfig.ScanMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f697a = r0
                int[] r0 = f697a     // Catch:{ NoSuchFieldError -> 0x0014 }
                at.nineyards.anyline.modules.ocr.AnylineOcrConfig$ScanMode r1 = p007at.nineyards.anyline.modules.ocr.AnylineOcrConfig.ScanMode.LINE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f697a     // Catch:{ NoSuchFieldError -> 0x001f }
                at.nineyards.anyline.modules.ocr.AnylineOcrConfig$ScanMode r1 = p007at.nineyards.anyline.modules.ocr.AnylineOcrConfig.ScanMode.GRID     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f697a     // Catch:{ NoSuchFieldError -> 0x002a }
                at.nineyards.anyline.modules.ocr.AnylineOcrConfig$ScanMode r1 = p007at.nineyards.anyline.modules.ocr.AnylineOcrConfig.ScanMode.AUTO     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p007at.nineyards.anyline.modules.ocr.AnylineOcrConfig.C07991.<clinit>():void");
        }
    }

    public boolean isRemoveSmallContours() {
        return this.removeSmallContours;
    }

    public void setRemoveSmallContours(boolean z) {
        this.removeSmallContours = z;
    }

    public boolean isRemoveWhitespaces() {
        return this.removeWhitespaces;
    }

    public void setRemoveWhitespaces(boolean z) {
        this.removeWhitespaces = z;
        if (z) {
            this.tesseractParameters.put("tessedit_minimal_rej_pass1", "1");
        } else {
            this.tesseractParameters.remove("tessedit_minimal_rej_pass1");
        }
    }

    public int getCharCountX() {
        return this.charCountX;
    }

    public void setCharCountX(int i) {
        this.charCountX = i;
    }

    public int getCharCountY() {
        return this.charCountY;
    }

    public void setCharCountY(int i) {
        this.charCountY = i;
    }

    public double getCharPaddingXFactor() {
        return this.charPaddingXFactor;
    }

    public void setCharPaddingXFactor(double d) {
        this.charPaddingXFactor = d;
    }

    public double getCharPaddingYFactor() {
        return this.charPaddingYFactor;
    }

    public void setCharPaddingYFactor(double d) {
        this.charPaddingYFactor = d;
    }

    public boolean isBrightTextOnDark() {
        return this.isBrightTextOnDark;
    }

    public void setIsBrightTextOnDark(boolean z) {
        this.isBrightTextOnDark = z;
    }

    public int getMinSharpness() {
        return this.minSharpness;
    }

    public void setMinSharpness(int i) {
        this.minSharpness = i;
    }

    public String getTesseractLanguagesAsJsonString() {
        return getLanguageNamesAsJsonString();
    }

    public String getLanguagesAsJsonString() {
        if (this.languages == null) {
            return "[]";
        }
        return new JSONArray(Arrays.asList(getLanguages())).toString();
    }

    public String getLanguageNamesAsJsonString() {
        if (this.languages == null) {
            return "[]";
        }
        return new JSONArray(Arrays.asList(getLanguageNames())).toString();
    }

    public String getLanguageFilenamesAsJsonString() {
        if (this.languages == null) {
            return "[]";
        }
        return new JSONArray(Arrays.asList(getLanguageFilenames())).toString();
    }

    public String getTesseractParametersAsJsonString() {
        return getLanguageParametersAsJsonString();
    }

    public String getLanguageParametersAsJsonString() {
        return new JSONObject(this.tesseractParameters).toString();
    }

    public String toString() {
        Field[] declaredFields = getClass().getDeclaredFields();
        JSONObject jSONObject = new JSONObject();
        try {
            for (Field field : declaredFields) {
                if (field.getModifiers() == 2) {
                    field.setAccessible(true);
                    String name = field.getName();
                    Class<?> type = field.getType();
                    Object obj = field.get(this);
                    if (obj != null) {
                        if (type.isAssignableFrom(List.class)) {
                            JSONArray jSONArray = new JSONArray();
                            for (int i = 0; i < ((List) obj).size(); i++) {
                                jSONArray.put(((List) obj).get(i));
                            }
                            jSONObject.put(name, jSONArray);
                        } else if (obj.getClass().isArray()) {
                            JSONArray jSONArray2 = new JSONArray();
                            int length = Array.getLength(obj);
                            for (int i2 = 0; i2 < length; i2++) {
                                jSONArray2.put(Array.get(obj, i2));
                            }
                            jSONObject.put(name, jSONArray2);
                        } else if (type.isAssignableFrom(Map.class)) {
                            JSONObject jSONObject2 = new JSONObject();
                            for (String str : ((Map) obj).keySet()) {
                                jSONObject2.put(str, ((Map) obj).get(str));
                            }
                            jSONObject.put(name, jSONObject2);
                        } else {
                            jSONObject.put(name, obj);
                        }
                    }
                }
            }
        } catch (IllegalAccessException e) {
            Log.e(TAG, "could not access field: " + e.getMessage());
        } catch (JSONException e2) {
            Log.e(TAG, "JsonException " + e2.getMessage());
        }
        return jSONObject.toString();
    }
}
