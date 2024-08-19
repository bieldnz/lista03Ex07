package view;
import controller.ControllerSoma;
public class Principal {
	
	public static void main(String[] args) {
		
		ControllerSoma controller = new ControllerSoma();
		
		int result = controller.soma(134, 0);
		
		System.out.println(result);
		
	}
	
}
