package com.ws.controller;

import com.project.generated.Expense;
import com.project.generated.ExpenseService;
import com.project.generated.GetExpensesRequest;
import com.project.generated.GetExpensesResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/expense")
@RestController
@Component
public class TestController {

    private static Expense expense;
    static {
        expense = new ExpenseService().getExpensePort();
    }

    @GetMapping("/executeGetExpenses")
    public GetExpensesResponse getExpenses() {
        GetExpensesRequest getExpensesRequest = new GetExpensesRequest();
        return expense.getExpenses(getExpensesRequest);
    }

    @GetMapping("/executeSaveThreadWithoutThread")
    public GetExpensesResponse saveThreadWithoutThread() {
        GetExpensesRequest getExpensesRequest = new GetExpensesRequest();
        return expense.getExpenses(getExpensesRequest);
    }
}
