package com.drew.metadata.photoshop;

import com.bumptech.glide.Registry;
import com.drew.metadata.TagDescriptor;

public class PsdHeaderDescriptor extends TagDescriptor<PsdHeaderDirectory> {
    public PsdHeaderDescriptor(PsdHeaderDirectory psdHeaderDirectory) {
        super(psdHeaderDirectory);
    }

    public String getDescription(int i) {
        if (i == 1) {
            return getChannelCountDescription();
        }
        if (i == 2) {
            return getImageHeightDescription();
        }
        if (i == 3) {
            return getImageWidthDescription();
        }
        if (i == 4) {
            return getBitsPerChannelDescription();
        }
        if (i != 5) {
            return super.getDescription(i);
        }
        return getColorModeDescription();
    }

    public String getChannelCountDescription() {
        Integer integer = ((PsdHeaderDirectory) this._directory).getInteger(1);
        if (integer == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(integer);
        sb.append(" channel");
        sb.append(integer.intValue() == 1 ? "" : "s");
        return sb.toString();
    }

    public String getBitsPerChannelDescription() {
        Integer integer = ((PsdHeaderDirectory) this._directory).getInteger(4);
        if (integer == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(integer);
        sb.append(" bit");
        sb.append(integer.intValue() == 1 ? "" : "s");
        sb.append(" per channel");
        return sb.toString();
    }

    public String getColorModeDescription() {
        return getIndexedDescription(5, Registry.BUCKET_BITMAP, "Grayscale", "Indexed", "RGB", "CMYK", null, null, "Multichannel", "Duotone", "Lab");
    }

    public String getImageHeightDescription() {
        Integer integer = ((PsdHeaderDirectory) this._directory).getInteger(2);
        if (integer == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(integer);
        sb.append(" pixel");
        sb.append(integer.intValue() == 1 ? "" : "s");
        return sb.toString();
    }

    public String getImageWidthDescription() {
        try {
            Integer integer = ((PsdHeaderDirectory) this._directory).getInteger(3);
            if (integer == null) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(integer);
            sb.append(" pixel");
            sb.append(integer.intValue() == 1 ? "" : "s");
            return sb.toString();
        } catch (Exception unused) {
            return null;
        }
    }
}
