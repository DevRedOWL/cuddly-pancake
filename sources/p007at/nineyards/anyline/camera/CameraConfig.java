package p007at.nineyards.anyline.camera;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.drew.metadata.photoshop.PhotoshopDirectory;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007at.nineyards.anyline.camera.CameraFeatures;
import p007at.nineyards.anyline.camera.CameraUtil;
import p007at.nineyards.anyline.util.DimensUtil;

/* renamed from: at.nineyards.anyline.camera.CameraConfig */
public class CameraConfig {

    /* renamed from: a */
    private static final String f247a = CameraConfig.class.getSimpleName();
    protected boolean autoExposureRegionEnabled;
    protected int autoFocusInterval;
    protected EnumSet<CameraFeatures.LensFacing> fallbackLensFacings;
    protected CameraFeatures.FocusMode focusMode;
    protected boolean focusOnTouchEnabled;
    protected boolean focusRegionEnabled;
    protected CameraSize frameSize;
    protected float frameToViewScale;
    protected CameraFeatures.LensFacing lensFacing;
    protected boolean opticalStabilizationEnabled;
    protected CameraSize pictureSize;
    protected CameraSize previewSize;
    protected CameraFeatures.SceneMode sceneMode;
    protected boolean updateRegionsOnAutoFocusEnabled;
    protected boolean videoStabilizationEnabled;

    public CameraConfig() {
        this.frameSize = null;
        this.previewSize = new CameraSize(1280, 720);
        this.pictureSize = new CameraSize(1920, PhotoshopDirectory.TAG_COUNT_INFORMATION);
        this.sceneMode = CameraFeatures.SceneMode.DISABLED;
        this.frameToViewScale = 1.0f;
        this.focusRegionEnabled = true;
        this.autoExposureRegionEnabled = true;
        this.focusOnTouchEnabled = true;
        this.updateRegionsOnAutoFocusEnabled = true;
        this.autoFocusInterval = PhotoshopDirectory.TAG_LIGHTROOM_WORKFLOW;
        this.videoStabilizationEnabled = false;
        this.opticalStabilizationEnabled = true;
        this.lensFacing = CameraFeatures.LensFacing.BACK;
        this.fallbackLensFacings = EnumSet.of(CameraFeatures.LensFacing.BACK);
    }

