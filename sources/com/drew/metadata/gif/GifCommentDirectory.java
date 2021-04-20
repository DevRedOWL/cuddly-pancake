package com.drew.metadata.gif;

import com.drew.metadata.Directory;
import com.drew.metadata.StringValue;
import java.util.HashMap;
import p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CommentRealmProxy;

public class GifCommentDirectory extends Directory {
    public static final int TAG_COMMENT = 1;
    protected static final HashMap<Integer, String> _tagNameMap = new HashMap<>();

    public String getName() {
        return "GIF Comment";
    }

    static {
        _tagNameMap.put(1, ru_unicorn_ujin_data_realm_marketplace_CommentRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
    }

    public GifCommentDirectory(StringValue stringValue) {
        setDescriptor(new GifCommentDescriptor(this));
        setStringValue(1, stringValue);
    }

    /* access modifiers changed from: protected */
    public HashMap<Integer, String> getTagNameMap() {
        return _tagNameMap;
    }
}
