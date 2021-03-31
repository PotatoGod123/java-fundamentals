package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Theater {
    String name;
    List<String> currentMovies = new ArrayList<>();
    ArrayList<Movie> newMovieHolder= new ArrayList<>();


    public Theater(String name) {
        this.name = name;
    }


    public void addMovie(String movie){
        currentMovies.add(movie);
    }

    public void removeMovie(String movie){
        currentMovies.remove(movie);
    }

    //old version using simple strings
//    @Override
//    public String toString(){
//        String str = "";
//        for(String movie:this.currentMovies){
//            str+=movie+", ";
//        }
//        return String.format("Welcome to the grand %s Theater!, We are showing %s",this.name,str);
//    }

    public void addNewMovieReview(int star,String movie, String author, String body ){
        //we make a new review that's contains the movie it will attach it self too
        MovieReview movieReview = new MovieReview(author,body,star,movie);
        //here i will check the theaters current movie set and check if a movie object exist
        for(Movie list:newMovieHolder){
            if(list.name== movieReview.movie){
                //if we find a match it will add the review to that movies review list
                list.arrayOfReviews.add(movieReview);
                return;
            }
        }
        //if no match then that movies does not exist
        Movie brandNewMovie = new Movie(movie,star);
        brandNewMovie.arrayOfReviews.add(movieReview);
        newMovieHolder.add(brandNewMovie);
        // this is basically a constructor inside another constructor, array of objects with inside an array of objects


    }

    @Override
    public String toString(){
        String str = "";
        for(Movie movieObject:newMovieHolder){
            str+=movieObject.name+", ";
        }
        return String.format("Welcome to the grand %s Theater!, We are showing %s",this.name,str);
    }
}
