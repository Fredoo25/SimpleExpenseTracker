package cd.rr.expense;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ExpenseController {
    @Autowired
    private ExpenseRepo expenseRepo;

    public ExpenseController(ExpenseRepo expenseRepo) {
        this.expenseRepo = expenseRepo;
    }
    @CrossOrigin  //  cors spring problem fix
    @GetMapping("/expenses")
    public List<Expense> getExpenses() {
        return expenseRepo.getAllExpenses();
    }
    @CrossOrigin  //  cors spring problem fix
    @PostMapping("/expense")  //  endpoint
    public ResponseEntity<Expense> addExpense(@RequestBody Expense expense) {
        expenseRepo.addExpense(expense);
        return new ResponseEntity<>(expense, HttpStatus.CREATED);
    }
    @CrossOrigin  //  cors spring problem fix
    @DeleteMapping("/expenses")
    public void deleteAllExpenses() {
        expenseRepo.deleteAllExpenses();
    }

}
