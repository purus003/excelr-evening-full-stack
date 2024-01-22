import java.io.IOException;
class InsufficientBalanceException extends ArithmeticException//extends IOException
{
	InsufficientBalanceException(String msg)
	{
		super(msg);
	}
}
