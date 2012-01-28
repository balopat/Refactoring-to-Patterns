import com.balopat.refactoring2patterns.CapitalStrategy;
import com.balopat.refactoring2patterns.CapitalStrategyRCTL;
import com.balopat.refactoring2patterns.Loan;
import org.junit.Test;

import java.util.Date;

public class AnotherTest {

    double commitment = 50.00;
    int riskTaking = 20;
    Date maturity = new Date();
    CapitalStrategy capitalStrategy = null;
    double outstanding = 0;
    int riskRating = 20;
    Date expiry = new Date();

    @Test
    public void testTermLoanNoPayments() {
        //...
        Loan termLoan = new Loan(commitment, riskTaking, maturity);
        //...
    }

    @Test
    public void testTermLoanOnePayment() {
        //...
        Loan termLoan = new Loan(commitment, riskTaking, maturity);
        //...
    }

    @Test
    public void testTermLoanWithNullExpiryPassed(){
        //...
        Loan termLoan = new Loan(commitment, riskTaking, maturity,null);
        //...
    }
    
    @Test
    public void testRCTL(){
        //...
        Loan rctlLoan = new Loan(capitalStrategy, commitment, outstanding, riskRating, maturity, expiry);
        //...
    }

    @Test
    public void testRCTLWithNullCapitalStrategyAndNoOutstanding(){
        //...
        Loan rctlLoan = new Loan(null, commitment, riskRating, maturity, expiry);
        //...
    }


    @Test
    public void testRevolver(){
        //...
        Loan revolverLoan = new Loan(commitment, outstanding, riskRating, null, expiry);
        //...
    }


    @Test
    public void testRevolverWithCapitalStrategy(){
        //...
        Loan revolverLoan = new Loan(new CapitalStrategyRCTL(), commitment, outstanding, riskRating, null, expiry);
        //...
    }
}
