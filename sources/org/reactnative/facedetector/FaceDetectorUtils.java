package org.reactnative.facedetector;

import android.graphics.PointF;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.vision.face.Face;
import com.google.android.gms.vision.face.Landmark;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.MapPoint;

public class FaceDetectorUtils {
    private static final String[] landmarkNames = {"bottomMouthPosition", "leftCheekPosition", "leftEarPosition", "leftEarTipPosition", "leftEyePosition", "leftMouthPosition", "noseBasePosition", "rightCheekPosition", "rightEarPosition", "rightEarTipPosition", "rightEyePosition", "rightMouthPosition"};

    public static double valueMirroredHorizontally(double d, int i, double d2) {
        return (((double) i) - (d / d2)) * d2;
    }

    public static WritableMap serializeFace(Face face) {
        return serializeFace(face, 1.0d, 1.0d, 0, 0, 0, 0);
    }

    public static WritableMap serializeFace(Face face, double d, double d2, int i, int i2, int i3, int i4) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("faceID", face.getId());
        createMap.putDouble("rollAngle", (double) face.getEulerZ());
        createMap.putDouble("yawAngle", (double) face.getEulerY());
        if (face.getIsSmilingProbability() >= 0.0f) {
            createMap.putDouble("smilingProbability", (double) face.getIsSmilingProbability());
        }
        if (face.getIsLeftEyeOpenProbability() >= 0.0f) {
            createMap.putDouble("leftEyeOpenProbability", (double) face.getIsLeftEyeOpenProbability());
        }
        if (face.getIsRightEyeOpenProbability() >= 0.0f) {
            createMap.putDouble("rightEyeOpenProbability", (double) face.getIsRightEyeOpenProbability());
        }
        for (Landmark next : face.getLandmarks()) {
            createMap.putMap(landmarkNames[next.getType()], mapFromPoint(next.getPosition(), d, d2, i, i2, i3, i4));
        }
        WritableMap createMap2 = Arguments.createMap();
        Float valueOf = Float.valueOf(face.getPosition().x);
        Float valueOf2 = Float.valueOf(face.getPosition().y);
        float f = (float) (i / 2);
        if (face.getPosition().x < f) {
            valueOf = Float.valueOf(valueOf.floatValue() + ((float) (i3 / 2)));
        } else if (face.getPosition().x > f) {
            valueOf = Float.valueOf(valueOf.floatValue() - ((float) (i3 / 2)));
        }
        float f2 = (float) (i2 / 2);
        if (face.getPosition().y < f2) {
            valueOf2 = Float.valueOf(valueOf2.floatValue() + ((float) (i4 / 2)));
        } else if (face.getPosition().y > f2) {
            valueOf2 = Float.valueOf(valueOf2.floatValue() - ((float) (i4 / 2)));
        }
        createMap2.putDouble(MapPoint.JsonFields.f6911x, ((double) valueOf.floatValue()) * d);
        createMap2.putDouble(MapPoint.JsonFields.f6912y, ((double) valueOf2.floatValue()) * d2);
        WritableMap createMap3 = Arguments.createMap();
        createMap3.putDouble("width", ((double) face.getWidth()) * d);
        createMap3.putDouble("height", ((double) face.getHeight()) * d2);
        WritableMap createMap4 = Arguments.createMap();
        createMap4.putMap("origin", createMap2);
        createMap4.putMap("size", createMap3);
        createMap.putMap("bounds", createMap4);
        return createMap;
    }

    public static WritableMap rotateFaceX(WritableMap writableMap, int i, double d) {
        ReadableMap map = writableMap.getMap("bounds");
        WritableMap positionTranslatedHorizontally = positionTranslatedHorizontally(positionMirroredHorizontally(map.getMap("origin"), i, d), -map.getMap("size").getDouble("width"));
        WritableMap createMap = Arguments.createMap();
        createMap.merge(map);
        createMap.putMap("origin", positionTranslatedHorizontally);
        for (String str : landmarkNames) {
            ReadableMap map2 = writableMap.hasKey(str) ? writableMap.getMap(str) : null;
            if (map2 != null) {
                writableMap.putMap(str, positionMirroredHorizontally(map2, i, d));
            }
        }
        writableMap.putMap("bounds", createMap);
        return writableMap;
    }

    public static WritableMap changeAnglesDirection(WritableMap writableMap) {
        writableMap.putDouble("rollAngle", ((-writableMap.getDouble("rollAngle")) + 360.0d) % 360.0d);
        writableMap.putDouble("yawAngle", ((-writableMap.getDouble("yawAngle")) + 360.0d) % 360.0d);
        return writableMap;
    }

    public static WritableMap mapFromPoint(PointF pointF, double d, double d2, int i, int i2, int i3, int i4) {
        WritableMap createMap = Arguments.createMap();
        Float valueOf = Float.valueOf(pointF.x);
        Float valueOf2 = Float.valueOf(pointF.y);
        float f = (float) (i / 2);
        if (pointF.x < f) {
            Float.valueOf(valueOf.floatValue() + ((float) (i3 / 2)));
        } else if (pointF.x > f) {
            Float.valueOf(valueOf.floatValue() - ((float) (i3 / 2)));
        }
        float f2 = (float) (i2 / 2);
        if (pointF.y < f2) {
            Float.valueOf(valueOf2.floatValue() + ((float) (i4 / 2)));
        } else if (pointF.y > f2) {
            Float.valueOf(valueOf2.floatValue() - ((float) (i4 / 2)));
        }
        createMap.putDouble(MapPoint.JsonFields.f6911x, ((double) pointF.x) * d);
        createMap.putDouble(MapPoint.JsonFields.f6912y, ((double) pointF.y) * d2);
        return createMap;
    }

    public static WritableMap positionTranslatedHorizontally(ReadableMap readableMap, double d) {
        WritableMap createMap = Arguments.createMap();
        createMap.merge(readableMap);
        createMap.putDouble(MapPoint.JsonFields.f6911x, readableMap.getDouble(MapPoint.JsonFields.f6911x) + d);
        return createMap;
    }

    public static WritableMap positionMirroredHorizontally(ReadableMap readableMap, int i, double d) {
        WritableMap createMap = Arguments.createMap();
        createMap.merge(readableMap);
        createMap.putDouble(MapPoint.JsonFields.f6911x, valueMirroredHorizontally(readableMap.getDouble(MapPoint.JsonFields.f6911x), i, d));
        return createMap;
    }
}
