package nosi.webapps.catalogo_igrp.pages.components_that_need_fields;

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
		
public class Components_that_need_fieldsController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Components_that_need_fields model = new Components_that_need_fields();
		model.load();
		model.setHyperlink("catalogo_igrp","Components_that_need_fields","index");
		model.setView_1_img("../images/IGRP/IGRP2.3/assets/img/jon_doe.jpg");
		 //model.setLink_upload_img(this.getConfig().getResolveUrl("igrp","file","save-image-txt&p_page_name="+Core.getCurrentPage()));
		Components_that_need_fieldsView view = new Components_that_need_fieldsView();
		view.form_1_checkboxlist_1.loadDomain("Melani");
		view.form_1_radiolist_1.loadDomain("MArcos");
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadFormlist_1(Core.query(null,"SELECT '' as formlist_1_button_1,'1' as formlist_1_checkbox_1,'#6412f1' as formlist_1_color_1,'03-01-2015' as separatorlist_1_date_1,'no@example.com' as formlist_1_email_1,'' as formlist_1_lookup_1,'/IGRP/images/IGRP/IGRP2.3/app/catalogo_igrp/group_components/Group_components.xml' as formlist_1_link_1,'240' as formlist_2_number_1,'******' as formlist_2_password_1,'hidden-6607_43b6' as formlist_1_hidden_1 "));
		model.loadFormlist_2(Core.query(null,"SELECT 'Lorem unde aliqua omnis magna' as formlist_1_plaintext_1,'1' as formlist_2_radio_1,'3' as formlist_2_range_1,'2' as formlist_2_select_1,'Ipsum anim totam unde elit' as formlist_2_text_1,'Omnis aperiam dolor iste ut aliqua mollit voluptatem omnis consectetur perspiciatis amet stract unde deserunt' as formlist_2_textarea_1,'13:31' as formlist_2_time_1,'' as formlist_2_file_1,'' as formlist_2_virtualkeyboard_1 "));
		model.loadSeparatorlist_1(Core.query(null,"SELECT '1' as separatorlist_1_checkbox_1,'2,2' as separatorlist_1_checkboxlist_1,'#c38b70' as separatorlist_1_color_1,'rinkefe@example.com' as separatorlist_1_email_1,'79' as formlist_1_number_1,'2' as separatorlist_1_select_1,'' as separatorlist_1_file_1,'hidden-f442_b412' as separatorlist_1_hidden_1 "));
		model.loadTable_1(Core.query(null,"SELECT '1' as table_1_checkbox_1,'1' as table_1_color_1,'01-07-2014' as table_1_date_1,'hiz@example.com' as table_1_email_1,'/IGRP/images/IGRP/IGRP2.3/app/catalogo_igrp/components_that_need_fields/Components_that_need_fields.xml' as table_1_link_1,'/IGRP/images/IGRP/IGRP2.3/assets/img/jon_doe.jpg' as table_1_img_1,'4' as table_1_number_1,'******' as table_1_password_1,'Voluptatem anim magna stract a' as table_1_plaintext_1,'hidden-54e2_4254' as table_1_hidden_1,'' as table_1_filter "));
		model.loadTable_2(Core.query(null,"SELECT '1' as table_2_radio_1,'Labore deserunt unde aliqua co' as table_2_text_1,'Aliqua natus aliqua totam laud' as table_2_textarea_1,'18:35' as table_2_time_1 "));
		view.form_1_select_1.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.formlist_2_select_1.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.separatorlist_1_checkboxlist_1.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.separatorlist_1_select_1.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		  ----#gen-example */
		/*----#start-code(index)----*/
				model.loadFormlist_1(Core.query(null,"SELECT '' as formlist_1_button_1,'1' as formlist_1_checkbox_1,'#73c93b' as formlist_1_color_1,'04-07-2014' as separatorlist_1_date_1,'jaivoura@example.com' as formlist_1_email_1,'' as formlist_1_lookup_1,'/IGRP/images/IGRP/IGRP2.3/app/catalogo_igrp/group_components/Group_components.xml' as formlist_1_link_1,'142' as formlist_2_number_1,'******' as formlist_2_password_1,'hidden-30d0_7d0d' as formlist_1_hidden_1 "));
		model.loadFormlist_2(Core.query(null,"SELECT 'Ipsum labore consectetur totam magna' as formlist_1_plaintext_1,'1' as formlist_2_radio_1,'3' as formlist_2_range_1,'2' as formlist_2_select_1,'Sit magna sed natus consectetur' as formlist_2_text_1,'Sit consectetur adipiscing perspiciatis natus anim rem perspiciatis unde labore sit consectetur aperiam mollit accusantium' as formlist_2_textarea_1,'11:36' as formlist_2_time_1,'' as formlist_2_file_1,'' as formlist_2_virtualkeyboard_1 "));
		model.loadSeparatorlist_1(Core.query(null,"SELECT '1' as separatorlist_1_checkbox_1,'2,2' as separatorlist_1_checkboxlist_1,'#9074b7' as separatorlist_1_color_1,'wuhfohzi@example.com' as separatorlist_1_email_1,'96' as formlist_1_number_1,'2' as separatorlist_1_select_1,'' as separatorlist_1_file_1,'hidden-e3e6_71b6' as separatorlist_1_hidden_1 "));
		model.loadTable_1(Core.query(null,"SELECT '1' as table_1_checkbox_1,'2' as table_1_color_1,'02-01-2015' as table_1_date_1,'tawulju@example.com' as table_1_email_1,'/IGRP/images/IGRP/IGRP2.3/app/catalogo_igrp/components_that_need_fields/Components_that_need_fields.xml' as table_1_link_1,'/IGRP/images/IGRP/IGRP2.3/assets/img/jon_doe.jpg' as table_1_img_1,'25' as table_1_number_1,'******' as table_1_password_1,'Elit adipiscing ut totam unde' as table_1_plaintext_1,'hidden-3738_fe6b' as table_1_hidden_1,'' as table_1_filter "));
		model.loadTable_2(Core.query(null,"SELECT '1' as table_2_radio_1,'Mollit officia perspiciatis si' as table_2_text_1,'Iste officia sed dolor deserun' as table_2_textarea_1,'18:21' as table_2_time_1 "));
		view.form_1_select_1.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.formlist_2_select_1.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.separatorlist_1_checkboxlist_1.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.separatorlist_1_select_1.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
		
		
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
