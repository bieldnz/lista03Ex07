package controller;

public class ControllerSoma {
	
	public ControllerSoma() {
		super();
	}
	
	public int soma(int n, int cont) {
		
		if(cont < Integer.toString(n).length()) {
			String value = n + "";
			int num = Integer.parseInt(String.valueOf(value.charAt(cont)));
			int result = num + soma(n, cont+1);
			return result;
		}else {
			return 0;
		}
	}
	
}
