package L6Tasks.L6Task2;

public class MyWeek {
    public  enum Week{

        MONDAY("MON"),
        TUESDAY("TUE"),
        WEDNESDAY("WD"),
        THURSDAY("TH"),
        FRIDAY("FR"),
        SATURDAY("ST"),
        SUNDAY("SUN");

        private String abrev;

        Week(String abrev){
            this.abrev = abrev;
        }

        public String getAbrev(){
            return this.abrev;
        }

        public static String getText(Week e){
            return e.toString();
        }
        public boolean isWeekend(){
            if(this.name().equals("SATURDAY")||this.name().equals("SUNDAY")){
                return true;
            }
            else return false;
        }
    }

}
