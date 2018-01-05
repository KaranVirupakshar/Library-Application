class Member
{
	String memID;
	String memName;
	String department;
	int issuedDay;
	int issuedMonth;
	int returnDay;
	int returnMonth;
	Material material;
	Member(){}
	Member(String memID, String memName, String department)
	{
		this.memID=memID;
		this.memName=memName;
		this.department=department;
	
		material=new Material();
		Library.memcount++;
	}
}
