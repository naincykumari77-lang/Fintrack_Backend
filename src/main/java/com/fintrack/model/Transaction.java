package com.fintrack.model;
import jakarta.persistence.*; import lombok.*; import java.math.BigDecimal; import java.time.LocalDateTime;
@Entity @Table(name="transactions") @Getter @Setter @NoArgsConstructor
public class Transaction { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; @ManyToOne(fetch=FetchType.LAZY,optional=false) @JoinColumn(name="user_id") private User user; @Column(nullable=false) private String description; @Column(nullable=false) private String category; @Column(nullable=false,precision=15,scale=2) private BigDecimal amount; @Enumerated(EnumType.STRING) private TransactionType type; private LocalDateTime transactionDate=LocalDateTime.now(); public enum TransactionType{INCOME,EXPENSE} }
