public class Hello
{
	public static boolean isAmharicRange(String str)
	{
		return ((str.hashCode()>=4608 && str.hashCode()<=4988)?true:false);
	}
	public static void main(String []args)
	{
		String k="???";
		//k+="\b?";
		System.out.println("?"+"?".hashCode());
		//System.out.println("?"+"?".hashCode()+isAmharicRange("?"));
		//System.out.println("?"+Character.getNumericValue('?')+isAmharicRange("?"));
	Amharica am=new Amharica();
	//System.out.println(am.showName());
	
	}
}