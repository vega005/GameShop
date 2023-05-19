package com.sklepinternetowy.internetshop;

public enum Category {
    PLAYSTATION("Playstation"),
    XBOX("Xbox"),
    PC("PC"),
    NINTENDO("Nintendo");
    private final String displayName;

    private Category(String displayName) {
        this.displayName = displayName;
    }

    @Override public String toString() {
        return displayName;
    }
}
