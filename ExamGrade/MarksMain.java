package ExamGrade;

public class MarksMain {

        public static void main(String[] args) {
          Marks Marks = new Marks();
          int percentage = 75;
          System.out.println("Percentage: " + percentage);
          System.out.println("Result: " + Marks.isAPass(percentage));
          System.out.println("Grade: " + Marks.getGrade(percentage));
          System.out.println(Marks.retakeMessage(percentage, true));
        }
      
      }

