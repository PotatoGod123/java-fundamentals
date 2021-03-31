package inheritance;

import java.util.ArrayList;

public class Shop implements ReviewAble{
    String name;
    String description;
    String priceSigns;
    //trying a different way to keep track stars
    int totalStars = 0;
    int averageStarsReview;
    ArrayList<Review> arrayOfReviews = new ArrayList<>();


    public Shop(String name,String description,String priceSigns){
        this.name=name;
        this.description=description;
        this.priceSigns=priceSigns;

    }

    @Override
    public String toString(){
        return String.format("Selected Shop is %s, %s. Average Reviews are %o",name,description,averageStarsReview);
    }


    @Override
    public void addReview(String author, String body, int stars) {
        Review newReview = new Review(body,author,stars);
        arrayOfReviews.add(newReview);
        this.totalStars+=stars;
        calculateStars();
    }

    @Override
    public void calculateStars() {
        averageStarsReview= totalStars/ arrayOfReviews.size();
    }
}
