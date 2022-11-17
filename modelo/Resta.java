package modelo;

public class Resta extends Operaciones
{
    public Resta(double x, double y)
    {
        super(x,y);
    }

    public void resta()
    {
        resultado = x - y;
    }
}
