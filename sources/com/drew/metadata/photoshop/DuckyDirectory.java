package com.drew.metadata.photoshop;

import androidx.exifinterface.media.ExifInterface;
import com.drew.metadata.Directory;
import com.drew.metadata.TagDescriptor;
import java.util.HashMap;
import p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CommentRealmProxy;

public class DuckyDirectory extends Directory {
    public static final int TAG_COMMENT = 2;
    public static final int TAG_COPYRIGHT = 3;
    public static final int TAG_QUALITY = 1;
    protected static final HashMap<Integer, String> _tagNameMap = new HashMap<>();

    public String getName() {
        return "Ducky";
    }

    static {
        _tagNameMap.put(1, "Quality");
        _tagNameMap.put(2, ru_unicorn_ujin_data_realm_marketplace_CommentRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        _tagNameMap.put(3, ExifInterface.TAG_COPYRIGHT);
    }

    public DuckyDirectory() {
        setDescriptor(new TagDescriptor(this));
    }

    /* access modifiers changed from: protected */
    public HashMap<Integer, String> getTagNameMap() {
        return _tagNameMap;
    }
}
