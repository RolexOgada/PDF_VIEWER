
package com.rolex.pdfviewer1.listener;

import android.graphics.Canvas;


public interface OnDrawListener {

    void onLayerDrawn(Canvas canvas, float pageWidth, float pageHeight, int displayedPage);
}
