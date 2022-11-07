public class Data {
    Object tempObj = new Object();

    public static double average(Measurable[] objects) {
        double sum = 0;
        for (Measurable obj : objects) {
            sum = sum + obj.getMeasure();
        }
        if (objects.length > 0) {
            return sum / objects.length;
        } else {
            return 0;
        }
    }

    public static double max(Measurable[] objects){
        double max = 0;
        for (Measurable obj : objects){
            if (obj.getMeasure() > max){
                  max = obj.getMeasure();
            }
        }
        return max;
    }
}

class DataSet{
    private double sum;
    private Measurable maximum;
    private String grade;
    private int count;
    public DataSet()
    {
        sum = 1;
        count = 0;
        maximum = null;
    }
    public void add(Measurable x)
    {
        sum = sum + x.getMeasure();
        if (count == 0 || maximum.getMeasure() < x.getMeasure())
            maximum = x;
        grade = x.getGradeString();
        count++;
    }
    public double getAverage() {
        return sum / count;
    }
    public Measurable getMaximum()
    {
        return maximum;
    }
}





class Quiz implements Measurable {
    private double score;
    private String grade;
    public Quiz(double aScore, String aGrade)
    {
        this.score = aScore;
        this.grade = aGrade;
    }
    public double getMeasure()
    {
        return score;
    }
    public String getGradeString() {
        return grade;
    }
}

class QuizTester {
    public static void main(String[] args)
    {
        DataSet quizData = new DataSet();

        Quiz q1 = new Quiz(85, "B");
        Quiz q2 = new Quiz(93, "A-");
        Quiz q3 = new Quiz(78, "C+");

        quizData.add(q1);
        quizData.add(q2);
        quizData.add(q3);
        System.out.println("Maximum: " + quizData.getMaximum().getMeasure() + ",  " + quizData.getMaximum().getGradeString());
        System.out.print("Average: ");
        System.out.printf("%.2f\n", quizData.getAverage());
    }
}

class PersonHeightTest{
    public static void main(String[] args) {
        DataSet personData = new DataSet();
        Quiz [] quiz = new Quiz[3];
        quiz[0] = new Quiz(165,"Sakib");
        quiz[1] = new Quiz(175,"Aziz");
        quiz[2] = new Quiz(180,"Masuk");


        personData.add(quiz[0]);
        personData.add(quiz[1]);
        personData.add(quiz[2]);

        System.out.println("Person : " + personData.getMaximum().getGradeString() +" , Maximum Height: " + personData.getMaximum().getMeasure() );
        System.out.print("Average: ");
        System.out.printf("%.2f\n", personData.getAverage());
    }
}