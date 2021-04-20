package p007at.nineyards.anyline;

import java.util.List;
import p007at.nineyards.anyline.core.Polygon;
import p007at.nineyards.anyline.core.RunFailure;
import p007at.nineyards.anyline.core.Square;
import p007at.nineyards.anyline.core.Vector_Contour;
import p007at.nineyards.anyline.models.AnylineImage;

/* renamed from: at.nineyards.anyline.AnylineDebugListener */
public interface AnylineDebugListener {
    public static final Class<Double> BRIGHTNESS_VARIABLE_CLASS = Double.class;
    public static final String BRIGHTNESS_VARIABLE_NAME = "$brightness";
    public static final Class<Vector_Contour> CONTOURS_VARIABLE_CLASS = Vector_Contour.class;
    public static final String CONTOURS_VARIABLE_NAME = "$contours";
    public static final Class<Float> DEVICE_ACCELERATION_VARIABLE_CLASS = Float.class;
    public static final String DEVICE_ACCELERATION_VARIABLE_NAME = "$deviceAcceleration";
    public static final Class<Boolean> DEVICE_SHAKE_WARNING_VARIABLE_CLASS = Boolean.class;
    public static final String DEVICE_SHAKE_WARNING_VARIABLE_NAME = "$shake";
    public static final Class<List> OUTLINE_VARIABLE_CLASS = List.class;
    public static final String OUTLINE_VARIABLE_NAME = "$textRect";
    public static final Class<Polygon> POLYGON_VARIABLE_CLASS = Polygon.class;
    public static final String POLYGON_VARIABLE_NAME = "$polygon";
    public static final Class<Integer> SHARPNESS_VARIABLE_CLASS = Integer.class;
    public static final String SHARPNESS_VARIABLE_NAME = "$sharpness";
    public static final Class<Square> SQUARE_VARIABLE_CLASS = Square.class;
    public static final String SQUARE_VARIABLE_NAME = "$square";
    public static final Class<AnylineImage> THRESHOLD_IMAGE_VARIABLE_CLASS = AnylineImage.class;
    public static final String THRESHOLD_IMAGE_VARIABLE_NAME = "$thresholdedImage";

    void onDebug(String str, Object obj);

    void onRunSkipped(RunFailure runFailure);
}
