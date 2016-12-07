public class Hipotenusa
{
  private double lado1;
  private double lado2;
  private double hipotenusa;

  public Hipotenusa(double lado1, double lado2)
  {
    this.lado1 = lado1;
    this.lado2 = lado2;
  }

  public void setLado1(double lado1)
  {
    this.lado1 = lado1;
  }

  public double getLado1()
  {
    return this.lado1;
  }

  public void setLado2(double lado2)
  {
    this.lado2 = lado2;
  }

  public double getLado2()
  {
    return this.lado2;
  }

  public void calcularHipotenusa()
  {
    double lado1 = getLado1();
    double lado2 = getLado2();

    this.hipotenusa = Math.sqrt((Math.pow(lado1,2))+(Math.pow(lado2,2)));
  }

  public double getHipotenusa()
  {
    return this.hipotenusa;
  }
}
