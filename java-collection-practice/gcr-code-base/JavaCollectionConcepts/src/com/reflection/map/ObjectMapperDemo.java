package com.reflection.map;
import java.util.HashMap;
import java.util.Map;

public class ObjectMapperDemo {

    public static void main(String[] args) {

        Map<String, Object> data = new HashMap<>();
        data.put("id", 101);
        data.put("name", "Ayush");
        data.put("department", "CSE");
        data.put("salary", 995000.0);

        Employee emp = ObjectMapperUtil.toObject(Employee.class, data);

        System.out.println(emp);
    }
}
