public interface Measurable
{
    double getMeasure();

    String getGradeString();
    static double largest(Measurable[] objects){
        double max = 0;
        for (Measurable obj : objects){
            if (obj.getMeasure() > max){
                max = obj.getMeasure();
            }
        }
        return max;
    }

    static double smallest(Measurable[] objects){
        double min = objects[0].getMeasure();
        for (Measurable obj : objects){
            if (obj.getMeasure() <= min){
                min = obj.getMeasure();
            }
        }
        return min;
    }
}
