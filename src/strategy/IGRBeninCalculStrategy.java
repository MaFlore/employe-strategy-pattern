package strategy;

public class IGRBeninCalculStrategy implements IGRCalculStrategy{
	
	public float calculIGR(float salaireBrutMensuel) {
		System.out.println("IGR Benin");
		float salaireBrutAnnuel = salaireBrutMensuel*12;
		
		if (salaireBrutMensuel<=20000) {
			return salaireBrutAnnuel*0/100;
		}
		
		if (salaireBrutMensuel>=20001 && salaireBrutMensuel<=100000) {
			return salaireBrutAnnuel*15/100;
		}
		
		if(salaireBrutMensuel>=100001 && salaireBrutMensuel<=250000) {
			return salaireBrutAnnuel*20/100;
		}
		
		if(salaireBrutMensuel>=250001 && salaireBrutMensuel<=500000) {
			return salaireBrutAnnuel*25/100;
		}

		else {
			return salaireBrutAnnuel*40/100;
		}
		
	}

}
