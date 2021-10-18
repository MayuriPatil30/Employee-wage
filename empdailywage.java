public class empdailywage
 {
      public static void main(String[] args) 
        {
            int parttime=1;
	    int fulltime=2;
            int emprateperhr=20;
            int empwage=0;
            int emphrs=0;
	    double empcheck=Math.floor(Math.random()*10)%3;
            if (empcheck==fulltime)
	        emphrs=8;
	    else if (empcheck==parttime)
		emphrs=4;
		empwage=emphrs*emprateperhr;
		System.out.println("Empwage: "+empwage);    
        }
}
