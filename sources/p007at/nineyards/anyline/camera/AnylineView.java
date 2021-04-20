package p007at.nineyards.anyline.camera;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import p007at.nineyards.anyline.C0718R;
import p007at.nineyards.anyline.camera.AnylineViewConfig;
import p007at.nineyards.anyline.camera.CameraFeatures;

/* renamed from: at.nineyards.anyline.camera.AnylineView */
public class AnylineView extends AnylineBaseView {
    public AnylineView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AnylineView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!isInEditMode()) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C0718R.styleable.AnylineView, i, 0);
            AnylineViewConfig anylineViewConfig = new AnylineViewConfig();
            int i2 = obtainStyledAttributes.getInt(C0718R.styleable.AnylineView_default_camera, -1);
            if (i2 >= 0) {
                anylineViewConfig.setDefaultLensFacing(CameraFeatures.LensFacing.fromBitFlag(i2));
            }
            int i3 = obtainStyledAttributes.getInt(C0718R.styleable.AnylineView_fallback_cameras, -1);
            if (i3 >= 0) {
                anylineViewConfig.setFallbackLensFacings(CameraFeatures.LensFacing.fromBitFlags(i3));
            }
            anylineViewConfig.setPreferredPreviewWidth(obtainStyledAttributes.getInt(C0718R.styleable.AnylineView_preferred_preview_width, anylineViewConfig.getPreferredPreviewWidth()));
            anylineViewConfig.setPreferredPreviewHeight(obtainStyledAttributes.getInt(C0718R.styleable.AnylineView_preferred_preview_height, anylineViewConfig.getPreferredPreviewHeight()));
            anylineViewConfig.setPreferredPictureWidth(obtainStyledAttributes.getInt(C0718R.styleable.AnylineView_preferred_picture_width, anylineViewConfig.getPreferredPictureWidth()));
            anylineViewConfig.setPreferredPictureHeight(obtainStyledAttributes.getInt(C0718R.styleable.AnylineView_preferred_picture_height, anylineViewConfig.getPreferredPictureHeight()));
            int i4 = obtainStyledAttributes.getInt(C0718R.styleable.AnylineView_cutout_alignment, -1);
            if (i4 >= 0) {
                anylineViewConfig.setCutoutAlignment(AnylineViewConfig.CutoutAlignment.fromInt(i4));
            }
            int i5 = obtainStyledAttributes.getInt(C0718R.styleable.AnylineView_cutout_max_width_percent, 0);
            if (i5 > 0) {
                anylineViewConfig.setCutoutMaxWidthPercent(i5);
            }
            int i6 = obtainStyledAttributes.getInt(C0718R.styleable.AnylineView_cutout_max_height_percent, 0);
            if (i6 > 0) {
                anylineViewConfig.setCutoutMaxHeightPercent(i6);
            }
            int i7 = obtainStyledAttributes.getInt(C0718R.styleable.AnylineView_cutout_width, 0);
            if (i7 > 0) {
                anylineViewConfig.setCutoutWidth(i7);
            }
            anylineViewConfig.setCutoutOffsetX(obtainStyledAttributes.getInt(C0718R.styleable.AnylineView_cutout_offset_x, 0));
            anylineViewConfig.setCutoutOffsetY(obtainStyledAttributes.getInt(C0718R.styleable.AnylineView_cutout_offset_y, 0));
            int i8 = obtainStyledAttributes.getInt(C0718R.styleable.AnylineView_cutout_style, -1);
            if (i8 >= 0) {
                anylineViewConfig.setCutoutStyle(AnylineViewConfig.CutoutStyle.fromInt(i8));
            }
            anylineViewConfig.setCutoutCornerRadiusInDp(obtainStyledAttributes.getInt(C0718R.styleable.AnylineView_cutout_rect_corner_radius_in_dp, anylineViewConfig.getCutoutCornerRadiusInDp()));
            anylineViewConfig.setCutoutStrokeColor(obtainStyledAttributes.getColor(C0718R.styleable.AnylineView_cutout_stroke_color, anylineViewConfig.getCutoutStrokeColor()));
            anylineViewConfig.setCutoutStrokeWidthInDp(obtainStyledAttributes.getInt(C0718R.styleable.AnylineView_cutout_stroke_width_in_dp, anylineViewConfig.getCutoutStrokeWidthInDp()));
            int i9 = obtainStyledAttributes.getInt(C0718R.styleable.AnylineView_cutout_ratio_from_size_width, 0);
            int i10 = obtainStyledAttributes.getInt(C0718R.styleable.AnylineView_cutout_ratio_from_size_height, 0);
            if (i9 > 0 && i10 > 0) {
                anylineViewConfig.setCutoutRatio(((float) i9) / ((float) i10));
            }
            anylineViewConfig.setCutoutCropPaddingX(obtainStyledAttributes.getInt(C0718R.styleable.AnylineView_cutout_crop_padding_x, anylineViewConfig.getCutoutCropPaddingX()));
            anylineViewConfig.setCutoutCropPaddingY(obtainStyledAttributes.getInt(C0718R.styleable.AnylineView_cutout_crop_padding_y, anylineViewConfig.getCutoutCropPaddingY()));
            anylineViewConfig.setCutoutCropOffsetX(obtainStyledAttributes.getInt(C0718R.styleable.AnylineView_cutout_crop_offset_x, anylineViewConfig.getCutoutCropOffsetX()));
            anylineViewConfig.setCutoutCropOffsetY(obtainStyledAttributes.getInt(C0718R.styleable.AnylineView_cutout_crop_offset_y, anylineViewConfig.getCutoutCropOffsetY()));
            int color = obtainStyledAttributes.getColor(C0718R.styleable.AnylineView_cutout_outside_color, 0);
            if (color != 0) {
                anylineViewConfig.setCutoutOuterColor(color);
            }
            Drawable drawable = obtainStyledAttributes.getDrawable(C0718R.styleable.AnylineView_cutout_drawable);
            if (drawable != null) {
                anylineViewConfig.setCutoutDrawable(drawable);
            }
            int i11 = obtainStyledAttributes.getInt(C0718R.styleable.AnylineView_flash_mode, -1);
            if (i11 >= 0) {
                anylineViewConfig.setFlashMode(AnylineViewConfig.FlashMode.fromInt(i11));
            }
            int i12 = obtainStyledAttributes.getInt(C0718R.styleable.AnylineView_flash_alignment, -1);
            if (i12 >= 0) {
                anylineViewConfig.setFlashAlignment(AnylineViewConfig.FlashAlignment.fromInt(i12));
            }
            int resourceId = obtainStyledAttributes.getResourceId(C0718R.styleable.AnylineView_flash_image_on, 0);
            if (resourceId != 0) {
                anylineViewConfig.setFlashImageOnId(resourceId);
            }
            int resourceId2 = obtainStyledAttributes.getResourceId(C0718R.styleable.AnylineView_flash_image_off, 0);
            if (resourceId2 != 0) {
                anylineViewConfig.setFlashImageOffId(resourceId2);
            }
            int resourceId3 = obtainStyledAttributes.getResourceId(C0718R.styleable.AnylineView_flash_image_auto, 0);
            if (resourceId3 != 0) {
                anylineViewConfig.setFlashImageAutoId(resourceId3);
            }
            obtainStyledAttributes.recycle();
            setConfig(anylineViewConfig);
        }
    }
}
