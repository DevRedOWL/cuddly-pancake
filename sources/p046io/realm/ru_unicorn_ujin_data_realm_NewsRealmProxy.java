package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.data.realm.ImageData;
import p035ru.unicorn.ujin.data.realm.News;
import p046io.realm.BaseRealm;
import p046io.realm.exceptions.RealmException;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsList;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;
import p046io.realm.ru_unicorn_ujin_data_realm_ImageDataRealmProxy;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_NewsRealmProxy */
public class ru_unicorn_ujin_data_realm_NewsRealmProxy extends News implements RealmObjectProxy, ru_unicorn_ujin_data_realm_NewsRealmProxyInterface {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private NewsColumnInfo columnInfo;
    private RealmList<ImageData> imageListRealmList;
    private ProxyState<News> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_NewsRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "News";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_NewsRealmProxy$NewsColumnInfo */
    static final class NewsColumnInfo extends ColumnInfo {
        long dateTextIndex;
        long idIndex;
        long imageDataIndex;
        long imageListIndex;
        long maxColumnIndexValue;
        long textIndex;
        long titleIndex;

        NewsColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(6);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.textIndex = addColumnDetails("text", "text", objectSchemaInfo);
            this.dateTextIndex = addColumnDetails("dateText", "dateText", objectSchemaInfo);
            this.imageDataIndex = addColumnDetails("imageData", "imageData", objectSchemaInfo);
            this.imageListIndex = addColumnDetails("imageList", "imageList", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        NewsColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new NewsColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            NewsColumnInfo newsColumnInfo = (NewsColumnInfo) columnInfo;
            NewsColumnInfo newsColumnInfo2 = (NewsColumnInfo) columnInfo2;
            newsColumnInfo2.idIndex = newsColumnInfo.idIndex;
            newsColumnInfo2.titleIndex = newsColumnInfo.titleIndex;
            newsColumnInfo2.textIndex = newsColumnInfo.textIndex;
            newsColumnInfo2.dateTextIndex = newsColumnInfo.dateTextIndex;
            newsColumnInfo2.imageDataIndex = newsColumnInfo.imageDataIndex;
            newsColumnInfo2.imageListIndex = newsColumnInfo.imageListIndex;
            newsColumnInfo2.maxColumnIndexValue = newsColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_NewsRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (NewsColumnInfo) realmObjectContext.getColumnInfo();
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
            throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
        }
    }

