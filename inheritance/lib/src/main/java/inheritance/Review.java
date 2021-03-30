package inheritance;

import java.util.Arrays;
import java.util.List;

public class Review {
    String body;
    String author;
    int numberOfStars;
    Restaurant restaurant;
    public Review(String body, String author, int numberOfStars, Restaurant restaurant) {
        this.body = body;
        this.author = author;
        this.numberOfStars = numberOfStars;
        this.restaurant= restaurant;
    }
    @Override
    public String toString(){
        String str=String.format("Hello %s, this your review for %s. Rated Stars:%o Review:%s",this.author,this.restaurant.name,this.numberOfStars,this.body);

        return str;
    }

//    public void updateStars(String author,int newStar,Restaurant currentRestaurant){
//
//        System.out.println(Arrays.toString(currentRestaurant.reviewsHolder));
//
////        boolean flag= true;
////        for(Object current:currentRestaurant.reviewsHolder){
////            if(current==author){
////                current.numberOfStars=newStar;
////                flag=false;
////            }
////
////        }
////
////        if(flag){
////            System.out.println("Could not find matching reviews! make sure author is type correctly!");
////        }else {
////            currentRestaurant.calculateStars();
////        }
//    }

}
