public class GradeConverter {
    public String convert(int Score){
        if(Score <=100 && Score > 90){
            return "A";
        }else if(Score <=89 && Score > 80){
            return "B";
        }else if(Score <=79 && Score > 70){
            return "C";
        }else if(Score <=69 && Score > 60){
            return "D";
        }else if(Score <=59 && Score > 0){
            return "E";
        }else {
            return "Invalid";
        }
    }

}