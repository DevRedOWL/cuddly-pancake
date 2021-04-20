package com.drew.metadata.exif;

import java.util.HashMap;

public class ExifThumbnailDirectory extends ExifDirectoryBase {
    @Deprecated
    public static final int TAG_THUMBNAIL_COMPRESSION = 259;
    public static final int TAG_THUMBNAIL_LENGTH = 514;
    public static final int TAG_THUMBNAIL_OFFSET = 513;
    protected static final HashMap<Integer, String> _tagNameMap = new HashMap<>();

    public String getName() {
        return "Exif Thumbnail";
    }

    static {
        addExifTagNames(_tagNameMap);
        _tagNameMap.put(513, "Thumbnail Offset");
        _tagNameMap.put(514, "Thumbnail Length");
    }

    public ExifThumbnailDirectory() {
        setDescriptor(new ExifThumbnailDescriptor(this));
    }

    /* access modifiers changed from: protected */
    public HashMap<Integer, String> getTagNameMap() {
        return _tagNameMap;
    }
}
