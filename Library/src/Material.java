class Material
{
	String materialId;
	String author;
	String  materialName;
	String returncheck;
	int rackNo;
	int quantity;
	
	Material(){}
	Material(String materialId, String author, String  materialName, int rackNo, int quantity)
	{
		this.materialId=materialId;
		this.author=author;
		this.materialName=materialName;
		this.rackNo=rackNo;
		this.quantity=quantity;
	}
}

class ReferenceBook extends Material
{
	String department;
	ReferenceBook(){}
	ReferenceBook(String materialId, String author, String  materialName, int rackNo, int quantity, String department)
	{
		super(materialId, author, materialName, rackNo, quantity);
		this.department=department;
		Library.libcount++;
	}
}

class Journal extends Material
{
	String publisher;
	Journal(){}
	Journal(String materialId, String author, String  materialName, int rackNo, int quantity, String publisher)
	{
		super(materialId, author, materialName, rackNo, quantity);
		this.publisher=publisher;
		Library.libcount++;
	}
}

