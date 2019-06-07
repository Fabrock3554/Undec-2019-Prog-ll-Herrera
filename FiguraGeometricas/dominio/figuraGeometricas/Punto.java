package figuraGeometricas;

public class Punto extends FiguraGeo{
	private int x;
	private int y;
	private static int cantidadDePunto;
	
	public Punto() {
		this(0,0);
	}
	public Punto(int x, int y) {
		super("punto", y);
		this.x=x;
		this.y=y;
		cantidadDePunto++;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public static int getCantidadDePunto() {
		return cantidadDePunto;
	}
	public Punto (Punto p) {
		this(p.getX(),p.getY());
	}
	
	
	
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public static void setCantidadDePunto(int cantidadDePunto) {
		Punto.cantidadDePunto = cantidadDePunto;
	}

}
