
public class membershipInfo 
{
	String register; 			//가입하기
	String leaveMember;			//탈퇴하기
	String checkMember;			//가입이력조회
	String noticeMembership;	//안내문
	String agreementMembership;	//동의서

//----------------------------------------------------------void로 설계 해보기
	void loadMembershipInfo()
	{
		System.out.println("가입하기" + this.register);
		System.out.println("탈퇴하기" + this.leaveMember);
		System.out.println("가입이력조회" + this.checkMember);
		System.out.println("안내문" + this.noticeMembership);
		System.out.println("동의서" + this.agreementMembership);
	}
	
	void saveMembershipInfo()
	{
		this.register = "XXX 가입합니다";
		this.leaveMember = "XXX 탈퇴합니다";
		this.checkMember = "XXX 조회중";
		this.noticeMembership = "안내문";
		this.agreementMembership = "동의서";
	}
	//----------------------------------------------------------반환타입으로 설계 해보기
	
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
