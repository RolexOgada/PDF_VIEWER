package com.rolex.pdfviewer1.scroll;

import com.rolex.pdfviewer1.PDFView;

public interface ScrollHandle {

    
    void setScroll(float position);

    
    void setupLayout(PDFView pdfView);

    
    void destroyLayout();

    
    void setPageNum(int pageNum);

    
    boolean shown();

    
    void show();

    
    void hide();

    
    void hideDelayed();
}
