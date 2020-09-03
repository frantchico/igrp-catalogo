package nosi.webapps.catalogo_igrp.pages.group_components;

import nosi.core.webapp.Controller;
import nosi.core.webapp.databse.helpers.ResultSet;
import nosi.core.webapp.databse.helpers.QueryInterface;
import java.io.IOException;
import nosi.core.webapp.Core;
import nosi.core.webapp.Response;
/*----#start-code(packages_import)----*/


/*----#end-code----*/
		
public class Group_componentsController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Group_components model = new Group_components();
		model.load();
		Group_componentsView view = new Group_componentsView();
		/*----#start-code(index)----*/
		
		
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionPrimero1() throws IOException, IllegalArgumentException, IllegalAccessException{
		Group_components model = new Group_components();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		 this.addQueryString("p_id","12"); //to send a query string in the URL
		 return this.forward("catalogo_igrp","Home","index", model, this.queryString()); //if submit, loads the values  ----#gen-example */
		/*----#start-code(primero1)----*/
		
		
		/*----#end-code----*/
		return this.redirect("catalogo_igrp","Home","index", this.queryString());	
	}
	
	public Response actionSegundo() throws IOException, IllegalArgumentException, IllegalAccessException{
		Group_components model = new Group_components();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		 this.addQueryString("p_id","12"); //to send a query string in the URL
		 return this.forward("catalogo_igrp","Group_components","index", model, this.queryString()); //if submit, loads the values  ----#gen-example */
		/*----#start-code(segundo)----*/
		
		
		/*----#end-code----*/
		return this.redirect("catalogo_igrp","Group_components","index", this.queryString());	
	}
	
	public Response actionTerceiro() throws IOException, IllegalArgumentException, IllegalAccessException{
		Group_components model = new Group_components();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		 this.addQueryString("p_id","12"); //to send a query string in the URL
		 return this.forward("catalogo_igrp","Group_components","index", model, this.queryString()); //if submit, loads the values  ----#gen-example */
		/*----#start-code(terceiro)----*/
		
		
		/*----#end-code----*/
		return this.redirect("catalogo_igrp","Group_components","index", this.queryString());	
	}
	
	public Response actionQuarto_boton() throws IOException, IllegalArgumentException, IllegalAccessException{
		Group_components model = new Group_components();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		 this.addQueryString("p_id","12"); //to send a query string in the URL
		 return this.forward("catalogo_igrp","Group_components","index", model, this.queryString()); //if submit, loads the values  ----#gen-example */
		/*----#start-code(quarto_boton)----*/
		
		
		/*----#end-code----*/
		return this.redirect("catalogo_igrp","Group_components","index", this.queryString());	
	}
	
	public Response actionPrimeiro() throws IOException, IllegalArgumentException, IllegalAccessException{
		Group_components model = new Group_components();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		 this.addQueryString("p_id","12"); //to send a query string in the URL
		 return this.forward("catalogo_igrp","Components_that_need_fields","index", model, this.queryString()); //if submit, loads the values  ----#gen-example */
		/*----#start-code(primeiro)----*/
		
		
		/*----#end-code----*/
		return this.redirect("catalogo_igrp","Components_that_need_fields","index", this.queryString());	
	}
	
	public Response actionSegundovertical() throws IOException, IllegalArgumentException, IllegalAccessException{
		Group_components model = new Group_components();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		 this.addQueryString("p_id","12"); //to send a query string in the URL
		 return this.forward("catalogo_igrp","Group_components","index", model, this.queryString()); //if submit, loads the values  ----#gen-example */
		/*----#start-code(segundovertical)----*/
		
		
		/*----#end-code----*/
		return this.redirect("catalogo_igrp","Group_components","index", this.queryString());	
	}
	
	public Response actionVerticalmenu_1_button_1() throws IOException, IllegalArgumentException, IllegalAccessException{
		Group_components model = new Group_components();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		 this.addQueryString("p_id","12"); //to send a query string in the URL
		 return this.forward("catalogo_igrp","Group_components","index", model, this.queryString()); //if submit, loads the values  ----#gen-example */
		/*----#start-code(verticalmenu_1_button_1)----*/
		
		
		/*----#end-code----*/
		return this.redirect("catalogo_igrp","Group_components","index", this.queryString());	
	}
	
	public Response actionToolbar_button_1() throws IOException, IllegalArgumentException, IllegalAccessException{
		Group_components model = new Group_components();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		 this.addQueryString("p_id","12"); //to send a query string in the URL
		 return this.forward("catalogo_igrp","Group_components","index", model, this.queryString()); //if submit, loads the values  ----#gen-example */
		/*----#start-code(toolbar_button_1)----*/
		
		
		/*----#end-code----*/
		return this.redirect("catalogo_igrp","Group_components","index", this.queryString());	
	}
	
	public Response actionTools_button_2() throws IOException, IllegalArgumentException, IllegalAccessException{
		Group_components model = new Group_components();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		 this.addQueryString("p_id","12"); //to send a query string in the URL
		 return this.forward("catalogo_igrp","Group_components","index", model, this.queryString()); //if submit, loads the values  ----#gen-example */
		/*----#start-code(tools_button_2)----*/
		
		
		/*----#end-code----*/
		return this.redirect("catalogo_igrp","Group_components","index", this.queryString());	
	}
	
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
