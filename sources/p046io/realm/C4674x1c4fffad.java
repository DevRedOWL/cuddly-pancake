package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p035ru.unicorn.ujin.view.activity.navigation.entity.video.C5788Video;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_entity_video_VideoRealmProxy */
public class C4674x1c4fffad extends C5788Video implements RealmObjectProxy, C4675x1f47e00c {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private VideoColumnInfo columnInfo;
    private ProxyState<C5788Video> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_entity_video_VideoRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Video";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_entity_video_VideoRealmProxy$VideoColumnInfo */
    static final class VideoColumnInfo extends ColumnInfo {
        long idIndex;
        long isFullscrennIndex;
        long isHasArchiveIndex;
        long mainIndex;
        long maxColumnIndexValue;
        long newArchiveUrlIndex;
        long previewIndex;
        long ratioIndex;
        long titleIndex;
        long videourlIndex;
        long videourlpegIndex;

        VideoColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(10);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.videourlIndex = addColumnDetails("videourl", "videourl", objectSchemaInfo);
            this.videourlpegIndex = addColumnDetails("videourlpeg", "videourlpeg", objectSchemaInfo);
            this.previewIndex = addColumnDetails(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_PREVIEW, RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_PREVIEW, objectSchemaInfo);
            this.ratioIndex = addColumnDetails("ratio", "ratio", objectSchemaInfo);
            this.mainIndex = addColumnDetails("main", "main", objectSchemaInfo);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.isFullscrennIndex = addColumnDetails("isFullscrenn", "isFullscrenn", objectSchemaInfo);
            this.isHasArchiveIndex = addColumnDetails("isHasArchive", "isHasArchive", objectSchemaInfo);
            this.newArchiveUrlIndex = addColumnDetails("newArchiveUrl", "newArchiveUrl", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        VideoColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new VideoColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            VideoColumnInfo videoColumnInfo = (VideoColumnInfo) columnInfo;
            VideoColumnInfo videoColumnInfo2 = (VideoColumnInfo) columnInfo2;
            videoColumnInfo2.idIndex = videoColumnInfo.idIndex;
            videoColumnInfo2.videourlIndex = videoColumnInfo.videourlIndex;
            videoColumnInfo2.videourlpegIndex = videoColumnInfo.videourlpegIndex;
            videoColumnInfo2.previewIndex = videoColumnInfo.previewIndex;
            videoColumnInfo2.ratioIndex = videoColumnInfo.ratioIndex;
            videoColumnInfo2.mainIndex = videoColumnInfo.mainIndex;
            videoColumnInfo2.titleIndex = videoColumnInfo.titleIndex;
            videoColumnInfo2.isFullscrennIndex = videoColumnInfo.isFullscrennIndex;
            videoColumnInfo2.isHasArchiveIndex = videoColumnInfo.isHasArchiveIndex;
            videoColumnInfo2.newArchiveUrlIndex = videoColumnInfo.newArchiveUrlIndex;
            videoColumnInfo2.maxColumnIndexValue = videoColumnInfo.maxColumnIndexValue;
        }
    }

