package SuperThisFinalStatic;

public class BlockFinalDemo {
	final int DAYS_IN_WEEK;
	{
		DAYS_IN_WEEK=7;
	}

	public static void main(String args[]) {
		BlockFinalDemo finalDemo=new BlockFinalDemo();
	//	System.out.println(finalDemo.DAYS_IN_WEEK);
	}
}