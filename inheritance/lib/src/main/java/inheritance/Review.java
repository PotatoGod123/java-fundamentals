package inheritance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Review {
    String body;
    String author;
    int numberOfStars;
    public Review(String body, String author, int numberOfStars) {
        this.body = body;
        this.author = author;
        this.numberOfStars = numberOfStars;
    }


    public void updateStars(String author,int newStar, Restaurant restaurantCurrent){
           for(Review restaurants : restaurantCurrent.reviewsHolder){
               if(restaurants.author==author){
                   restaurants.numberOfStars=newStar;
                   restaurantCurrent.calculateStars();
                   return;
               }
           }
        System.out.println("type in correct author, no match found");


    }

    @Override
    public String toString(){
        String str=String.format("Hello %s, this your review. Rated Stars:%o Review:%s",this.author,this.numberOfStars,this.body);

        return str;
    }


}
