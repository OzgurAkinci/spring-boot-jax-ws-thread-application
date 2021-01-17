package com.ws.controller;

import com.project.generated.*;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

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
    public String saveThreadWithoutThread() {
        SaveExpenseRequest saveExpenseRequest = new SaveExpenseRequest();

        List<String> list = new ArrayList<>();
        for(int i=0; i<1000; i++){
            list.add("ExpenseType-" + i);
        }


        // Async değil
        long startTime1 = System.currentTimeMillis();
        for (String d: list) {
            Expense expense = new Expense();
            expense.setQuantity(new BigDecimal(1000));
            expense.setExpenseType(d);
            saveExpenseRequest.setExpense(expense);
            expenseService.saveExpense(saveExpenseRequest);
        }

        // Burada, üstteki method Async olacak.



        return "Execution time: " + ((System.currentTimeMillis() - startTime1) + " ms." + "Execution time (async) : ");
    }
}
