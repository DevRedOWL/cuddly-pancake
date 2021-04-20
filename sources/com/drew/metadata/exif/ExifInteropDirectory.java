package com.drew.metadata.exif;

import java.util.HashMap;

public class ExifInteropDirectory extends ExifDirectoryBase {
    protected static final HashMap<Integer, String> _tagNameMap = new HashMap<>();

    public String getName() {
        return "Interoperability";
    }

    static {
        addExifTagNames(_tagNameMap);
    }

    public ExifInteropDirectory() {
        setDescriptor(new ExifInteropDescriptor(this));
    }

    /* access modifiers changed from: protected */
    public HashMap<Integer, String> getTagNameMap() {
        return _tagNameMap;
    }
}
