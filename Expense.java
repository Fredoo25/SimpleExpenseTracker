package cd.rr.expense;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

public class Expense {
    //  member variables
    private String description;
    private Double amount;
    private Date date;

    public Expense(String description, Double amount, Date date) {
        this.description = description;
        this.amount = amount;
        this.date = date;
    }
    //  Getters and Setters
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



}
