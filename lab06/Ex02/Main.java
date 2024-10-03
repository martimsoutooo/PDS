package Ex02;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie.MovieBuilder("Divergent", 2014)
                .director(new Person("Neil Burger"))
                .writer(new Person("Evan Daugherty"))
                .series("Divergent")
                .cast(List.of(new Person("Shailene Woodley"), new Person("Theo James"), new Person("Kate Winslet")))
                .locations(List.of(new Place("Chicago")))
                .languages(List.of("English"))
                .genres(List.of("Action", "Adventure", "Mystery"))
                .isNetflix(false)
                .isTelevision(true)
                .isIndependent(false)
                .build();
        System.out.println(movie1);

        Movie movie2 = new Movie.MovieBuilder("The Hunger Games", 2012)
                .director(new Person("Gary Ross"))
                .writer(new Person("Suzanne Collins"))
                .series("The Hunger Games")
                .cast(List.of(new Person("Jennifer Lawrence"), new Person("Josh Hutcherson"), new Person("Liam Hemsworth")))
                .locations(List.of(new Place("North Carolina")))
                .languages(List.of("English"))
                .genres(List.of("Action", "Adventure", "Sci-Fi"))
                .isNetflix(false)
                .isTelevision(true)
                .isIndependent(false)
                .build();
        System.out.println(movie2); 
    }
}
