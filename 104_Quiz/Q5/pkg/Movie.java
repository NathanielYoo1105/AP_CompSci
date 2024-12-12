// Nathaniel Yoo
package pkg;

public class Movie{
    String movieName;
    double rating;
    int numRatings;
    int revenue;
    
    public Movie(){
        movieName = "Avengers";
        rating = 8.0;
        numRatings = 33;
        revenue = 623357910;
    }
    
    public Movie(String movieName, double rating, int numRatings, int revenue){
        this.movieName = movieName;
        this.rating = rating;
        this.numRatings = numRatings;
        this.revenue = revenue;
    }
    
    public void movieToString(){
        System.out.println("Movie: " + movieName);
        System.out.println("Rating: " + rating);
        System.out.println("Number of Ratings: " + numRatings);
        System.out.println("Revenue: " + revenue + "\n");
    }
    
    public String getMovieName(){
        return movieName;
    }
    
    public int getRevenue(){
        return revenue;
    }
    
    public double getRating(){
        return rating;
    }
    
    public void addRating(double addedRating){
        double tempRating = rating * numRatings;
        tempRating += addedRating;
        numRatings++;
        rating = tempRating / numRatings;
    }
    
    public boolean compareRatings(Movie a){
        if (rating > a.getRating()){
            return true;
        } else {
            return false;
        }
    }
    
    public String revenueToString(){
        int hundreds = revenue % 1000;
        int thousands = (revenue % 1000000) / 1000;
        int millions = revenue / 1000000;
        return (millions + "," + thousands + "," + hundreds);
    }
    
    public Movie pirateMovie(){
        Movie piratedMovie = new Movie(movieName, rating, numRatings, revenue);
        return piratedMovie;
    }
}
