package com.app.threadcxfjaxwsserver.domain;


import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name="expense")
public class Expense implements Serializable {
    @Id
    @GeneratedValue(generator = "expense_seq_generator")
    @SequenceGenerator( name = "expense_seq_generator", sequenceName = "expense_seq", initialValue = 5, allocationSize = 1)
    private Integer id;

    @Column(name="expense_type")
    private String expenseType;

    @Column(name="quantity")
    private BigDecimal quantity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getExpenseType() {
        return expenseType;
    }

    public void setExpenseType(String expenseType) {
        this.expenseType = expenseType;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }
}
