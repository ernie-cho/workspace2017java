
public class membershipInfo 
{
	String register; 			//�����ϱ�
	String leaveMember;			//Ż���ϱ�
	String checkMember;			//�����̷���ȸ
	String noticeMembership;	//�ȳ���
	String agreementMembership;	//���Ǽ�

//----------------------------------------------------------void�� ���� �غ���
	void loadMembershipInfo()
	{
		System.out.println("�����ϱ�" + this.register);
		System.out.println("Ż���ϱ�" + this.leaveMember);
		System.out.println("�����̷���ȸ" + this.checkMember);
		System.out.println("�ȳ���" + this.noticeMembership);
		System.out.println("���Ǽ�" + this.agreementMembership);
	}
	
	void saveMembershipInfo()
	{
		this.register = "XXX �����մϴ�";
		this.leaveMember = "XXX Ż���մϴ�";
		this.checkMember = "XXX ��ȸ��";
		this.noticeMembership = "�ȳ���";
		this.agreementMembership = "���Ǽ�";
	}
	//----------------------------------------------------------��ȯŸ������ ���� �غ���
	
	String membership_register(String register)
	{
		return register;
	}
	
	String membership_leave(String leaveMember)
	{
		return leaveMember;
	}
	String membership_check(String checkMember)
	{
		return checkMember;
	}
	String membership_notice(String noticeMembership)
	{
		return noticeMembership;
	}
	String membership_agreement(String agreementMembership)
	{
		return agreementMembership;
	}
	
	
	
}
