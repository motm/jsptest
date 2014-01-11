package jsptest2;

import de.motm.controller.Mes;
import net.sf.jsptest.HtmlTestCase;

public class Test extends HtmlTestCase {
	
	
	
	@Override
	protected String getWebRoot() {
		return "src/main/webapp/WEB-INF/views";
	}

	public void test() throws Exception{
		Mes mes = new Mes("message4");
		
		setRequestAttribute("msg", mes);
		get("/home.jsp");
		page().shouldContain("message4");
		
		System.out.println(getRenderedResponse());
		
	}
	

}
