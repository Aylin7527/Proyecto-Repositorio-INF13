public class Punto {
    private float x;
    private float y;

    public Punto(float a, float b) {
        x = a;
        y = b;
    }

    public float[] coordCartesianas() {
        return new float[]{x, y};
    }

    public double[] coordPolares() {
        double r = Math.sqrt(x * x + y * y);
        double theta = Math.atan2(y, x);  // Ángulo en radianes
        return new double[]{r, theta};
    }

    public static void main(String[] args) {
        Punto p = new Punto(3, 4);
        float[] cartesianas = p.coordCartesianas();
        double[] polares = p.coordPolares();

        System.out.println("Coordenadas cartesianas: (" + cartesianas[0] + ", " + cartesianas[1] + ")");
        System.out.println("Coordenadas polares: (" + polares[0] + ", " + polares[1] + ")");
    }
}
