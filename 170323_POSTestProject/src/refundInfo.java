
public class refundInfo 
{
	int refund100;			//100%환불
	int refund50;			//50%환불
	int refund20;			//20%환불
	String refundCase;		//환불정책
	
	//----------------------------------------------------------void로 설계 해보기
	void loadRefundInfo()
	{
		System.out.println("100%환불" + this.refund100);
		System.out.println("50%환불" + this.refund50);
		System.out.println("20%환불" + this.refund20);
		System.out.println("환불정책" + this.refundCase);
	}
	
	void saveRefundInfo()
	{
		this.refund100 = 100;
		this.refund50 = 50;
		this.refund20 = 20;
		this.refundCase = "환불정책";
	}
	//----------------------------------------------------------반환타입으로 설계 해보기
	
	int refund_100(int refund100)
	{
		return refund100;
	}
	
	int refund_50(int refund50)
	{
		return refund50;
	}
	
	int refund_20(int refund20)
	{
		return refund20;
	}
	
	String refund_case(String refundCase)
	{
		return refundCase;
	}
	
	
}
