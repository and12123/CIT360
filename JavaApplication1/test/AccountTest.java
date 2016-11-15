
import org.junit.*;

class Account {
	    private double balance;

	    public Account(double balance) {
	        this.balance = balance;
	    }

	    public double getBalance() {
	        return balance;
	    }
	 
	    public void setBalance(double balance) {
	        this.balance = balance;
	    }

	    public void withdraw(double withdrawAmount) {
	        this.balance = balance - withdrawAmount;
	    }
	 
	    public void deposit(double depositAmount) {
	        this.balance = balance + depositAmount;
	    }
	}
	 
	public class AccountTest extends Assert {
	    private Account account;
	    private static double balance;
	 
	    @BeforeClass
	    public static void BeforeClass() {
	        balance = 100;
	        System.out.println("BeforeClass");
	    }
	 
	    @Before
	    public void setUp() throws Exception {
	        account = new Account(balance);
	    }
	 
	    @Test
	    public void balanceForAccount() {
	        Assert.assertEquals("Test balance", account.getBalance(), balance, 0);
	        System.out.println("Test balance. Balance: " + account.getBalance());
	    }
            
            @Test
	    public void testOneDeposit() {
	        account.deposit(20);
	        Assert.assertEquals("Test deposit", account.getBalance(), balance, 20);
	        System.out.println("Test deposit. Balance: " + account.getBalance());
	    }
	 
	    @Test
	    public void testManyDeposits() {
	        account.deposit(20);
	        account.deposit(10);
	        Assert.assertEquals("Test many deposits", account.getBalance(), balance, 30);
	        System.out.println("Test many deposits. Balance: " + account.getBalance());
	    }
	 
	    @Test
	    public void testOneWithdraw() {
	        account.withdraw(20);
	        Assert.assertEquals("Test withdraw", account.getBalance(), balance, 20);
	        System.out.println("Test withdraw. Balance: " + account.getBalance());
	    }	 
	
            @Test
	    public void testManyWithdraws() {
	        account.withdraw(20);
	        account.withdraw(10);
	        Assert.assertEquals("Test many withdraws", account.getBalance(), balance, 30);
	        System.out.println("Test many withdraws. Balance: " + account.getBalance());
	    }
	 
	    @After
	    public void tearDown() throws Exception {
	        account = null;
	        System.out.println("tearDown");
	    }
	 
	    @AfterClass
	    public static void AfterClass() {
	        balance = 0;
	        System.out.println("AfterClass");
	    }
	 
	    @Ignore
	    public void executionIgnored() {
	        System.out.println("@Ignore: This execution is ignored");
	    }
	}