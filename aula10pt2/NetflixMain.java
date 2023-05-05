public class NetflixMain {
    public static void main(String[] args)
    {
        NetflixMovie movie = new NetflixMovie(4, 2004);
        movie.setMovieName("Otavio Bizulli: The Movie");
        movie.setCategory("Musical");
        movie.setMainActors(new String[] {"Otavio Bizulli", "Adriana Bizulli", "Antonio Bizulli"});
        movie.displayMovieData();
    }
}
