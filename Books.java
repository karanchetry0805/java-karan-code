package johan;


public class Books {
	
	String title;
	int pages;
	int price;
	
	
	Books()
	{
		title="THE BOOK";
		pages=500;
		price=125;
	}
	
	void display() {
		System.out.println("title:"+title+"no-of-papes:"+pages+"prices"+price);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Books obj1=new Books();
		Books obj2=new Books();
		obj1.display();
		obj2.display();
		
	}

}
