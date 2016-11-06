class BMI { 
 	void BMI_(float weight, float height) { 
 		float bmi = (float) weight / (height * height); 
 		System.out.printf("bmi  : %f",bmi); 
         String mybmi=""; 
 		if (bmi <= 18.5) 
 			mybmi= "low"; 
 		else if (bmi >= 18.5 && bmi < 23) 
 			mybmi= "normal"; 
 		else if (bmi >= 23 && bmi < 25) 
 			mybmi= "risky"; 
 		else if (bmi >= 25 && bmi < 30) 
 			mybmi= "obesity 1"; 
 		else if (bmi >= 30 && bmi < 40) 
 			mybmi= "obesity 2"; 
 		else if (bmi >= 40) 
 			mybmi= "obesity 3"; 
 		else 
 			mybmi= "error"; 
         System.out.printf(" Weight : %f kg, Height : %f m grade : %s", weight, height, mybmi); 
 	} 

 		BMI b = new BMI(); 
 		
 		 
 	} 
 } 