    CameraConfig(Context context, CameraConfig cameraConfig, CameraFeatures cameraFeatures, int i, int i2) {
        double d;
        int i3;
        CameraFeatures.FocusMode focusMode2;
        this.frameSize = null;
        this.previewSize = new CameraSize(1280, 720);
        this.pictureSize = new CameraSize(1920, PhotoshopDirectory.TAG_COUNT_INFORMATION);
        this.sceneMode = CameraFeatures.SceneMode.DISABLED;
        this.frameToViewScale = 1.0f;
        boolean z = true;
        this.focusRegionEnabled = true;
        this.autoExposureRegionEnabled = true;
        this.focusOnTouchEnabled = true;
        this.updateRegionsOnAutoFocusEnabled = true;
        this.autoFocusInterval = PhotoshopDirectory.TAG_LIGHTROOM_WORKFLOW;
        this.videoStabilizationEnabled = false;
        this.opticalStabilizationEnabled = true;
        this.lensFacing = CameraFeatures.LensFacing.BACK;
        this.fallbackLensFacings = EnumSet.of(CameraFeatures.LensFacing.BACK);
        this.focusRegionEnabled = cameraConfig.focusRegionEnabled && cameraFeatures.getMaxFocusRegions() > 0;
        this.autoExposureRegionEnabled = cameraConfig.autoExposureRegionEnabled && cameraFeatures.getMaxAutoExposureRegions() > 0;
        this.focusOnTouchEnabled = cameraConfig.focusOnTouchEnabled;
        this.autoFocusInterval = cameraConfig.autoFocusInterval;
        if (cameraConfig.previewSize != null) {
            this.previewSize = CameraUtil.getBiggestFittingPreviewSize(cameraFeatures.getPreviewSizes(), cameraConfig.previewSize.getWidth(), cameraConfig.previewSize.getHeight());
        } else {
            this.previewSize = CameraUtil.getBiggestFittingPreviewSize(cameraFeatures.getPreviewSizes(), Math.min(i > i2 ? i : i2, 1920), Math.min(i > i2 ? i2 : i, PhotoshopDirectory.TAG_COUNT_INFORMATION));
        }
        if (DimensUtil.isOrientationPortrait(context)) {
            this.frameSize = new CameraSize(this.previewSize.getHeight(), this.previewSize.getWidth());
        } else {
            this.frameSize = new CameraSize(this.previewSize.getWidth(), this.previewSize.getHeight());
        }
        this.frameToViewScale = Math.max(((float) i2) / ((float) this.frameSize.getHeight()), ((float) i) / ((float) this.frameSize.getWidth()));
        String str = f247a;
        Log.d(str, "Using preview size of " + this.frameSize.toString());
        if (cameraConfig.getPictureSize() == null) {
            Log.d(f247a, "preferredPictureSize was set to 0,0");
            cameraConfig.setPictureSize(new CameraSize(0, 0));
        }
        ArrayList arrayList = new ArrayList();
        if (cameraConfig.pictureSize.getWidth() == 0 || cameraConfig.pictureSize.getHeight() == 0) {
            d = (double) this.previewSize.getWidth();
            i3 = this.previewSize.getHeight();
        } else {
            d = (double) cameraConfig.pictureSize.getWidth();
            i3 = cameraConfig.pictureSize.getHeight();
        }
        double d2 = d / ((double) i3);
        arrayList.add(CameraUtil.AspectRatio.fromRatio(d2 < 1.0d ? 1.0d / d2 : d2));
        this.pictureSize = CameraUtil.getBestFittingPictureSize(cameraFeatures.getPictureSizes(), cameraConfig.pictureSize.getWidth(), cameraConfig.pictureSize.getHeight(), arrayList);
        String str2 = f247a;
        Log.d(str2, "Using picture size of " + this.pictureSize.toString());
        if (Build.MODEL.contains("GT-I9100") || Build.MODEL.contains("GT-I9505")) {
            this.focusMode = CameraFeatures.FocusMode.AUTO;
        } else if (cameraConfig.focusMode == null || !cameraFeatures.getFocusModes().contains(cameraConfig.focusMode)) {
            if (Build.MODEL.contains("GT-I9100") || Build.MODEL.contains("GT-I9505")) {
                focusMode2 = CameraFeatures.FocusMode.AUTO;
            } else {
                List<CameraFeatures.FocusMode> focusModes = cameraFeatures.getFocusModes();
                if (focusModes.contains(CameraFeatures.FocusMode.CONTINUOUS_PICTURE)) {
                    focusMode2 = CameraFeatures.FocusMode.CONTINUOUS_PICTURE;
                } else if (focusModes.contains(CameraFeatures.FocusMode.CONTINUOUS_VIDEO)) {
                    focusMode2 = CameraFeatures.FocusMode.CONTINUOUS_VIDEO;
                } else if (focusModes.contains(CameraFeatures.FocusMode.AUTO)) {
                    focusMode2 = CameraFeatures.FocusMode.AUTO;
                } else if (focusModes.contains(CameraFeatures.FocusMode.MACRO)) {
                    focusMode2 = CameraFeatures.FocusMode.MACRO;
                } else if (focusModes.contains(CameraFeatures.FocusMode.FIXED)) {
                    focusMode2 = CameraFeatures.FocusMode.FIXED;
                } else if (focusModes.contains(CameraFeatures.FocusMode.INFINITY)) {
                    focusMode2 = CameraFeatures.FocusMode.INFINITY;
                } else if (focusModes.contains(CameraFeatures.FocusMode.EDOF)) {
                    focusMode2 = CameraFeatures.FocusMode.EDOF;
                } else {
                    focusMode2 = CameraFeatures.FocusMode.OFF;
                }
            }
            this.focusMode = focusMode2;
        } else {
            this.focusMode = cameraConfig.focusMode;
        }
        String str3 = f247a;
        Log.d(str3, "Using focus mode " + this.focusMode.toString());
        if (cameraFeatures.getSceneModes() != null && cameraFeatures.getSceneModes().contains(cameraConfig.sceneMode)) {
            this.sceneMode = cameraConfig.sceneMode;
        }
        this.videoStabilizationEnabled = cameraConfig.videoStabilizationEnabled && cameraFeatures.isVideoStabilizationSupported();
        this.opticalStabilizationEnabled = (!cameraConfig.opticalStabilizationEnabled || !(cameraFeatures instanceof CameraFeatures2) || !((CameraFeatures2) cameraFeatures).isOpticalStabilizationSupported()) ? false : z;
        if (cameraFeatures.lensFacing != null) {
            this.lensFacing = cameraFeatures.lensFacing;
        }
        EnumSet<CameraFeatures.LensFacing> enumSet = cameraConfig.fallbackLensFacings;
        if (enumSet != null) {
            this.fallbackLensFacings = enumSet;
        }
    }

    public CameraSize getFrameSize() {
        return this.frameSize;
    }

