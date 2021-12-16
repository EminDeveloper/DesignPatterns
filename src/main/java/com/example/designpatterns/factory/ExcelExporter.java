package com.example.designpatterns.factory;

class ExcelExporter implements FileExporter {
    @Override
    public String export(String content) {
        return "EXCEL -> " + content;
    }
}