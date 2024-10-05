package com.rolex.pdfviewer1.shockwave.pdfium;

import java.io.IOException;

public class PdfPasswordException extends IOException {

    public PdfPasswordException() {
        super();
    }
    public PdfPasswordException(String detailMessage) {
        super(detailMessage);
    }
}
