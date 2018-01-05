class Library
{
	int collegeID;
	int libraryID;
	static int libcount=0;
	static int memcount=0;
	Material[] materials;
	Member[] members;
	Library(){}
	Library(int collegeID, int libraryID)
	{
		this.collegeID=collegeID;
		this.libraryID=libraryID;
		materials=new Material[20];
		materials[0]=new ReferenceBook("101","John A","DS Book",1,5,"CS");
		materials[1]=new ReferenceBook("102","Justin B","DC Book",2,7,"EC");
		materials[2]=new ReferenceBook("103","Drake C","AEC Book",3,4,"EE");
		materials[3]=new ReferenceBook("104","Walden D","FM Book",4,2,"MECH");
		materials[4]=new ReferenceBook("105","Charlie E","OOPS Book",5,6,"CS");
		materials[5]=new Journal("201","Jim 1A","Chem Journal",11,2,"IN");
		materials[6]=new Journal("202","Alan 2B","Phy Journal",12,4,"BR");
		materials[7]=new Journal("203","Bryan 3C","Phil Journal",13,6,"SP");
		materials[8]=new Journal("204","Link 4D","Bio Journal",14,5,"FR");
		materials[9]=new Journal("205","Phil 5E","History Journal",15,7,"AM");
		materials[10]=new ReferenceBook("106","Walden D","DS Book",4,2,"CS");
		materials[11]=new ReferenceBook("107","Charlie E","DC Book",5,6,"EC");
		materials[12]=new Journal("206","Michael F","Com Journal",15,7,"CH");
		members=new Member[6];
		members[0]=new Member("801","Charles M","CS");
		members[1]=new Member("802","Andy W","EC");
	}
}