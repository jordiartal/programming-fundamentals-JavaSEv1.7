package classes;
public class RestaurantApp{
	public static void main (String[] args){
		try{
						
			//exercise 3
			Restaurant menu1 = new Restaurant("stamppot boerenkool", 564.65, 45, 20.5, 0.5);
			Restaurant menu2 = new Restaurant("metworst", 345, 12, 10.99, 0);			
			Restaurant menu3 = new Restaurant("Hutspot", 560.4, 65, 30.99, 1);			
			Restaurant menu4 = new Restaurant("Biefstuk", 780, 46, 50.34, 2);
			Restaurant menu5 = new Restaurant("Kibbeling", 450.4, 23, 20.78, 1);
			
			//exercise 4
			Restaurant[] carta = new Restaurant[5];
			carta[0]=menu1;
			carta[1]=menu2;
			carta[2]=menu3;
			carta[3]=menu4;
			carta[4]=menu5;
			
			System.out.println("exercise 4");
			for(int i=0;i<5;i++){
				System.out.println(carta[i].getAtributes(carta));
			}
			System.out.println("-------------------------------");
			
			
			//exercise 5
			System.out.println("exercise 5");
			for(int i=0;i<5;i++){
				if(carta[i].getEta()<30){
					System.out.println(carta[i].getName()+" cooks in "+carta[i].getEta()+" minutes");
				}
				
			}
			System.out.println("-------------------------------");
			
			//exercise 6
			System.out.println("exercise 6");
			double totalprice=0;
			double discount=0;
			for(int i=0;i<5;i++){
				totalprice=totalprice+carta[i].getPperson();
				if(totalprice>65){
					discount=totalprice-((totalprice/65)*10);
				}
			}
			System.out.println("the total price is "+totalprice);
			System.out.println("the total price with discount is "+discount);
			System.out.println("-------------------------------");
			
			
		}
		catch(Exception e){
			System.out.println("error al main" + e);
		}
	}
}