/**
 * Class which convert number to string representation
 */
public class NumberConverter {

    private final String[] firstPart = {"Сто","Двести","Триста","Четыреста","Пятьсот","Шестьсот","Семьсот","Восемьсот","Девятьсот"};
    private final String[] secondPart = {"десять","двадцать","тридцать","сорок","пятьдесят","шестьдесят","семьдесят","восемьдесят","двеяносто"};
    private final String[] thirdPart = {"один","два","три","четыре","пять","шесть","семь","восемь","девять"};
    private final String[] doublePart = {"десять","одинадцать","двенадцать","тринадцать","четырнадцать","пятнадцать","шестнадцать",
            "семнадцать","восемнадцать","девятнадцать"};

    /**
     * Realization
     * Convert figure of number to string representation
     * String representation comes from relevant array
     * @return number like a text
     */
    private String NumberToString(){
        NumberInitializer number = new NumberInitializer();
        if(number.getSecondNumber()==0&&number.getThirdNumber()==0){
            String  first = firstPart[number.getFirstNumber()-1];
            return first;
        }
        else if (number.getSecondNumber()==0&&number.getThirdNumber()!=0){
            String first = firstPart[number.getFirstNumber()-1] ;
            String third= thirdPart[number.getThirdNumber()-1];
            return first + " " + third;
        }
        else if (number.getSecondNumber()!=0&&number.getThirdNumber()==0){
            String first = firstPart[number.getFirstNumber()-1] ;
            String second = secondPart[number.getSecondNumber()-1];
            return first + " " + second;
        }
        else if(number.getDoublePart()>=10&&number.getDoublePart()<=19){
            String first = firstPart[number.getFirstNumber()-1] ;
            String second = doublePart[number.getDoublePart()-10];
            return first + " " + second;
         }
         else {
            String first = firstPart[number.getFirstNumber()-1];
            String second = secondPart[number.getSecondNumber()-1];
            String third= thirdPart[number.getThirdNumber()-1];
            return first + " " + " " + second + " " + third;
        }
    }

    /**
     * Interface of "NumberToString()"
     * @return result of NumberToString()
     */
    public String getNumber(){
        return NumberToString();
    }
}
