package com.practice.budgettracker.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

@Entity
public class Category {

    private Long id;
    private BigDecimal budget;
    private String name;
    private Date startDate;
    private Date endDate;
    private Section section;
    private Set<Transaction> transactions = new TreeSet<>();

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getBudget() {
        return budget;
    }

    public void setBudget(BigDecimal budget) {
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @ManyToOne
    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    @OneToMany(cascade=CascadeType.PERSIST, fetch=FetchType.LAZY, mappedBy="category")
    public Set<Transaction> getTransactions() {
        return transactions;
    }


    public void setTransactions(Set<Transaction> transactions) {
        this.transactions = transactions;
    }
}
