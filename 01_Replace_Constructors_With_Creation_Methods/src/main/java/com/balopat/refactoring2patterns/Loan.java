package com.balopat.refactoring2patterns;

import com.balopat.refactoring2patterns.CapitalStrategy;

import java.util.Date;

public class Loan {
    private double commitment;
    private double outstanding;
    private int riskRating;
    private Date maturity;
    private Date expiry;
    private CapitalStrategy capitalStrategy;

    public Loan(double commitment, int riskRating, Date maturity, Date expiry) {
        this(commitment, 0.00, riskRating, maturity, expiry);
    }

    public Loan(double commitment, double outstanding, int riskRating, Date maturity, Date expiry) {
        this(null, commitment, outstanding, riskRating, maturity, expiry);
    }

    public Loan(CapitalStrategy capitalStrategy, double commitment, int riskRating, Date maturity, Date expiry) {
        this(capitalStrategy, commitment, 0.00, riskRating, maturity, expiry);
    }

    public Loan(CapitalStrategy capitalStrategy, double commitment, double outstanding, int riskRating, Date maturity, Date expiry) {
        this.commitment = commitment;
        this.outstanding = outstanding;
        this.riskRating = riskRating; 
        this.maturity = maturity;
        this.expiry = expiry;
        this.capitalStrategy = capitalStrategy;
        
        if (capitalStrategy == null){
            if (expiry == null)
                this.capitalStrategy = new CapitalStrategyTermLoan();
            else if (maturity == null)
                this.capitalStrategy = new CapitalStrategyRevolver();
            else
                this.capitalStrategy = new CapitalStrategyRCTL();
        }
                 
    }

    public static Loan createTermLoan(double commitment, int riskTaking, Date maturity) {
        return new Loan(commitment, riskTaking, maturity, null);
    }
}
