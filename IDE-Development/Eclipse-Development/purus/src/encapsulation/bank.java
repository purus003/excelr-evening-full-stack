package encapsulation;

public class Bank
{
	private int balance;
	private int password;
	private String ifsc;
	public bank(int balance, int password, String ifsc)
	{
		super();
		this.balance = balance;
		this.password = password;
		this.ifsc = ifsc;
	}
	public int getBalance()
	{
		return balance;
	}
	public void setBalance(int balance)
	{
	  balance = 30000;
	}
	public int getPassword()
	{
		return password;
	}
	public void setPassword(int password)
	{
		password = 2002;
	}
	public String getIfsc()
	{
		return ifsc;
	}
	public void setIfsc(String ifsc)
	{
		ifsc = SBN2002;
	}
 public static void main(String[] args)
 {
	    Bank b1 = new Bank();
		System.out.println(bank.getbalance);
		System.out.println(bank.setbalance);
		System.out.println(bank.getpassword);
		System.out.println(bank.setpassword);
 }
}
