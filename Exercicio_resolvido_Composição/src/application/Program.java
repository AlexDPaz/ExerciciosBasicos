package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entities.enuns.WorkeLevel;


public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		/*Ler os dados de um trabalhador com N contratos (N fornecido pelo usuário). Depois, solicitar
do usuário um mês e mostrar qual foi o salário do funcionário nesse mês, conforme exemplo
(próxima página).*/
		
		System.out.print("Enter department's name: ");
		String departamentName = sc.nextLine();
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String workername = sc.nextLine();
		System.out.print("Level: ");
		String workerlevel = sc.nextLine();
		System.out.print("Base salary: " );
		double baseSalary = sc.nextDouble();
		/*Foi instaciado um novo objsto do tipo woker(os dados de objeto é o nome que digitei, instacia de enus que foi digitado e o salario base que foi informado
		Associado ao objeto vai ter outro objaeto to tipo departamento passano o nome do departamento que eu digitei.*/
		Worker worker = new Worker(workername, WorkeLevel.valueOf(workerlevel), baseSalary, new Departament(departamentName));
		
		System.out.print("How many contracts to this worker? ");
		int numeberContract = sc.nextInt();
		
		for (int i=0; i<=numeberContract; i++) {
			System.out.println("Enter contract #"+(i + 1) +" data:");
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			//ja tendo criado valor p/houra e as horas já posso intaciar os contratos 
			HourContract  contract = new HourContract(contractDate, valuePerHour, hours);
			//para associar esse contrato ao trabalhador chamo o metodo woker e passo como argumento o contrato 
			worker.addContract(contract);
		}
		
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		//retorta a String manualmente 
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0,2));
		int yaear = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Name: " + worker.getName());
		// tenho o objeto "worker" > acesso outro objeto"departamento" que esta associado a ele, e depois associao o nome do departamento.
		System.out.println("Departament: " + worker.getDepartment().getName());
		System.out.println("Income for "+monthAndYear + ": "+ String.format("%.2f", worker.income(yaear, month)));
		
		sc.close();
	}
}

