package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    String name;
    int stars;
    ArrayList<MovieReview> arrayOfReviews = new ArrayList<>();
    ArrayList<Integer> allStarRatings = new ArrayList<>();

    public Movie(String movie,int stars){
        this.name=movie;
        this.stars=stars;
    }
// need to finish this we can get the full review of the movie, or probably inside the MovieReview
//    @Override
//    public String toString(){
//
//    }

}
