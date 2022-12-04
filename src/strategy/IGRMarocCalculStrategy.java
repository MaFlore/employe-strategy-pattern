package strategy;

public class IGRMarocCalculStrategy implements IGRCalculStrategy{
	
	public float calculIGR(float salaireBrutMensuel) {
		System.out.println("IGR Maroc");
		float salaireBrutAnnuel = salaireBrutMensuel*12;
		
		if (salaireBrutMensuel<=30000) {
			return salaireBrutAnnuel*0/100;
		}
		
		if (salaireBrutMensuel>=30001 && salaireBrutMensuel<=50000) {
			return salaireBrutAnnuel*10/100;
		}
		
		if(salaireBrutMensuel>=50001 && salaireBrutMensuel<=60000) {
			return salaireBrutAnnuel*20/100;
		}
		
		if(salaireBrutMensuel>=60001 && salaireBrutMensuel<=80000) {
			return salaireBrutAnnuel*30/100;
		}
		
		if(salaireBrutMensuel>=80001 && salaireBrutMensuel<=180000) {
			return salaireBrutAnnuel*34/100;
		}
		
		else {
			return salaireBrutAnnuel*38/100;
		}		
	}
}
