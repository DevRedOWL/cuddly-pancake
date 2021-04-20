package com.drew.metadata.jpeg;

import com.drew.metadata.Directory;
import java.util.HashMap;

public class JpegCommentDirectory extends Directory {
    public static final int TAG_COMMENT = 0;
    protected static final HashMap<Integer, String> _tagNameMap = new HashMap<>();

    public String getName() {
        return "JpegComment";
    }

    static {
        _tagNameMap.put(0, "JPEG Comment");
    }

    public JpegCommentDirectory() {
        setDescriptor(new JpegCommentDescriptor(this));
    }

    /* access modifiers changed from: protected */
    public HashMap<Integer, String> getTagNameMap() {
        return _tagNameMap;
    }
}
