package cn.tedu;

public class HelloAction {
	private String message;
	
	public String getMessage() {
		return message;
	}
	
	public String execute(){
		message="HI";
		System.out.println("新方法");
		return "success";
	}
}
