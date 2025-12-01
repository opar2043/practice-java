package src.ExamGrading;

public class GradeSystem {
  public static void GradeScroe (int score) throws InvalidException{
    if(score <0 || score > 100){
        throw new InvalidException("Score must be 0-100");
    }
  }
}
