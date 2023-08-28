package entitie;

public class Aluno {
	
	public String aluno;
	public double n1;
	public double n2;
	public double n3;
	
	public double notaFinal() {
		return n1 + n2 + n3;
	}
	
	public double potons() {
		if (notaFinal() < 60.0 ) {
			return notaFinal() - 60.00;
		}
		else {
			return 0.0;
		}
	}

}
