package com.reflection.map;
import java.lang.reflect.Field;
import java.util.Map;

public class ObjectMapperUtil {

    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) {

        try {
            // Create object using no-arg constructor
            T obj = clazz.getDeclaredConstructor().newInstance();

            // Iterate over fields
            for (Field field : clazz.getDeclaredFields()) {

                field.setAccessible(true);

                String fieldName = field.getName();

                // If map contains matching key
                if (properties.containsKey(fieldName)) {
                    Object value = properties.get(fieldName);

                    // Set field value
                    field.set(obj, value);
                }
            }
            return obj;

        } catch (Exception e) {
            throw new RuntimeException("Object mapping failed", e);
        }
    }
}
