package com.fintrack.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import java.math.BigDecimal;

public record GoalRequest(
        @NotBlank String name,
        @NotNull @PositiveOrZero BigDecimal currentAmount,
        @NotNull @Positive BigDecimal targetAmount,
        String targetDate
) {}
