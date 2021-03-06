package com.loopj.android.http;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;
import p042cz.msebera.android.httpclient.cookie.Cookie;
import p042cz.msebera.android.httpclient.impl.cookie.BasicClientCookie;

public class SerializableCookie implements Serializable {
    private static final long serialVersionUID = 6374381828722046732L;
    private transient BasicClientCookie clientCookie;
    private final transient Cookie cookie;

    public SerializableCookie(Cookie cookie2) {
        this.cookie = cookie2;
    }

    public Cookie getCookie() {
        Cookie cookie2 = this.cookie;
        BasicClientCookie basicClientCookie = this.clientCookie;
        return basicClientCookie != null ? basicClientCookie : cookie2;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(this.cookie.getName());
        objectOutputStream.writeObject(this.cookie.getValue());
        objectOutputStream.writeObject(this.cookie.getComment());
        objectOutputStream.writeObject(this.cookie.getDomain());
        objectOutputStream.writeObject(this.cookie.getExpiryDate());
        objectOutputStream.writeObject(this.cookie.getPath());
        objectOutputStream.writeInt(this.cookie.getVersion());
        objectOutputStream.writeBoolean(this.cookie.isSecure());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.clientCookie = new BasicClientCookie((String) objectInputStream.readObject(), (String) objectInputStream.readObject());
        this.clientCookie.setComment((String) objectInputStream.readObject());
        this.clientCookie.setDomain((String) objectInputStream.readObject());
        this.clientCookie.setExpiryDate((Date) objectInputStream.readObject());
        this.clientCookie.setPath((String) objectInputStream.readObject());
        this.clientCookie.setVersion(objectInputStream.readInt());
        this.clientCookie.setSecure(objectInputStream.readBoolean());
    }
}