    C4674x1c4fffad() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (VideoColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public String realmGet$id() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.idIndex);
    }

    public void realmSet$id(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.idIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.idIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.idIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.idIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$videourl() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.videourlIndex);
    }

    public void realmSet$videourl(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.videourlIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.videourlIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.videourlIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.videourlIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$videourlpeg() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.videourlpegIndex);
    }

    public void realmSet$videourlpeg(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.videourlpegIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.videourlpegIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.videourlpegIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.videourlpegIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$preview() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.previewIndex);
    }

    public void realmSet$preview(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.previewIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.previewIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.previewIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.previewIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public Double realmGet$ratio() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.ratioIndex)) {
            return null;
        }
        return Double.valueOf(this.proxyState.getRow$realm().getDouble(this.columnInfo.ratioIndex));
    }

    public void realmSet$ratio(Double d) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (d == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.ratioIndex);
            } else {
                this.proxyState.getRow$realm().setDouble(this.columnInfo.ratioIndex, d.doubleValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (d == null) {
                row$realm.getTable().setNull(this.columnInfo.ratioIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setDouble(this.columnInfo.ratioIndex, row$realm.getIndex(), d.doubleValue(), true);
            }
        }
    }

    public Integer realmGet$main() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.mainIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.mainIndex));
    }

    public void realmSet$main(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.mainIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.mainIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.mainIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.mainIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public String realmGet$title() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.titleIndex);
    }

    public void realmSet$title(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.titleIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.titleIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.titleIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.titleIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public boolean realmGet$isFullscrenn() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getBoolean(this.columnInfo.isFullscrennIndex);
    }

    public void realmSet$isFullscrenn(boolean z) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setBoolean(this.columnInfo.isFullscrennIndex, z);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setBoolean(this.columnInfo.isFullscrennIndex, row$realm.getIndex(), z, true);
        }
    }

    public boolean realmGet$isHasArchive() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getBoolean(this.columnInfo.isHasArchiveIndex);
    }

    public void realmSet$isHasArchive(boolean z) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setBoolean(this.columnInfo.isHasArchiveIndex, z);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setBoolean(this.columnInfo.isHasArchiveIndex, row$realm.getIndex(), z, true);
        }
    }

    public String realmGet$newArchiveUrl() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.newArchiveUrlIndex);
    }

    public void realmSet$newArchiveUrl(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str != null) {
                this.proxyState.getRow$realm().setString(this.columnInfo.newArchiveUrlIndex, str);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'newArchiveUrl' to null.");
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str != null) {
                row$realm.getTable().setString(this.columnInfo.newArchiveUrlIndex, row$realm.getIndex(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'newArchiveUrl' to null.");
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 10, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("videourl", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("videourlpeg", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_PREVIEW, RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("ratio", RealmFieldType.DOUBLE, false, false, false);
        builder2.addPersistedProperty("main", RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty("title", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("isFullscrenn", RealmFieldType.BOOLEAN, false, false, true);
        builder2.addPersistedProperty("isHasArchive", RealmFieldType.BOOLEAN, false, false, true);
        builder2.addPersistedProperty("newArchiveUrl", RealmFieldType.STRING, false, false, true);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static VideoColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new VideoColumnInfo(osSchemaInfo);
    }

    public static C5788Video createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        C5788Video video = (C5788Video) realm.createObjectInternal(C5788Video.class, true, Collections.emptyList());
        C4675x1f47e00c ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface = video;
        if (jSONObject.has("id")) {
            if (jSONObject.isNull("id")) {
                ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmSet$id((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmSet$id(jSONObject.getString("id"));
            }
        }
        if (jSONObject.has("videourl")) {
            if (jSONObject.isNull("videourl")) {
                ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmSet$videourl((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmSet$videourl(jSONObject.getString("videourl"));
            }
        }
        if (jSONObject.has("videourlpeg")) {
            if (jSONObject.isNull("videourlpeg")) {
                ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmSet$videourlpeg((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmSet$videourlpeg(jSONObject.getString("videourlpeg"));
            }
        }
        if (jSONObject.has(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_PREVIEW)) {
            if (jSONObject.isNull(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_PREVIEW)) {
                ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmSet$preview((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmSet$preview(jSONObject.getString(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_PREVIEW));
            }
        }
        if (jSONObject.has("ratio")) {
            if (jSONObject.isNull("ratio")) {
                ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmSet$ratio((Double) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmSet$ratio(Double.valueOf(jSONObject.getDouble("ratio")));
            }
        }
        if (jSONObject.has("main")) {
            if (jSONObject.isNull("main")) {
                ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmSet$main((Integer) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmSet$main(Integer.valueOf(jSONObject.getInt("main")));
            }
        }
        if (jSONObject.has("title")) {
            if (jSONObject.isNull("title")) {
                ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmSet$title((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmSet$title(jSONObject.getString("title"));
            }
        }
        if (jSONObject.has("isFullscrenn")) {
            if (!jSONObject.isNull("isFullscrenn")) {
                ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmSet$isFullscrenn(jSONObject.getBoolean("isFullscrenn"));
            } else {
                throw new IllegalArgumentException("Trying to set non-nullable field 'isFullscrenn' to null.");
            }
        }
        if (jSONObject.has("isHasArchive")) {
            if (!jSONObject.isNull("isHasArchive")) {
                ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmSet$isHasArchive(jSONObject.getBoolean("isHasArchive"));
            } else {
                throw new IllegalArgumentException("Trying to set non-nullable field 'isHasArchive' to null.");
            }
        }
        if (jSONObject.has("newArchiveUrl")) {
            if (jSONObject.isNull("newArchiveUrl")) {
                ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmSet$newArchiveUrl((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmSet$newArchiveUrl(jSONObject.getString("newArchiveUrl"));
            }
        }
        return video;
    }

    public static C5788Video createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        C5788Video video = new C5788Video();
        C4675x1f47e00c ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface = video;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmSet$id(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmSet$id((String) null);
                }
            } else if (nextName.equals("videourl")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmSet$videourl(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmSet$videourl((String) null);
                }
            } else if (nextName.equals("videourlpeg")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmSet$videourlpeg(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmSet$videourlpeg((String) null);
                }
            } else if (nextName.equals(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_PREVIEW)) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmSet$preview(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmSet$preview((String) null);
                }
            } else if (nextName.equals("ratio")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmSet$ratio(Double.valueOf(jsonReader.nextDouble()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmSet$ratio((Double) null);
                }
            } else if (nextName.equals("main")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmSet$main(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmSet$main((Integer) null);
                }
            } else if (nextName.equals("title")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmSet$title(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmSet$title((String) null);
                }
            } else if (nextName.equals("isFullscrenn")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmSet$isFullscrenn(jsonReader.nextBoolean());
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'isFullscrenn' to null.");
                }
            } else if (nextName.equals("isHasArchive")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmSet$isHasArchive(jsonReader.nextBoolean());
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'isHasArchive' to null.");
                }
            } else if (!nextName.equals("newArchiveUrl")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmSet$newArchiveUrl(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmSet$newArchiveUrl((String) null);
            }
        }
        jsonReader.endObject();
        return (C5788Video) realm.copyToRealm(video, new ImportFlag[0]);
    }

    private static C4674x1c4fffad newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) C5788Video.class), false, Collections.emptyList());
        C4674x1c4fffad ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxy = new C4674x1c4fffad();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxy;
    }

    public static C5788Video copyOrUpdate(Realm realm, VideoColumnInfo videoColumnInfo, C5788Video video, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (video instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) video;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return video;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(video);
        if (realmObjectProxy2 != null) {
            return (C5788Video) realmObjectProxy2;
        }
        return copy(realm, videoColumnInfo, video, z, map, set);
    }

    public static C5788Video copy(Realm realm, VideoColumnInfo videoColumnInfo, C5788Video video, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(video);
        if (realmObjectProxy != null) {
            return (C5788Video) realmObjectProxy;
        }
        C4675x1f47e00c ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface = video;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(C5788Video.class), videoColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(videoColumnInfo.idIndex, ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmGet$id());
        osObjectBuilder.addString(videoColumnInfo.videourlIndex, ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmGet$videourl());
        osObjectBuilder.addString(videoColumnInfo.videourlpegIndex, ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmGet$videourlpeg());
        osObjectBuilder.addString(videoColumnInfo.previewIndex, ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmGet$preview());
        osObjectBuilder.addDouble(videoColumnInfo.ratioIndex, ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmGet$ratio());
        osObjectBuilder.addInteger(videoColumnInfo.mainIndex, ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmGet$main());
        osObjectBuilder.addString(videoColumnInfo.titleIndex, ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmGet$title());
        osObjectBuilder.addBoolean(videoColumnInfo.isFullscrennIndex, Boolean.valueOf(ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmGet$isFullscrenn()));
        osObjectBuilder.addBoolean(videoColumnInfo.isHasArchiveIndex, Boolean.valueOf(ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmGet$isHasArchive()));
        osObjectBuilder.addString(videoColumnInfo.newArchiveUrlIndex, ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmGet$newArchiveUrl());
        C4674x1c4fffad newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(video, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, C5788Video video, Map<RealmModel, Long> map) {
        C5788Video video2 = video;
        if (video2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) video2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(C5788Video.class);
        long nativePtr = table.getNativePtr();
        VideoColumnInfo videoColumnInfo = (VideoColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) C5788Video.class);
        long createRow = OsObject.createRow(table);
        map.put(video2, Long.valueOf(createRow));
        C4675x1f47e00c ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface = video2;
        String realmGet$id = ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetString(nativePtr, videoColumnInfo.idIndex, createRow, realmGet$id, false);
        }
        String realmGet$videourl = ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmGet$videourl();
        if (realmGet$videourl != null) {
            Table.nativeSetString(nativePtr, videoColumnInfo.videourlIndex, createRow, realmGet$videourl, false);
        }
        String realmGet$videourlpeg = ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmGet$videourlpeg();
        if (realmGet$videourlpeg != null) {
            Table.nativeSetString(nativePtr, videoColumnInfo.videourlpegIndex, createRow, realmGet$videourlpeg, false);
        }
        String realmGet$preview = ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmGet$preview();
        if (realmGet$preview != null) {
            Table.nativeSetString(nativePtr, videoColumnInfo.previewIndex, createRow, realmGet$preview, false);
        }
        Double realmGet$ratio = ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmGet$ratio();
        if (realmGet$ratio != null) {
            Table.nativeSetDouble(nativePtr, videoColumnInfo.ratioIndex, createRow, realmGet$ratio.doubleValue(), false);
        }
        Integer realmGet$main = ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmGet$main();
        if (realmGet$main != null) {
            Table.nativeSetLong(nativePtr, videoColumnInfo.mainIndex, createRow, realmGet$main.longValue(), false);
        }
        String realmGet$title = ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, videoColumnInfo.titleIndex, createRow, realmGet$title, false);
        }
        long j = nativePtr;
        long j2 = createRow;
        Table.nativeSetBoolean(j, videoColumnInfo.isFullscrennIndex, j2, ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmGet$isFullscrenn(), false);
        Table.nativeSetBoolean(j, videoColumnInfo.isHasArchiveIndex, j2, ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmGet$isHasArchive(), false);
        String realmGet$newArchiveUrl = ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmGet$newArchiveUrl();
        if (realmGet$newArchiveUrl != null) {
            Table.nativeSetString(nativePtr, videoColumnInfo.newArchiveUrlIndex, createRow, realmGet$newArchiveUrl, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(C5788Video.class);
        long nativePtr = table.getNativePtr();
        VideoColumnInfo videoColumnInfo = (VideoColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) C5788Video.class);
        while (it.hasNext()) {
            C5788Video video = (C5788Video) it.next();
            if (!map2.containsKey(video)) {
                if (video instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) video;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(video, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(video, Long.valueOf(createRow));
                C4675x1f47e00c ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface = video;
                String realmGet$id = ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmGet$id();
                if (realmGet$id != null) {
                    Table.nativeSetString(nativePtr, videoColumnInfo.idIndex, createRow, realmGet$id, false);
                }
                String realmGet$videourl = ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmGet$videourl();
                if (realmGet$videourl != null) {
                    Table.nativeSetString(nativePtr, videoColumnInfo.videourlIndex, createRow, realmGet$videourl, false);
                }
                String realmGet$videourlpeg = ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmGet$videourlpeg();
                if (realmGet$videourlpeg != null) {
                    Table.nativeSetString(nativePtr, videoColumnInfo.videourlpegIndex, createRow, realmGet$videourlpeg, false);
                }
                String realmGet$preview = ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmGet$preview();
                if (realmGet$preview != null) {
                    Table.nativeSetString(nativePtr, videoColumnInfo.previewIndex, createRow, realmGet$preview, false);
                }
                Double realmGet$ratio = ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmGet$ratio();
                if (realmGet$ratio != null) {
                    Table.nativeSetDouble(nativePtr, videoColumnInfo.ratioIndex, createRow, realmGet$ratio.doubleValue(), false);
                }
                Integer realmGet$main = ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmGet$main();
                if (realmGet$main != null) {
                    Table.nativeSetLong(nativePtr, videoColumnInfo.mainIndex, createRow, realmGet$main.longValue(), false);
                }
                String realmGet$title = ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, videoColumnInfo.titleIndex, createRow, realmGet$title, false);
                }
                long j = nativePtr;
                long j2 = createRow;
                Table.nativeSetBoolean(j, videoColumnInfo.isFullscrennIndex, j2, ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmGet$isFullscrenn(), false);
                Table.nativeSetBoolean(j, videoColumnInfo.isHasArchiveIndex, j2, ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmGet$isHasArchive(), false);
                String realmGet$newArchiveUrl = ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmGet$newArchiveUrl();
                if (realmGet$newArchiveUrl != null) {
                    Table.nativeSetString(nativePtr, videoColumnInfo.newArchiveUrlIndex, createRow, realmGet$newArchiveUrl, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, C5788Video video, Map<RealmModel, Long> map) {
        C5788Video video2 = video;
        if (video2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) video2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(C5788Video.class);
        long nativePtr = table.getNativePtr();
        VideoColumnInfo videoColumnInfo = (VideoColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) C5788Video.class);
        long createRow = OsObject.createRow(table);
        map.put(video2, Long.valueOf(createRow));
        C4675x1f47e00c ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface = video2;
        String realmGet$id = ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetString(nativePtr, videoColumnInfo.idIndex, createRow, realmGet$id, false);
        } else {
            Table.nativeSetNull(nativePtr, videoColumnInfo.idIndex, createRow, false);
        }
        String realmGet$videourl = ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmGet$videourl();
        if (realmGet$videourl != null) {
            Table.nativeSetString(nativePtr, videoColumnInfo.videourlIndex, createRow, realmGet$videourl, false);
        } else {
            Table.nativeSetNull(nativePtr, videoColumnInfo.videourlIndex, createRow, false);
        }
        String realmGet$videourlpeg = ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmGet$videourlpeg();
        if (realmGet$videourlpeg != null) {
            Table.nativeSetString(nativePtr, videoColumnInfo.videourlpegIndex, createRow, realmGet$videourlpeg, false);
        } else {
            Table.nativeSetNull(nativePtr, videoColumnInfo.videourlpegIndex, createRow, false);
        }
        String realmGet$preview = ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmGet$preview();
        if (realmGet$preview != null) {
            Table.nativeSetString(nativePtr, videoColumnInfo.previewIndex, createRow, realmGet$preview, false);
        } else {
            Table.nativeSetNull(nativePtr, videoColumnInfo.previewIndex, createRow, false);
        }
        Double realmGet$ratio = ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmGet$ratio();
        if (realmGet$ratio != null) {
            Table.nativeSetDouble(nativePtr, videoColumnInfo.ratioIndex, createRow, realmGet$ratio.doubleValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, videoColumnInfo.ratioIndex, createRow, false);
        }
        Integer realmGet$main = ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmGet$main();
        if (realmGet$main != null) {
            Table.nativeSetLong(nativePtr, videoColumnInfo.mainIndex, createRow, realmGet$main.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, videoColumnInfo.mainIndex, createRow, false);
        }
        String realmGet$title = ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, videoColumnInfo.titleIndex, createRow, realmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, videoColumnInfo.titleIndex, createRow, false);
        }
        long j = nativePtr;
        long j2 = createRow;
        Table.nativeSetBoolean(j, videoColumnInfo.isFullscrennIndex, j2, ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmGet$isFullscrenn(), false);
        Table.nativeSetBoolean(j, videoColumnInfo.isHasArchiveIndex, j2, ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmGet$isHasArchive(), false);
        String realmGet$newArchiveUrl = ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmGet$newArchiveUrl();
        if (realmGet$newArchiveUrl != null) {
            Table.nativeSetString(nativePtr, videoColumnInfo.newArchiveUrlIndex, createRow, realmGet$newArchiveUrl, false);
        } else {
            Table.nativeSetNull(nativePtr, videoColumnInfo.newArchiveUrlIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(C5788Video.class);
        long nativePtr = table.getNativePtr();
        VideoColumnInfo videoColumnInfo = (VideoColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) C5788Video.class);
        while (it.hasNext()) {
            C5788Video video = (C5788Video) it.next();
            if (!map2.containsKey(video)) {
                if (video instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) video;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(video, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(video, Long.valueOf(createRow));
                C4675x1f47e00c ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface = video;
                String realmGet$id = ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmGet$id();
                if (realmGet$id != null) {
                    Table.nativeSetString(nativePtr, videoColumnInfo.idIndex, createRow, realmGet$id, false);
                } else {
                    Table.nativeSetNull(nativePtr, videoColumnInfo.idIndex, createRow, false);
                }
                String realmGet$videourl = ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmGet$videourl();
                if (realmGet$videourl != null) {
                    Table.nativeSetString(nativePtr, videoColumnInfo.videourlIndex, createRow, realmGet$videourl, false);
                } else {
                    Table.nativeSetNull(nativePtr, videoColumnInfo.videourlIndex, createRow, false);
                }
                String realmGet$videourlpeg = ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmGet$videourlpeg();
                if (realmGet$videourlpeg != null) {
                    Table.nativeSetString(nativePtr, videoColumnInfo.videourlpegIndex, createRow, realmGet$videourlpeg, false);
                } else {
                    Table.nativeSetNull(nativePtr, videoColumnInfo.videourlpegIndex, createRow, false);
                }
                String realmGet$preview = ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmGet$preview();
                if (realmGet$preview != null) {
                    Table.nativeSetString(nativePtr, videoColumnInfo.previewIndex, createRow, realmGet$preview, false);
                } else {
                    Table.nativeSetNull(nativePtr, videoColumnInfo.previewIndex, createRow, false);
                }
                Double realmGet$ratio = ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmGet$ratio();
                if (realmGet$ratio != null) {
                    Table.nativeSetDouble(nativePtr, videoColumnInfo.ratioIndex, createRow, realmGet$ratio.doubleValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, videoColumnInfo.ratioIndex, createRow, false);
                }
                Integer realmGet$main = ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmGet$main();
                if (realmGet$main != null) {
                    Table.nativeSetLong(nativePtr, videoColumnInfo.mainIndex, createRow, realmGet$main.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, videoColumnInfo.mainIndex, createRow, false);
                }
                String realmGet$title = ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, videoColumnInfo.titleIndex, createRow, realmGet$title, false);
                } else {
                    Table.nativeSetNull(nativePtr, videoColumnInfo.titleIndex, createRow, false);
                }
                long j = nativePtr;
                long j2 = createRow;
                Table.nativeSetBoolean(j, videoColumnInfo.isFullscrennIndex, j2, ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmGet$isFullscrenn(), false);
                Table.nativeSetBoolean(j, videoColumnInfo.isHasArchiveIndex, j2, ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmGet$isHasArchive(), false);
                String realmGet$newArchiveUrl = ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmGet$newArchiveUrl();
                if (realmGet$newArchiveUrl != null) {
                    Table.nativeSetString(nativePtr, videoColumnInfo.newArchiveUrlIndex, createRow, realmGet$newArchiveUrl, false);
                } else {
                    Table.nativeSetNull(nativePtr, videoColumnInfo.newArchiveUrlIndex, createRow, false);
                }
            }
        }
    }

    public static C5788Video createDetachedCopy(C5788Video video, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        C5788Video video2;
        if (i > i2 || video == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(video);
        if (cacheData == null) {
            video2 = new C5788Video();
            map.put(video, new RealmObjectProxy.CacheData(i, video2));
        } else if (i >= cacheData.minDepth) {
            return (C5788Video) cacheData.object;
        } else {
            cacheData.minDepth = i;
            video2 = (C5788Video) cacheData.object;
        }
        C4675x1f47e00c ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface = video2;
        C4675x1f47e00c ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface2 = video;
        ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmSet$id(ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmSet$videourl(ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface2.realmGet$videourl());
        ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmSet$videourlpeg(ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface2.realmGet$videourlpeg());
        ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmSet$preview(ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface2.realmGet$preview());
        ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmSet$ratio(ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface2.realmGet$ratio());
        ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmSet$main(ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface2.realmGet$main());
        ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmSet$title(ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface2.realmGet$title());
        ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmSet$isFullscrenn(ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface2.realmGet$isFullscrenn());
        ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmSet$isHasArchive(ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface2.realmGet$isHasArchive());
        ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface.realmSet$newArchiveUrl(ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxyinterface2.realmGet$newArchiveUrl());
        return video2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("Video = proxy[");
        sb.append("{id:");
        String str = "null";
        sb.append(realmGet$id() != null ? realmGet$id() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{videourl:");
        sb.append(realmGet$videourl() != null ? realmGet$videourl() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{videourlpeg:");
        sb.append(realmGet$videourlpeg() != null ? realmGet$videourlpeg() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{preview:");
        sb.append(realmGet$preview() != null ? realmGet$preview() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{ratio:");
        sb.append(realmGet$ratio() != null ? realmGet$ratio() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{main:");
        sb.append(realmGet$main() != null ? realmGet$main() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{title:");
        if (realmGet$title() != null) {
            str = realmGet$title();
        }
        sb.append(str);
        sb.append("}");
        sb.append(",");
        sb.append("{isFullscrenn:");
        sb.append(realmGet$isFullscrenn());
        sb.append("}");
        sb.append(",");
        sb.append("{isHasArchive:");
        sb.append(realmGet$isHasArchive());
        sb.append("}");
        sb.append(",");
        sb.append("{newArchiveUrl:");
        sb.append(realmGet$newArchiveUrl());
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }

    public ProxyState<?> realmGet$proxyState() {
        return this.proxyState;
    }

    public int hashCode() {
        String path = this.proxyState.getRealm$realm().getPath();
        String name = this.proxyState.getRow$realm().getTable().getName();
        long index = this.proxyState.getRow$realm().getIndex();
        int i = 0;
        int hashCode = (527 + (path != null ? path.hashCode() : 0)) * 31;
        if (name != null) {
            i = name.hashCode();
        }
        return ((hashCode + i) * 31) + ((int) ((index >>> 32) ^ index));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C4674x1c4fffad ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxy = (C4674x1c4fffad) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_entity_video_videorealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
