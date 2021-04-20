package p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.ProfileEditFieldLabel;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.ProfileFieldLabel;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserData;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserProfile;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserVehicle;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.profile_my.FullProfileMapper */
public class FullProfileMapper implements Diffable<FullProfileMapper> {
    private String extractedValue;
    private String field;
    private FieldTypes fieldType;
    private String value;

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.profile_my.FullProfileMapper$FieldTypes */
    public enum FieldTypes {
        STRING,
        GENDER,
        AUTO
    }

    public FullProfileMapper(String str, String str2, FieldTypes fieldTypes) {
        this.field = str;
        this.value = str2;
        this.fieldType = fieldTypes;
    }

    public static List<FullProfileMapper> mapTo(CabinetProfile cabinetProfile) {
        ArrayList arrayList = new ArrayList();
        for (Field field2 : cabinetProfile.getClass().getDeclaredFields()) {
            field2.setAccessible(true);
            Object obj = null;
            try {
                obj = field2.get(cabinetProfile);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            if (obj != null) {
                System.out.println(field2.getName() + "=" + obj);
            } else {
                obj = "-";
            }
            arrayList.add(new FullProfileMapper(field2.getName(), obj.toString(), FieldTypes.STRING));
        }
        return arrayList;
    }

    public static List<FullProfileMapper> mapTo(UserProfile userProfile, Boolean bool) {
        return bool.booleanValue() ? editMapTo(userProfile) : viewMapTo(userProfile);
    }

    public static List<FullProfileMapper> viewMapTo(UserProfile userProfile) {
        ArrayList arrayList = new ArrayList();
        UserData userdata = userProfile.getUserdata();
        for (ProfileFieldLabel profileFieldLabel : ProfileFieldLabel.values()) {
            Field[] declaredFields = userdata.getClass().getDeclaredFields();
            int length = declaredFields.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    Field field2 = declaredFields[i];
                    if (profileFieldLabel.name().toLowerCase().equals(field2.getName())) {
                        arrayList.add(mapTo(field2, userdata, false));
                        break;
                    }
                    i++;
                } else {
                    if (!userProfile.getVehicles().isEmpty()) {
                        UserVehicle userVehicle = userProfile.getVehicles().get(0);
                        Field[] declaredFields2 = userVehicle.getClass().getDeclaredFields();
                        int length2 = declaredFields2.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length2) {
                                break;
                            }
                            Field field3 = declaredFields2[i2];
                            if (profileFieldLabel.name().toLowerCase().equals(field3.getName())) {
                                arrayList.add(mapTo(field3, userVehicle, false));
                                break;
                            }
                            i2++;
                        }
                    }
                    arrayList.add(new FullProfileMapper(profileFieldLabel.name().toLowerCase(), "-", FieldTypes.STRING));
                }
            }
        }
        return arrayList;
    }

    public static List<FullProfileMapper> editMapTo(UserProfile userProfile) {
        ArrayList arrayList = new ArrayList();
        UserData userdata = userProfile.getUserdata();
        for (ProfileEditFieldLabel profileEditFieldLabel : ProfileEditFieldLabel.values()) {
            Field[] declaredFields = userdata.getClass().getDeclaredFields();
            int length = declaredFields.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    Field field2 = declaredFields[i];
                    if (profileEditFieldLabel.name().toLowerCase().equals(field2.getName())) {
                        arrayList.add(mapTo(field2, userdata, true));
                        break;
                    }
                    i++;
                } else {
                    if (!userProfile.getVehicles().isEmpty()) {
                        UserVehicle userVehicle = userProfile.getVehicles().get(0);
                        Field[] declaredFields2 = userVehicle.getClass().getDeclaredFields();
                        int length2 = declaredFields2.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length2) {
                                break;
                            }
                            Field field3 = declaredFields2[i2];
                            if (profileEditFieldLabel.name().toLowerCase().equals(field3.getName())) {
                                arrayList.add(mapTo(field3, userVehicle, true));
                                break;
                            }
                            i2++;
                        }
                    }
                    arrayList.add(new FullProfileMapper(profileEditFieldLabel.name().toLowerCase(), "", FieldTypes.STRING));
                }
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.FullProfileMapper mapTo(java.lang.reflect.Field r1, java.lang.Object r2, java.lang.Boolean r3) {
        /*
            r0 = 1
            r1.setAccessible(r0)
            java.lang.Object r2 = r1.get(r2)     // Catch:{ IllegalAccessException -> 0x000e, IllegalArgumentException -> 0x0009 }
            goto L_0x0013
        L_0x0009:
            r2 = move-exception
            r2.printStackTrace()
            goto L_0x0012
        L_0x000e:
            r2 = move-exception
            r2.printStackTrace()
        L_0x0012:
            r2 = 0
        L_0x0013:
            if (r2 == 0) goto L_0x001f
            java.lang.String r0 = r2.toString()
            boolean r0 = org.apache.commons.lang3.StringUtils.isBlank(r0)
            if (r0 == 0) goto L_0x002a
        L_0x001f:
            boolean r2 = r3.booleanValue()
            if (r2 == 0) goto L_0x0028
            java.lang.String r2 = ""
            goto L_0x002a
        L_0x0028:
            java.lang.String r2 = "-"
        L_0x002a:
            ru.unicorn.ujin.view.activity.navigation.ui.profile_my.FullProfileMapper r3 = new ru.unicorn.ujin.view.activity.navigation.ui.profile_my.FullProfileMapper
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = r2.toString()
            ru.unicorn.ujin.view.activity.navigation.ui.profile_my.FullProfileMapper$FieldTypes r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.FullProfileMapper.FieldTypes.STRING
            r3.<init>(r1, r2, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.FullProfileMapper.mapTo(java.lang.reflect.Field, java.lang.Object, java.lang.Boolean):ru.unicorn.ujin.view.activity.navigation.ui.profile_my.FullProfileMapper");
    }

    public String getField() {
        return this.field;
    }

    public void setField(String str) {
        this.field = str;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public void setExtractedValue(String str) {
        this.extractedValue = str;
    }

    public String getExtractedValue() {
        return this.extractedValue;
    }

    public FieldTypes getFieldType() {
        return this.fieldType;
    }

    public void setFieldType(FieldTypes fieldTypes) {
        this.fieldType = fieldTypes;
    }

    public boolean areItemsTheSame(FullProfileMapper fullProfileMapper) {
        return this.field.equals(fullProfileMapper.field);
    }

    public boolean areContentsTheSame(FullProfileMapper fullProfileMapper) {
        return this.value.equals(fullProfileMapper.value);
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.profile_my.FullProfileMapper$GENDER */
    public enum GENDER {
        MALE("Мужской"),
        FEMALE("Женский");
        
        private final String val;

        private GENDER(String str) {
            this.val = str;
        }

        public static String getName(String str) {
            for (GENDER gender : values()) {
                if (gender.val.contains(str.replace(".", ""))) {
                    return gender.name().toLowerCase();
                }
            }
            return null;
        }

        public static String getViewName(String str) {
            if (!str.isEmpty() && str.length() >= 3) {
                for (GENDER gender : values()) {
                    if (gender.val.equals(str) || gender.val.contains(str.substring(0, 3))) {
                        return gender.getVal();
                    }
                }
            }
            return "Не указан";
        }

        public String getVal() {
            return this.val;
        }
    }
}
