package classes;

public class Main {

	public static void main(String[] args) {
			CustomerManager customerManager /*= new CustomerManager()*/ ; 
			CustomerManager customerManager2 = new CustomerManager();
			customerManager = customerManager2; // refNumbers are equaled
			customerManager.Add();
			customerManager.Remove();
			customerManager.Update();
			
			//value
			int sayi1 = 10; /*sayi1 in değeri 10*/
			int sayi2 = 20; /*sayi2 nin değeri 20*/
			sayi2= sayi1; /*sayi2 nin değeri sayi1 in değerine eşit*/
			sayi1 =30;        /*sayi1 in değeri 30a eşit*/
			System.out.println(sayi2);
			System.out.println(sayi1);
	
	        int[] sayilar1 = new int[] {1,2,3};
	        int[] sayilar2 /*= new int[] {4,5,6}*/  ;
	        sayilar2 = sayilar1;        //refNumbers are equaled
	        sayilar1[0]=10;
	        System.out.println(sayilar2[0]);
	        		}

}
