class TabletRunner
{
 public static void main(String[] values)
 
 {
        // instastation: copy
   Tablet tablet=new Tablet();
   tablet.setName("Dolo");
   tablet.setPrice(10);

   
    Tablet tablet1=new Tablet();
	System.out.println("tablet name:"+tablet.name);
    System.out.println("tablet price:"+tablet.price);


   System.out.println("tablet1 name:"+tablet1.name);
   System.out.println("tablet1 price:"+tablet1.price);
   
   tablet1.setName("Crocion");
   tablet1.setPrice(20);
   System.out.println("tablet1 updated name:"+tablet1.name);
   System.out.println("tablet1 updated price:"+tablet1.price);
   

 }
}