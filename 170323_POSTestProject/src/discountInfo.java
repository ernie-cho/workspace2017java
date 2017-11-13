
public class discountInfo
{
	int employeeSettingDC;	//직원재량할인
	int eventDC;			//이벤트성할인
	int onePlusOne;			//1+1
	int twoPlusOne;			//2+1
	int limitDC;			//유통기간마감직전
	int timeDC;				//시간대별할인

//----------------------------------------------------------void로 설계 해보기
	void loadDiscountInfo()
	{
		System.out.println("직원재량할인" + this.employeeSettingDC);
		System.out.println("이벤트성할인" + this.eventDC);
		System.out.println("1+1" + this.onePlusOne);
		System.out.println("2+1" + this.twoPlusOne);
		System.out.println("유통기간마감직전" + this.limitDC);
		System.out.println("시간대별할인" + this.timeDC);
	}
	
	void saveDiscountInfo()
	{
		this.employeeSettingDC = 5;
		this.eventDC = 10;
		this.onePlusOne = 50;
		this.twoPlusOne = 33;
		this.limitDC = 30;
		this.timeDC = 15;
	}
	//----------------------------------------------------------반환타입으로 설계 해보기	
	int dc(int employeeSettingDC)
	{
		return employeeSettingDC;
	}
	
	int dc_event(int eventDC)
	{
		return eventDC;
	}
	
	int dc_onePlus(int onePlusOne)
	{
		return onePlusOne;
	}
	
	int dc_twoPlus(int twoPlusOne)
	{
		return twoPlusOne;
	}
	
	int dc_limit(int limitDC)
	{
		return limitDC;
	}
	
	int dc_time(int timeDC)
	{
		return timeDC;
	}
	
	
	
	
	
	
	
}
