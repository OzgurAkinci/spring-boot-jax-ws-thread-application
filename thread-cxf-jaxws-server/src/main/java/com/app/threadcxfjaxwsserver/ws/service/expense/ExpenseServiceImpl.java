package com.app.threadcxfjaxwsserver.ws.service.expense;

import com.app.threadcxfjaxwsserver.config.WebServiceConfig;
import com.app.threadcxfjaxwsserver.domain.Expense;
import com.app.threadcxfjaxwsserver.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.jws.WebService;

import java.util.List;
import java.util.logging.Logger;

@WebService(serviceName = "ExpenseService", portName = "ExpensePort", targetNamespace = "http://185.247.139.7:8182/thread-ws-server-application/",
        endpointInterface = "com.app.threadcxfjaxwsserver.ws.service.expense.ExpenseService")
public class ExpenseServiceImpl extends SpringBeanAutowiringSupport implements ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    public ExpenseServiceImpl() {
        AutowiredAnnotationBeanPostProcessor bpp = new AutowiredAnnotationBeanPostProcessor();
        WebApplicationContext currentContext = WebServiceConfig.getCurrentWebApplicationContext();
        bpp.setBeanFactory(currentContext.getAutowireCapableBeanFactory());
        bpp.processInjection(this);
    }

    private static final Logger LOG = Logger.getLogger(ExpenseServiceImpl.class.getName());

    public List<Expense> getExpenses() {
        return expenseRepository.findAll();
    }

    public Expense saveExpense(Expense expense) {
        return expenseRepository.save(expense);
    }

}
