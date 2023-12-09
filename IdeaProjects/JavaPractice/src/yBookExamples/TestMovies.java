package yBookExamples;

public class TestMovies{
    public static void main(String[] args) {
        Movie first = new Movie();
        first.title = "Batman";
        first.genre = "hero";
        first.rating = 8.9;
        first.playingMovie();
        System.out.println(first.title);
    }

}
