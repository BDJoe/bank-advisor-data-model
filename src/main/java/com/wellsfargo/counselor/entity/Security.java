package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
public class Security {
    @Id
    @GeneratedValue()
    private Long securityId;

    @ManyToOne
    @JoinColumn(name = "porfolio_id", nullable = false)
    private Portfolio portfolio;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private Float purchasePrice;

    @Column(nullable = false)
    private Timestamp purchaseDate;

    @Column(nullable = false)
    private Long quantity;

    protected Security() {}

    public Security(Portfolio portfolio, String name, String category, Float purchasePrice, Timestamp purchaseDate, Long quantity) {
        this.portfolio = portfolio;
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
    }


    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Float getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Float purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Timestamp getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Timestamp purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }
}
