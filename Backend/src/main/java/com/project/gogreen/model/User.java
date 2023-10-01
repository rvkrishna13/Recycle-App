package com.project.gogreen.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.project.gogreen.model.cart.CartItem;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
// Task 1: Write your code here

    @Transient
    public double getCartTotal () {
        double sum = 0;

        for (CartItem item : cartItems) {
            sum += item.getTotalPrice();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", cartItems=" + cartItems +
                '}';
    }
}
