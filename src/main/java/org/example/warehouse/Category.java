package org.example.warehouse;

import java.util.HashMap;
import java.util.Map;

public class Category {
    private final String name;
    private static final Map<String, Category> categories = new HashMap<>();

    private Category(String name) {
        this.name = name;
    }
    public static Category of(String name) {
        if (name == null || name.isEmpty())
            throw new IllegalArgumentException("Category name can't be null");

        name = capitalize(name);

        if(!categories.containsKey(name)) {
            categories.put(name, new Category(name));
        }
        return categories.get(name);
    }
    public String getName() {
        return this.name;
    }
    private static String capitalize(String name) {
        if(name.isEmpty())
            return name;

        if (name.length() == 1)
            return name.toUpperCase();

        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }
}