package com.edumentorapplication;

public class Learner extends User implements ICertifiable {

    private String courseType; // "SHORT" or "FULL_TIME"

    public Learner(String name, String email, int userId, String courseType) {
        super(name, email, userId);
        this.courseType = courseType;
    }

    @Override
    public void generateCertificate() {
        if (courseType.equalsIgnoreCase("SHORT")) {
            System.out.println("Short Course Certificate generated for " + name);
        } else {
            System.out.println("Full-Time Course Certificate generated for " + name);
        }
    }
}
