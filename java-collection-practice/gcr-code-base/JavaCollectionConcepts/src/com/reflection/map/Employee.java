package com.reflection.map;
class Employee {
    int id;
    String name;
    String department;
    double salary;

    public Employee() {
    }

    @Override
    public String toString() {
        return id + ", " + name + ", " + department + ", " + salary;
    }
}
