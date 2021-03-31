package inheritance;

public class MovieReview extends Review {
    String movie;
    public MovieReview(String author,String body, int stars, String movie) {
        super(body,author,stars);
        this.movie = movie;
    }

    // Probably don't need this but just adding incase i need to update stuff
    // if needed idk
    // public void changeMovie(String movie) this.movie = movie;

}
