
package entity;

import java.time.LocalDate;

public class Mariage {
    private int id;
    private LocalDate date;

    public int getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
    
    
}
