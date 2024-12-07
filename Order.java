package com.klef.jfsd.exam.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.time.LocalDate;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @NotNull(message = "Order ID cannot be null")
    @Column(unique = true, nullable = false)
    private Long orderId;

    @NotNull(message = "Product Name cannot be null")
    @Size(min = 2, message = "Product Name must have at least 2 characters")
    private String productName;

    @NotNull(message = "Quantity cannot be null")
    private Integer quantity;

    @NotNull(message = "Order Date cannot be null")
    private LocalDate orderDate;

    @NotNull(message = "Customer Name cannot be null")
    @Size(min = 2, message = "Customer Name must have at least 2 characters")
    private String customerName;

    // Getters and Setters
}
