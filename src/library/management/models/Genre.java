package library.management.models;

public enum Genre {
    NON_FICTION("Sachbuch", "Bücher, die auf Fakten basieren und reale Informationen präsentieren.", 4),
    FANTASY("Fantasy", "Eine Erzählung, die magische Elemente und übernatürliche Wesen beinhaltet.", 5),
    SCIENCE_FICTION("Wissenschaftsfiktion", "Zukunftsorientierte Geschichten, die Technologien und wissenschaftliche Entwicklungen erkunden.", 4),
    MYSTERY("Krimi", "Erzählungen rund um Geheimnisse und Verbrechen.", 3);

    private final String name;
    private final String description;
    private final Integer rating;

    Genre(String name, String description, Integer rating) {
        if (rating < 1 || rating > 5) {
            throw new IllegalArgumentException("Rating must be between 1 and 5.");
        }

        this.name = name;
        this.description = description;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Integer getRating() {
        return rating;
    }
}
