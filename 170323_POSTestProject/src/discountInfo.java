
public class discountInfo
{
	int employeeSettingDC;	//�����緮����
	int eventDC;			//�̺�Ʈ������
	int onePlusOne;			//1+1
	int twoPlusOne;			//2+1
	int limitDC;			//����Ⱓ��������
	int timeDC;				//�ð��뺰����

//----------------------------------------------------------void�� ���� �غ���
	void loadDiscountInfo()
	{
		System.out.println("�����緮����" + this.employeeSettingDC);
		System.out.println("�̺�Ʈ������" + this.eventDC);
		System.out.println("1+1" + this.onePlusOne);
		System.out.println("2+1" + this.twoPlusOne);
		System.out.println("����Ⱓ��������" + this.limitDC);
		System.out.println("�ð��뺰����" + this.timeDC);
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
	//----------------------------------------------------------��ȯŸ������ ���� �غ���	
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
