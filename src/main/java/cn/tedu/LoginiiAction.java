package cn.tedu;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import cn.tedu.entity.User;

public class LoginiiAction implements SessionAware,RequestAware{
	
	
	private User user;
	private Map<String,Object> session;
	private Map<String,Object> request;
	
	public Map<String, Object> getRequest() {
		return request;
	}
	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}
	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String execute(){
//		ActionContext context=ActionContext.getContext();
//		Map<String,Object> session=context.getSession();
		if("caocao".equals(user.getUsername())&&"123".equals(user.getPassword())){
			session.put("loginUser", user.getUsername());
			return "success";
		}
		request.put("msg", "想好了在登录");
		System.out.println(user);
		return "error";
	}

}
