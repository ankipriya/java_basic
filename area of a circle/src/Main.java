public class Main {
    public static final int perfect_score=100;
    public static final double pi=3.14159;
    public static void main(String[] args) {
        int score=75;
        double radius=8.9;
        double area=pi*radius*radius;
        boolean is_score_equal=perfect_score==score;
        System.out.println("Radius="+radius);
        System.out.println("Area="+area);
        System.out.println("scores are equal."+is_score_equal);
    }
}