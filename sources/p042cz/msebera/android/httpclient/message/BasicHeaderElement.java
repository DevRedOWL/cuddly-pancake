package p042cz.msebera.android.httpclient.message;

import p042cz.msebera.android.httpclient.HeaderElement;
import p042cz.msebera.android.httpclient.NameValuePair;
import p042cz.msebera.android.httpclient.util.Args;
import p042cz.msebera.android.httpclient.util.LangUtils;

/* renamed from: cz.msebera.android.httpclient.message.BasicHeaderElement */
public class BasicHeaderElement implements HeaderElement, Cloneable {
    private final String name;
    private final NameValuePair[] parameters;
    private final String value;

    public BasicHeaderElement(String str, String str2, NameValuePair[] nameValuePairArr) {
        this.name = (String) Args.notNull(str, "Name");
        this.value = str2;
        if (nameValuePairArr != null) {
            this.parameters = nameValuePairArr;
        } else {
            this.parameters = new NameValuePair[0];
        }
    }

    public BasicHeaderElement(String str, String str2) {
        this(str, str2, (NameValuePair[]) null);
    }

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

    public NameValuePair[] getParameters() {
        return (NameValuePair[]) this.parameters.clone();
    }

    public int getParameterCount() {
        return this.parameters.length;
    }

    public NameValuePair getParameter(int i) {
        return this.parameters[i];
    }

    public NameValuePair getParameterByName(String str) {
        Args.notNull(str, "Name");
        for (NameValuePair nameValuePair : this.parameters) {
            if (nameValuePair.getName().equalsIgnoreCase(str)) {
                return nameValuePair;
            }
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeaderElement)) {
            return false;
        }
        BasicHeaderElement basicHeaderElement = (BasicHeaderElement) obj;
        if (!this.name.equals(basicHeaderElement.name) || !LangUtils.equals((Object) this.value, (Object) basicHeaderElement.value) || !LangUtils.equals((Object[]) this.parameters, (Object[]) basicHeaderElement.parameters)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = LangUtils.hashCode(LangUtils.hashCode(17, (Object) this.name), (Object) this.value);
        for (NameValuePair hashCode2 : this.parameters) {
            hashCode = LangUtils.hashCode(hashCode, (Object) hashCode2);
        }
        return hashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        if (this.value != null) {
            sb.append("=");
            sb.append(this.value);
        }
        for (NameValuePair append : this.parameters) {
            sb.append("; ");
            sb.append(append);
        }
        return sb.toString();
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
