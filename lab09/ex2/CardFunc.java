class CardFunc {
    private static int nextId = 1;

    public static void issueCard(Person3 person) {
        System.out.println("Issued card for: " + person.getName() + " with ID: " + nextId++);
    }
}
