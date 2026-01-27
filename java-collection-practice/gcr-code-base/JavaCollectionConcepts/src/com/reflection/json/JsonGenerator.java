package com.reflection.json;
import java.lang.reflect.Field;

public class JsonGenerator {

    public static String toJson(Object obj) {

        StringBuilder json = new StringBuilder();
        json.append("{");

        Class<?> clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();

        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            field.setAccessible(true); // allow access to private fields

            try {
                json.append("\"")
                    .append(field.getName())
                    .append("\": ");

                Object value = field.get(obj);

                // Add quotes for String values
                if (value instanceof String) {
                    json.append("\"").append(value).append("\"");
                } else {
                    json.append(value);
                }

                if (i < fields.length - 1) {
                    json.append(", ");
                }

            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        json.append("}");
        return json.toString();
    }

    // Driver
    public static void main(String[] args) {

        Student student = new Student(101, "Alice", 8.75);
        String json = toJson(student);

        System.out.println(json);
    }
}
