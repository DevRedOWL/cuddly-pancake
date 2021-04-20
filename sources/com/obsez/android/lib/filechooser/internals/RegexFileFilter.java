package com.obsez.android.lib.filechooser.internals;

import java.io.File;
import java.io.FileFilter;
import java.util.regex.Pattern;

public class RegexFileFilter implements FileFilter {
    boolean m_allowHidden;
    boolean m_onlyDirectory;
    Pattern m_pattern;

    public RegexFileFilter() {
        this((Pattern) null);
    }

    public RegexFileFilter(Pattern pattern) {
        this(false, false, pattern);
    }

    public RegexFileFilter(boolean z, boolean z2, String str) {
        this.m_allowHidden = z2;
        this.m_onlyDirectory = z;
        this.m_pattern = Pattern.compile(str, 2);
    }

    public RegexFileFilter(boolean z, boolean z2, String str, int i) {
        this.m_allowHidden = z2;
        this.m_onlyDirectory = z;
        this.m_pattern = Pattern.compile(str, i);
    }

    public RegexFileFilter(boolean z, boolean z2, Pattern pattern) {
        this.m_allowHidden = z2;
        this.m_onlyDirectory = z;
        this.m_pattern = pattern;
    }

    public boolean accept(File file) {
        if (!this.m_allowHidden && file.isHidden()) {
            return false;
        }
        if (this.m_onlyDirectory && !file.isDirectory()) {
            return false;
        }
        if (this.m_pattern == null || file.isDirectory()) {
            return true;
        }
        if (this.m_pattern.matcher(file.getName()).matches()) {
            return true;
        }
        return false;
    }
}
