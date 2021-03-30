package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant  {
    String name;
    int stars;
    String priceCategory;
    List reviewsHolder;
    ArrayList<Integer> allStars;
    public Restaurant(String name, int stars, String priceCategory) {
        this.name = name;
        this.stars = stars;
        this.priceCategory = priceCategory;
        this.reviewsHolder = new ArrayList<>();
        this.allStars= new ArrayList<>();

    }

    @Override
    public String toString(){
        return String.format("The selected restaurant is %s, with average %o stars reviews and in the Price Category of %s.", this.name, this.stars, this.priceCategory);
    }

    public void addReview(String body, String author, int numberOfStars){
        Review holder = new Review(body,author,numberOfStars,this);
        //add a new review to newly made restaurant with . notation
        this.reviewsHolder.add(holder);
        // add new star to the list holding all past stars
        this.allStars.add(numberOfStars);
        //now gotta make method to calculate and change the stores new ave rating

        calculateStars();
    }

    public void calculateStars(){
        int total=this.stars;

        for(int starss:this.allStars){
            total+=starss;
        }
        total =total/this.allStars.size();
        if(total>5)total=5;
        this.stars=total;

    }

}
