package com.app.threadcxfjaxwsserver.ws.service.expense;

import com.app.threadcxfjaxwsserver.domain.Expense;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import java.util.List;


@WebService(targetNamespace = "http://185.247.139.7:8182/thread-ws-server-application/", name = "expense")
public interface ExpenseService {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getExpensesRequest",
            targetNamespace = "http://185.247.139.7:8182/thread-ws-server-application/",
            className = "sample.ws.service.GetExpensesRequest")
    @WebMethod(action = "urn:Expenses")
    @ResponseWrapper(localName = "getExpensesResponse",
            targetNamespace = "http://185.247.139.7:8182/thread-ws-server-application/",
            className = "sample.ws.service.GetExpensesResponse")
    List<Expense> getExpenses();

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "saveExpenseRequest",
            targetNamespace = "http://185.247.139.7:8182/thread-ws-server-application/",
            className = "sample.ws.service.saveExpenseRequest")
    @WebMethod(action = "urn:Expenses")
    @ResponseWrapper(localName = "saveExpenseResponse",
            targetNamespace = "http://185.247.139.7:8182/thread-ws-server-application/",
            className = "sample.ws.service.SaveExpenseResponse")
    Expense saveExpense(@WebParam(name="expense") Expense expense);
}
