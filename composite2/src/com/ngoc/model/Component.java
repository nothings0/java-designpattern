package com.ngoc.model;

public interface Component {
    String getPath();
    void setPath(String path);
    long getTotalSize();
    void showDetails(String indent);
}
