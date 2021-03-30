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
    @Override
    public String toString(){
        String str=String.format("Hello %s, this your review for %s. Rated Stars:%o Review:%s",this.author,this.numberOfStars,this.body);

        return str;
    }

    public void updateStars(int newStar){
        this.numberOfStars=newStar;

    }

}
