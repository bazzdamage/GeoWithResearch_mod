public class Person {
    public String fullName;

    public Person(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return fullName;
    }

    public String getFullName() {
        return fullName;
    }

}
