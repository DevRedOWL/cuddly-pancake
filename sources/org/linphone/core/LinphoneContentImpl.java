package org.linphone.core;

public class LinphoneContentImpl implements LinphoneContent {
    private byte[] mData;
    private String mEncoding;
    private int mExpectedSize;
    private String mName;
    private String mSubtype;
    private String mType;

    public LinphoneContentImpl(String str, String str2, byte[] bArr, String str3) {
        this.mType = str;
        this.mSubtype = str2;
        this.mData = bArr;
        this.mEncoding = str3;
        this.mName = null;
        this.mExpectedSize = 0;
    }

    public LinphoneContentImpl(String str, String str2, String str3, byte[] bArr, String str4, int i) {
        this.mType = str2;
        this.mSubtype = str3;
        this.mData = bArr;
        this.mEncoding = str4;
        this.mName = str;
        this.mExpectedSize = i;
    }

    public String getType() {
        return this.mType;
    }

    public String getSubtype() {
        return this.mSubtype;
    }

    public String getDataAsString() {
        byte[] bArr = this.mData;
        if (bArr != null) {
            return new String(bArr);
        }
        return null;
    }

    public void setExpectedSize(int i) {
        this.mExpectedSize = i;
    }

    public int getExpectedSize() {
        return this.mExpectedSize;
    }

    public int getRealSize() {
        byte[] bArr = this.mData;
        if (bArr != null) {
            return bArr.length;
        }
        return 0;
    }

    public void setType(String str) {
        this.mType = str;
    }

    public void setSubtype(String str) {
        this.mSubtype = str;
    }

    public void setStringData(String str) {
        if (str != null) {
            this.mData = str.getBytes();
        } else {
            this.mData = null;
        }
    }

    public void setData(byte[] bArr) {
        this.mData = bArr;
    }

    public String getEncoding() {
        return this.mEncoding;
    }

    public byte[] getData() {
        return this.mData;
    }

    public void setEncoding(String str) {
        this.mEncoding = str;
    }

    public void setName(String str) {
        this.mName = str;
    }

    public String getName() {
        return this.mName;
    }
}
