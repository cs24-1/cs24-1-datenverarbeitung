package library.management.models;

public record Author(String surname, String firstname, Integer birthYear) {
    @Override
    public String toString() {
        return firstname + " " + surname + " (Geboren " + birthYear + ")";
    }
}
