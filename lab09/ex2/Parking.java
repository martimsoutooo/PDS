class Parking {
    private static final double SALARY_THRESHOLD = 1000;

    public static void allowIfEligible(Person3 person) {
        if (person.getSalary() > SALARY_THRESHOLD) {
            System.out.println("Parking allowed for: " + person.getName());
        }
    }
}
