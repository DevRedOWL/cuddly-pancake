package org.linphone;

public class LinphoneException extends Exception {
    public LinphoneException() {
    }

    public LinphoneException(String str) {
        super(str);
    }

    public LinphoneException(Throwable th) {
        super(th);
    }

    public LinphoneException(String str, Throwable th) {
        super(str, th);
    }
}
