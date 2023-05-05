public class NetflixMovie
{
    private int movieCode;
    private String movieName;
    private String category;
    private String[] mainActors;
    private int releaseYear;
    
    public NetflixMovie(int movieCode, int releaseYear)
    {
        this.movieCode = movieCode;
        this.releaseYear = releaseYear;
        this.movieName = "";
        this.category = "";
        this.mainActors = new String[10];
    }
    
    public int getMovieCode()
    {
        return movieCode;
    }
    
    public void setMovieCode(int movieCode)
    {
        this.movieCode = movieCode;
    }
    
    public String getMovieName()
    {
        return movieName;
    }
    
    public void setMovieName(String movieName)
    {
        this.movieName = movieName;
    }
    
    public String getCategory()
    {
        return category;
    }
    
    public void setCategory(String category)
    {
        this.category = category;
    }
    
    public String[] getMainActors()
    {
        return mainActors;
    }
    
    public void setMainActors(String[] mainActors)
    {
        this.mainActors = mainActors;
    }
    
    public int getReleaseYear()
    {
        return releaseYear;
    }
    
    public void setReleaseYear(int releaseYear)
    {
        this.releaseYear = releaseYear;
    }
    
    public void displayMovieData()
    {
        System.out.println("Codigo do Filme: " + movieCode);
        System.out.println("Nome do Filme: " + movieName);
        System.out.println("Categoria: " + category);
        System.out.println("Atores Principais:");
        for (String actor : mainActors)
        {
            System.out.println(actor);
        }
        System.out.println("Ano de Lançamento: " + releaseYear);
    }
}

