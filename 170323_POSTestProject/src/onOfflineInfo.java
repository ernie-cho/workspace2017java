
public class onOfflineInfo
{
	double onlinePayment;			//Online�����ϱ�
	double offlinePayment;			//Offline�����ϱ�
	String onlinePOS;				//OnlinePOS
	String offlinePOS;				//OfflinePOS
	
	//----------------------------------------------------------void�� ���� �غ���
	void loadOnOfflineInfo()
	{
		System.out.println("Online�����ϱ�" + this.onlinePayment);
		System.out.println("Offline�����ϱ�" + this.offlinePayment);
		System.out.println("OnlinePOS" + this.onlinePOS);
		System.out.println("OfflinePOS" + this.offlinePOS);
	}
	
	void saveOfflineInfo()
	{
		this.onlinePayment = 2343;
		this.offlinePayment = 2343;
		this.onlinePOS = "OnlinePOS����";
		this.offlinePOS = "OfflinePOS����";
	}
	//----------------------------------------------------------��ȯŸ������ ���� �غ���
	
	String onOff_onPOS(String onlinePOS)
	{
		return onlinePOS;
	}
	
	String onOff_offPOS(String offlinePOS)
	{
		return offlinePOS;
	}
	
	double onOff_onPay(double onlinePayment)
	{
		return onlinePayment;
	}
	
	double onOff_offPay(double offlinePayment)
	{
		return offlinePayment;
	}
	
	
	
	
}
