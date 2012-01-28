import com.balopat.refactoring2patterns.Loan;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

public class CapitalCalculationTests {


    

    @Test
    public void testTermLoanNoPayments() {

        double commitment = 50.00;
        int riskTaking = 20;
        Date maturity = new Date();
        
        Loan termLoan = new Loan(commitment, riskTaking, maturity);

    }
}
