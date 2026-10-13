package com.fintrack.model;
import jakarta.persistence.*; import lombok.*; import java.math.BigDecimal;
@Entity @Table(name="budgets") @Getter @Setter @NoArgsConstructor
public class Budget { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; @ManyToOne(fetch=FetchType.LAZY,optional=false) @JoinColumn(name="user_id") private User user; @Column(nullable=false) private String category; @Column(nullable=false,precision=15,scale=2) private BigDecimal limitAmount; }
