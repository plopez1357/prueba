package ar.edu.untref.dyasc;

import static org.junit.Assert.*;

public class Test{
	
	@org.junit.Test
	public void generateSuccessionVerticalAndDirect() {
		FormatSuccession succession = new FormatSuccession();
		String resultSuccession = succession.generateSuccessionWithSpecifications("vd",5);
		assertEquals("fibo<5>: \n0\n1\n1\n2\n3\n", resultSuccession);
	}
	
	@org.junit.Test
	public void generateSuccessionVerticalAndInverse() {
		FormatSuccession succession = new FormatSuccession();
		String resultSuccession = succession.generateSuccessionWithSpecifications("vi", 8);
		assertEquals("fibo<8>: \n13\n8\n5\n3\n2\n1\n1\n0\n", resultSuccession);
	}
	
	@org.junit.Test
	public void generateSuccessionHorizontalAndDirect() {
		FormatSuccession succession = new FormatSuccession();
		String resultSuccession = succession.generateSuccessionWithSpecifications("hd", 5);
		assertEquals("fibo<5>: 0 1 1 2 3 ", resultSuccession);
	}
	
	@org.junit.Test
	public void generateSuccessionHorizontalAndInverse() {
		FormatSuccession succession = new FormatSuccession();
		String resultSuccession = succession.generateSuccessionWithSpecifications("hi", 8);
		assertEquals("fibo<8>: 13 8 5 3 2 1 1 0 ", resultSuccession);
	}
	
	@org.junit.Test
	public void generateSuccessionWithoutOHorizontalAndDirect() {
		FormatSuccession succession = new FormatSuccession();
		String resultSuccession = succession.generateSuccessionWithSpecifications("9",9);
		assertEquals("fibo<9>: 0 1 1 2 3 5 8 13 21 ", resultSuccession);
	}
	
	@org.junit.Test
	public void showSuccessionVerticalAndDirect() {
		String succession[] = new String[2];
		succession[0] ="-o=vd";
		succession[1] ="5";
		String resultSuccession = Program.validateErrorsAndShowSucession(succession);
		assertEquals("fibo<5>: \n0\n1\n1\n2\n3\n", resultSuccession);
	}
	
	@org.junit.Test
	public void showSuccessionVerticalAndInverse() {
		String succession[] = new String[2];
		succession[0] ="-o=vi";
		succession[1] ="8";
		String resultSuccession = Program.validateErrorsAndShowSucession(succession);
		assertEquals("fibo<8>: \n13\n8\n5\n3\n2\n1\n1\n0\n", resultSuccession);
	}
	
	@org.junit.Test
	public void showSuccessionHorizontalAndDirect() {
		String succession[] = new String[2];
		succession[0] ="-o=hd";
		succession[1] ="6";
		String resultSuccession = Program.validateErrorsAndShowSucession(succession);
		assertEquals("fibo<6>: 0 1 1 2 3 5 ", resultSuccession);
	}
	
	@org.junit.Test
	public void showSuccessionHorizontalAndInverse() {
		String succession[] = new String[2];
		succession[0] ="-o=hi";
		succession[1] ="9";
		String resultSuccession = Program.validateErrorsAndShowSucession(succession);
		assertEquals("fibo<9>: 21 13 8 5 3 2 1 1 0 ", resultSuccession);
	}
	
	@org.junit.Test
	public void showSuccessionWithoutSpecification() {
		String succession[] = new String[1];
		succession[0] ="7";
		String resultSuccession = Program.validateErrorsAndShowSucession(succession);
		assertEquals("fibo<7>: 0 1 1 2 3 5 8 ", resultSuccession);
	}
	
	@org.junit.Test
	public void validateErrorMoreTwoValues() {
		String succession[] = new String[3];
		succession[0] ="-o=hi";
		succession[1] ="2";
		succession[2] ="7";
		String resultSuccession = Program.validateErrorsAndShowSucession(succession);
		assertEquals("Opciones no validas.", resultSuccession);
	}
	
	@org.junit.Test
	public void validateErrorWithoutEnteringValues() {
		String succession[] = new String[0];
		String resultSuccession = Program.validateErrorsAndShowSucession(succession);
		assertEquals("Opciones no validas.", resultSuccession);
	}
	
	@org.junit.Test
	public void validateErrorInvalidSpecifications() {
		String succession[] = new String[2];
		succession[0] ="-o=xy";
		succession[1] ="2";
		String resultSuccession = Program.validateErrorsAndShowSucession(succession);
		assertEquals("Opciones no validas.", resultSuccession);
	}
}
