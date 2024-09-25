class TrainRunner{
	public static void main(String[] args){
		Train.book("khanapur","belagavi");
		Train.book("khanapur","belagavi","passenger");
        Train.book("khanapur","belagavi","passenger",150);
	    Train.cancel(1234);
        Train.cancel("khanapur","belagavi");
    }
}
