# Lab 06, 07

Basically a yelp review.

## Classes/and Posibble contructors

Movie- Has a movie constructor to make a new instance of a movie
Shop- Make a new with it's constructor and be able to add reviews!
Restaurant- Make a new restaurant with it's on rating and reviews
Theater- this bad boy has you able to make a theater instance but able to put a Movie instance inside that conatians the review intance of said movie in it.

## Version 1.2.0

## Methods

### Common if for maybe Theater class

.toString()==> Will return a reable string to see your instances

// this is only for the Restaurant at the moment, make a review instance first//addReview(Review Review)==> will add a new instance of review

.addReview(String author,String Body,int stars)==> same thing as above but less work to do to make and add a review

// available in all but the theater and movie  stuff

calculateStars()==> will take in all the new reviews and re assign the restaurant or shops current review with the updated one. No need to call this 
when you do addReview it should udpate it there


// basically only in theater at the moment, since it's a new thing i'm doing

.addMovie(String movie)==> very bare bones adding movie to a list. Depreceated don' use!

.removeMovie(String movie)==> same as above, but remove the movie from list. Depreceated!

toString()==> return your theatre information

addNewMovieReview(int star,String movie, String author, String body )==> this will add a new review with the movie you selected AND make a new movie object at the same time.
  

## Update log

Version 1.2.0- Added whole new shops and an interface to be used across class as needed
Version 1.1.0- Change some code to make the relationship between restaurant reviews better
Version 1.0.0- Base files and basic contructor for restaurant and review