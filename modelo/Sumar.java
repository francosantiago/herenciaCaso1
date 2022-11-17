package modelo;

public class Sumar extends Operaciones
{
    public Sumar(double x, double y)
    {
        super(x,y);
    }

    public void sumar()
    {
        resultado = x + y;
    }
}
