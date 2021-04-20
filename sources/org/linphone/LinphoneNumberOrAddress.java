package org.linphone;

import java.io.Serializable;

public class LinphoneNumberOrAddress implements Serializable, Comparable<LinphoneNumberOrAddress> {
    private static final long serialVersionUID = -2301689469730072896L;
    private boolean isSIPAddress;
    private String oldValueForUpdatePurpose;
    private String value;

    public LinphoneNumberOrAddress(String str, boolean z) {
        this.value = str;
        this.isSIPAddress = z;
        this.oldValueForUpdatePurpose = null;
    }

    public LinphoneNumberOrAddress(String str, boolean z, String str2) {
        this(str, z);
        this.oldValueForUpdatePurpose = str2;
    }

    public int compareTo(LinphoneNumberOrAddress linphoneNumberOrAddress) {
        if (linphoneNumberOrAddress.isSIPAddress() == isSIPAddress()) {
            return linphoneNumberOrAddress.getValue().compareTo(getValue());
        }
        return isSIPAddress() ? -1 : 1;
    }

    public boolean isSIPAddress() {
        return this.isSIPAddress;
    }

    public String getOldValue() {
        return this.oldValueForUpdatePurpose;
    }

    public void setOldValue(String str) {
        this.oldValueForUpdatePurpose = str;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String str) {
        this.value = str;
    }
}
