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

    private Loan(CapitalStrategy capitalStrategy, double commitment, double outstanding, int riskRating, Date maturity, Date expiry) {
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
        double noOutsanding = 0.00;
        CapitalStrategy noCapitalStrategy = null;
        Date noExpiry = null;
        return new Loan(noCapitalStrategy, commitment, noOutsanding, riskTaking, maturity, noExpiry);
    }

    public static Loan createTermLoan(CapitalStrategy riskAdjustedCapitalStrategy, double commitment, double outstanding,int riskTaking, Date maturity ) {
        Date noExpiry = null;
        return new Loan(riskAdjustedCapitalStrategy, commitment, outstanding, riskTaking, maturity, noExpiry);
    }

    public static Loan createRevolver(CapitalStrategyRCTL capitalStrategy, double commitment, double outstanding, int riskRating, Date expiry) {
        Date noMaturity = null;
        return new Loan(capitalStrategy, commitment, outstanding, riskRating, noMaturity, expiry);
    }

    public static Loan createRevolver(double commitment, double outstanding, int riskRating, Date expiry) {
        CapitalStrategy noCapitalStrategy = null;
        Date noMaturity = null;
        return new Loan(noCapitalStrategy, commitment, outstanding, riskRating, noMaturity, expiry);
    }

    public static Loan createRCTL(double commitment, Date maturity, CapitalStrategy capitalStrategy, double outstanding, int riskRating, Date expiry) {
        return new Loan(capitalStrategy, commitment, outstanding, riskRating, maturity, expiry);
    }

    public static Loan createRCTL(CapitalStrategy capitalStrategyRctl, double commitment, int riskRating, Date maturity, Date expiry) {
        double noOutstanding = 0.00;
        return new Loan(capitalStrategyRctl, commitment, noOutstanding, riskRating, maturity, expiry);
    }
}
