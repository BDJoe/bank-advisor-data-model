package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue()
    private Long portfolioId;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    @Column(nullable = false)
    private Timestamp creationDate;

    protected Portfolio() {}

    public Portfolio(Client client, Timestamp creationDate) {
        this.client = client;
        this.creationDate = creationDate;
    }

    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
