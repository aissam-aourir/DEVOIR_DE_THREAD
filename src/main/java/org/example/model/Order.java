package org.example.model;

import lombok.Data;

@Data
public class Order {
    int id;String date;
    float amount;int customerId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id =id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date=date;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
}
