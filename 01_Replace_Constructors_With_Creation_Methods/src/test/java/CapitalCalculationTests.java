import com.balopat.refactoring2patterns.CapitalStrategy;
import com.balopat.refactoring2patterns.Loan;
import org.junit.Test;

import java.util.Date;

public class CapitalCalculationTests {

    double commitment = 50.00;
    int riskTaking = 20;
    Date maturity = new Date();
    CapitalStrategy riskAdjustedCapitalStrategy = null;
    double outstanding = 79.00;
    

    @Test
    public void testTermLoanNoPayments() {
        //...
        Loan termLoan = Loan.createTermLoan(commitment, riskTaking, maturity);
        //...
    }

 
    @Test
    public void testTermLoanOnePayment() {
        //...
        Loan termLoan = new Loan(commitment, riskTaking, maturity);
        //...
    }

    @Test
    public void testTermLoanWithRiskAdjustedCapitalStrategy(){
        //...
        Loan termLoan = new Loan(riskAdjustedCapitalStrategy, commitment, outstanding, riskTaking, maturity, null);
        //...
    }

    public static Loan createTermLoan(double commitment, int riskTaking, Date maturity) {
        return new Loan(commitment, riskTaking, maturity);
    }
}
