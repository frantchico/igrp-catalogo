package nosi.webapps.catalogo_igrp.pages.components_a_solo;

import nosi.core.webapp.Controller;
import nosi.core.webapp.databse.helpers.ResultSet;
import nosi.core.webapp.databse.helpers.QueryInterface;
import java.io.IOException;
import nosi.core.webapp.Core;
import nosi.core.webapp.Response;
/* Start-Code-Block (import) */
/* End-Code-Block */
/*----#start-code(packages_import)----*/


/*----#end-code----*/
		
public class Components_a_soloController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Components_a_solo model = new Components_a_solo();
		model.load();
		model.setCirclestatbox_1_title("Circle Box Title");
		model.setCirclestatbox_1_lbl("percent");
		model.setCirclestatbox_1_val("13.3");
		model.setCirclestatbox_1_desc("Some Text Here");
		model.setCirclestatbox_1_url("http://www.example.com");
		model.setCirclestatbox_1_bg("cp-vermillion");
		model.setSmallbox_1_title("Small Box Title");
		model.setSmallbox_1_val("899");
		model.setSmallbox_1_url("http://www.example.com");
		model.setSmallbox_1_lbl("View Details");
		model.setSmallbox_1_bg("cp-magenta");
		model.setSmallbox_1_icn("fa-battery");
		model.setStatbox_1_title("Box Title");
		model.setStatbox_1_val("420");
		model.setStatbox_1_txt("Read More...");
		model.setStatbox_1_url("http://www.example.com");
		model.setStatbox_1_bg("cp-cyan");
		model.setStatbox_1_icn("fa-check");
		model.setQuickbuttonbox_1_title("Box Title");
		model.setQuickbuttonbox_1_val("986");
		model.setQuickbuttonbox_1_url(Core.getIGRPLink("catalogo_igrp","Components_a_solo","index"));
		model.setQuickbuttonbox_1_bg("cp-field");
		model.setQuickbuttonbox_1_icn("fa-balance-scale");
		model.setInfopanel_1_title("Infopanel");
		model.setInfopanel_1_val("46");
		model.setInfopanel_1_url(Core.getIGRPLink("catalogo_igrp","Components_that_need_fields","index"));
		model.setInfopanel_1_bg("cp-black");
		model.setInfopanel_1_icn("fa-info");
		model.loadCarousel_1(
				Core.query(null,"SELECT 'Img' as carousel_1_label,'/IGRP/images/IGRP/IGRP2.3/assets/img/jon_doe.jpg' as carousel_1_img"+
								" UNION SELECT 'Img' as carousel_1_label,'/IGRP/images/IGRP/IGRP2.3/assets/img/jon_doe.jpg' as carousel_1_img")
		 );
		Components_a_soloView view = new Components_a_soloView();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadCalendar_1_events(Core.query(null,"SELECT 'Birthday' as calendar_1_title,'Marcos fez anos' as calendar_1_description,'1' as calendar_1_id,'16-12-2019T10:00:00' as calendar_1_start,'16-12-2019T12:00:00' as calendar_1_end,'red' as calendar_1_color,'' as calendar_1_allday "));
		model.loadLeafletmap_1_markers(Core.query(null,"SELECT 'Cabo Verde' as leafletmap_1_title,'Centro de Cabo Verde' as leafletmap_1_info,'16' as leafletmap_1_lat,'-24' as leafletmap_1_lng,'' as leafletmap_1_icon "));
		view.chart_1.loadQuery(Core.query(null,"SELECT 'X1' as EixoX, 'Y1' as EixoY, 15 as EixoZ"
                                      +" UNION SELECT 'X2' as EixoX, 'Y2' as EixoY, 10 as EixoZ"
                                      +" UNION SELECT 'X2' as EixoX, 'Y2' as EixoY, 23 as EixoZ"
                                      +" UNION SELECT 'X3' as EixoX, 'Y3' as EixoY, 40 as EixoZ"));
		model.setCirclestatbox_1_url(Core.getIGRPLink("your app","your page","your action"));
		model.setSmallbox_1_url(Core.getIGRPLink("your app","your page","your action"));
		model.setStatbox_1_url(Core.getIGRPLink("your app","your page","your action"));
		  ----#gen-example */
		/*----#start-code(index)----*/
		 /*model.loadCalendar_1_events(Core.query(null,"SELECT 'Aniversario' as calendar_1_title,"
		      		+ "'Marcos fez anos' as calendar_1_description,'1' as calendar_1_id,"
		      		+ "'02-10-2018T09:00:00' as calendar_1_start,'02-10-2018T12:00:00' as calendar_1_end,"
		      		+ "'green' as calendar_1_color,'false' as calendar_1_allday UNION "
		            + "SELECT 'Birthday' as calendar_1_title,"      
                    + "'Ela fez anos' as calendar_1_description,'2' as calendar_1_id, "
		      		+ "'04-10-2018T10:00:00' as calendar_1_start,'04-10-2018T12:00:00' as calendar_1_end,"		           
		      		+ "'red' as calendar_1_color,'true' as calendar_1_allday"));
		   */
      model.loadCalendar_1_events(Core.query(null,"SELECT 'Birthday' as calendar_1_title,'Marcos fez anos' as calendar_1_description,'1' as calendar_1_id,'13-10-2018T10:00:00' as calendar_1_start,'13-10-2018T12:00:00' as calendar_1_end,'red' as calendar_1_color,'' as calendar_1_allday "));
      
    	 model.setCirclestatbox_1_val("23");
		model.setSmallbox_1_val("44");
		model.setStatbox_1_val("42342");
      model.loadLeafletmap_1_markers(Core.query(null,"SELECT 'The point' as leafletmap_1_title,'Ponto algures' as leafletmap_1_info,'17' as leafletmap_1_lat,'-24' as leafletmap_1_lng,'fa-database' as leafletmap_1_icon "));
    
       model.loadTimeline_1(Core.query(null,"SELECT '1 de Out de 2013' as timeline_1_date,'Ponto algures' as timeline_1_text,'Ponto algures' as timeline_1_btn,'Ponto algures' as timeline_1_btn_desc,'24 hd' as timeline_1_hd,'fa-database' as timeline_1_icon UNION SELECT '1 de Out de 2013' as timeline_1_date,'Ponto algures' as timeline_1_btn,'Ponto algures' as timeline_1_btn_desc,'17 text' as timeline_1_text,'hd li' as timeline_1_hd,'fa-check' as timeline_1_icon"));
      
       view.chart_1.loadQuery(Core.query(null,"SELECT 'X1' as EixoX, 'Y1' as EixoY, 15 as valor"
               +" UNION SELECT 'X2' as EixoX, 'Y2' as EixoY, 10 as valor"
               +" UNION SELECT 'X2' as EixoX, 'Y2' as EixoY, 23 as valor"
               +" UNION SELECT 'X3' as EixoX, 'Y3' as EixoY, 40 as valor"));
		
      /*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionEditEventsCalendar_1() throws IOException, IllegalArgumentException, IllegalAccessException{
		Components_a_solo model = new Components_a_solo();
		//programming your save edit calendar
		Response response = new Response();
		response.setContentType(Response.FORMAT_XML);
		response.setContent("your message");
		return response;
		
	}
	
		
		
/*----#start-code(custom_actions)----*/
	
	
/*----#end-code----*/
}
