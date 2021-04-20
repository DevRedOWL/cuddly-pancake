package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p035ru.unicorn.ujin.view.activity.navigation.api.SignalRemote;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_api_SignalRemoteRealmProxy */
public class C4639x6ab32465 extends SignalRemote implements RealmObjectProxy, C4640x38f68a54 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private SignalRemoteColumnInfo columnInfo;
    private ProxyState<SignalRemote> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_api_SignalRemoteRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "SignalRemote";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_api_SignalRemoteRealmProxy$SignalRemoteColumnInfo */
    static final class SignalRemoteColumnInfo extends ColumnInfo {
        long activeButtonImgIndex;
        long idIndex;
        long maxColumnIndexValue;
        long nameIndex;
        long readonlyLabelIndex;
        long readonlyValueIndex;
        long showSmallWindowIndex;
        long titleIndex;
        long typeControlIndex;
        long valueIndex;

        SignalRemoteColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(9);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.readonlyValueIndex = addColumnDetails("readonlyValue", "readonlyValue", objectSchemaInfo);
            this.readonlyLabelIndex = addColumnDetails("readonlyLabel", "readonlyLabel", objectSchemaInfo);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.nameIndex = addColumnDetails("name", "name", objectSchemaInfo);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.valueIndex = addColumnDetails("value", "value", objectSchemaInfo);
            this.typeControlIndex = addColumnDetails("typeControl", "typeControl", objectSchemaInfo);
            this.showSmallWindowIndex = addColumnDetails("showSmallWindow", "showSmallWindow", objectSchemaInfo);
            this.activeButtonImgIndex = addColumnDetails("activeButtonImg", "activeButtonImg", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        SignalRemoteColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new SignalRemoteColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            SignalRemoteColumnInfo signalRemoteColumnInfo = (SignalRemoteColumnInfo) columnInfo;
            SignalRemoteColumnInfo signalRemoteColumnInfo2 = (SignalRemoteColumnInfo) columnInfo2;
            signalRemoteColumnInfo2.readonlyValueIndex = signalRemoteColumnInfo.readonlyValueIndex;
            signalRemoteColumnInfo2.readonlyLabelIndex = signalRemoteColumnInfo.readonlyLabelIndex;
            signalRemoteColumnInfo2.idIndex = signalRemoteColumnInfo.idIndex;
            signalRemoteColumnInfo2.nameIndex = signalRemoteColumnInfo.nameIndex;
            signalRemoteColumnInfo2.titleIndex = signalRemoteColumnInfo.titleIndex;
            signalRemoteColumnInfo2.valueIndex = signalRemoteColumnInfo.valueIndex;
            signalRemoteColumnInfo2.typeControlIndex = signalRemoteColumnInfo.typeControlIndex;
            signalRemoteColumnInfo2.showSmallWindowIndex = signalRemoteColumnInfo.showSmallWindowIndex;
            signalRemoteColumnInfo2.activeButtonImgIndex = signalRemoteColumnInfo.activeButtonImgIndex;
            signalRemoteColumnInfo2.maxColumnIndexValue = signalRemoteColumnInfo.maxColumnIndexValue;
        }
    }

    C4639x6ab32465() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (SignalRemoteColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public Integer realmGet$readonlyValue() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.readonlyValueIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.readonlyValueIndex));
    }

    public void realmSet$readonlyValue(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.readonlyValueIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.readonlyValueIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.readonlyValueIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.readonlyValueIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public Integer realmGet$readonlyLabel() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.readonlyLabelIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.readonlyLabelIndex));
    }

    public void realmSet$readonlyLabel(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.readonlyLabelIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.readonlyLabelIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.readonlyLabelIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.readonlyLabelIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
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

    public String realmGet$name() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.nameIndex);
    }

    public void realmSet$name(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.nameIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.nameIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.nameIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.nameIndex, row$realm.getIndex(), str, true);
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

    public String realmGet$value() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.valueIndex);
    }

    public void realmSet$value(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.valueIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.valueIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.valueIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.valueIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$typeControl() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.typeControlIndex);
    }

    public void realmSet$typeControl(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.typeControlIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.typeControlIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.typeControlIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.typeControlIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public Integer realmGet$showSmallWindow() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.showSmallWindowIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.showSmallWindowIndex));
    }

    public void realmSet$showSmallWindow(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.showSmallWindowIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.showSmallWindowIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.showSmallWindowIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.showSmallWindowIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public String realmGet$activeButtonImg() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.activeButtonImgIndex);
    }

    public void realmSet$activeButtonImg(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.activeButtonImgIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.activeButtonImgIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.activeButtonImgIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.activeButtonImgIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 9, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("readonlyValue", RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty("readonlyLabel", RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty("id", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("name", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("title", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("value", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("typeControl", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("showSmallWindow", RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty("activeButtonImg", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static SignalRemoteColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new SignalRemoteColumnInfo(osSchemaInfo);
    }

    public static SignalRemote createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        SignalRemote signalRemote = (SignalRemote) realm.createObjectInternal(SignalRemote.class, true, Collections.emptyList());
        C4640x38f68a54 ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface = signalRemote;
        if (jSONObject.has("readonlyValue")) {
            if (jSONObject.isNull("readonlyValue")) {
                ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmSet$readonlyValue((Integer) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmSet$readonlyValue(Integer.valueOf(jSONObject.getInt("readonlyValue")));
            }
        }
        if (jSONObject.has("readonlyLabel")) {
            if (jSONObject.isNull("readonlyLabel")) {
                ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmSet$readonlyLabel((Integer) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmSet$readonlyLabel(Integer.valueOf(jSONObject.getInt("readonlyLabel")));
            }
        }
        if (jSONObject.has("id")) {
            if (jSONObject.isNull("id")) {
                ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmSet$id((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmSet$id(jSONObject.getString("id"));
            }
        }
        if (jSONObject.has("name")) {
            if (jSONObject.isNull("name")) {
                ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmSet$name((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmSet$name(jSONObject.getString("name"));
            }
        }
        if (jSONObject.has("title")) {
            if (jSONObject.isNull("title")) {
                ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmSet$title((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmSet$title(jSONObject.getString("title"));
            }
        }
        if (jSONObject.has("value")) {
            if (jSONObject.isNull("value")) {
                ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmSet$value((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmSet$value(jSONObject.getString("value"));
            }
        }
        if (jSONObject.has("typeControl")) {
            if (jSONObject.isNull("typeControl")) {
                ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmSet$typeControl((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmSet$typeControl(jSONObject.getString("typeControl"));
            }
        }
        if (jSONObject.has("showSmallWindow")) {
            if (jSONObject.isNull("showSmallWindow")) {
                ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmSet$showSmallWindow((Integer) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmSet$showSmallWindow(Integer.valueOf(jSONObject.getInt("showSmallWindow")));
            }
        }
        if (jSONObject.has("activeButtonImg")) {
            if (jSONObject.isNull("activeButtonImg")) {
                ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmSet$activeButtonImg((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmSet$activeButtonImg(jSONObject.getString("activeButtonImg"));
            }
        }
        return signalRemote;
    }

    public static SignalRemote createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        SignalRemote signalRemote = new SignalRemote();
        C4640x38f68a54 ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface = signalRemote;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("readonlyValue")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmSet$readonlyValue(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmSet$readonlyValue((Integer) null);
                }
            } else if (nextName.equals("readonlyLabel")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmSet$readonlyLabel(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmSet$readonlyLabel((Integer) null);
                }
            } else if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmSet$id(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmSet$id((String) null);
                }
            } else if (nextName.equals("name")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmSet$name(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmSet$name((String) null);
                }
            } else if (nextName.equals("title")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmSet$title(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmSet$title((String) null);
                }
            } else if (nextName.equals("value")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmSet$value(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmSet$value((String) null);
                }
            } else if (nextName.equals("typeControl")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmSet$typeControl(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmSet$typeControl((String) null);
                }
            } else if (nextName.equals("showSmallWindow")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmSet$showSmallWindow(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmSet$showSmallWindow((Integer) null);
                }
            } else if (!nextName.equals("activeButtonImg")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmSet$activeButtonImg(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmSet$activeButtonImg((String) null);
            }
        }
        jsonReader.endObject();
        return (SignalRemote) realm.copyToRealm(signalRemote, new ImportFlag[0]);
    }

    private static C4639x6ab32465 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) SignalRemote.class), false, Collections.emptyList());
        C4639x6ab32465 ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxy = new C4639x6ab32465();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxy;
    }

    public static SignalRemote copyOrUpdate(Realm realm, SignalRemoteColumnInfo signalRemoteColumnInfo, SignalRemote signalRemote, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (signalRemote instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) signalRemote;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return signalRemote;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(signalRemote);
        if (realmObjectProxy2 != null) {
            return (SignalRemote) realmObjectProxy2;
        }
        return copy(realm, signalRemoteColumnInfo, signalRemote, z, map, set);
    }

    public static SignalRemote copy(Realm realm, SignalRemoteColumnInfo signalRemoteColumnInfo, SignalRemote signalRemote, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(signalRemote);
        if (realmObjectProxy != null) {
            return (SignalRemote) realmObjectProxy;
        }
        C4640x38f68a54 ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface = signalRemote;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(SignalRemote.class), signalRemoteColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(signalRemoteColumnInfo.readonlyValueIndex, ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmGet$readonlyValue());
        osObjectBuilder.addInteger(signalRemoteColumnInfo.readonlyLabelIndex, ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmGet$readonlyLabel());
        osObjectBuilder.addString(signalRemoteColumnInfo.idIndex, ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmGet$id());
        osObjectBuilder.addString(signalRemoteColumnInfo.nameIndex, ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmGet$name());
        osObjectBuilder.addString(signalRemoteColumnInfo.titleIndex, ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmGet$title());
        osObjectBuilder.addString(signalRemoteColumnInfo.valueIndex, ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmGet$value());
        osObjectBuilder.addString(signalRemoteColumnInfo.typeControlIndex, ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmGet$typeControl());
        osObjectBuilder.addInteger(signalRemoteColumnInfo.showSmallWindowIndex, ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmGet$showSmallWindow());
        osObjectBuilder.addString(signalRemoteColumnInfo.activeButtonImgIndex, ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmGet$activeButtonImg());
        C4639x6ab32465 newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(signalRemote, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, SignalRemote signalRemote, Map<RealmModel, Long> map) {
        SignalRemote signalRemote2 = signalRemote;
        if (signalRemote2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) signalRemote2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(SignalRemote.class);
        long nativePtr = table.getNativePtr();
        SignalRemoteColumnInfo signalRemoteColumnInfo = (SignalRemoteColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SignalRemote.class);
        long createRow = OsObject.createRow(table);
        map.put(signalRemote2, Long.valueOf(createRow));
        C4640x38f68a54 ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface = signalRemote2;
        Integer realmGet$readonlyValue = ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmGet$readonlyValue();
        if (realmGet$readonlyValue != null) {
            Table.nativeSetLong(nativePtr, signalRemoteColumnInfo.readonlyValueIndex, createRow, realmGet$readonlyValue.longValue(), false);
        }
        Integer realmGet$readonlyLabel = ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmGet$readonlyLabel();
        if (realmGet$readonlyLabel != null) {
            Table.nativeSetLong(nativePtr, signalRemoteColumnInfo.readonlyLabelIndex, createRow, realmGet$readonlyLabel.longValue(), false);
        }
        String realmGet$id = ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetString(nativePtr, signalRemoteColumnInfo.idIndex, createRow, realmGet$id, false);
        }
        String realmGet$name = ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, signalRemoteColumnInfo.nameIndex, createRow, realmGet$name, false);
        }
        String realmGet$title = ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, signalRemoteColumnInfo.titleIndex, createRow, realmGet$title, false);
        }
        String realmGet$value = ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmGet$value();
        if (realmGet$value != null) {
            Table.nativeSetString(nativePtr, signalRemoteColumnInfo.valueIndex, createRow, realmGet$value, false);
        }
        String realmGet$typeControl = ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmGet$typeControl();
        if (realmGet$typeControl != null) {
            Table.nativeSetString(nativePtr, signalRemoteColumnInfo.typeControlIndex, createRow, realmGet$typeControl, false);
        }
        Integer realmGet$showSmallWindow = ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmGet$showSmallWindow();
        if (realmGet$showSmallWindow != null) {
            Table.nativeSetLong(nativePtr, signalRemoteColumnInfo.showSmallWindowIndex, createRow, realmGet$showSmallWindow.longValue(), false);
        }
        String realmGet$activeButtonImg = ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmGet$activeButtonImg();
        if (realmGet$activeButtonImg != null) {
            Table.nativeSetString(nativePtr, signalRemoteColumnInfo.activeButtonImgIndex, createRow, realmGet$activeButtonImg, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(SignalRemote.class);
        long nativePtr = table.getNativePtr();
        SignalRemoteColumnInfo signalRemoteColumnInfo = (SignalRemoteColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SignalRemote.class);
        while (it.hasNext()) {
            SignalRemote signalRemote = (SignalRemote) it.next();
            if (!map2.containsKey(signalRemote)) {
                if (signalRemote instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) signalRemote;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(signalRemote, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(signalRemote, Long.valueOf(createRow));
                C4640x38f68a54 ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface = signalRemote;
                Integer realmGet$readonlyValue = ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmGet$readonlyValue();
                if (realmGet$readonlyValue != null) {
                    Table.nativeSetLong(nativePtr, signalRemoteColumnInfo.readonlyValueIndex, createRow, realmGet$readonlyValue.longValue(), false);
                }
                Integer realmGet$readonlyLabel = ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmGet$readonlyLabel();
                if (realmGet$readonlyLabel != null) {
                    Table.nativeSetLong(nativePtr, signalRemoteColumnInfo.readonlyLabelIndex, createRow, realmGet$readonlyLabel.longValue(), false);
                }
                String realmGet$id = ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmGet$id();
                if (realmGet$id != null) {
                    Table.nativeSetString(nativePtr, signalRemoteColumnInfo.idIndex, createRow, realmGet$id, false);
                }
                String realmGet$name = ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmGet$name();
                if (realmGet$name != null) {
                    Table.nativeSetString(nativePtr, signalRemoteColumnInfo.nameIndex, createRow, realmGet$name, false);
                }
                String realmGet$title = ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, signalRemoteColumnInfo.titleIndex, createRow, realmGet$title, false);
                }
                String realmGet$value = ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmGet$value();
                if (realmGet$value != null) {
                    Table.nativeSetString(nativePtr, signalRemoteColumnInfo.valueIndex, createRow, realmGet$value, false);
                }
                String realmGet$typeControl = ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmGet$typeControl();
                if (realmGet$typeControl != null) {
                    Table.nativeSetString(nativePtr, signalRemoteColumnInfo.typeControlIndex, createRow, realmGet$typeControl, false);
                }
                Integer realmGet$showSmallWindow = ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmGet$showSmallWindow();
                if (realmGet$showSmallWindow != null) {
                    Table.nativeSetLong(nativePtr, signalRemoteColumnInfo.showSmallWindowIndex, createRow, realmGet$showSmallWindow.longValue(), false);
                }
                String realmGet$activeButtonImg = ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmGet$activeButtonImg();
                if (realmGet$activeButtonImg != null) {
                    Table.nativeSetString(nativePtr, signalRemoteColumnInfo.activeButtonImgIndex, createRow, realmGet$activeButtonImg, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, SignalRemote signalRemote, Map<RealmModel, Long> map) {
        SignalRemote signalRemote2 = signalRemote;
        if (signalRemote2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) signalRemote2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(SignalRemote.class);
        long nativePtr = table.getNativePtr();
        SignalRemoteColumnInfo signalRemoteColumnInfo = (SignalRemoteColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SignalRemote.class);
        long createRow = OsObject.createRow(table);
        map.put(signalRemote2, Long.valueOf(createRow));
        C4640x38f68a54 ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface = signalRemote2;
        Integer realmGet$readonlyValue = ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmGet$readonlyValue();
        if (realmGet$readonlyValue != null) {
            Table.nativeSetLong(nativePtr, signalRemoteColumnInfo.readonlyValueIndex, createRow, realmGet$readonlyValue.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, signalRemoteColumnInfo.readonlyValueIndex, createRow, false);
        }
        Integer realmGet$readonlyLabel = ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmGet$readonlyLabel();
        if (realmGet$readonlyLabel != null) {
            Table.nativeSetLong(nativePtr, signalRemoteColumnInfo.readonlyLabelIndex, createRow, realmGet$readonlyLabel.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, signalRemoteColumnInfo.readonlyLabelIndex, createRow, false);
        }
        String realmGet$id = ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetString(nativePtr, signalRemoteColumnInfo.idIndex, createRow, realmGet$id, false);
        } else {
            Table.nativeSetNull(nativePtr, signalRemoteColumnInfo.idIndex, createRow, false);
        }
        String realmGet$name = ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, signalRemoteColumnInfo.nameIndex, createRow, realmGet$name, false);
        } else {
            Table.nativeSetNull(nativePtr, signalRemoteColumnInfo.nameIndex, createRow, false);
        }
        String realmGet$title = ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, signalRemoteColumnInfo.titleIndex, createRow, realmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, signalRemoteColumnInfo.titleIndex, createRow, false);
        }
        String realmGet$value = ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmGet$value();
        if (realmGet$value != null) {
            Table.nativeSetString(nativePtr, signalRemoteColumnInfo.valueIndex, createRow, realmGet$value, false);
        } else {
            Table.nativeSetNull(nativePtr, signalRemoteColumnInfo.valueIndex, createRow, false);
        }
        String realmGet$typeControl = ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmGet$typeControl();
        if (realmGet$typeControl != null) {
            Table.nativeSetString(nativePtr, signalRemoteColumnInfo.typeControlIndex, createRow, realmGet$typeControl, false);
        } else {
            Table.nativeSetNull(nativePtr, signalRemoteColumnInfo.typeControlIndex, createRow, false);
        }
        Integer realmGet$showSmallWindow = ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmGet$showSmallWindow();
        if (realmGet$showSmallWindow != null) {
            Table.nativeSetLong(nativePtr, signalRemoteColumnInfo.showSmallWindowIndex, createRow, realmGet$showSmallWindow.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, signalRemoteColumnInfo.showSmallWindowIndex, createRow, false);
        }
        String realmGet$activeButtonImg = ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmGet$activeButtonImg();
        if (realmGet$activeButtonImg != null) {
            Table.nativeSetString(nativePtr, signalRemoteColumnInfo.activeButtonImgIndex, createRow, realmGet$activeButtonImg, false);
        } else {
            Table.nativeSetNull(nativePtr, signalRemoteColumnInfo.activeButtonImgIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(SignalRemote.class);
        long nativePtr = table.getNativePtr();
        SignalRemoteColumnInfo signalRemoteColumnInfo = (SignalRemoteColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SignalRemote.class);
        while (it.hasNext()) {
            SignalRemote signalRemote = (SignalRemote) it.next();
            if (!map2.containsKey(signalRemote)) {
                if (signalRemote instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) signalRemote;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(signalRemote, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(signalRemote, Long.valueOf(createRow));
                C4640x38f68a54 ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface = signalRemote;
                Integer realmGet$readonlyValue = ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmGet$readonlyValue();
                if (realmGet$readonlyValue != null) {
                    Table.nativeSetLong(nativePtr, signalRemoteColumnInfo.readonlyValueIndex, createRow, realmGet$readonlyValue.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, signalRemoteColumnInfo.readonlyValueIndex, createRow, false);
                }
                Integer realmGet$readonlyLabel = ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmGet$readonlyLabel();
                if (realmGet$readonlyLabel != null) {
                    Table.nativeSetLong(nativePtr, signalRemoteColumnInfo.readonlyLabelIndex, createRow, realmGet$readonlyLabel.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, signalRemoteColumnInfo.readonlyLabelIndex, createRow, false);
                }
                String realmGet$id = ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmGet$id();
                if (realmGet$id != null) {
                    Table.nativeSetString(nativePtr, signalRemoteColumnInfo.idIndex, createRow, realmGet$id, false);
                } else {
                    Table.nativeSetNull(nativePtr, signalRemoteColumnInfo.idIndex, createRow, false);
                }
                String realmGet$name = ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmGet$name();
                if (realmGet$name != null) {
                    Table.nativeSetString(nativePtr, signalRemoteColumnInfo.nameIndex, createRow, realmGet$name, false);
                } else {
                    Table.nativeSetNull(nativePtr, signalRemoteColumnInfo.nameIndex, createRow, false);
                }
                String realmGet$title = ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, signalRemoteColumnInfo.titleIndex, createRow, realmGet$title, false);
                } else {
                    Table.nativeSetNull(nativePtr, signalRemoteColumnInfo.titleIndex, createRow, false);
                }
                String realmGet$value = ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmGet$value();
                if (realmGet$value != null) {
                    Table.nativeSetString(nativePtr, signalRemoteColumnInfo.valueIndex, createRow, realmGet$value, false);
                } else {
                    Table.nativeSetNull(nativePtr, signalRemoteColumnInfo.valueIndex, createRow, false);
                }
                String realmGet$typeControl = ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmGet$typeControl();
                if (realmGet$typeControl != null) {
                    Table.nativeSetString(nativePtr, signalRemoteColumnInfo.typeControlIndex, createRow, realmGet$typeControl, false);
                } else {
                    Table.nativeSetNull(nativePtr, signalRemoteColumnInfo.typeControlIndex, createRow, false);
                }
                Integer realmGet$showSmallWindow = ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmGet$showSmallWindow();
                if (realmGet$showSmallWindow != null) {
                    Table.nativeSetLong(nativePtr, signalRemoteColumnInfo.showSmallWindowIndex, createRow, realmGet$showSmallWindow.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, signalRemoteColumnInfo.showSmallWindowIndex, createRow, false);
                }
                String realmGet$activeButtonImg = ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmGet$activeButtonImg();
                if (realmGet$activeButtonImg != null) {
                    Table.nativeSetString(nativePtr, signalRemoteColumnInfo.activeButtonImgIndex, createRow, realmGet$activeButtonImg, false);
                } else {
                    Table.nativeSetNull(nativePtr, signalRemoteColumnInfo.activeButtonImgIndex, createRow, false);
                }
            }
        }
    }

    public static SignalRemote createDetachedCopy(SignalRemote signalRemote, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        SignalRemote signalRemote2;
        if (i > i2 || signalRemote == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(signalRemote);
        if (cacheData == null) {
            signalRemote2 = new SignalRemote();
            map.put(signalRemote, new RealmObjectProxy.CacheData(i, signalRemote2));
        } else if (i >= cacheData.minDepth) {
            return (SignalRemote) cacheData.object;
        } else {
            cacheData.minDepth = i;
            signalRemote2 = (SignalRemote) cacheData.object;
        }
        C4640x38f68a54 ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface = signalRemote2;
        C4640x38f68a54 ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface2 = signalRemote;
        ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmSet$readonlyValue(ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface2.realmGet$readonlyValue());
        ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmSet$readonlyLabel(ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface2.realmGet$readonlyLabel());
        ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmSet$id(ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmSet$name(ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface2.realmGet$name());
        ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmSet$title(ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface2.realmGet$title());
        ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmSet$value(ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface2.realmGet$value());
        ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmSet$typeControl(ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface2.realmGet$typeControl());
        ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmSet$showSmallWindow(ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface2.realmGet$showSmallWindow());
        ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface.realmSet$activeButtonImg(ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxyinterface2.realmGet$activeButtonImg());
        return signalRemote2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("SignalRemote = proxy[");
        sb.append("{readonlyValue:");
        String str = "null";
        sb.append(realmGet$readonlyValue() != null ? realmGet$readonlyValue() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{readonlyLabel:");
        sb.append(realmGet$readonlyLabel() != null ? realmGet$readonlyLabel() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{id:");
        sb.append(realmGet$id() != null ? realmGet$id() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{name:");
        sb.append(realmGet$name() != null ? realmGet$name() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{title:");
        sb.append(realmGet$title() != null ? realmGet$title() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{value:");
        sb.append(realmGet$value() != null ? realmGet$value() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{typeControl:");
        sb.append(realmGet$typeControl() != null ? realmGet$typeControl() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{showSmallWindow:");
        sb.append(realmGet$showSmallWindow() != null ? realmGet$showSmallWindow() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{activeButtonImg:");
        if (realmGet$activeButtonImg() != null) {
            str = realmGet$activeButtonImg();
        }
        sb.append(str);
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
        C4639x6ab32465 ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxy = (C4639x6ab32465) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_api_signalremoterealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
