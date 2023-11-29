package com.janawat.productapi;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ProductDTO {
    @NotNull(message = "Name cannot be null")
    @NotBlank(message = "Name is required")
    private String name;

    @NotNull(message = "Price cannot be null")
    @Positive(message = "Price must be a positive value")
    private Double price;
}
