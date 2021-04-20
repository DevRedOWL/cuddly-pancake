package com.obsez.android.lib.filechooser.internals;

import java.io.File;
import java.io.FileFilter;

public class ExtFileFilter implements FileFilter {
    boolean m_allowHidden;
    String[] m_ext;
    boolean m_onlyDirectory;

    public ExtFileFilter() {
        this(false, false, new String[0]);
    }

    public ExtFileFilter(String... strArr) {
        this(false, false, strArr);
    }

    public ExtFileFilter(boolean z, boolean z2, String... strArr) {
        this.m_allowHidden = z2;
        this.m_onlyDirectory = z;
        this.m_ext = strArr;
    }

    public boolean accept(File file) {
        if (!this.m_allowHidden && file.isHidden()) {
            return false;
        }
        if (this.m_onlyDirectory && !file.isDirectory()) {
            return false;
        }
        if (this.m_ext == null || file.isDirectory()) {
            return true;
        }
        String extensionWithoutDot = FileUtil.getExtensionWithoutDot(file);
        for (String equalsIgnoreCase : this.m_ext) {
            if (extensionWithoutDot.equalsIgnoreCase(equalsIgnoreCase)) {
                return true;
            }
        }
        return false;
    }
}
