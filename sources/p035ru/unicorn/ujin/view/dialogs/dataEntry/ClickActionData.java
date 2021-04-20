package p035ru.unicorn.ujin.view.dialogs.dataEntry;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\u0018\u00002\u00020\u0001:\u0001$Bo\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\rR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000f\"\u0004\b\u001f\u0010\u0011R(\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006%"}, mo51343d2 = {"Lru/unicorn/ujin/view/dialogs/dataEntry/ClickActionData;", "", "handleAction", "", "fields", "Ljava/util/ArrayList;", "fieldsToBeValid", "data", "params", "", "dataFields", "Ljava/util/HashMap;", "confirmMessage", "(Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;Ljava/util/Map;Ljava/util/HashMap;Ljava/lang/String;)V", "getConfirmMessage", "()Ljava/lang/String;", "setConfirmMessage", "(Ljava/lang/String;)V", "getData", "setData", "getDataFields", "()Ljava/util/HashMap;", "setDataFields", "(Ljava/util/HashMap;)V", "getFields", "()Ljava/util/ArrayList;", "setFields", "(Ljava/util/ArrayList;)V", "getFieldsToBeValid", "setFieldsToBeValid", "getHandleAction", "setHandleAction", "getParams", "()Ljava/util/Map;", "setParams", "(Ljava/util/Map;)V", "JsonFields", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.dialogs.dataEntry.ClickActionData */
/* compiled from: DataEntryItem.kt */
public final class ClickActionData {
    private String confirmMessage;
    private String data;
    private HashMap<String, Object> dataFields;
    private ArrayList<String> fields;
    private ArrayList<String> fieldsToBeValid;
    private String handleAction;
    private Map<String, String> params;

    public ClickActionData(String str, ArrayList<String> arrayList, ArrayList<String> arrayList2, String str2, Map<String, String> map, HashMap<String, Object> hashMap, String str3) {
        this.handleAction = str;
        this.fields = arrayList;
        this.fieldsToBeValid = arrayList2;
        this.data = str2;
        this.params = map;
        this.dataFields = hashMap;
        this.confirmMessage = str3;
    }

    public final String getHandleAction() {
        return this.handleAction;
    }

    public final void setHandleAction(String str) {
        this.handleAction = str;
    }

    public final ArrayList<String> getFields() {
        return this.fields;
    }

    public final void setFields(ArrayList<String> arrayList) {
        this.fields = arrayList;
    }

    public final ArrayList<String> getFieldsToBeValid() {
        return this.fieldsToBeValid;
    }

    public final void setFieldsToBeValid(ArrayList<String> arrayList) {
        this.fieldsToBeValid = arrayList;
    }

    public final String getData() {
        return this.data;
    }

    public final void setData(String str) {
        this.data = str;
    }

    public final Map<String, String> getParams() {
        return this.params;
    }

    public final void setParams(Map<String, String> map) {
        this.params = map;
    }

    public final HashMap<String, Object> getDataFields() {
        return this.dataFields;
    }

    public final void setDataFields(HashMap<String, Object> hashMap) {
        this.dataFields = hashMap;
    }

    public final String getConfirmMessage() {
        return this.confirmMessage;
    }

    public final void setConfirmMessage(String str) {
        this.confirmMessage = str;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006¨\u0006\u0015"}, mo51343d2 = {"Lru/unicorn/ujin/view/dialogs/dataEntry/ClickActionData$JsonFields;", "", "()V", "confirmMessage", "", "getConfirmMessage", "()Ljava/lang/String;", "data", "getData", "dataFields", "getDataFields", "fields", "getFields", "fieldsToBeValid", "getFieldsToBeValid", "handleAction", "getHandleAction", "method", "getMethod", "params", "getParams", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.dialogs.dataEntry.ClickActionData$JsonFields */
    /* compiled from: DataEntryItem.kt */
    public static final class JsonFields {
        public static final JsonFields INSTANCE = new JsonFields();
        private static final String confirmMessage = "confirm_message";
        private static final String data = "data";
        private static final String dataFields = "data_fields";
        private static final String fields = "fields";
        private static final String fieldsToBeValid = "fields_to_be_valid";
        private static final String handleAction = "handle_action";
        private static final String method = FirebaseAnalytics.Param.METHOD;
        private static final String params = "params";

        private JsonFields() {
        }

        public final String getHandleAction() {
            return handleAction;
        }

        public final String getFields() {
            return fields;
        }

        public final String getMethod() {
            return method;
        }

        public final String getData() {
            return data;
        }

        public final String getFieldsToBeValid() {
            return fieldsToBeValid;
        }

        public final String getParams() {
            return params;
        }

        public final String getConfirmMessage() {
            return confirmMessage;
        }

        public final String getDataFields() {
            return dataFields;
        }
    }
}
