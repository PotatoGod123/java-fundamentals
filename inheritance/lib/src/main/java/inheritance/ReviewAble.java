package inheritance;

public interface ReviewAble {
// this will allow to bring in these methods to each thing that needs a review
    String author=null;
    String body = null;
    int stars = 0;

    public void addReview(String author,String body, int stars);
    public void calculateStars();
    //need to print reviews
}
