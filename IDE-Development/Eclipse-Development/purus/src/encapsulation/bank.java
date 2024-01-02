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
	public void setBalance(int 30000)
	{
	  balance = 30000;
	}
	public int getPassword()
	{
		return password;
	}
	public void setPassword(int 2002)
	{
		password = 2002;
	}
	public String getIfsc()
	{
		return ifsc;
	}
	public void setIfsc(String SBN2002)
	{
		ifsc = SBN2002;
	}
 public static void main(String[] args)
 {
	    Bank b1 = new Bank();
		System.out.println(b1.getbalance);
		System.out.println(b1.setbalance);
		System.out.println(b1.getpassword);
		System.out.println(b1.setpassword);
 }
}
