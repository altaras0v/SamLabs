package com.Tarasov.Util;

/**
 * Util class which describes vountry
 */
public class DescriptionBelarus {

    public static final String CAPITAL = "Minsk";
    public static final String FOUNDING_DATE = "09-19-1991";
    public static final String CURRENCY_UNIT = "BYN";

    /**
     * Class that initialises districts of country
     */
    public static final class DISTRICTS{
        public static final String GRODNO = "Grodno";
        public static final String GOMEL = "Gomel";
        public static final String MOGILEV = "Mogilev";
        public static final String MINSK = "Minsk";
        public static final String VITEBSK = "Vitebsk";
        public static final String BREST = "Brest";
    }
    /**
     * Class that initialises languages of country
     */
    public static final class LANGUAGES{
        public static final String RU = "Russian";
        public static final String BY = "Belarussian";
    }
    /**
     * Class that initialises neighbors of country
     */
    public static final class NEIGHBORS{
        public static final String RUSSIA = "Russia";
        public static final String POLAND = "Poland";
        public static final String LITHUANIA = "Lithuania";
        public static final String LATVIA = "Latvia";
        public static final String UKRAINE = "Ukraine";
    }

    /**
     * Display short information about country
     * @return string of short information about country
     */
    public static String shortInfo(){
        return  ("Столица:"+CAPITAL+" Дата основания:"+FOUNDING_DATE+" Валюта:"+CURRENCY_UNIT);
    }

    /**
     * Display full information about country
     * @return string of full information about country
     */
    public static String fullInfo(){
        return  ("Столица:"+CAPITAL+"\nДата основания:"+FOUNDING_DATE+"\nВалюта:"+CURRENCY_UNIT+
                "\nЯзыки:"+LANGUAGES.BY+" "+LANGUAGES.RU + "\nСтраны-соседи:" + NEIGHBORS.LATVIA + " "+NEIGHBORS.LITHUANIA+
                " "+NEIGHBORS.POLAND+" "+NEIGHBORS.RUSSIA+" "+NEIGHBORS.UKRAINE+ "\nРегионы:"+DISTRICTS.BREST
                +" "+DISTRICTS.GOMEL+" "+DISTRICTS.GRODNO+" "+DISTRICTS.MINSK+" "+DISTRICTS.MOGILEV+" "+DISTRICTS.VITEBSK);
    }
}

