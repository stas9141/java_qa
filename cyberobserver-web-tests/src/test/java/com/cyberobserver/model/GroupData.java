package com.cyberobserver.model;

public class GroupData {
    private final String name;
    private final String description;

    public GroupData(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
