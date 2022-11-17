package modelo;

public class Multiplicación extends Operaciones
{
    public Multiplicación(double x, double y)
    {
        super(x,y);
    }

    public void multiplicación()
    {
        resultado = x * y;
    }
}
