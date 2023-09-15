package org.lessons.java.geometria;

public class Rettangolo {
	public int base;
	public int altezza;
	public int perimetro;
	public int area;
	
	public Rettangolo(int base, int altezza)
	{
		this.base = base;
		this.altezza = altezza;
		
		this.perimetro = this.calcolaPerimetro(base, altezza);
		this.area = this.calcolaArea(base, altezza);
	}
	
	public int calcolaPerimetro(int lato1, int lato2)
	{
		int perimetro = (2 * lato1) + (2 * lato2);
		return perimetro;
	}
	
	public int calcolaArea(int base, int altezza)
	{
		int area = base * altezza;
		return area;
	}
	
	public void getInfo()
	{
		System.out.println("Base: " + base);
		System.out.println("Altezza: " + altezza);
		System.out.println("Perimetro: " + perimetro);
		System.out.println("Area: " + area);
		
		char ch = 'o';
		char space = ' ';
		String drawBase = "";
		String drawHeigth = "";
		
		for(int i = 0; i < base; i++)
		{
			drawBase += ch;
			if(i == 0 || i == base - 1)
				drawHeigth += ch;
			else
				drawHeigth += space;
		}
		
		System.out.println(drawBase);
		for(int i = 0; i < altezza - 2; i++)
		{
			System.out.println(drawHeigth);
		}
		
		
		System.out.println(drawBase);
	}
	
	
}
