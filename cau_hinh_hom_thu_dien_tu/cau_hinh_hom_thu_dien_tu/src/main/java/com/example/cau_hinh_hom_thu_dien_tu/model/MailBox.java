package com.example.cau_hinh_hom_thu_dien_tu.model;

public class MailBox {
    private String languages;
    private int size;
    private boolean filter;
    private String signature;

    public MailBox() {
    }

    public MailBox(String languages, int size, boolean filter, String signature) {
        this.languages = languages;
        this.size = size;
        this.filter = filter;
        this.signature = signature;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String language) {
        this.languages = language;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isFilter() {
        return filter;
    }

    public void setFilter(boolean filter) {
        this.filter = filter;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
