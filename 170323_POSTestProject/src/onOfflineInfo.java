
public class onOfflineInfo
{
	double onlinePayment;			//Online결재하기
	double offlinePayment;			//Offline결재하기
	String onlinePOS;				//OnlinePOS
	String offlinePOS;				//OfflinePOS
	
	//----------------------------------------------------------void로 설계 해보기
	void loadOnOfflineInfo()
	{
		System.out.println("Online결재하기" + this.onlinePayment);
		System.out.println("Offline결재하기" + this.offlinePayment);
		System.out.println("OnlinePOS" + this.onlinePOS);
		System.out.println("OfflinePOS" + this.offlinePOS);
	}
	
	void saveOfflineInfo()
	{
		this.onlinePayment = 2343;
		this.offlinePayment = 2343;
		this.onlinePOS = "OnlinePOS서비스";
		this.offlinePOS = "OfflinePOS서비스";
	}
	//----------------------------------------------------------반환타입으로 설계 해보기
	
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