    public int getFrameWidth() {
        CameraSize cameraSize = this.frameSize;
        if (cameraSize == null) {
            return 0;
        }
        return cameraSize.getWidth();
    }

    public int getFrameHeight() {
        CameraSize cameraSize = this.frameSize;
        if (cameraSize == null) {
            return 0;
        }
        return cameraSize.getHeight();
    }

    public float getFrameToViewScale() {
        return this.frameToViewScale;
    }

    public CameraSize getPreviewSize() {
        return this.previewSize;
    }

    public void setPreviewSize(CameraSize cameraSize) {
        this.previewSize = cameraSize;
    }

    @Deprecated
    public CameraSize getPictureSize() {
        return this.pictureSize;
    }

    @Deprecated
    public void setPictureSize(CameraSize cameraSize) {
        this.pictureSize = cameraSize;
    }

    public CameraSize getHighResolutionImageSize() {
        return this.pictureSize;
    }

    public void setHighResolutionPictureSize(CameraSize cameraSize) {
        this.pictureSize = cameraSize;
    }

    public CameraFeatures.FocusMode getFocusMode() {
        return this.focusMode;
    }

    public void setFocusMode(CameraFeatures.FocusMode focusMode2) {
        this.focusMode = focusMode2;
    }

    public boolean isFocusModeAuto() {
        return this.focusMode == CameraFeatures.FocusMode.AUTO || this.focusMode == CameraFeatures.FocusMode.MACRO;
    }

    public CameraFeatures.SceneMode getSceneMode() {
        return this.sceneMode;
    }

    public void setSceneMode(CameraFeatures.SceneMode sceneMode2) {
        this.sceneMode = sceneMode2;
    }

    public boolean isFocusRegionEnabled() {
        return this.focusRegionEnabled;
    }

    public void setFocusRegionEnabled(boolean z) {
        this.focusRegionEnabled = z;
    }

    public boolean isAutoExposureRegionEnabled() {
        return this.autoExposureRegionEnabled;
    }

    public void setAutoExposureRegionEnabled(boolean z) {
        this.autoExposureRegionEnabled = z;
    }

    public boolean isFocusOnTouchEnabled() {
        return this.focusOnTouchEnabled;
    }

    public void setFocusOnTouchEnabled(boolean z) {
        this.focusOnTouchEnabled = z;
    }

    public boolean isUpdateRegionsOnAutoFocusEnabled() {
        return this.updateRegionsOnAutoFocusEnabled;
    }

    public void setUpdateRegionsOnAutoFocusEnabled(boolean z) {
        this.updateRegionsOnAutoFocusEnabled = z;
    }

    public boolean isVideoStabilizationEnabled() {
        return this.videoStabilizationEnabled;
    }

    public void setVideoStabilizationEnabled(boolean z) {
        this.videoStabilizationEnabled = z;
    }

    public boolean isOpticalStabilizationEnabled() {
        return this.opticalStabilizationEnabled;
    }

    public void setOpticalStabilizationEnabled(boolean z) {
        this.opticalStabilizationEnabled = z;
    }

    public int getAutoFocusInterval() {
        return this.autoFocusInterval;
    }

    public void setAutoFocusInterval(int i) {
        this.autoFocusInterval = i;
    }

    public CameraFeatures.LensFacing getLensFacing() {
        return this.lensFacing;
    }

    public void setLensFacing(CameraFeatures.LensFacing lensFacing2) {
        this.lensFacing = lensFacing2;
    }

    public EnumSet<CameraFeatures.LensFacing> getFallbackLensFacings() {
        return this.fallbackLensFacings;
    }

    public void setFallbackLensFacings(CameraFeatures.LensFacing... lensFacingArr) {
        this.fallbackLensFacings = EnumSet.copyOf(Arrays.asList(lensFacingArr));
    }

    public void setFallbackLensFacings(EnumSet<CameraFeatures.LensFacing> enumSet) {
        this.fallbackLensFacings = enumSet;
    }

    public String toString() {
        Field[] declaredFields = getClass().getDeclaredFields();
        JSONObject jSONObject = new JSONObject();
        try {
            for (Field field : declaredFields) {
                if (field.getModifiers() == 4) {
                    field.setAccessible(true);
                    String name = field.getName();
                    Class<?> type = field.getType();
                    Object obj = field.get(this);
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
                    } else {
                        jSONObject.put(name, obj);
                    }
                }
            }
        } catch (IllegalAccessException e) {
            Log.e(f247a, "could not access field: " + e.getMessage());
        } catch (JSONException e2) {
            Log.e(f247a, "JsonException " + e2.getMessage());
        }
        return jSONObject.toString();
    }
}
