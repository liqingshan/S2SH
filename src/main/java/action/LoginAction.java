package action;

import java.util.Map;

import service.UserService;


import com.opensymphony.xwork2.ActionContext;

public class LoginAction {
	private String username;
	private String password;
	private String pic;
	private UserService userservice;
	
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public UserService getUserservice() {
		return userservice;
	}
	public void setUserservice(UserService userservice) {
		this.userservice = userservice;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String userlogin(){
		ActionContext ctx=ActionContext.getContext();
		Map<String, Object> s=ctx.getSession();
		s.put("username", "Jon");
		System.out.print("dfdfsda");
		return "ok";
	}
	
	public String logout(){
		ActionContext ctx=ActionContext.getContext();
		Map<String, Object> s=ctx.getSession();
		s.remove("username");
		return "ok";
	}
	
	
}
