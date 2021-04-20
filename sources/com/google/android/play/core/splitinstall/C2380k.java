package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.util.Log;
import com.google.android.play.core.splitcompat.C2345p;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.google.android.play.core.splitinstall.k */
public final class C2380k {

    /* renamed from: a */
    private static C2382m f2113a;

    private C2380k() {
    }

    /* renamed from: a */
    public static synchronized C2382m m1526a(Context context) {
        C2382m mVar;
        synchronized (C2380k.class) {
            if (f2113a == null) {
                C2371b bVar = new C2371b((byte[]) null);
                bVar.mo34021b(new C2404x(C2345p.m1447c(context)));
                f2113a = bVar.mo34020a();
            }
            mVar = f2113a;
        }
        return mVar;
    }

    /* renamed from: b */
    static C2377h m1527b(XmlPullParser xmlPullParser, C2376g gVar) {
        String c;
        while (xmlPullParser.next() != 1) {
            try {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("splits")) {
                        while (xmlPullParser.next() != 3) {
                            if (xmlPullParser.getEventType() == 2) {
                                if (!xmlPullParser.getName().equals("module") || (c = m1528c("name", xmlPullParser)) == null) {
                                    m1529d(xmlPullParser);
                                } else {
                                    while (xmlPullParser.next() != 3) {
                                        if (xmlPullParser.getEventType() == 2) {
                                            if (xmlPullParser.getName().equals("language")) {
                                                while (xmlPullParser.next() != 3) {
                                                    if (xmlPullParser.getEventType() == 2) {
                                                        if (xmlPullParser.getName().equals("entry")) {
                                                            String c2 = m1528c("key", xmlPullParser);
                                                            String c3 = m1528c("split", xmlPullParser);
                                                            m1529d(xmlPullParser);
                                                            if (!(c2 == null || c3 == null)) {
                                                                gVar.mo34029b(c, c2, c3);
                                                            }
                                                        } else {
                                                            m1529d(xmlPullParser);
                                                        }
                                                    }
                                                }
                                            } else {
                                                m1529d(xmlPullParser);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        m1529d(xmlPullParser);
                    }
                }
            } catch (IOException | IllegalStateException | XmlPullParserException e) {
                Log.e("SplitInstall", "Error while parsing splits.xml", e);
                return null;
            }
        }
        return gVar.mo34028a();
    }

    /* renamed from: c */
    private static String m1528c(String str, XmlPullParser xmlPullParser) {
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    /* renamed from: d */
    private static void m1529d(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        int i = 1;
        while (i != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }
}
