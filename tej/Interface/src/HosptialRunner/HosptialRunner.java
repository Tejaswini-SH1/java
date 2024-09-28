package HosptialRunner;

import com.xworkz.rule.internal.GovtHosptialRule;

public interface HosptialRunner {

	public static void main(String[] args) {
		//7 ways 4 varialbes.return type,extends+implements
		
		GovtHosptialRule govtHosptialRule=null;
		govtHosptialRule.maintainSilence();
		govtHosptialRule.serve();
		govtHosptialRule.visitorAllowed();

	}

}