    public String realmGet$title() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.titleIndex);
    }

    public void realmSet$title(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str != null) {
                this.proxyState.getRow$realm().setString(this.columnInfo.titleIndex, str);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'title' to null.");
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str != null) {
                row$realm.getTable().setString(this.columnInfo.titleIndex, row$realm.getIndex(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'title' to null.");
        }
    }

    public String realmGet$text() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.textIndex);
    }

    public void realmSet$text(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str != null) {
                this.proxyState.getRow$realm().setString(this.columnInfo.textIndex, str);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'text' to null.");
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str != null) {
                row$realm.getTable().setString(this.columnInfo.textIndex, row$realm.getIndex(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'text' to null.");
        }
    }

    public String realmGet$dateText() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.dateTextIndex);
    }

    public void realmSet$dateText(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str != null) {
                this.proxyState.getRow$realm().setString(this.columnInfo.dateTextIndex, str);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'dateText' to null.");
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str != null) {
                row$realm.getTable().setString(this.columnInfo.dateTextIndex, row$realm.getIndex(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'dateText' to null.");
        }
    }

    public ImageData realmGet$imageData() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.imageDataIndex)) {
            return null;
        }
        return (ImageData) this.proxyState.getRealm$realm().get(ImageData.class, this.proxyState.getRow$realm().getLink(this.columnInfo.imageDataIndex), false, Collections.emptyList());
    }

    public void realmSet$imageData(ImageData imageData) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (imageData == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.imageDataIndex);
                return;
            }
            this.proxyState.checkValidObject(imageData);
            this.proxyState.getRow$realm().setLink(this.columnInfo.imageDataIndex, ((RealmObjectProxy) imageData).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("imageData")) {
            if (imageData != null && !RealmObject.isManaged(imageData)) {
                imageData = (ImageData) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(imageData, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (imageData == null) {
                row$realm.nullifyLink(this.columnInfo.imageDataIndex);
                return;
            }
            this.proxyState.checkValidObject(imageData);
            row$realm.getTable().setLink(this.columnInfo.imageDataIndex, row$realm.getIndex(), ((RealmObjectProxy) imageData).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public RealmList<ImageData> realmGet$imageList() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<ImageData> realmList = this.imageListRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.imageListRealmList = new RealmList<>(ImageData.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.imageListIndex), this.proxyState.getRealm$realm());
        return this.imageListRealmList;
    }

    public void realmSet$imageList(RealmList<ImageData> realmList) {
        int i = 0;
        if (this.proxyState.isUnderConstruction()) {
            if (!this.proxyState.getAcceptDefaultValue$realm() || this.proxyState.getExcludeFields$realm().contains("imageList")) {
                return;
            }
            if (realmList != null && !realmList.isManaged()) {
                Realm realm = (Realm) this.proxyState.getRealm$realm();
                RealmList<ImageData> realmList2 = new RealmList<>();
                Iterator<ImageData> it = realmList.iterator();
                while (it.hasNext()) {
                    ImageData next = it.next();
                    if (next == null || RealmObject.isManaged(next)) {
                        realmList2.add(next);
                    } else {
                        realmList2.add(realm.copyToRealm(next, new ImportFlag[0]));
                    }
                }
                realmList = realmList2;
            }
        }
        this.proxyState.getRealm$realm().checkIfValid();
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.imageListIndex);
        if (realmList == null || ((long) realmList.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList != null) {
                int size = realmList.size();
                while (i < size) {
                    ImageData imageData = realmList.get(i);
                    this.proxyState.checkValidObject(imageData);
                    modelList.addRow(((RealmObjectProxy) imageData).realmGet$proxyState().getRow$realm().getIndex());
                    i++;
                }
                return;
            }
            return;
        }
        int size2 = realmList.size();
        while (i < size2) {
            ImageData imageData2 = realmList.get(i);
            this.proxyState.checkValidObject(imageData2);
            modelList.setRow((long) i, ((RealmObjectProxy) imageData2).realmGet$proxyState().getRow$realm().getIndex());
            i++;
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 6, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.STRING, true, true, true);
        builder2.addPersistedProperty("title", RealmFieldType.STRING, false, false, true);
        builder2.addPersistedProperty("text", RealmFieldType.STRING, false, false, true);
        builder2.addPersistedProperty("dateText", RealmFieldType.STRING, false, false, true);
        builder.addPersistedLinkProperty("imageData", RealmFieldType.OBJECT, ru_unicorn_ujin_data_realm_ImageDataRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty("imageList", RealmFieldType.LIST, ru_unicorn_ujin_data_realm_ImageDataRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static NewsColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new NewsColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [io.realm.RealmModel] */
    /* JADX WARNING: type inference failed for: r0v4, types: [io.realm.RealmModel] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0118  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.News createOrUpdateUsingJsonObject(p046io.realm.Realm r13, org.json.JSONObject r14, boolean r15) throws org.json.JSONException {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 2
            r0.<init>(r1)
            java.lang.String r1 = "id"
            r2 = 0
            if (r15 == 0) goto L_0x0063
            java.lang.Class<ru.unicorn.ujin.data.realm.News> r3 = p035ru.unicorn.ujin.data.realm.News.class
            io.realm.internal.Table r3 = r13.getTable(r3)
            io.realm.RealmSchema r4 = r13.getSchema()
            java.lang.Class<ru.unicorn.ujin.data.realm.News> r5 = p035ru.unicorn.ujin.data.realm.News.class
            io.realm.internal.ColumnInfo r4 = r4.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r5)
            io.realm.ru_unicorn_ujin_data_realm_NewsRealmProxy$NewsColumnInfo r4 = (p046io.realm.ru_unicorn_ujin_data_realm_NewsRealmProxy.NewsColumnInfo) r4
            long r4 = r4.idIndex
            boolean r6 = r14.isNull(r1)
            r7 = -1
            if (r6 != 0) goto L_0x0030
            java.lang.String r6 = r14.getString(r1)
            long r4 = r3.findFirstString(r4, r6)
            goto L_0x0031
        L_0x0030:
            r4 = r7
        L_0x0031:
            int r6 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x0063
            io.realm.BaseRealm$ThreadLocalRealmObjectContext r6 = p046io.realm.BaseRealm.objectContext
            java.lang.Object r6 = r6.get()
            io.realm.BaseRealm$RealmObjectContext r6 = (p046io.realm.BaseRealm.RealmObjectContext) r6
            io.realm.internal.UncheckedRow r9 = r3.getUncheckedRow(r4)     // Catch:{ all -> 0x005e }
            io.realm.RealmSchema r3 = r13.getSchema()     // Catch:{ all -> 0x005e }
            java.lang.Class<ru.unicorn.ujin.data.realm.News> r4 = p035ru.unicorn.ujin.data.realm.News.class
            io.realm.internal.ColumnInfo r10 = r3.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r4)     // Catch:{ all -> 0x005e }
            r11 = 0
            java.util.List r12 = java.util.Collections.emptyList()     // Catch:{ all -> 0x005e }
            r7 = r6
            r8 = r13
            r7.set(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x005e }
            io.realm.ru_unicorn_ujin_data_realm_NewsRealmProxy r3 = new io.realm.ru_unicorn_ujin_data_realm_NewsRealmProxy     // Catch:{ all -> 0x005e }
            r3.<init>()     // Catch:{ all -> 0x005e }
            r6.clear()
            goto L_0x0064
        L_0x005e:
            r13 = move-exception
            r6.clear()
            throw r13
        L_0x0063:
            r3 = r2
        L_0x0064:
            java.lang.String r4 = "imageList"
            java.lang.String r5 = "imageData"
            if (r3 != 0) goto L_0x00a9
            boolean r3 = r14.has(r5)
            if (r3 == 0) goto L_0x0073
            r0.add(r5)
        L_0x0073:
            boolean r3 = r14.has(r4)
            if (r3 == 0) goto L_0x007c
            r0.add(r4)
        L_0x007c:
            boolean r3 = r14.has(r1)
            if (r3 == 0) goto L_0x00a1
            boolean r3 = r14.isNull(r1)
            r6 = 1
            if (r3 == 0) goto L_0x0093
            java.lang.Class<ru.unicorn.ujin.data.realm.News> r1 = p035ru.unicorn.ujin.data.realm.News.class
            io.realm.RealmModel r0 = r13.createObjectInternal(r1, r2, r6, r0)
            r3 = r0
            io.realm.ru_unicorn_ujin_data_realm_NewsRealmProxy r3 = (p046io.realm.ru_unicorn_ujin_data_realm_NewsRealmProxy) r3
            goto L_0x00a9
        L_0x0093:
            java.lang.Class<ru.unicorn.ujin.data.realm.News> r3 = p035ru.unicorn.ujin.data.realm.News.class
            java.lang.String r1 = r14.getString(r1)
            io.realm.RealmModel r0 = r13.createObjectInternal(r3, r1, r6, r0)
            r3 = r0
            io.realm.ru_unicorn_ujin_data_realm_NewsRealmProxy r3 = (p046io.realm.ru_unicorn_ujin_data_realm_NewsRealmProxy) r3
            goto L_0x00a9
        L_0x00a1:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "JSON object doesn't have the primary key field 'id'."
            r13.<init>(r14)
            throw r13
        L_0x00a9:
            r0 = r3
            io.realm.ru_unicorn_ujin_data_realm_NewsRealmProxyInterface r0 = (p046io.realm.ru_unicorn_ujin_data_realm_NewsRealmProxyInterface) r0
            java.lang.String r1 = "title"
            boolean r6 = r14.has(r1)
            if (r6 == 0) goto L_0x00c5
            boolean r6 = r14.isNull(r1)
            if (r6 == 0) goto L_0x00be
            r0.realmSet$title(r2)
            goto L_0x00c5
        L_0x00be:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$title(r1)
        L_0x00c5:
            java.lang.String r1 = "text"
            boolean r6 = r14.has(r1)
            if (r6 == 0) goto L_0x00de
            boolean r6 = r14.isNull(r1)
            if (r6 == 0) goto L_0x00d7
            r0.realmSet$text(r2)
            goto L_0x00de
        L_0x00d7:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$text(r1)
        L_0x00de:
            java.lang.String r1 = "dateText"
            boolean r6 = r14.has(r1)
            if (r6 == 0) goto L_0x00f7
            boolean r6 = r14.isNull(r1)
            if (r6 == 0) goto L_0x00f0
            r0.realmSet$dateText(r2)
            goto L_0x00f7
        L_0x00f0:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$dateText(r1)
        L_0x00f7:
            boolean r1 = r14.has(r5)
            if (r1 == 0) goto L_0x0112
            boolean r1 = r14.isNull(r5)
            if (r1 == 0) goto L_0x0107
            r0.realmSet$imageData(r2)
            goto L_0x0112
        L_0x0107:
            org.json.JSONObject r1 = r14.getJSONObject(r5)
            ru.unicorn.ujin.data.realm.ImageData r1 = p046io.realm.ru_unicorn_ujin_data_realm_ImageDataRealmProxy.createOrUpdateUsingJsonObject(r13, r1, r15)
            r0.realmSet$imageData(r1)
        L_0x0112:
            boolean r1 = r14.has(r4)
            if (r1 == 0) goto L_0x0146
            boolean r1 = r14.isNull(r4)
            if (r1 == 0) goto L_0x0122
            r0.realmSet$imageList(r2)
            goto L_0x0146
        L_0x0122:
            io.realm.RealmList r1 = r0.realmGet$imageList()
            r1.clear()
            org.json.JSONArray r14 = r14.getJSONArray(r4)
            r1 = 0
        L_0x012e:
            int r2 = r14.length()
            if (r1 >= r2) goto L_0x0146
            org.json.JSONObject r2 = r14.getJSONObject(r1)
            ru.unicorn.ujin.data.realm.ImageData r2 = p046io.realm.ru_unicorn_ujin_data_realm_ImageDataRealmProxy.createOrUpdateUsingJsonObject(r13, r2, r15)
            io.realm.RealmList r4 = r0.realmGet$imageList()
            r4.add(r2)
            int r1 = r1 + 1
            goto L_0x012e
        L_0x0146:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_NewsRealmProxy.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.data.realm.News");
    }

    public static News createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        News news = new News();
        ru_unicorn_ujin_data_realm_NewsRealmProxyInterface ru_unicorn_ujin_data_realm_newsrealmproxyinterface = news;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_newsrealmproxyinterface.realmSet$id(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_newsrealmproxyinterface.realmSet$id((String) null);
                }
                z = true;
            } else if (nextName.equals("title")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_newsrealmproxyinterface.realmSet$title(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_newsrealmproxyinterface.realmSet$title((String) null);
                }
            } else if (nextName.equals("text")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_newsrealmproxyinterface.realmSet$text(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_newsrealmproxyinterface.realmSet$text((String) null);
                }
            } else if (nextName.equals("dateText")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_newsrealmproxyinterface.realmSet$dateText(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_newsrealmproxyinterface.realmSet$dateText((String) null);
                }
            } else if (nextName.equals("imageData")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_newsrealmproxyinterface.realmSet$imageData((ImageData) null);
                } else {
                    ru_unicorn_ujin_data_realm_newsrealmproxyinterface.realmSet$imageData(ru_unicorn_ujin_data_realm_ImageDataRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
            } else if (!nextName.equals("imageList")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_newsrealmproxyinterface.realmSet$imageList((RealmList<ImageData>) null);
            } else {
                ru_unicorn_ujin_data_realm_newsrealmproxyinterface.realmSet$imageList(new RealmList());
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    ru_unicorn_ujin_data_realm_newsrealmproxyinterface.realmGet$imageList().add(ru_unicorn_ujin_data_realm_ImageDataRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
        if (z) {
            return (News) realm.copyToRealm(news, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static ru_unicorn_ujin_data_realm_NewsRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) News.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_NewsRealmProxy ru_unicorn_ujin_data_realm_newsrealmproxy = new ru_unicorn_ujin_data_realm_NewsRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_newsrealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.News copyOrUpdate(p046io.realm.Realm r8, p046io.realm.ru_unicorn_ujin_data_realm_NewsRealmProxy.NewsColumnInfo r9, p035ru.unicorn.ujin.data.realm.News r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.data.realm.News r1 = (p035ru.unicorn.ujin.data.realm.News) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x008c
            java.lang.Class<ru.unicorn.ujin.data.realm.News> r2 = p035ru.unicorn.ujin.data.realm.News.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_data_realm_NewsRealmProxyInterface r5 = (p046io.realm.ru_unicorn_ujin_data_realm_NewsRealmProxyInterface) r5
            java.lang.String r5 = r5.realmGet$id()
            long r3 = r2.findFirstString(r3, r5)
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0069
            r0 = 0
            goto L_0x008d
        L_0x0069:
            io.realm.internal.UncheckedRow r3 = r2.getUncheckedRow(r3)     // Catch:{ all -> 0x0087 }
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0087 }
            r1 = r0
            r2 = r8
            r4 = r9
            r1.set(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0087 }
            io.realm.ru_unicorn_ujin_data_realm_NewsRealmProxy r1 = new io.realm.ru_unicorn_ujin_data_realm_NewsRealmProxy     // Catch:{ all -> 0x0087 }
            r1.<init>()     // Catch:{ all -> 0x0087 }
            r2 = r1
            io.realm.internal.RealmObjectProxy r2 = (p046io.realm.internal.RealmObjectProxy) r2     // Catch:{ all -> 0x0087 }
            r12.put(r10, r2)     // Catch:{ all -> 0x0087 }
            r0.clear()
            goto L_0x008c
        L_0x0087:
            r8 = move-exception
            r0.clear()
            throw r8
        L_0x008c:
            r0 = r11
        L_0x008d:
            r3 = r1
            if (r0 == 0) goto L_0x009a
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r12
            r6 = r13
            ru.unicorn.ujin.data.realm.News r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x009e
        L_0x009a:
            ru.unicorn.ujin.data.realm.News r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x009e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_NewsRealmProxy.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_data_realm_NewsRealmProxy$NewsColumnInfo, ru.unicorn.ujin.data.realm.News, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.data.realm.News");
    }

    public static News copy(Realm realm, NewsColumnInfo newsColumnInfo, News news, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(news);
        if (realmObjectProxy != null) {
            return (News) realmObjectProxy;
        }
        ru_unicorn_ujin_data_realm_NewsRealmProxyInterface ru_unicorn_ujin_data_realm_newsrealmproxyinterface = news;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(News.class), newsColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(newsColumnInfo.idIndex, ru_unicorn_ujin_data_realm_newsrealmproxyinterface.realmGet$id());
        osObjectBuilder.addString(newsColumnInfo.titleIndex, ru_unicorn_ujin_data_realm_newsrealmproxyinterface.realmGet$title());
        osObjectBuilder.addString(newsColumnInfo.textIndex, ru_unicorn_ujin_data_realm_newsrealmproxyinterface.realmGet$text());
        osObjectBuilder.addString(newsColumnInfo.dateTextIndex, ru_unicorn_ujin_data_realm_newsrealmproxyinterface.realmGet$dateText());
        ru_unicorn_ujin_data_realm_NewsRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(news, newProxyInstance);
        ImageData realmGet$imageData = ru_unicorn_ujin_data_realm_newsrealmproxyinterface.realmGet$imageData();
        if (realmGet$imageData == null) {
            newProxyInstance.realmSet$imageData((ImageData) null);
        } else {
            ImageData imageData = (ImageData) map.get(realmGet$imageData);
            if (imageData != null) {
                newProxyInstance.realmSet$imageData(imageData);
            } else {
                newProxyInstance.realmSet$imageData(ru_unicorn_ujin_data_realm_ImageDataRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_ImageDataRealmProxy.ImageDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ImageData.class), realmGet$imageData, z, map, set));
            }
        }
        RealmList<ImageData> realmGet$imageList = ru_unicorn_ujin_data_realm_newsrealmproxyinterface.realmGet$imageList();
        if (realmGet$imageList != null) {
            RealmList<ImageData> realmGet$imageList2 = newProxyInstance.realmGet$imageList();
            realmGet$imageList2.clear();
            for (int i = 0; i < realmGet$imageList.size(); i++) {
                ImageData imageData2 = realmGet$imageList.get(i);
                ImageData imageData3 = (ImageData) map.get(imageData2);
                if (imageData3 != null) {
                    realmGet$imageList2.add(imageData3);
                } else {
                    realmGet$imageList2.add(ru_unicorn_ujin_data_realm_ImageDataRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_ImageDataRealmProxy.ImageDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ImageData.class), imageData2, z, map, set));
                }
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, News news, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        News news2 = news;
        Map<RealmModel, Long> map2 = map;
        if (news2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) news2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(News.class);
        long nativePtr = table.getNativePtr();
        NewsColumnInfo newsColumnInfo = (NewsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) News.class);
        long j3 = newsColumnInfo.idIndex;
        ru_unicorn_ujin_data_realm_NewsRealmProxyInterface ru_unicorn_ujin_data_realm_newsrealmproxyinterface = news2;
        String realmGet$id = ru_unicorn_ujin_data_realm_newsrealmproxyinterface.realmGet$id();
        long nativeFindFirstString = realmGet$id != null ? Table.nativeFindFirstString(nativePtr, j3, realmGet$id) : -1;
        if (nativeFindFirstString == -1) {
            j = OsObject.createRowWithPrimaryKey(table, j3, realmGet$id);
        } else {
            Table.throwDuplicatePrimaryKeyException(realmGet$id);
            j = nativeFindFirstString;
        }
        map2.put(news2, Long.valueOf(j));
        String realmGet$title = ru_unicorn_ujin_data_realm_newsrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            j2 = j;
            Table.nativeSetString(nativePtr, newsColumnInfo.titleIndex, j, realmGet$title, false);
        } else {
            j2 = j;
        }
        String realmGet$text = ru_unicorn_ujin_data_realm_newsrealmproxyinterface.realmGet$text();
        if (realmGet$text != null) {
            Table.nativeSetString(nativePtr, newsColumnInfo.textIndex, j2, realmGet$text, false);
        }
        String realmGet$dateText = ru_unicorn_ujin_data_realm_newsrealmproxyinterface.realmGet$dateText();
        if (realmGet$dateText != null) {
            Table.nativeSetString(nativePtr, newsColumnInfo.dateTextIndex, j2, realmGet$dateText, false);
        }
        ImageData realmGet$imageData = ru_unicorn_ujin_data_realm_newsrealmproxyinterface.realmGet$imageData();
        if (realmGet$imageData != null) {
            Long l = map2.get(realmGet$imageData);
            if (l == null) {
                l = Long.valueOf(ru_unicorn_ujin_data_realm_ImageDataRealmProxy.insert(realm2, realmGet$imageData, map2));
            }
            Table.nativeSetLink(nativePtr, newsColumnInfo.imageDataIndex, j2, l.longValue(), false);
        }
        RealmList<ImageData> realmGet$imageList = ru_unicorn_ujin_data_realm_newsrealmproxyinterface.realmGet$imageList();
        if (realmGet$imageList == null) {
            return j2;
        }
        long j4 = j2;
        OsList osList = new OsList(table.getUncheckedRow(j4), newsColumnInfo.imageListIndex);
        Iterator<ImageData> it = realmGet$imageList.iterator();
        while (it.hasNext()) {
            ImageData next = it.next();
            Long l2 = map2.get(next);
            if (l2 == null) {
                l2 = Long.valueOf(ru_unicorn_ujin_data_realm_ImageDataRealmProxy.insert(realm2, next, map2));
            }
            osList.addRow(l2.longValue());
        }
        return j4;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(News.class);
        long nativePtr = table.getNativePtr();
        NewsColumnInfo newsColumnInfo = (NewsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) News.class);
        long j3 = newsColumnInfo.idIndex;
        while (it.hasNext()) {
            News news = (News) it.next();
            if (!map2.containsKey(news)) {
                if (news instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) news;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(news, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                ru_unicorn_ujin_data_realm_NewsRealmProxyInterface ru_unicorn_ujin_data_realm_newsrealmproxyinterface = news;
                String realmGet$id = ru_unicorn_ujin_data_realm_newsrealmproxyinterface.realmGet$id();
                long nativeFindFirstString = realmGet$id != null ? Table.nativeFindFirstString(nativePtr, j3, realmGet$id) : -1;
                if (nativeFindFirstString == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j3, realmGet$id);
                } else {
                    Table.throwDuplicatePrimaryKeyException(realmGet$id);
                    j = nativeFindFirstString;
                }
                map2.put(news, Long.valueOf(j));
                String realmGet$title = ru_unicorn_ujin_data_realm_newsrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    j2 = j;
                    Table.nativeSetString(nativePtr, newsColumnInfo.titleIndex, j, realmGet$title, false);
                } else {
                    j2 = j;
                }
                String realmGet$text = ru_unicorn_ujin_data_realm_newsrealmproxyinterface.realmGet$text();
                if (realmGet$text != null) {
                    Table.nativeSetString(nativePtr, newsColumnInfo.textIndex, j2, realmGet$text, false);
                }
                String realmGet$dateText = ru_unicorn_ujin_data_realm_newsrealmproxyinterface.realmGet$dateText();
                if (realmGet$dateText != null) {
                    Table.nativeSetString(nativePtr, newsColumnInfo.dateTextIndex, j2, realmGet$dateText, false);
                }
                ImageData realmGet$imageData = ru_unicorn_ujin_data_realm_newsrealmproxyinterface.realmGet$imageData();
                if (realmGet$imageData != null) {
                    Long l = map2.get(realmGet$imageData);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_realm_ImageDataRealmProxy.insert(realm2, realmGet$imageData, map2));
                    }
                    table.setLink(newsColumnInfo.imageDataIndex, j2, l.longValue(), false);
                }
                RealmList<ImageData> realmGet$imageList = ru_unicorn_ujin_data_realm_newsrealmproxyinterface.realmGet$imageList();
                if (realmGet$imageList != null) {
                    OsList osList = new OsList(table.getUncheckedRow(j2), newsColumnInfo.imageListIndex);
                    Iterator<ImageData> it2 = realmGet$imageList.iterator();
                    while (it2.hasNext()) {
                        ImageData next = it2.next();
                        Long l2 = map2.get(next);
                        if (l2 == null) {
                            l2 = Long.valueOf(ru_unicorn_ujin_data_realm_ImageDataRealmProxy.insert(realm2, next, map2));
                        }
                        osList.addRow(l2.longValue());
                    }
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, News news, Map<RealmModel, Long> map) {
        long j;
        Realm realm2 = realm;
        News news2 = news;
        Map<RealmModel, Long> map2 = map;
        if (news2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) news2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(News.class);
        long nativePtr = table.getNativePtr();
        NewsColumnInfo newsColumnInfo = (NewsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) News.class);
        long j2 = newsColumnInfo.idIndex;
        ru_unicorn_ujin_data_realm_NewsRealmProxyInterface ru_unicorn_ujin_data_realm_newsrealmproxyinterface = news2;
        String realmGet$id = ru_unicorn_ujin_data_realm_newsrealmproxyinterface.realmGet$id();
        long nativeFindFirstString = realmGet$id != null ? Table.nativeFindFirstString(nativePtr, j2, realmGet$id) : -1;
        long createRowWithPrimaryKey = nativeFindFirstString == -1 ? OsObject.createRowWithPrimaryKey(table, j2, realmGet$id) : nativeFindFirstString;
        map2.put(news2, Long.valueOf(createRowWithPrimaryKey));
        String realmGet$title = ru_unicorn_ujin_data_realm_newsrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            j = createRowWithPrimaryKey;
            Table.nativeSetString(nativePtr, newsColumnInfo.titleIndex, createRowWithPrimaryKey, realmGet$title, false);
        } else {
            j = createRowWithPrimaryKey;
            Table.nativeSetNull(nativePtr, newsColumnInfo.titleIndex, j, false);
        }
        String realmGet$text = ru_unicorn_ujin_data_realm_newsrealmproxyinterface.realmGet$text();
        if (realmGet$text != null) {
            Table.nativeSetString(nativePtr, newsColumnInfo.textIndex, j, realmGet$text, false);
        } else {
            Table.nativeSetNull(nativePtr, newsColumnInfo.textIndex, j, false);
        }
        String realmGet$dateText = ru_unicorn_ujin_data_realm_newsrealmproxyinterface.realmGet$dateText();
        if (realmGet$dateText != null) {
            Table.nativeSetString(nativePtr, newsColumnInfo.dateTextIndex, j, realmGet$dateText, false);
        } else {
            Table.nativeSetNull(nativePtr, newsColumnInfo.dateTextIndex, j, false);
        }
        ImageData realmGet$imageData = ru_unicorn_ujin_data_realm_newsrealmproxyinterface.realmGet$imageData();
        if (realmGet$imageData != null) {
            Long l = map2.get(realmGet$imageData);
            if (l == null) {
                l = Long.valueOf(ru_unicorn_ujin_data_realm_ImageDataRealmProxy.insertOrUpdate(realm2, realmGet$imageData, map2));
            }
            Table.nativeSetLink(nativePtr, newsColumnInfo.imageDataIndex, j, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, newsColumnInfo.imageDataIndex, j);
        }
        long j3 = j;
        OsList osList = new OsList(table.getUncheckedRow(j3), newsColumnInfo.imageListIndex);
        RealmList<ImageData> realmGet$imageList = ru_unicorn_ujin_data_realm_newsrealmproxyinterface.realmGet$imageList();
        if (realmGet$imageList == null || ((long) realmGet$imageList.size()) != osList.size()) {
            osList.removeAll();
            if (realmGet$imageList != null) {
                Iterator<ImageData> it = realmGet$imageList.iterator();
                while (it.hasNext()) {
                    ImageData next = it.next();
                    Long l2 = map2.get(next);
                    if (l2 == null) {
                        l2 = Long.valueOf(ru_unicorn_ujin_data_realm_ImageDataRealmProxy.insertOrUpdate(realm2, next, map2));
                    }
                    osList.addRow(l2.longValue());
                }
            }
        } else {
            int size = realmGet$imageList.size();
            for (int i = 0; i < size; i++) {
                ImageData imageData = realmGet$imageList.get(i);
                Long l3 = map2.get(imageData);
                if (l3 == null) {
                    l3 = Long.valueOf(ru_unicorn_ujin_data_realm_ImageDataRealmProxy.insertOrUpdate(realm2, imageData, map2));
                }
                osList.setRow((long) i, l3.longValue());
            }
        }
        return j3;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(News.class);
        long nativePtr = table.getNativePtr();
        NewsColumnInfo newsColumnInfo = (NewsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) News.class);
        long j3 = newsColumnInfo.idIndex;
        while (it.hasNext()) {
            News news = (News) it.next();
            if (!map2.containsKey(news)) {
                if (news instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) news;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(news, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                ru_unicorn_ujin_data_realm_NewsRealmProxyInterface ru_unicorn_ujin_data_realm_newsrealmproxyinterface = news;
                String realmGet$id = ru_unicorn_ujin_data_realm_newsrealmproxyinterface.realmGet$id();
                long nativeFindFirstString = realmGet$id != null ? Table.nativeFindFirstString(nativePtr, j3, realmGet$id) : -1;
                if (nativeFindFirstString == -1) {
                    nativeFindFirstString = OsObject.createRowWithPrimaryKey(table, j3, realmGet$id);
                }
                map2.put(news, Long.valueOf(nativeFindFirstString));
                String realmGet$title = ru_unicorn_ujin_data_realm_newsrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    j2 = nativeFindFirstString;
                    j = j3;
                    Table.nativeSetString(nativePtr, newsColumnInfo.titleIndex, nativeFindFirstString, realmGet$title, false);
                } else {
                    j2 = nativeFindFirstString;
                    j = j3;
                    Table.nativeSetNull(nativePtr, newsColumnInfo.titleIndex, nativeFindFirstString, false);
                }
                String realmGet$text = ru_unicorn_ujin_data_realm_newsrealmproxyinterface.realmGet$text();
                if (realmGet$text != null) {
                    Table.nativeSetString(nativePtr, newsColumnInfo.textIndex, j2, realmGet$text, false);
                } else {
                    Table.nativeSetNull(nativePtr, newsColumnInfo.textIndex, j2, false);
                }
                String realmGet$dateText = ru_unicorn_ujin_data_realm_newsrealmproxyinterface.realmGet$dateText();
                if (realmGet$dateText != null) {
                    Table.nativeSetString(nativePtr, newsColumnInfo.dateTextIndex, j2, realmGet$dateText, false);
                } else {
                    Table.nativeSetNull(nativePtr, newsColumnInfo.dateTextIndex, j2, false);
                }
                ImageData realmGet$imageData = ru_unicorn_ujin_data_realm_newsrealmproxyinterface.realmGet$imageData();
                if (realmGet$imageData != null) {
                    Long l = map2.get(realmGet$imageData);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_realm_ImageDataRealmProxy.insertOrUpdate(realm2, realmGet$imageData, map2));
                    }
                    Table.nativeSetLink(nativePtr, newsColumnInfo.imageDataIndex, j2, l.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, newsColumnInfo.imageDataIndex, j2);
                }
                OsList osList = new OsList(table.getUncheckedRow(j2), newsColumnInfo.imageListIndex);
                RealmList<ImageData> realmGet$imageList = ru_unicorn_ujin_data_realm_newsrealmproxyinterface.realmGet$imageList();
                if (realmGet$imageList == null || ((long) realmGet$imageList.size()) != osList.size()) {
                    osList.removeAll();
                    if (realmGet$imageList != null) {
                        Iterator<ImageData> it2 = realmGet$imageList.iterator();
                        while (it2.hasNext()) {
                            ImageData next = it2.next();
                            Long l2 = map2.get(next);
                            if (l2 == null) {
                                l2 = Long.valueOf(ru_unicorn_ujin_data_realm_ImageDataRealmProxy.insertOrUpdate(realm2, next, map2));
                            }
                            osList.addRow(l2.longValue());
                        }
                    }
                } else {
                    int size = realmGet$imageList.size();
                    for (int i = 0; i < size; i++) {
                        ImageData imageData = realmGet$imageList.get(i);
                        Long l3 = map2.get(imageData);
                        if (l3 == null) {
                            l3 = Long.valueOf(ru_unicorn_ujin_data_realm_ImageDataRealmProxy.insertOrUpdate(realm2, imageData, map2));
                        }
                        osList.setRow((long) i, l3.longValue());
                    }
                }
                j3 = j;
            }
        }
    }

    public static News createDetachedCopy(News news, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        News news2;
        if (i > i2 || news == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(news);
        if (cacheData == null) {
            news2 = new News();
            map.put(news, new RealmObjectProxy.CacheData(i, news2));
        } else if (i >= cacheData.minDepth) {
            return (News) cacheData.object;
        } else {
            cacheData.minDepth = i;
            news2 = (News) cacheData.object;
        }
        ru_unicorn_ujin_data_realm_NewsRealmProxyInterface ru_unicorn_ujin_data_realm_newsrealmproxyinterface = news2;
        ru_unicorn_ujin_data_realm_NewsRealmProxyInterface ru_unicorn_ujin_data_realm_newsrealmproxyinterface2 = news;
        ru_unicorn_ujin_data_realm_newsrealmproxyinterface.realmSet$id(ru_unicorn_ujin_data_realm_newsrealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_data_realm_newsrealmproxyinterface.realmSet$title(ru_unicorn_ujin_data_realm_newsrealmproxyinterface2.realmGet$title());
        ru_unicorn_ujin_data_realm_newsrealmproxyinterface.realmSet$text(ru_unicorn_ujin_data_realm_newsrealmproxyinterface2.realmGet$text());
        ru_unicorn_ujin_data_realm_newsrealmproxyinterface.realmSet$dateText(ru_unicorn_ujin_data_realm_newsrealmproxyinterface2.realmGet$dateText());
        int i3 = i + 1;
        ru_unicorn_ujin_data_realm_newsrealmproxyinterface.realmSet$imageData(ru_unicorn_ujin_data_realm_ImageDataRealmProxy.createDetachedCopy(ru_unicorn_ujin_data_realm_newsrealmproxyinterface2.realmGet$imageData(), i3, i2, map));
        if (i == i2) {
            ru_unicorn_ujin_data_realm_newsrealmproxyinterface.realmSet$imageList((RealmList<ImageData>) null);
        } else {
            RealmList<ImageData> realmGet$imageList = ru_unicorn_ujin_data_realm_newsrealmproxyinterface2.realmGet$imageList();
            RealmList realmList = new RealmList();
            ru_unicorn_ujin_data_realm_newsrealmproxyinterface.realmSet$imageList(realmList);
            int size = realmGet$imageList.size();
            for (int i4 = 0; i4 < size; i4++) {
                realmList.add(ru_unicorn_ujin_data_realm_ImageDataRealmProxy.createDetachedCopy(realmGet$imageList.get(i4), i3, i2, map));
            }
        }
        return news2;
    }

    static News update(Realm realm, NewsColumnInfo newsColumnInfo, News news, News news2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        ru_unicorn_ujin_data_realm_NewsRealmProxyInterface ru_unicorn_ujin_data_realm_newsrealmproxyinterface = news;
        ru_unicorn_ujin_data_realm_NewsRealmProxyInterface ru_unicorn_ujin_data_realm_newsrealmproxyinterface2 = news2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(News.class), newsColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(newsColumnInfo.idIndex, ru_unicorn_ujin_data_realm_newsrealmproxyinterface2.realmGet$id());
        osObjectBuilder.addString(newsColumnInfo.titleIndex, ru_unicorn_ujin_data_realm_newsrealmproxyinterface2.realmGet$title());
        osObjectBuilder.addString(newsColumnInfo.textIndex, ru_unicorn_ujin_data_realm_newsrealmproxyinterface2.realmGet$text());
        osObjectBuilder.addString(newsColumnInfo.dateTextIndex, ru_unicorn_ujin_data_realm_newsrealmproxyinterface2.realmGet$dateText());
        ImageData realmGet$imageData = ru_unicorn_ujin_data_realm_newsrealmproxyinterface2.realmGet$imageData();
        if (realmGet$imageData == null) {
            osObjectBuilder.addNull(newsColumnInfo.imageDataIndex);
        } else {
            ImageData imageData = (ImageData) map.get(realmGet$imageData);
            if (imageData != null) {
                osObjectBuilder.addObject(newsColumnInfo.imageDataIndex, imageData);
            } else {
                osObjectBuilder.addObject(newsColumnInfo.imageDataIndex, ru_unicorn_ujin_data_realm_ImageDataRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_ImageDataRealmProxy.ImageDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ImageData.class), realmGet$imageData, true, map, set));
            }
        }
        RealmList<ImageData> realmGet$imageList = ru_unicorn_ujin_data_realm_newsrealmproxyinterface2.realmGet$imageList();
        if (realmGet$imageList != null) {
            RealmList realmList = new RealmList();
            for (int i = 0; i < realmGet$imageList.size(); i++) {
                ImageData imageData2 = realmGet$imageList.get(i);
                ImageData imageData3 = (ImageData) map.get(imageData2);
                if (imageData3 != null) {
                    realmList.add(imageData3);
                } else {
                    realmList.add(ru_unicorn_ujin_data_realm_ImageDataRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_ImageDataRealmProxy.ImageDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ImageData.class), imageData2, true, map, set));
                }
            }
            osObjectBuilder.addObjectList(newsColumnInfo.imageListIndex, realmList);
        } else {
            osObjectBuilder.addObjectList(newsColumnInfo.imageListIndex, new RealmList());
        }
        osObjectBuilder.updateExistingObject();
        return news;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("News = proxy[");
        sb.append("{id:");
        sb.append(realmGet$id());
        sb.append("}");
        sb.append(",");
        sb.append("{title:");
        sb.append(realmGet$title());
        sb.append("}");
        sb.append(",");
        sb.append("{text:");
        sb.append(realmGet$text());
        sb.append("}");
        sb.append(",");
        sb.append("{dateText:");
        sb.append(realmGet$dateText());
        sb.append("}");
        sb.append(",");
        sb.append("{imageData:");
        sb.append(realmGet$imageData() != null ? ru_unicorn_ujin_data_realm_ImageDataRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME : "null");
        sb.append("}");
        sb.append(",");
        sb.append("{imageList:");
        sb.append("RealmList<ImageData>[");
        sb.append(realmGet$imageList().size());
        sb.append("]");
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
        ru_unicorn_ujin_data_realm_NewsRealmProxy ru_unicorn_ujin_data_realm_newsrealmproxy = (ru_unicorn_ujin_data_realm_NewsRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_newsrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_newsrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_newsrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
