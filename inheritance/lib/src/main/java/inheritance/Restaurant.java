package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements ReviewAble  {
    String name;
    int stars;
    String priceCategory;
    List<Review> reviewsHolder= new ArrayList<>();
    ArrayList<Integer> allStars=new ArrayList<>();
    public Restaurant(String name, int stars, String priceCategory) {

        this.name = name;
        this.stars = stars;
        this.priceCategory = priceCategory;

    }

    public String toString(){
        return String.format("The selected restaurant is %s, with average %o stars reviews and in the Price Category of %s.", this.name, this.stars, this.priceCategory);
    }

    public void addReview(Review review){

        //add a new review to newly made restaurant with . notation
        this.reviewsHolder.add(review);
        // add new star to the list holding all past stars
        this.allStars.add(review.numberOfStars);
        //now gotta make method to calculate and change the stores new ave rating
        calculateStars();
    }
        //trying to bloody call this to update else where but it's not changing the stars in the current restaurant
    @Override
    public void calculateStars(){
        int total=this.stars;
//        System.out.println(total+" This should be total at beginning");
        for(int starss:this.allStars){
            System.out.println("these are the stars given by each reviewer "+starss);
            total+=starss;
        }
        System.out.println("this is size "+(allStars.size()+1));
        total =total/(this.allStars.size()+1);
        if(total>5)total=5;
        this.stars=total;

    }

    @Override
    public void addReview(String author, String body, int stars) {
        //Made a new add review to this will test later, this is based on the other stores
        Review newReview = new Review(body,author,stars);
        reviewsHolder.add(newReview);
        allStars.add(stars);
        calculateStars();

    }
}
