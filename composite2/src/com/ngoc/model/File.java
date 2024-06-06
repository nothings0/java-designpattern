package com.ngoc.model;

public class File implements Component {
    private String tenFile;
    private long size;
    private String path;
    
    public File(String tenFile, long size) {
        this.tenFile = tenFile;
        this.size = size;
        this.path = tenFile;  // Initial path is the file name itself
    }

    public String getTenFile() {
        return tenFile;
    }

    public void setTenFile(String tenFile) {
        this.tenFile = tenFile;
    }

    @Override
    public String getPath() {
        return path;
    }

    @Override
    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public long getTotalSize() {
        return this.size;
    }

    @Override
    public void showDetails(String indent) {
        System.out.println(indent + "File: " + tenFile + ", Size: " + size + ", Path: " + path);
    }
}
