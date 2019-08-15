package com.arunraj.rest.model;

import java.io.File;

public class ClientFile {
    private String fileName;

    public ClientFile() {
    }

    public ClientFile(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}