
public class refundInfo 
{
	int refund100;			//100%ȯ��
	int refund50;			//50%ȯ��
	int refund20;			//20%ȯ��
	String refundCase;		//ȯ����å
	
	//----------------------------------------------------------void�� ���� �غ���
	void loadRefundInfo()
	{
		System.out.println("100%ȯ��" + this.refund100);
		System.out.println("50%ȯ��" + this.refund50);
		System.out.println("20%ȯ��" + this.refund20);
		System.out.println("ȯ����å" + this.refundCase);
	}
	
	void saveRefundInfo()
	{
		this.refund100 = 100;
		this.refund50 = 50;
		this.refund20 = 20;
		this.refundCase = "ȯ����å";
	}
	//----------------------------------------------------------��ȯŸ������ ���� �غ���
	
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
