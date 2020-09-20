package qube.sonar;

import java.util.List;

public class SonarTest {
	
	public static void main(String[] args) {
		
	}
	
	class Sonar {
		private String test = "";
		Sonar(){
			
			
		}
		
		public void dummy(int number, List<String> names) {
                        number = 10;
			if (number == 0) {
				System.out.println("zero");
			}
			
		}
				
	}

}
