package figuraGeometricas;

public class FiguraGeo {

	private int id;
	private final String figura;
	private final int dimension;
	private static int cantidadFigura;
	

	public FiguraGeo(String figura,int dimension) {
		cantidadFigura++;
		this.figura=figura;
		this.dimension=dimension;
	}
	

	public int getId() {
		return id;
	}

	public String getFigura() {
		return figura;
	}

	public int getDimension() {
		return dimension;
	}

	public static int getCantidadFigura() {
		return cantidadFigura;
	}

	public static void setCantidadFigura(int cantidadFigura) {
		FiguraGeo.cantidadFigura = cantidadFigura;
	}
	
	
	
	
		
}
