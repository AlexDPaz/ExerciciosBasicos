package entities;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enuns.WorkeLevel;


public class Worker {

	private String name;
	private WorkeLevel level;
	private Double baseSalary;

	// criando as associações worker > departament
	private Departament department;
	// criando associação usando uma lista worker > hourContract(um woker tens varios contratos)
	private List<HourContract> contracts = new ArrayList<>();
	/* quando tem um composição tem muitos que no caso é uma lista, não incuir no construtor e simplesmente
	 * inicia a lista vazia 
	 */

	public Worker() {
	}

// quando criar os contrutores não incluir a lista e por padrao instaciar a lista na classe. 
	public Worker(String name, WorkeLevel level, Double baseSalary, Departament department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkeLevel getLevel() {
		return level;
	}

	public void setLevel(WorkeLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Departament getDepartment() {
		return department;
	}

	public void setDepartment(Departament department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}
/* remover o set contract para não ser trocada a lista 
	public void setContracts(List<HourContract> contracts) {
		this.contracts = contracts;
	}*/

	public void addContract(HourContract contract) {
		contracts.add(contract);
	}

	public void removedContract(HourContract contract) {
		contracts.remove(0);
	}
	public Double income(int year , int month) {
		double  sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		/* laço para percorero os contrato do funcionario que sejao de um mes espesifico
		 * entoa incluir uma condição para iss o
		 */
		for(HourContract c : contracts) {
			// para cada contrato setar nesse calendario a data do contrato "c"
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_mouth = 1 + cal.get(Calendar.MONTH); 
			if (year == c_year && month == c_mouth) {
			sum += c.totalValeu();
			}
		}
		return sum;
		
		/* esse laço se fosse paara retornar o valor de todos os comtratos
		for(HourContract c : contracts) {
			sum += c.totalValeu();
		}
		return sum;*/
	}
	

}
