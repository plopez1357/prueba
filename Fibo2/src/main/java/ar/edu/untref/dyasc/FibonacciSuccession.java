package ar.edu.untref.dyasc;

public class FibonacciSuccession { 

   //Retorna el nùmero correpondiente a la posicion ingresada de la serie de fibonacci 
   private int calculatePositionOfFibonacciSuccession(int position){
	   
      if (position > 1){
        return calculatePositionOfFibonacciSuccession(position-1) 
        + calculatePositionOfFibonacciSuccession(position-2);  //función recursiva
      }
      else if (position == 1) {  //caso base
        return 1;
      }
      else if (position == 0){  //caso base
        return 0;
      }
	return position;
   }
   
   //Dado el largo de la sucesion, la retorna
   public int[] calculateFibonacciSuccession(int successionLength){
	  int fibonacciSuccession[] = new int[successionLength];
	  
      for(int i = 0; i < successionLength; i++){
    	  fibonacciSuccession[i] = calculatePositionOfFibonacciSuccession(i);
	  }
      return fibonacciSuccession;
   }
}
