package com.drew.metadata.exif;

import java.util.HashMap;

public class ExifImageDirectory extends ExifDirectoryBase {
    protected static final HashMap<Integer, String> _tagNameMap = new HashMap<>();

    public String getName() {
        return "Exif Image";
    }

    static {
        addExifTagNames(_tagNameMap);
    }

    public ExifImageDirectory() {
        setDescriptor(new ExifImageDescriptor(this));
    }

    /* access modifiers changed from: protected */
    public HashMap<Integer, String> getTagNameMap() {
        return _tagNameMap;
    }
}
