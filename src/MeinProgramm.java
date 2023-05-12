public class MeinProgramm{
    public static void main(String[] args){
        System.out.println("Hallo Welt!");

        double radius=4;

        double umfang=2*Math.PI*radius;
        double flaeche=2*Math.PI*radius*radius/4;

        System.out.println("Umfang vom Kreis mit Radius = "+radius+" ist gleich "+umfang);
        System.out.println("Flächen vom Kreis mit Radius = "+radius+" ist gleich "+flaeche);
    }
}