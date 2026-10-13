package com.fintrack.dto; import com.fintrack.model.Transaction; import jakarta.validation.constraints.*; import java.math.BigDecimal;
public record TransactionRequest(@NotBlank String description,@NotBlank String category,@NotNull @Positive BigDecimal amount,@NotNull Transaction.TransactionType type){}
