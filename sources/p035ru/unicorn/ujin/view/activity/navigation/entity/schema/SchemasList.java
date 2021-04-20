package p035ru.unicorn.ujin.view.activity.navigation.entity.schema;

import com.google.gson.annotations.SerializedName;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.entity.schema.SchemasList */
public class SchemasList {
    @SerializedName("app_schema")
    private Schemas schemas;

    public Schemas getSchemas() {
        return this.schemas;
    }

    public void setSchemas(Schemas schemas2) {
        this.schemas = schemas2;
    }
}
