
public class pointInfo
{
	int usePoint;			//����Ʈ���
	int addPoint;			//����Ʈ����
	int remainPoint;		//��������Ʈ
	int limitPoint;			//��ȿ�Ⱓ
	
	//----------------------------------------------------------void�� ���� �غ���
	void loadPointInfo()
	{
		System.out.println("����Ʈ���" + this.usePoint);
		System.out.println("����Ʈ����" + this.addPoint);
		System.out.println("��������Ʈ" + this.remainPoint);
		System.out.println("��ȿ�Ⱓ" + this.limitPoint);	
	}
	
	
	void savePointInfo()
	{
		this.usePoint = 343;
		this.addPoint = 23;
		this.remainPoint = 23033;
		this.limitPoint = 20190302;
	}
	//----------------------------------------------------------��ȯŸ������ ���� �غ���
	
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
