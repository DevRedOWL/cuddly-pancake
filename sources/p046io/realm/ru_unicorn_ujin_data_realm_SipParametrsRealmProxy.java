package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.data.realm.SipOpenDoorParam;
import p035ru.unicorn.ujin.data.realm.SipParametrs;
import p035ru.unicorn.ujin.data.realm.SipPreviewParams;
import p046io.realm.BaseRealm;
import p046io.realm.exceptions.RealmException;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;
import p046io.realm.ru_unicorn_ujin_data_realm_SipOpenDoorParamRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_SipPreviewParamsRealmProxy;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_SipParametrsRealmProxy */
public class ru_unicorn_ujin_data_realm_SipParametrsRealmProxy extends SipParametrs implements RealmObjectProxy, ru_unicorn_ujin_data_realm_SipParametrsRealmProxyInterface {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private SipParametrsColumnInfo columnInfo;
    private ProxyState<SipParametrs> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_SipParametrsRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "SipParametrs";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_SipParametrsRealmProxy$SipParametrsColumnInfo */
    static final class SipParametrsColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long openDoorParamIndex;
        long previewParamsIndex;
        long sipCodecAudioIndex;
        long sipCodecVideoIndex;
        long sipDomainIndex;
        long sipPasswordIndex;
        long sipPortIndex;
        long sipProxyIndex;
        long sipProxyPortIndex;
        long sipTransportIndex;
        long sipUserIndex;
        long videoSourceIndex;

        SipParametrsColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(12);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.sipUserIndex = addColumnDetails("sipUser", "sipUser", objectSchemaInfo);
            this.sipPasswordIndex = addColumnDetails("sipPassword", "sipPassword", objectSchemaInfo);
            this.sipPortIndex = addColumnDetails("sipPort", "sipPort", objectSchemaInfo);
            this.sipDomainIndex = addColumnDetails("sipDomain", "sipDomain", objectSchemaInfo);
            this.sipProxyIndex = addColumnDetails("sipProxy", "sipProxy", objectSchemaInfo);
            this.sipProxyPortIndex = addColumnDetails("sipProxyPort", "sipProxyPort", objectSchemaInfo);
            this.sipCodecAudioIndex = addColumnDetails("sipCodecAudio", "sipCodecAudio", objectSchemaInfo);
            this.sipCodecVideoIndex = addColumnDetails("sipCodecVideo", "sipCodecVideo", objectSchemaInfo);
            this.videoSourceIndex = addColumnDetails("videoSource", "videoSource", objectSchemaInfo);
            this.sipTransportIndex = addColumnDetails("sipTransport", "sipTransport", objectSchemaInfo);
            this.previewParamsIndex = addColumnDetails("previewParams", "previewParams", objectSchemaInfo);
            this.openDoorParamIndex = addColumnDetails("openDoorParam", "openDoorParam", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        SipParametrsColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new SipParametrsColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            SipParametrsColumnInfo sipParametrsColumnInfo = (SipParametrsColumnInfo) columnInfo;
            SipParametrsColumnInfo sipParametrsColumnInfo2 = (SipParametrsColumnInfo) columnInfo2;
            sipParametrsColumnInfo2.sipUserIndex = sipParametrsColumnInfo.sipUserIndex;
            sipParametrsColumnInfo2.sipPasswordIndex = sipParametrsColumnInfo.sipPasswordIndex;
            sipParametrsColumnInfo2.sipPortIndex = sipParametrsColumnInfo.sipPortIndex;
            sipParametrsColumnInfo2.sipDomainIndex = sipParametrsColumnInfo.sipDomainIndex;
            sipParametrsColumnInfo2.sipProxyIndex = sipParametrsColumnInfo.sipProxyIndex;
            sipParametrsColumnInfo2.sipProxyPortIndex = sipParametrsColumnInfo.sipProxyPortIndex;
            sipParametrsColumnInfo2.sipCodecAudioIndex = sipParametrsColumnInfo.sipCodecAudioIndex;
            sipParametrsColumnInfo2.sipCodecVideoIndex = sipParametrsColumnInfo.sipCodecVideoIndex;
            sipParametrsColumnInfo2.videoSourceIndex = sipParametrsColumnInfo.videoSourceIndex;
            sipParametrsColumnInfo2.sipTransportIndex = sipParametrsColumnInfo.sipTransportIndex;
            sipParametrsColumnInfo2.previewParamsIndex = sipParametrsColumnInfo.previewParamsIndex;
            sipParametrsColumnInfo2.openDoorParamIndex = sipParametrsColumnInfo.openDoorParamIndex;
            sipParametrsColumnInfo2.maxColumnIndexValue = sipParametrsColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_SipParametrsRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (SipParametrsColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public Integer realmGet$sipUser() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.sipUserIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.sipUserIndex));
    }

    public void realmSet$sipUser(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            throw new RealmException("Primary key field 'sipUser' cannot be changed after object was created.");
        }
    }

    public String realmGet$sipPassword() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.sipPasswordIndex);
    }

    public void realmSet$sipPassword(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.sipPasswordIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.sipPasswordIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.sipPasswordIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.sipPasswordIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public Integer realmGet$sipPort() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.sipPortIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.sipPortIndex));
    }

    public void realmSet$sipPort(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.sipPortIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.sipPortIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.sipPortIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.sipPortIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public String realmGet$sipDomain() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.sipDomainIndex);
    }

    public void realmSet$sipDomain(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.sipDomainIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.sipDomainIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.sipDomainIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.sipDomainIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$sipProxy() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.sipProxyIndex);
    }

    public void realmSet$sipProxy(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.sipProxyIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.sipProxyIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.sipProxyIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.sipProxyIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public Integer realmGet$sipProxyPort() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.sipProxyPortIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.sipProxyPortIndex));
    }

    public void realmSet$sipProxyPort(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.sipProxyPortIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.sipProxyPortIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.sipProxyPortIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.sipProxyPortIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public String realmGet$sipCodecAudio() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.sipCodecAudioIndex);
    }

    public void realmSet$sipCodecAudio(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.sipCodecAudioIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.sipCodecAudioIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.sipCodecAudioIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.sipCodecAudioIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$sipCodecVideo() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.sipCodecVideoIndex);
    }

    public void realmSet$sipCodecVideo(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.sipCodecVideoIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.sipCodecVideoIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.sipCodecVideoIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.sipCodecVideoIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$videoSource() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.videoSourceIndex);
    }

    public void realmSet$videoSource(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.videoSourceIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.videoSourceIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.videoSourceIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.videoSourceIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$sipTransport() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.sipTransportIndex);
    }

    public void realmSet$sipTransport(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.sipTransportIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.sipTransportIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.sipTransportIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.sipTransportIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public SipPreviewParams realmGet$previewParams() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.previewParamsIndex)) {
            return null;
        }
        return (SipPreviewParams) this.proxyState.getRealm$realm().get(SipPreviewParams.class, this.proxyState.getRow$realm().getLink(this.columnInfo.previewParamsIndex), false, Collections.emptyList());
    }

    public void realmSet$previewParams(SipPreviewParams sipPreviewParams) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (sipPreviewParams == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.previewParamsIndex);
                return;
            }
            this.proxyState.checkValidObject(sipPreviewParams);
            this.proxyState.getRow$realm().setLink(this.columnInfo.previewParamsIndex, ((RealmObjectProxy) sipPreviewParams).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("previewParams")) {
            if (sipPreviewParams != null && !RealmObject.isManaged(sipPreviewParams)) {
                sipPreviewParams = (SipPreviewParams) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(sipPreviewParams, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (sipPreviewParams == null) {
                row$realm.nullifyLink(this.columnInfo.previewParamsIndex);
                return;
            }
            this.proxyState.checkValidObject(sipPreviewParams);
            row$realm.getTable().setLink(this.columnInfo.previewParamsIndex, row$realm.getIndex(), ((RealmObjectProxy) sipPreviewParams).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public SipOpenDoorParam realmGet$openDoorParam() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.openDoorParamIndex)) {
            return null;
        }
        return (SipOpenDoorParam) this.proxyState.getRealm$realm().get(SipOpenDoorParam.class, this.proxyState.getRow$realm().getLink(this.columnInfo.openDoorParamIndex), false, Collections.emptyList());
    }

    public void realmSet$openDoorParam(SipOpenDoorParam sipOpenDoorParam) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (sipOpenDoorParam == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.openDoorParamIndex);
                return;
            }
            this.proxyState.checkValidObject(sipOpenDoorParam);
            this.proxyState.getRow$realm().setLink(this.columnInfo.openDoorParamIndex, ((RealmObjectProxy) sipOpenDoorParam).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("openDoorParam")) {
            if (sipOpenDoorParam != null && !RealmObject.isManaged(sipOpenDoorParam)) {
                sipOpenDoorParam = (SipOpenDoorParam) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(sipOpenDoorParam, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (sipOpenDoorParam == null) {
                row$realm.nullifyLink(this.columnInfo.openDoorParamIndex);
                return;
            }
            this.proxyState.checkValidObject(sipOpenDoorParam);
            row$realm.getTable().setLink(this.columnInfo.openDoorParamIndex, row$realm.getIndex(), ((RealmObjectProxy) sipOpenDoorParam).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 12, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("sipUser", RealmFieldType.INTEGER, true, true, false);
        builder2.addPersistedProperty("sipPassword", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("sipPort", RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty("sipDomain", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("sipProxy", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("sipProxyPort", RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty("sipCodecAudio", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("sipCodecVideo", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("videoSource", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("sipTransport", RealmFieldType.STRING, false, false, false);
        builder.addPersistedLinkProperty("previewParams", RealmFieldType.OBJECT, ru_unicorn_ujin_data_realm_SipPreviewParamsRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty("openDoorParam", RealmFieldType.OBJECT, ru_unicorn_ujin_data_realm_SipOpenDoorParamRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static SipParametrsColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new SipParametrsColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [io.realm.RealmModel] */
    /* JADX WARNING: type inference failed for: r0v4, types: [io.realm.RealmModel] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.SipParametrs createOrUpdateUsingJsonObject(p046io.realm.Realm r13, org.json.JSONObject r14, boolean r15) throws org.json.JSONException {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 2
            r0.<init>(r1)
            java.lang.String r1 = "sipUser"
            r2 = 0
            if (r15 == 0) goto L_0x0066
            java.lang.Class<ru.unicorn.ujin.data.realm.SipParametrs> r3 = p035ru.unicorn.ujin.data.realm.SipParametrs.class
            io.realm.internal.Table r3 = r13.getTable(r3)
            io.realm.RealmSchema r4 = r13.getSchema()
            java.lang.Class<ru.unicorn.ujin.data.realm.SipParametrs> r5 = p035ru.unicorn.ujin.data.realm.SipParametrs.class
            io.realm.internal.ColumnInfo r4 = r4.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r5)
            io.realm.ru_unicorn_ujin_data_realm_SipParametrsRealmProxy$SipParametrsColumnInfo r4 = (p046io.realm.ru_unicorn_ujin_data_realm_SipParametrsRealmProxy.SipParametrsColumnInfo) r4
            long r4 = r4.sipUserIndex
            boolean r6 = r14.isNull(r1)
            if (r6 == 0) goto L_0x002a
            long r4 = r3.findFirstNull(r4)
            goto L_0x0032
        L_0x002a:
            long r6 = r14.getLong(r1)
            long r4 = r3.findFirstLong(r4, r6)
        L_0x0032:
            r6 = -1
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0066
            io.realm.BaseRealm$ThreadLocalRealmObjectContext r6 = p046io.realm.BaseRealm.objectContext
            java.lang.Object r6 = r6.get()
            io.realm.BaseRealm$RealmObjectContext r6 = (p046io.realm.BaseRealm.RealmObjectContext) r6
            io.realm.internal.UncheckedRow r9 = r3.getUncheckedRow(r4)     // Catch:{ all -> 0x0061 }
            io.realm.RealmSchema r3 = r13.getSchema()     // Catch:{ all -> 0x0061 }
            java.lang.Class<ru.unicorn.ujin.data.realm.SipParametrs> r4 = p035ru.unicorn.ujin.data.realm.SipParametrs.class
            io.realm.internal.ColumnInfo r10 = r3.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r4)     // Catch:{ all -> 0x0061 }
            r11 = 0
            java.util.List r12 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0061 }
            r7 = r6
            r8 = r13
            r7.set(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0061 }
            io.realm.ru_unicorn_ujin_data_realm_SipParametrsRealmProxy r3 = new io.realm.ru_unicorn_ujin_data_realm_SipParametrsRealmProxy     // Catch:{ all -> 0x0061 }
            r3.<init>()     // Catch:{ all -> 0x0061 }
            r6.clear()
            goto L_0x0067
        L_0x0061:
            r13 = move-exception
            r6.clear()
            throw r13
        L_0x0066:
            r3 = r2
        L_0x0067:
            java.lang.String r4 = "openDoorParam"
            java.lang.String r5 = "previewParams"
            if (r3 != 0) goto L_0x00b0
            boolean r3 = r14.has(r5)
            if (r3 == 0) goto L_0x0076
            r0.add(r5)
        L_0x0076:
            boolean r3 = r14.has(r4)
            if (r3 == 0) goto L_0x007f
            r0.add(r4)
        L_0x007f:
            boolean r3 = r14.has(r1)
            if (r3 == 0) goto L_0x00a8
            boolean r3 = r14.isNull(r1)
            r6 = 1
            if (r3 == 0) goto L_0x0096
            java.lang.Class<ru.unicorn.ujin.data.realm.SipParametrs> r1 = p035ru.unicorn.ujin.data.realm.SipParametrs.class
            io.realm.RealmModel r0 = r13.createObjectInternal(r1, r2, r6, r0)
            r3 = r0
            io.realm.ru_unicorn_ujin_data_realm_SipParametrsRealmProxy r3 = (p046io.realm.ru_unicorn_ujin_data_realm_SipParametrsRealmProxy) r3
            goto L_0x00b0
        L_0x0096:
            java.lang.Class<ru.unicorn.ujin.data.realm.SipParametrs> r3 = p035ru.unicorn.ujin.data.realm.SipParametrs.class
            int r1 = r14.getInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            io.realm.RealmModel r0 = r13.createObjectInternal(r3, r1, r6, r0)
            r3 = r0
            io.realm.ru_unicorn_ujin_data_realm_SipParametrsRealmProxy r3 = (p046io.realm.ru_unicorn_ujin_data_realm_SipParametrsRealmProxy) r3
            goto L_0x00b0
        L_0x00a8:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "JSON object doesn't have the primary key field 'sipUser'."
            r13.<init>(r14)
            throw r13
        L_0x00b0:
            r0 = r3
            io.realm.ru_unicorn_ujin_data_realm_SipParametrsRealmProxyInterface r0 = (p046io.realm.ru_unicorn_ujin_data_realm_SipParametrsRealmProxyInterface) r0
            java.lang.String r1 = "sipPassword"
            boolean r6 = r14.has(r1)
            if (r6 == 0) goto L_0x00cc
            boolean r6 = r14.isNull(r1)
            if (r6 == 0) goto L_0x00c5
            r0.realmSet$sipPassword(r2)
            goto L_0x00cc
        L_0x00c5:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$sipPassword(r1)
        L_0x00cc:
            java.lang.String r1 = "sipPort"
            boolean r6 = r14.has(r1)
            if (r6 == 0) goto L_0x00e9
            boolean r6 = r14.isNull(r1)
            if (r6 == 0) goto L_0x00de
            r0.realmSet$sipPort(r2)
            goto L_0x00e9
        L_0x00de:
            int r1 = r14.getInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.realmSet$sipPort(r1)
        L_0x00e9:
            java.lang.String r1 = "sipDomain"
            boolean r6 = r14.has(r1)
            if (r6 == 0) goto L_0x0102
            boolean r6 = r14.isNull(r1)
            if (r6 == 0) goto L_0x00fb
            r0.realmSet$sipDomain(r2)
            goto L_0x0102
        L_0x00fb:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$sipDomain(r1)
        L_0x0102:
            java.lang.String r1 = "sipProxy"
            boolean r6 = r14.has(r1)
            if (r6 == 0) goto L_0x011b
            boolean r6 = r14.isNull(r1)
            if (r6 == 0) goto L_0x0114
            r0.realmSet$sipProxy(r2)
            goto L_0x011b
        L_0x0114:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$sipProxy(r1)
        L_0x011b:
            java.lang.String r1 = "sipProxyPort"
            boolean r6 = r14.has(r1)
            if (r6 == 0) goto L_0x0138
            boolean r6 = r14.isNull(r1)
            if (r6 == 0) goto L_0x012d
            r0.realmSet$sipProxyPort(r2)
            goto L_0x0138
        L_0x012d:
            int r1 = r14.getInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.realmSet$sipProxyPort(r1)
        L_0x0138:
            java.lang.String r1 = "sipCodecAudio"
            boolean r6 = r14.has(r1)
            if (r6 == 0) goto L_0x0151
            boolean r6 = r14.isNull(r1)
            if (r6 == 0) goto L_0x014a
            r0.realmSet$sipCodecAudio(r2)
            goto L_0x0151
        L_0x014a:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$sipCodecAudio(r1)
        L_0x0151:
            java.lang.String r1 = "sipCodecVideo"
            boolean r6 = r14.has(r1)
            if (r6 == 0) goto L_0x016a
            boolean r6 = r14.isNull(r1)
            if (r6 == 0) goto L_0x0163
            r0.realmSet$sipCodecVideo(r2)
            goto L_0x016a
        L_0x0163:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$sipCodecVideo(r1)
        L_0x016a:
            java.lang.String r1 = "videoSource"
            boolean r6 = r14.has(r1)
            if (r6 == 0) goto L_0x0184
            boolean r6 = r14.isNull(r1)
            if (r6 == 0) goto L_0x017d
            r0.realmSet$videoSource(r2)
            goto L_0x0184
        L_0x017d:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$videoSource(r1)
        L_0x0184:
            java.lang.String r1 = "sipTransport"
            boolean r6 = r14.has(r1)
            if (r6 == 0) goto L_0x019d
            boolean r6 = r14.isNull(r1)
            if (r6 == 0) goto L_0x0196
            r0.realmSet$sipTransport(r2)
            goto L_0x019d
        L_0x0196:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$sipTransport(r1)
        L_0x019d:
            boolean r1 = r14.has(r5)
            if (r1 == 0) goto L_0x01b8
            boolean r1 = r14.isNull(r5)
            if (r1 == 0) goto L_0x01ad
            r0.realmSet$previewParams(r2)
            goto L_0x01b8
        L_0x01ad:
            org.json.JSONObject r1 = r14.getJSONObject(r5)
            ru.unicorn.ujin.data.realm.SipPreviewParams r1 = p046io.realm.ru_unicorn_ujin_data_realm_SipPreviewParamsRealmProxy.createOrUpdateUsingJsonObject(r13, r1, r15)
            r0.realmSet$previewParams(r1)
        L_0x01b8:
            boolean r1 = r14.has(r4)
            if (r1 == 0) goto L_0x01d3
            boolean r1 = r14.isNull(r4)
            if (r1 == 0) goto L_0x01c8
            r0.realmSet$openDoorParam(r2)
            goto L_0x01d3
        L_0x01c8:
            org.json.JSONObject r14 = r14.getJSONObject(r4)
            ru.unicorn.ujin.data.realm.SipOpenDoorParam r13 = p046io.realm.ru_unicorn_ujin_data_realm_SipOpenDoorParamRealmProxy.createOrUpdateUsingJsonObject(r13, r14, r15)
            r0.realmSet$openDoorParam(r13)
        L_0x01d3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_SipParametrsRealmProxy.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.data.realm.SipParametrs");
    }

    public static SipParametrs createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        SipParametrs sipParametrs = new SipParametrs();
        ru_unicorn_ujin_data_realm_SipParametrsRealmProxyInterface ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface = sipParametrs;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("sipUser")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmSet$sipUser(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmSet$sipUser((Integer) null);
                }
                z = true;
            } else if (nextName.equals("sipPassword")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmSet$sipPassword(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmSet$sipPassword((String) null);
                }
            } else if (nextName.equals("sipPort")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmSet$sipPort(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmSet$sipPort((Integer) null);
                }
            } else if (nextName.equals("sipDomain")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmSet$sipDomain(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmSet$sipDomain((String) null);
                }
            } else if (nextName.equals("sipProxy")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmSet$sipProxy(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmSet$sipProxy((String) null);
                }
            } else if (nextName.equals("sipProxyPort")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmSet$sipProxyPort(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmSet$sipProxyPort((Integer) null);
                }
            } else if (nextName.equals("sipCodecAudio")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmSet$sipCodecAudio(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmSet$sipCodecAudio((String) null);
                }
            } else if (nextName.equals("sipCodecVideo")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmSet$sipCodecVideo(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmSet$sipCodecVideo((String) null);
                }
            } else if (nextName.equals("videoSource")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmSet$videoSource(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmSet$videoSource((String) null);
                }
            } else if (nextName.equals("sipTransport")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmSet$sipTransport(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmSet$sipTransport((String) null);
                }
            } else if (nextName.equals("previewParams")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmSet$previewParams((SipPreviewParams) null);
                } else {
                    ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmSet$previewParams(ru_unicorn_ujin_data_realm_SipPreviewParamsRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
            } else if (!nextName.equals("openDoorParam")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmSet$openDoorParam((SipOpenDoorParam) null);
            } else {
                ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmSet$openDoorParam(ru_unicorn_ujin_data_realm_SipOpenDoorParamRealmProxy.createUsingJsonStream(realm, jsonReader));
            }
        }
        jsonReader.endObject();
        if (z) {
            return (SipParametrs) realm.copyToRealm(sipParametrs, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'sipUser'.");
    }

    private static ru_unicorn_ujin_data_realm_SipParametrsRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) SipParametrs.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_SipParametrsRealmProxy ru_unicorn_ujin_data_realm_sipparametrsrealmproxy = new ru_unicorn_ujin_data_realm_SipParametrsRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_sipparametrsrealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.SipParametrs copyOrUpdate(p046io.realm.Realm r8, p046io.realm.ru_unicorn_ujin_data_realm_SipParametrsRealmProxy.SipParametrsColumnInfo r9, p035ru.unicorn.ujin.data.realm.SipParametrs r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
        /*
            boolean r0 = r10 instanceof p046io.realm.internal.RealmObjectProxy
            if (r0 == 0) goto L_0x0038
            r0 = r10
            io.realm.internal.RealmObjectProxy r0 = (p046io.realm.internal.RealmObjectProxy) r0
            io.realm.ProxyState r1 = r0.realmGet$proxyState()
            io.realm.BaseRealm r1 = r1.getRealm$realm()
            if (r1 == 0) goto L_0x0038
            io.realm.ProxyState r0 = r0.realmGet$proxyState()
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            long r1 = r0.threadId
            long r3 = r8.threadId
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0030
            java.lang.String r0 = r0.getPath()
            java.lang.String r1 = r8.getPath()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0038
            return r10
        L_0x0030:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Objects which belong to Realm instances in other threads cannot be copied into this Realm instance."
            r8.<init>(r9)
            throw r8
        L_0x0038:
            io.realm.BaseRealm$ThreadLocalRealmObjectContext r0 = p046io.realm.BaseRealm.objectContext
            java.lang.Object r0 = r0.get()
            io.realm.BaseRealm$RealmObjectContext r0 = (p046io.realm.BaseRealm.RealmObjectContext) r0
            java.lang.Object r1 = r12.get(r10)
            io.realm.internal.RealmObjectProxy r1 = (p046io.realm.internal.RealmObjectProxy) r1
            if (r1 == 0) goto L_0x004b
            ru.unicorn.ujin.data.realm.SipParametrs r1 = (p035ru.unicorn.ujin.data.realm.SipParametrs) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0097
            java.lang.Class<ru.unicorn.ujin.data.realm.SipParametrs> r2 = p035ru.unicorn.ujin.data.realm.SipParametrs.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.sipUserIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_data_realm_SipParametrsRealmProxyInterface r5 = (p046io.realm.ru_unicorn_ujin_data_realm_SipParametrsRealmProxyInterface) r5
            java.lang.Integer r5 = r5.realmGet$sipUser()
            if (r5 != 0) goto L_0x0064
            long r3 = r2.findFirstNull(r3)
            goto L_0x006c
        L_0x0064:
            long r5 = r5.longValue()
            long r3 = r2.findFirstLong(r3, r5)
        L_0x006c:
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0074
            r0 = 0
            goto L_0x0098
        L_0x0074:
            io.realm.internal.UncheckedRow r3 = r2.getUncheckedRow(r3)     // Catch:{ all -> 0x0092 }
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0092 }
            r1 = r0
            r2 = r8
            r4 = r9
            r1.set(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0092 }
            io.realm.ru_unicorn_ujin_data_realm_SipParametrsRealmProxy r1 = new io.realm.ru_unicorn_ujin_data_realm_SipParametrsRealmProxy     // Catch:{ all -> 0x0092 }
            r1.<init>()     // Catch:{ all -> 0x0092 }
            r2 = r1
            io.realm.internal.RealmObjectProxy r2 = (p046io.realm.internal.RealmObjectProxy) r2     // Catch:{ all -> 0x0092 }
            r12.put(r10, r2)     // Catch:{ all -> 0x0092 }
            r0.clear()
            goto L_0x0097
        L_0x0092:
            r8 = move-exception
            r0.clear()
            throw r8
        L_0x0097:
            r0 = r11
        L_0x0098:
            r3 = r1
            if (r0 == 0) goto L_0x00a5
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r12
            r6 = r13
            ru.unicorn.ujin.data.realm.SipParametrs r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x00a9
        L_0x00a5:
            ru.unicorn.ujin.data.realm.SipParametrs r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x00a9:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_SipParametrsRealmProxy.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_data_realm_SipParametrsRealmProxy$SipParametrsColumnInfo, ru.unicorn.ujin.data.realm.SipParametrs, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.data.realm.SipParametrs");
    }

    public static SipParametrs copy(Realm realm, SipParametrsColumnInfo sipParametrsColumnInfo, SipParametrs sipParametrs, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(sipParametrs);
        if (realmObjectProxy != null) {
            return (SipParametrs) realmObjectProxy;
        }
        ru_unicorn_ujin_data_realm_SipParametrsRealmProxyInterface ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface = sipParametrs;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(SipParametrs.class), sipParametrsColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(sipParametrsColumnInfo.sipUserIndex, ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$sipUser());
        osObjectBuilder.addString(sipParametrsColumnInfo.sipPasswordIndex, ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$sipPassword());
        osObjectBuilder.addInteger(sipParametrsColumnInfo.sipPortIndex, ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$sipPort());
        osObjectBuilder.addString(sipParametrsColumnInfo.sipDomainIndex, ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$sipDomain());
        osObjectBuilder.addString(sipParametrsColumnInfo.sipProxyIndex, ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$sipProxy());
        osObjectBuilder.addInteger(sipParametrsColumnInfo.sipProxyPortIndex, ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$sipProxyPort());
        osObjectBuilder.addString(sipParametrsColumnInfo.sipCodecAudioIndex, ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$sipCodecAudio());
        osObjectBuilder.addString(sipParametrsColumnInfo.sipCodecVideoIndex, ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$sipCodecVideo());
        osObjectBuilder.addString(sipParametrsColumnInfo.videoSourceIndex, ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$videoSource());
        osObjectBuilder.addString(sipParametrsColumnInfo.sipTransportIndex, ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$sipTransport());
        ru_unicorn_ujin_data_realm_SipParametrsRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(sipParametrs, newProxyInstance);
        SipPreviewParams realmGet$previewParams = ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$previewParams();
        if (realmGet$previewParams == null) {
            newProxyInstance.realmSet$previewParams((SipPreviewParams) null);
        } else {
            SipPreviewParams sipPreviewParams = (SipPreviewParams) map.get(realmGet$previewParams);
            if (sipPreviewParams != null) {
                newProxyInstance.realmSet$previewParams(sipPreviewParams);
            } else {
                newProxyInstance.realmSet$previewParams(ru_unicorn_ujin_data_realm_SipPreviewParamsRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_SipPreviewParamsRealmProxy.SipPreviewParamsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SipPreviewParams.class), realmGet$previewParams, z, map, set));
            }
        }
        SipOpenDoorParam realmGet$openDoorParam = ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$openDoorParam();
        if (realmGet$openDoorParam == null) {
            newProxyInstance.realmSet$openDoorParam((SipOpenDoorParam) null);
        } else {
            SipOpenDoorParam sipOpenDoorParam = (SipOpenDoorParam) map.get(realmGet$openDoorParam);
            if (sipOpenDoorParam != null) {
                newProxyInstance.realmSet$openDoorParam(sipOpenDoorParam);
            } else {
                newProxyInstance.realmSet$openDoorParam(ru_unicorn_ujin_data_realm_SipOpenDoorParamRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_SipOpenDoorParamRealmProxy.SipOpenDoorParamColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SipOpenDoorParam.class), realmGet$openDoorParam, z, map, set));
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, SipParametrs sipParametrs, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        SipParametrs sipParametrs2 = sipParametrs;
        Map<RealmModel, Long> map2 = map;
        if (sipParametrs2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) sipParametrs2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(SipParametrs.class);
        long nativePtr = table.getNativePtr();
        SipParametrsColumnInfo sipParametrsColumnInfo = (SipParametrsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SipParametrs.class);
        long j3 = sipParametrsColumnInfo.sipUserIndex;
        ru_unicorn_ujin_data_realm_SipParametrsRealmProxyInterface ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface = sipParametrs2;
        Integer realmGet$sipUser = ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$sipUser();
        if (realmGet$sipUser == null) {
            j = Table.nativeFindFirstNull(nativePtr, j3);
        } else {
            j = Table.nativeFindFirstInt(nativePtr, j3, (long) ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$sipUser().intValue());
        }
        if (j == -1) {
            j2 = OsObject.createRowWithPrimaryKey(table, j3, ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$sipUser());
        } else {
            Table.throwDuplicatePrimaryKeyException(realmGet$sipUser);
            j2 = j;
        }
        map2.put(sipParametrs2, Long.valueOf(j2));
        String realmGet$sipPassword = ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$sipPassword();
        if (realmGet$sipPassword != null) {
            Table.nativeSetString(nativePtr, sipParametrsColumnInfo.sipPasswordIndex, j2, realmGet$sipPassword, false);
        }
        Integer realmGet$sipPort = ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$sipPort();
        if (realmGet$sipPort != null) {
            Table.nativeSetLong(nativePtr, sipParametrsColumnInfo.sipPortIndex, j2, realmGet$sipPort.longValue(), false);
        }
        String realmGet$sipDomain = ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$sipDomain();
        if (realmGet$sipDomain != null) {
            Table.nativeSetString(nativePtr, sipParametrsColumnInfo.sipDomainIndex, j2, realmGet$sipDomain, false);
        }
        String realmGet$sipProxy = ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$sipProxy();
        if (realmGet$sipProxy != null) {
            Table.nativeSetString(nativePtr, sipParametrsColumnInfo.sipProxyIndex, j2, realmGet$sipProxy, false);
        }
        Integer realmGet$sipProxyPort = ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$sipProxyPort();
        if (realmGet$sipProxyPort != null) {
            Table.nativeSetLong(nativePtr, sipParametrsColumnInfo.sipProxyPortIndex, j2, realmGet$sipProxyPort.longValue(), false);
        }
        String realmGet$sipCodecAudio = ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$sipCodecAudio();
        if (realmGet$sipCodecAudio != null) {
            Table.nativeSetString(nativePtr, sipParametrsColumnInfo.sipCodecAudioIndex, j2, realmGet$sipCodecAudio, false);
        }
        String realmGet$sipCodecVideo = ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$sipCodecVideo();
        if (realmGet$sipCodecVideo != null) {
            Table.nativeSetString(nativePtr, sipParametrsColumnInfo.sipCodecVideoIndex, j2, realmGet$sipCodecVideo, false);
        }
        String realmGet$videoSource = ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$videoSource();
        if (realmGet$videoSource != null) {
            Table.nativeSetString(nativePtr, sipParametrsColumnInfo.videoSourceIndex, j2, realmGet$videoSource, false);
        }
        String realmGet$sipTransport = ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$sipTransport();
        if (realmGet$sipTransport != null) {
            Table.nativeSetString(nativePtr, sipParametrsColumnInfo.sipTransportIndex, j2, realmGet$sipTransport, false);
        }
        SipPreviewParams realmGet$previewParams = ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$previewParams();
        if (realmGet$previewParams != null) {
            Long l = map2.get(realmGet$previewParams);
            if (l == null) {
                l = Long.valueOf(ru_unicorn_ujin_data_realm_SipPreviewParamsRealmProxy.insert(realm2, realmGet$previewParams, map2));
            }
            Table.nativeSetLink(nativePtr, sipParametrsColumnInfo.previewParamsIndex, j2, l.longValue(), false);
        }
        SipOpenDoorParam realmGet$openDoorParam = ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$openDoorParam();
        if (realmGet$openDoorParam != null) {
            Long l2 = map2.get(realmGet$openDoorParam);
            if (l2 == null) {
                l2 = Long.valueOf(ru_unicorn_ujin_data_realm_SipOpenDoorParamRealmProxy.insert(realm2, realmGet$openDoorParam, map2));
            }
            Table.nativeSetLink(nativePtr, sipParametrsColumnInfo.openDoorParamIndex, j2, l2.longValue(), false);
        }
        return j2;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(SipParametrs.class);
        long nativePtr = table.getNativePtr();
        SipParametrsColumnInfo sipParametrsColumnInfo = (SipParametrsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SipParametrs.class);
        long j3 = sipParametrsColumnInfo.sipUserIndex;
        while (it.hasNext()) {
            SipParametrs sipParametrs = (SipParametrs) it.next();
            if (!map2.containsKey(sipParametrs)) {
                if (sipParametrs instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) sipParametrs;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(sipParametrs, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                ru_unicorn_ujin_data_realm_SipParametrsRealmProxyInterface ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface = sipParametrs;
                Integer realmGet$sipUser = ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$sipUser();
                if (realmGet$sipUser == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j3);
                } else {
                    j = Table.nativeFindFirstInt(nativePtr, j3, (long) ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$sipUser().intValue());
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j3, ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$sipUser());
                } else {
                    Table.throwDuplicatePrimaryKeyException(realmGet$sipUser);
                }
                long j4 = j;
                map2.put(sipParametrs, Long.valueOf(j4));
                String realmGet$sipPassword = ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$sipPassword();
                if (realmGet$sipPassword != null) {
                    j2 = j3;
                    Table.nativeSetString(nativePtr, sipParametrsColumnInfo.sipPasswordIndex, j4, realmGet$sipPassword, false);
                } else {
                    j2 = j3;
                }
                Integer realmGet$sipPort = ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$sipPort();
                if (realmGet$sipPort != null) {
                    Table.nativeSetLong(nativePtr, sipParametrsColumnInfo.sipPortIndex, j4, realmGet$sipPort.longValue(), false);
                }
                String realmGet$sipDomain = ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$sipDomain();
                if (realmGet$sipDomain != null) {
                    Table.nativeSetString(nativePtr, sipParametrsColumnInfo.sipDomainIndex, j4, realmGet$sipDomain, false);
                }
                String realmGet$sipProxy = ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$sipProxy();
                if (realmGet$sipProxy != null) {
                    Table.nativeSetString(nativePtr, sipParametrsColumnInfo.sipProxyIndex, j4, realmGet$sipProxy, false);
                }
                Integer realmGet$sipProxyPort = ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$sipProxyPort();
                if (realmGet$sipProxyPort != null) {
                    Table.nativeSetLong(nativePtr, sipParametrsColumnInfo.sipProxyPortIndex, j4, realmGet$sipProxyPort.longValue(), false);
                }
                String realmGet$sipCodecAudio = ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$sipCodecAudio();
                if (realmGet$sipCodecAudio != null) {
                    Table.nativeSetString(nativePtr, sipParametrsColumnInfo.sipCodecAudioIndex, j4, realmGet$sipCodecAudio, false);
                }
                String realmGet$sipCodecVideo = ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$sipCodecVideo();
                if (realmGet$sipCodecVideo != null) {
                    Table.nativeSetString(nativePtr, sipParametrsColumnInfo.sipCodecVideoIndex, j4, realmGet$sipCodecVideo, false);
                }
                String realmGet$videoSource = ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$videoSource();
                if (realmGet$videoSource != null) {
                    Table.nativeSetString(nativePtr, sipParametrsColumnInfo.videoSourceIndex, j4, realmGet$videoSource, false);
                }
                String realmGet$sipTransport = ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$sipTransport();
                if (realmGet$sipTransport != null) {
                    Table.nativeSetString(nativePtr, sipParametrsColumnInfo.sipTransportIndex, j4, realmGet$sipTransport, false);
                }
                SipPreviewParams realmGet$previewParams = ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$previewParams();
                if (realmGet$previewParams != null) {
                    Long l = map2.get(realmGet$previewParams);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_realm_SipPreviewParamsRealmProxy.insert(realm2, realmGet$previewParams, map2));
                    }
                    table.setLink(sipParametrsColumnInfo.previewParamsIndex, j4, l.longValue(), false);
                }
                SipOpenDoorParam realmGet$openDoorParam = ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$openDoorParam();
                if (realmGet$openDoorParam != null) {
                    Long l2 = map2.get(realmGet$openDoorParam);
                    if (l2 == null) {
                        l2 = Long.valueOf(ru_unicorn_ujin_data_realm_SipOpenDoorParamRealmProxy.insert(realm2, realmGet$openDoorParam, map2));
                    }
                    table.setLink(sipParametrsColumnInfo.openDoorParamIndex, j4, l2.longValue(), false);
                }
                j3 = j2;
            }
        }
    }

    public static long insertOrUpdate(Realm realm, SipParametrs sipParametrs, Map<RealmModel, Long> map) {
        long j;
        Realm realm2 = realm;
        SipParametrs sipParametrs2 = sipParametrs;
        Map<RealmModel, Long> map2 = map;
        if (sipParametrs2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) sipParametrs2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(SipParametrs.class);
        long nativePtr = table.getNativePtr();
        SipParametrsColumnInfo sipParametrsColumnInfo = (SipParametrsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SipParametrs.class);
        long j2 = sipParametrsColumnInfo.sipUserIndex;
        ru_unicorn_ujin_data_realm_SipParametrsRealmProxyInterface ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface = sipParametrs2;
        if (ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$sipUser() == null) {
            j = Table.nativeFindFirstNull(nativePtr, j2);
        } else {
            j = Table.nativeFindFirstInt(nativePtr, j2, (long) ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$sipUser().intValue());
        }
        long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j2, ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$sipUser()) : j;
        map2.put(sipParametrs2, Long.valueOf(createRowWithPrimaryKey));
        String realmGet$sipPassword = ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$sipPassword();
        if (realmGet$sipPassword != null) {
            Table.nativeSetString(nativePtr, sipParametrsColumnInfo.sipPasswordIndex, createRowWithPrimaryKey, realmGet$sipPassword, false);
        } else {
            Table.nativeSetNull(nativePtr, sipParametrsColumnInfo.sipPasswordIndex, createRowWithPrimaryKey, false);
        }
        Integer realmGet$sipPort = ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$sipPort();
        if (realmGet$sipPort != null) {
            Table.nativeSetLong(nativePtr, sipParametrsColumnInfo.sipPortIndex, createRowWithPrimaryKey, realmGet$sipPort.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, sipParametrsColumnInfo.sipPortIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$sipDomain = ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$sipDomain();
        if (realmGet$sipDomain != null) {
            Table.nativeSetString(nativePtr, sipParametrsColumnInfo.sipDomainIndex, createRowWithPrimaryKey, realmGet$sipDomain, false);
        } else {
            Table.nativeSetNull(nativePtr, sipParametrsColumnInfo.sipDomainIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$sipProxy = ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$sipProxy();
        if (realmGet$sipProxy != null) {
            Table.nativeSetString(nativePtr, sipParametrsColumnInfo.sipProxyIndex, createRowWithPrimaryKey, realmGet$sipProxy, false);
        } else {
            Table.nativeSetNull(nativePtr, sipParametrsColumnInfo.sipProxyIndex, createRowWithPrimaryKey, false);
        }
        Integer realmGet$sipProxyPort = ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$sipProxyPort();
        if (realmGet$sipProxyPort != null) {
            Table.nativeSetLong(nativePtr, sipParametrsColumnInfo.sipProxyPortIndex, createRowWithPrimaryKey, realmGet$sipProxyPort.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, sipParametrsColumnInfo.sipProxyPortIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$sipCodecAudio = ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$sipCodecAudio();
        if (realmGet$sipCodecAudio != null) {
            Table.nativeSetString(nativePtr, sipParametrsColumnInfo.sipCodecAudioIndex, createRowWithPrimaryKey, realmGet$sipCodecAudio, false);
        } else {
            Table.nativeSetNull(nativePtr, sipParametrsColumnInfo.sipCodecAudioIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$sipCodecVideo = ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$sipCodecVideo();
        if (realmGet$sipCodecVideo != null) {
            Table.nativeSetString(nativePtr, sipParametrsColumnInfo.sipCodecVideoIndex, createRowWithPrimaryKey, realmGet$sipCodecVideo, false);
        } else {
            Table.nativeSetNull(nativePtr, sipParametrsColumnInfo.sipCodecVideoIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$videoSource = ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$videoSource();
        if (realmGet$videoSource != null) {
            Table.nativeSetString(nativePtr, sipParametrsColumnInfo.videoSourceIndex, createRowWithPrimaryKey, realmGet$videoSource, false);
        } else {
            Table.nativeSetNull(nativePtr, sipParametrsColumnInfo.videoSourceIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$sipTransport = ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$sipTransport();
        if (realmGet$sipTransport != null) {
            Table.nativeSetString(nativePtr, sipParametrsColumnInfo.sipTransportIndex, createRowWithPrimaryKey, realmGet$sipTransport, false);
        } else {
            Table.nativeSetNull(nativePtr, sipParametrsColumnInfo.sipTransportIndex, createRowWithPrimaryKey, false);
        }
        SipPreviewParams realmGet$previewParams = ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$previewParams();
        if (realmGet$previewParams != null) {
            Long l = map2.get(realmGet$previewParams);
            if (l == null) {
                l = Long.valueOf(ru_unicorn_ujin_data_realm_SipPreviewParamsRealmProxy.insertOrUpdate(realm2, realmGet$previewParams, map2));
            }
            Table.nativeSetLink(nativePtr, sipParametrsColumnInfo.previewParamsIndex, createRowWithPrimaryKey, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, sipParametrsColumnInfo.previewParamsIndex, createRowWithPrimaryKey);
        }
        SipOpenDoorParam realmGet$openDoorParam = ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$openDoorParam();
        if (realmGet$openDoorParam != null) {
            Long l2 = map2.get(realmGet$openDoorParam);
            if (l2 == null) {
                l2 = Long.valueOf(ru_unicorn_ujin_data_realm_SipOpenDoorParamRealmProxy.insertOrUpdate(realm2, realmGet$openDoorParam, map2));
            }
            Table.nativeSetLink(nativePtr, sipParametrsColumnInfo.openDoorParamIndex, createRowWithPrimaryKey, l2.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, sipParametrsColumnInfo.openDoorParamIndex, createRowWithPrimaryKey);
        }
        return createRowWithPrimaryKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(SipParametrs.class);
        long nativePtr = table.getNativePtr();
        SipParametrsColumnInfo sipParametrsColumnInfo = (SipParametrsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SipParametrs.class);
        long j3 = sipParametrsColumnInfo.sipUserIndex;
        while (it.hasNext()) {
            SipParametrs sipParametrs = (SipParametrs) it.next();
            if (!map2.containsKey(sipParametrs)) {
                if (sipParametrs instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) sipParametrs;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(sipParametrs, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                ru_unicorn_ujin_data_realm_SipParametrsRealmProxyInterface ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface = sipParametrs;
                if (ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$sipUser() == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j3);
                } else {
                    j = Table.nativeFindFirstInt(nativePtr, j3, (long) ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$sipUser().intValue());
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j3, ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$sipUser());
                }
                long j4 = j;
                map2.put(sipParametrs, Long.valueOf(j4));
                String realmGet$sipPassword = ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$sipPassword();
                if (realmGet$sipPassword != null) {
                    j2 = j3;
                    Table.nativeSetString(nativePtr, sipParametrsColumnInfo.sipPasswordIndex, j4, realmGet$sipPassword, false);
                } else {
                    j2 = j3;
                    Table.nativeSetNull(nativePtr, sipParametrsColumnInfo.sipPasswordIndex, j4, false);
                }
                Integer realmGet$sipPort = ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$sipPort();
                if (realmGet$sipPort != null) {
                    Table.nativeSetLong(nativePtr, sipParametrsColumnInfo.sipPortIndex, j4, realmGet$sipPort.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, sipParametrsColumnInfo.sipPortIndex, j4, false);
                }
                String realmGet$sipDomain = ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$sipDomain();
                if (realmGet$sipDomain != null) {
                    Table.nativeSetString(nativePtr, sipParametrsColumnInfo.sipDomainIndex, j4, realmGet$sipDomain, false);
                } else {
                    Table.nativeSetNull(nativePtr, sipParametrsColumnInfo.sipDomainIndex, j4, false);
                }
                String realmGet$sipProxy = ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$sipProxy();
                if (realmGet$sipProxy != null) {
                    Table.nativeSetString(nativePtr, sipParametrsColumnInfo.sipProxyIndex, j4, realmGet$sipProxy, false);
                } else {
                    Table.nativeSetNull(nativePtr, sipParametrsColumnInfo.sipProxyIndex, j4, false);
                }
                Integer realmGet$sipProxyPort = ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$sipProxyPort();
                if (realmGet$sipProxyPort != null) {
                    Table.nativeSetLong(nativePtr, sipParametrsColumnInfo.sipProxyPortIndex, j4, realmGet$sipProxyPort.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, sipParametrsColumnInfo.sipProxyPortIndex, j4, false);
                }
                String realmGet$sipCodecAudio = ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$sipCodecAudio();
                if (realmGet$sipCodecAudio != null) {
                    Table.nativeSetString(nativePtr, sipParametrsColumnInfo.sipCodecAudioIndex, j4, realmGet$sipCodecAudio, false);
                } else {
                    Table.nativeSetNull(nativePtr, sipParametrsColumnInfo.sipCodecAudioIndex, j4, false);
                }
                String realmGet$sipCodecVideo = ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$sipCodecVideo();
                if (realmGet$sipCodecVideo != null) {
                    Table.nativeSetString(nativePtr, sipParametrsColumnInfo.sipCodecVideoIndex, j4, realmGet$sipCodecVideo, false);
                } else {
                    Table.nativeSetNull(nativePtr, sipParametrsColumnInfo.sipCodecVideoIndex, j4, false);
                }
                String realmGet$videoSource = ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$videoSource();
                if (realmGet$videoSource != null) {
                    Table.nativeSetString(nativePtr, sipParametrsColumnInfo.videoSourceIndex, j4, realmGet$videoSource, false);
                } else {
                    Table.nativeSetNull(nativePtr, sipParametrsColumnInfo.videoSourceIndex, j4, false);
                }
                String realmGet$sipTransport = ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$sipTransport();
                if (realmGet$sipTransport != null) {
                    Table.nativeSetString(nativePtr, sipParametrsColumnInfo.sipTransportIndex, j4, realmGet$sipTransport, false);
                } else {
                    Table.nativeSetNull(nativePtr, sipParametrsColumnInfo.sipTransportIndex, j4, false);
                }
                SipPreviewParams realmGet$previewParams = ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$previewParams();
                if (realmGet$previewParams != null) {
                    Long l = map2.get(realmGet$previewParams);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_realm_SipPreviewParamsRealmProxy.insertOrUpdate(realm2, realmGet$previewParams, map2));
                    }
                    Table.nativeSetLink(nativePtr, sipParametrsColumnInfo.previewParamsIndex, j4, l.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, sipParametrsColumnInfo.previewParamsIndex, j4);
                }
                SipOpenDoorParam realmGet$openDoorParam = ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmGet$openDoorParam();
                if (realmGet$openDoorParam != null) {
                    Long l2 = map2.get(realmGet$openDoorParam);
                    if (l2 == null) {
                        l2 = Long.valueOf(ru_unicorn_ujin_data_realm_SipOpenDoorParamRealmProxy.insertOrUpdate(realm2, realmGet$openDoorParam, map2));
                    }
                    Table.nativeSetLink(nativePtr, sipParametrsColumnInfo.openDoorParamIndex, j4, l2.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, sipParametrsColumnInfo.openDoorParamIndex, j4);
                }
                j3 = j2;
            }
        }
    }

    public static SipParametrs createDetachedCopy(SipParametrs sipParametrs, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        SipParametrs sipParametrs2;
        if (i > i2 || sipParametrs == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(sipParametrs);
        if (cacheData == null) {
            sipParametrs2 = new SipParametrs();
            map.put(sipParametrs, new RealmObjectProxy.CacheData(i, sipParametrs2));
        } else if (i >= cacheData.minDepth) {
            return (SipParametrs) cacheData.object;
        } else {
            cacheData.minDepth = i;
            sipParametrs2 = (SipParametrs) cacheData.object;
        }
        ru_unicorn_ujin_data_realm_SipParametrsRealmProxyInterface ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface = sipParametrs2;
        ru_unicorn_ujin_data_realm_SipParametrsRealmProxyInterface ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface2 = sipParametrs;
        ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmSet$sipUser(ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface2.realmGet$sipUser());
        ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmSet$sipPassword(ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface2.realmGet$sipPassword());
        ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmSet$sipPort(ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface2.realmGet$sipPort());
        ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmSet$sipDomain(ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface2.realmGet$sipDomain());
        ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmSet$sipProxy(ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface2.realmGet$sipProxy());
        ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmSet$sipProxyPort(ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface2.realmGet$sipProxyPort());
        ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmSet$sipCodecAudio(ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface2.realmGet$sipCodecAudio());
        ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmSet$sipCodecVideo(ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface2.realmGet$sipCodecVideo());
        ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmSet$videoSource(ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface2.realmGet$videoSource());
        ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmSet$sipTransport(ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface2.realmGet$sipTransport());
        int i3 = i + 1;
        ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmSet$previewParams(ru_unicorn_ujin_data_realm_SipPreviewParamsRealmProxy.createDetachedCopy(ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface2.realmGet$previewParams(), i3, i2, map));
        ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface.realmSet$openDoorParam(ru_unicorn_ujin_data_realm_SipOpenDoorParamRealmProxy.createDetachedCopy(ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface2.realmGet$openDoorParam(), i3, i2, map));
        return sipParametrs2;
    }

    static SipParametrs update(Realm realm, SipParametrsColumnInfo sipParametrsColumnInfo, SipParametrs sipParametrs, SipParametrs sipParametrs2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        ru_unicorn_ujin_data_realm_SipParametrsRealmProxyInterface ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface = sipParametrs;
        ru_unicorn_ujin_data_realm_SipParametrsRealmProxyInterface ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface2 = sipParametrs2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(SipParametrs.class), sipParametrsColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(sipParametrsColumnInfo.sipUserIndex, ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface2.realmGet$sipUser());
        osObjectBuilder.addString(sipParametrsColumnInfo.sipPasswordIndex, ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface2.realmGet$sipPassword());
        osObjectBuilder.addInteger(sipParametrsColumnInfo.sipPortIndex, ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface2.realmGet$sipPort());
        osObjectBuilder.addString(sipParametrsColumnInfo.sipDomainIndex, ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface2.realmGet$sipDomain());
        osObjectBuilder.addString(sipParametrsColumnInfo.sipProxyIndex, ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface2.realmGet$sipProxy());
        osObjectBuilder.addInteger(sipParametrsColumnInfo.sipProxyPortIndex, ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface2.realmGet$sipProxyPort());
        osObjectBuilder.addString(sipParametrsColumnInfo.sipCodecAudioIndex, ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface2.realmGet$sipCodecAudio());
        osObjectBuilder.addString(sipParametrsColumnInfo.sipCodecVideoIndex, ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface2.realmGet$sipCodecVideo());
        osObjectBuilder.addString(sipParametrsColumnInfo.videoSourceIndex, ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface2.realmGet$videoSource());
        osObjectBuilder.addString(sipParametrsColumnInfo.sipTransportIndex, ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface2.realmGet$sipTransport());
        SipPreviewParams realmGet$previewParams = ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface2.realmGet$previewParams();
        if (realmGet$previewParams == null) {
            osObjectBuilder.addNull(sipParametrsColumnInfo.previewParamsIndex);
        } else {
            SipPreviewParams sipPreviewParams = (SipPreviewParams) map.get(realmGet$previewParams);
            if (sipPreviewParams != null) {
                osObjectBuilder.addObject(sipParametrsColumnInfo.previewParamsIndex, sipPreviewParams);
            } else {
                osObjectBuilder.addObject(sipParametrsColumnInfo.previewParamsIndex, ru_unicorn_ujin_data_realm_SipPreviewParamsRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_SipPreviewParamsRealmProxy.SipPreviewParamsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SipPreviewParams.class), realmGet$previewParams, true, map, set));
            }
        }
        SipOpenDoorParam realmGet$openDoorParam = ru_unicorn_ujin_data_realm_sipparametrsrealmproxyinterface2.realmGet$openDoorParam();
        if (realmGet$openDoorParam == null) {
            osObjectBuilder.addNull(sipParametrsColumnInfo.openDoorParamIndex);
        } else {
            SipOpenDoorParam sipOpenDoorParam = (SipOpenDoorParam) map.get(realmGet$openDoorParam);
            if (sipOpenDoorParam != null) {
                osObjectBuilder.addObject(sipParametrsColumnInfo.openDoorParamIndex, sipOpenDoorParam);
            } else {
                osObjectBuilder.addObject(sipParametrsColumnInfo.openDoorParamIndex, ru_unicorn_ujin_data_realm_SipOpenDoorParamRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_SipOpenDoorParamRealmProxy.SipOpenDoorParamColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SipOpenDoorParam.class), realmGet$openDoorParam, true, map, set));
            }
        }
        osObjectBuilder.updateExistingObject();
        return sipParametrs;
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
        ru_unicorn_ujin_data_realm_SipParametrsRealmProxy ru_unicorn_ujin_data_realm_sipparametrsrealmproxy = (ru_unicorn_ujin_data_realm_SipParametrsRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_sipparametrsrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_sipparametrsrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_sipparametrsrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
