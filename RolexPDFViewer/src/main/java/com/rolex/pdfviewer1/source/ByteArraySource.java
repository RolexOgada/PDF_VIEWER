package com.rolex.pdfviewer1.source;

import android.content.Context;

import com.rolex.pdfviewer1.shockwave.pdfium.PdfDocument;
import com.rolex.pdfviewer1.shockwave.pdfium.PdfiumCore;

import java.io.IOException;

public class ByteArraySource implements DocumentSource {

    private byte[] data;

    public ByteArraySource(byte[] data) {
        this.data = data;
    }

    @Override
    public PdfDocument createDocument(Context context, PdfiumCore core, String password) throws IOException {
        return core.newDocument(data, password);
    }
}
