
public class Shop {

	public static void main(String[] args) {
	
		Door door = new Door();
		if (door.isLocked(args[0])) {
			System.out.println("shop is closed");
		}else {
			{
				System.out.println("shop is open");
			}
			
		}
		

	}

}
