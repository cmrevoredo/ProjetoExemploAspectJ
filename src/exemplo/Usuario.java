package exemplo;

import com.cmrevoredo.s2d2.modeling.utils.SensitiveData;

public class Usuario {
	private String login;
	@SensitiveData(setNullIfRead=true)
	private String password;
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
