package com.ws.controller;

import com.project.generated.*;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RequestMapping("/expense")
@RestController
@Component
public class TestController {

    private static ExpenseService expenseService;
    static {
        expenseService = new ExpenseService_Service().getExpensePort();
    }

    @GetMapping("/executeGetExpenses")
    public GetExpensesResponse getExpenses() {
        GetExpensesRequest getExpensesRequest = new GetExpensesRequest();
        return expenseService.getExpenses(getExpensesRequest);
    }

    @GetMapping("/executeSaveThreadWithoutThread")
    public SaveExpenseResponse saveThreadWithoutThread() {
        SaveExpenseRequest saveExpenseRequest = new SaveExpenseRequest();
        Expense expense = new Expense();
        expense.setQuantity(new BigDecimal(1000));
        expense.setExpenseType("");
        saveExpenseRequest.setExpense(expense);
        return expenseService.saveExpense(saveExpenseRequest);
    }
}
