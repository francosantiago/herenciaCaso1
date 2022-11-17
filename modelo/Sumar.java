import modelo.Operaciones;

public class Sumar extends Operaciones
{
    public Sumar(double x, double y)
    {
        super(x,y);
    }

    public void Sumar()
    {
        resultado = x + y;
    }
}
