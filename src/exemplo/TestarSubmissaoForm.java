package exemplo;

import com.cmrevoredo.s2d2.modeling.threat.taxonomy.vectors.AttackVectors;
import com.cmrevoredo.s2d2.modeling.threat.tree.B4FormSubmit;
import com.cmrevoredo.s2d2.web.protocols.http.act.HttpResponse;
import com.google.gson.JsonObject;

public class TestarSubmissaoForm {
	public static void main(String[] args) {
		TestarSubmissaoForm html = new TestarSubmissaoForm();
		JsonObject jsonObject = new JsonObject();
		jsonObject.addProperty("login", "abc");
		jsonObject.addProperty("password", "123");
		html.submit(jsonObject);
	}
	
	@B4FormSubmit(vectors={AttackVectors.V3, AttackVectors.V4, AttackVectors.V5})
	public HttpResponse submit(JsonObject json){
		HttpResponse response = new HttpResponse();
		response.setBody("Página resultante do json submetido");
		
		Usuario usuario = new Usuario();
		usuario.setLogin(json.get("login").toString());
		usuario.setPassword(json.get("password").toString());
		
		System.out.println(usuario.getLogin());
		System.out.println(usuario.getPassword());
		
		return response;
	}

}
