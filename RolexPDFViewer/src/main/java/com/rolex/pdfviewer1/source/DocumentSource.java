package com.rolex.pdfviewer1.source;

import android.content.Context;

import com.rolex.pdfviewer1.shockwave.pdfium.PdfDocument;
import com.rolex.pdfviewer1.shockwave.pdfium.PdfiumCore;

import java.io.IOException;

public interface DocumentSource {
    PdfDocument createDocument(Context context, PdfiumCore core, String password) throws IOException;
}
