package johan;

public class Cat {
	String breed;
	String size;
	String color;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat1=new Cat();
		Cat cat2=new Cat();
		
		cat1.breed="indan";
		cat1.size="normal";
		cat1.color="golden";
		
		cat2.breed="road side";
		cat2.size="kitten";
		cat2.color="black";
		
		System.out.println(" cat 1 details:");
        System.out.println("Breed: " + cat1.breed);
        System.out.println("size: " + cat1.size);
        System.out.println("size: " + cat1.color);
        
        System.out.println(" cat 2 details:");
        System.out.println("Breed: " + cat2.breed);
        System.out.println("size: " + cat2.size);
        System.out.println("size: " + cat2.color);
		
	}

}
