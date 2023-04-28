package av00;

public class av_02_625248
{
    private String name;
    private String birthdate;
    private double height;

    public String getname()
    {
        return name;
    }

    public void setname(String name)
    {
        this.name = name;
    }

    public String getbirthdate()
    {
        return birthdate;
    }

    public void setbirthdate(String birthdate)
    {
        this.birthdate = birthdate;
    }

    public double getheight()
    {
        return height;
    }

    public void setheight(double height)
    {
        this.height = height;
    }

    public void printdata()
    {
        System.out.println("Nome: " + name);
        System.out.println("Data de Nascimento: " + birthdate);
        System.out.println("Altura: " + height + " m");
    } 
}
