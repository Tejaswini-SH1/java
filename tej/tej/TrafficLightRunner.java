class TrafficLightRunner{
	public static void main(String[] trafficinfos){
		if(trafficinfos.length==3)//Avoid indexoutofbounds error
		{
		
		String location=trafficinfos[0];
		String automatic=trafficinfos[1];
		String working=trafficinfos[2];
		
		System.out.println("Location:"+location);
		System.out.println("Automatic:"+automatic);
		System.out.println("working:"+working);
	}
	
	else{
		System.out.println("Least 3 needed");
		
	}
	}
}