package Tasks.L7Task2;

import java.util.Date;

public class EquipmentElement<T> {

    private String name;
    private String inv_number;
    private Date date;


    public EquipmentElement(String name, String inv_number, Date date) {
        this.name = name;
        this.inv_number = inv_number;
        this.date = date;
    }

    public String getName() {
        return name;
    }
}
