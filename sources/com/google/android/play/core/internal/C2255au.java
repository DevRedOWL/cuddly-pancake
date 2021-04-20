package com.google.android.play.core.internal;

import android.content.res.AssetManager;
import com.google.android.play.core.splitcompat.C2330a;
import java.io.File;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.google.android.play.core.internal.au */
public final class C2255au {

    /* renamed from: a */
    private final C2330a f1938a;

    /* renamed from: b */
    private XmlPullParser f1939b;

    public C2255au(C2330a aVar) {
        this.f1938a = aVar;
    }

    /* renamed from: a */
    public final void mo33825a(AssetManager assetManager, File file) throws IOException {
        this.f1939b = assetManager.openXmlResourceParser(C2330a.m1406c(assetManager, file), "AndroidManifest.xml");
    }

    /* renamed from: b */
    public final long mo33826b() throws IOException, XmlPullParserException {
        if (this.f1939b != null) {
            while (true) {
                int next = this.f1939b.next();
                if (next != 2) {
                    if (next == 1) {
                        break;
                    }
                } else if (this.f1939b.getName().equals("manifest")) {
                    String attributeValue = this.f1939b.getAttributeValue("http://schemas.android.com/apk/res/android", "versionCode");
                    String attributeValue2 = this.f1939b.getAttributeValue("http://schemas.android.com/apk/res/android", "versionCodeMajor");
                    if (attributeValue != null) {
                        try {
                            int parseInt = Integer.parseInt(attributeValue);
                            if (attributeValue2 == null) {
                                return (long) parseInt;
                            }
                            try {
                                return (((long) Integer.parseInt(attributeValue2)) << 32) | (((long) parseInt) & 4294967295L);
                            } catch (NumberFormatException e) {
                                throw new XmlPullParserException(String.format("Couldn't parse versionCodeMajor to int: %s", new Object[]{e.getMessage()}));
                            }
                        } catch (NumberFormatException e2) {
                            throw new XmlPullParserException(String.format("Couldn't parse versionCode to int: %s", new Object[]{e2.getMessage()}));
                        }
                    } else {
                        throw new XmlPullParserException("Manifest entry doesn't contain 'versionCode' attribute.");
                    }
                }
            }
            throw new XmlPullParserException("Couldn't find manifest entry at top-level.");
        }
        throw new XmlPullParserException("Manifest file needs to be loaded before parsing.");
    }
}
