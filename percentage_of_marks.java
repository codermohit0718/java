public class double_data_type {
    public static void main(String[] args) {
        double marks_physics = 70 ;
        double marks_mathematics = 90;
        double marks_english = 80;
        double marks_biology = 95;
        double marks_chemistry = 60;
       double percentage_of_marks = (marks_physics+marks_mathematics+marks_english+marks_biology+marks_chemistry)/5;
        System.out.printf("the percentage of marks of student is %.2f",percentage_of_marks);
    }
    
}
