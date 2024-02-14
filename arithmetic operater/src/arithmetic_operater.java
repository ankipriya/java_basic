public class arithmetic_operater {
    public static void main(String[]args) {

        int no_of_girls = 20;
        int no_of_boys = 36;
        int no_of_student = no_of_boys + no_of_girls;
        int team_size = 5;
        int no_of_teams = no_of_student / team_size;
        int remaining_student = no_of_student % team_size;
        System.out.println("no of girls=" + no_of_girls);
        System.out.println("no of boys=" + no_of_boys);
        System.out.println("no of students=" + no_of_student);
        System.out.println("no of teams=" + no_of_teams);
        System.out.println("remaining students=" + remaining_student);
    }


}
