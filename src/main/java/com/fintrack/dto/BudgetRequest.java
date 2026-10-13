package com.fintrack.dto; import jakarta.validation.constraints.*; import java.math.BigDecimal;
public record BudgetRequest(@NotBlank String category,@NotNull @Positive BigDecimal limitAmount){}
