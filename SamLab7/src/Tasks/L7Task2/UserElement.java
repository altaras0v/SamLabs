package Tasks.L7Task2;

import java.util.Date;

public class UserElement<T> {
    private String fio;
    private String department;
    private String phone;
    private Date date;
    public UserElement(String fio, String department, String phone, Date date) {
        this.fio = fio;
        this.department = department;
        this.phone = phone;
        this.date = date;
    }

    public String getFio() {
        return fio;
    }
}
