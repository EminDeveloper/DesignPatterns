package com.example.designpatterns.factory;

class PdfExporter implements FileExporter {
    @Override
    public String export(String content) {
        return "PDF-> " + content;
    }
}