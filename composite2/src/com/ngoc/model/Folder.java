package com.ngoc.model;

import java.util.ArrayList;
import java.util.List;

public class Folder implements Component {
    private String tenFolder;
    private long size;
    private String path;
    private List<Component> components = new ArrayList<>();

    public Folder(String tenFolder, long size) {
        this.tenFolder = tenFolder;
        this.size = size;
        this.path = tenFolder;  // Initial path is the folder name itself
    }

    public String getTenFolder() {
        return tenFolder;
    }

    public void setTenFolder(String tenFolder) {
        this.tenFolder = tenFolder;
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
        long totalSize = this.size;
        for (Component component : components) {
            totalSize += component.getTotalSize();
        }
        return totalSize;
    }

    public void addFile(Component component) {
        component.setPath(this.path + "/" + component.getPath());
        components.add(component);
    }

    public void removeFile(Component component) {
        components.remove(component);
    }

    @Override
    public void showDetails(String indent) {
        System.out.println(indent + "Folder: " + tenFolder + ", Size: " + getTotalSize() + ", Path: " + path);
        for (Component component : components) {
            component.showDetails(indent + "    ");
        }
    }
}
