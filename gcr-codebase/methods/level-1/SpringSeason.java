class SpringSeason {

    // Method to check spring season
    public boolean isSpringSeason(int month, int day) {

        if ((month == 3 && day >= 20) ||
            (month == 4) ||
            (month == 5) ||
            (month == 6 && day <= 20)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        // Taking input from terminal
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        //calling method
        SpringSeason season = new SpringSeason();
        boolean isSpring = season.isSpringSeason(month, day);


        // Displaying result
        if (isSpring) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
