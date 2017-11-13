
public class pointInfo
{
	int usePoint;			//포인트사용
	int addPoint;			//포인트적립
	int remainPoint;		//남은포인트
	int limitPoint;			//유효기간
	
	//----------------------------------------------------------void로 설계 해보기
	void loadPointInfo()
	{
		System.out.println("포인트사용" + this.usePoint);
		System.out.println("포인트적립" + this.addPoint);
		System.out.println("남은포인트" + this.remainPoint);
		System.out.println("유효기간" + this.limitPoint);	
	}
	
	
	void savePointInfo()
	{
		this.usePoint = 343;
		this.addPoint = 23;
		this.remainPoint = 23033;
		this.limitPoint = 20190302;
	}
	//----------------------------------------------------------반환타입으로 설계 해보기
	
	int point_uPoint(int usePoint)
	{
		return usePoint;
	}
	
	int point_aPoint(int addPoint)
	{
		return addPoint;
	}
	
	int point_rPoint(int remainPoint)
	{
		return remainPoint;
	}
	
	int point_lPoint(int limitPoint)
	{
		return limitPoint;
	}
}
