package cd.rr.expense;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.*;

@Component
public class ExpenseRepo {

    //  List of all expenses
    private static List<Expense> expenses = new ArrayList<>();
    //  add all expenses
    static {
        Expense one = new Expense("Chipotle", 8.91, new Date("2021/6/7"));
        Expense two = new Expense("Airplane Ticket to Detroit", 279.0, new Date("2021/6/9"));
        Expense three = new Expense("New Suit", 149.99, new Date("2021/6/11"));
        Expense four = new Expense("Uber Ride to Lions Stadium", 14.63, new Date("2021/6/13"));
        Expense five = new Expense("Lions Game Ticket", 290.95, new Date("2021/6/13"));
        expenses.add(one);
        expenses.add(two);
        expenses.add(three);
        expenses.add(four);
        expenses.add(five);
    }
    public ExpenseRepo(){  //  guidelines: a component needs a no param constructor

    }
    //  methods for expenses - add, delete, getall
    //  return all expenses
    public List<Expense> getAllExpenses() {
        return expenses;
    }
    //  add an expense
    public void addExpense(Expense e) {
        expenses.add(e);
    }
    //  delete all expenses
    public void deleteAllExpenses() {
        expenses.clear();  //  clear expenses list of all expense objects
    }
}
