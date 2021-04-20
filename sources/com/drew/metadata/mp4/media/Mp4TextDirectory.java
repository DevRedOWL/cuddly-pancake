package com.drew.metadata.mp4.media;

import java.util.HashMap;

public class Mp4TextDirectory extends Mp4MediaDirectory {
    protected static final HashMap<Integer, String> _tagNameMap = new HashMap<>();

    public String getName() {
        return "MP4 Text";
    }

    /* access modifiers changed from: protected */
    public HashMap<Integer, String> getTagNameMap() {
        return null;
    }

    public Mp4TextDirectory() {
        setDescriptor(new Mp4TextDescriptor(this));
    }

    static {
        Mp4MediaDirectory.addMp4MediaTags(_tagNameMap);
    }
}
