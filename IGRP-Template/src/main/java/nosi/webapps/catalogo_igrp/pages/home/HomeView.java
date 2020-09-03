package nosi.webapps.catalogo_igrp.pages.home;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;
import nosi.core.config.Config;

public class HomeView extends View {

	public Field paragraph_1_text;
	public Field infopanel_1_title;
	public Field infopanel_1_val;
	public Field infopanel_1_url;
	public Field infopanel_1_bg;
	public Field infopanel_1_icn;
	public Field infopanel_2_title;
	public Field infopanel_2_val;
	public Field infopanel_2_url;
	public Field infopanel_2_bg;
	public Field infopanel_2_icn;
	public Field img;
	public Field paragraph_3_text;
	public Field paragraph_2_text;
	public Field infopanel_3_title;
	public Field infopanel_3_val;
	public Field infopanel_3_url;
	public Field infopanel_3_bg;
	public Field infopanel_3_icn;
	public Field img_1;
	public Field paragraph_4_text;
	public IGRPParagraph paragraph_1;
	public IGRPBox box_1;
	public IGRPBox box_3;
	public IGRPForm infopanel_1;
	public IGRPBox box_2;
	public IGRPForm infopanel_2;
	public IGRPForm form_1;
	public IGRPParagraph paragraph_3;
	public IGRPParagraph paragraph_2;
	public IGRPForm infopanel_3;
	public IGRPForm form_2;
	public IGRPParagraph paragraph_4;


	public HomeView(){

		this.setPageTitle("Home");
			
		paragraph_1 = new IGRPParagraph("paragraph_1","Página Inicial");

		box_1 = new IGRPBox("box_1","");

		box_3 = new IGRPBox("box_3","");

		infopanel_1 = new IGRPForm("infopanel_1","");

		box_2 = new IGRPBox("box_2","");

		infopanel_2 = new IGRPForm("infopanel_2","");

		form_1 = new IGRPForm("form_1","");

		paragraph_3 = new IGRPParagraph("paragraph_3","");

		paragraph_2 = new IGRPParagraph("paragraph_2","");

		infopanel_3 = new IGRPForm("infopanel_3","");

		form_2 = new IGRPForm("form_2","");

		paragraph_4 = new IGRPParagraph("paragraph_4","");

		paragraph_1_text = new TextField(model,"paragraph_1_text");
		paragraph_1_text.setLabel(gt(""));
		paragraph_1_text.setValue(gt("<p><span style='font-family:Comic Sans MS,cursive;'>PT: Esta aplica&ccedil;&atilde;o Catalogo est&aacute; divida em 3 p&aacute;ginas que podem ser acedidas pelo menu lateral. Alguns t&ecirc;m c&oacute;digos de como usar os components/+fields.<br /> &nbsp; &nbsp;&nbsp;<br /> EN: This app &nbsp;Catalogo is divided in to 3 pages that can be seen in the sidebar. Some has code of how to use &nbsp;components/+fields.</span><br /> &nbsp;</p>"));
		paragraph_1_text.propertie().add("type","text").add("name","p_paragraph_1_text").add("maxlength","4000");
		
		infopanel_1_title = new TextField(model,"infopanel_1_title");
		infopanel_1_title.setLabel(gt("Title"));
		infopanel_1_title.setValue(gt("Group and menu components"));
		infopanel_1_title.propertie().add("name","p_infopanel_1_title").add("type","text").add("maxlength","4000");
		
		infopanel_1_val = new TextField(model,"infopanel_1_val");
		infopanel_1_val.setLabel(gt("Value"));
		infopanel_1_val.setValue(gt(""));
		infopanel_1_val.propertie().add("name","p_infopanel_1_val").add("type","text").add("maxlength","4000");
		
		infopanel_1_url = new LinkField(model,"infopanel_1_url");
		infopanel_1_url.setLabel(gt(""));
		infopanel_1_url.setValue(new Config().getResolveUrl("catalogo_igrp","Group_components","index"));
		infopanel_1_url.propertie().add("name","p_infopanel_1_url").add("type","link").add("maxlength","4000");
		
		infopanel_1_bg = new TextField(model,"infopanel_1_bg");
		infopanel_1_bg.setLabel(gt("Background"));
		infopanel_1_bg.setValue(gt("cp-cyan"));
		infopanel_1_bg.propertie().add("name","p_infopanel_1_bg").add("type","text").add("maxlength","4000");
		
		infopanel_1_icn = new TextField(model,"infopanel_1_icn");
		infopanel_1_icn.setLabel(gt("Icon"));
		infopanel_1_icn.setValue(gt("fa-info"));
		infopanel_1_icn.propertie().add("name","p_infopanel_1_icn").add("type","text").add("maxlength","4000");
		
		infopanel_2_title = new TextField(model,"infopanel_2_title");
		infopanel_2_title.setLabel(gt("Title"));
		infopanel_2_title.setValue(gt("Components a solo"));
		infopanel_2_title.propertie().add("name","p_infopanel_2_title").add("type","text").add("maxlength","4000");
		
		infopanel_2_val = new TextField(model,"infopanel_2_val");
		infopanel_2_val.setLabel(gt("Value"));
		infopanel_2_val.setValue(gt(""));
		infopanel_2_val.propertie().add("name","p_infopanel_2_val").add("type","text").add("maxlength","4000");
		
		infopanel_2_url = new LinkField(model,"infopanel_2_url");
		infopanel_2_url.setLabel(gt(""));
		infopanel_2_url.setValue(new Config().getResolveUrl("catalogo_igrp","Components_a_solo","index"));
		infopanel_2_url.propertie().add("name","p_infopanel_2_url").add("type","link").add("maxlength","4000");
		
		infopanel_2_bg = new TextField(model,"infopanel_2_bg");
		infopanel_2_bg.setLabel(gt("Background"));
		infopanel_2_bg.setValue(gt("cp-vermillion"));
		infopanel_2_bg.propertie().add("name","p_infopanel_2_bg").add("type","text").add("maxlength","4000");
		
		infopanel_2_icn = new TextField(model,"infopanel_2_icn");
		infopanel_2_icn.setLabel(gt("Icon"));
		infopanel_2_icn.setValue(gt("fa-info"));
		infopanel_2_icn.propertie().add("name","p_infopanel_2_icn").add("type","text").add("maxlength","4000");
		
		img = new TextField(model,"img");
		img.setLabel(gt("Img"));
		img.setValue(gt("/IGRP/images/IGRP/IGRP2.3/assets/img/tutorial/drop_component.png"));
		img.propertie().add("name","p_img").add("type","img").add("width","").add("height","").add("croppie","false").add("rounded","false").add("maxlength","250").add("placeholder",gt("")).add("autoupload","false").add("desclabel","false");
		
		paragraph_3_text = new TextField(model,"paragraph_3_text");
		paragraph_3_text.setLabel(gt(""));
		paragraph_3_text.setValue(gt("<ul> <li><strong>Group&nbsp;| Menu components</strong></li> <li>Box | Toolbar</li> <li>Tabcontent | Treelist</li> <li>Panel | Vertical Menu</li> <li>...</li> </ul>"));
		paragraph_3_text.propertie().add("type","text").add("name","p_paragraph_3_text").add("maxlength","4000");
		
		paragraph_2_text = new TextField(model,"paragraph_2_text");
		paragraph_2_text.setLabel(gt(""));
		paragraph_2_text.setValue(gt("<ul> <li>Chart</li> <li>Timeline</li> <li>Finger Print</li> <li>Info Panel</li> <li>Stat Box</li> <li>Small Box</li> <li>Quick&nbsp;Button Box</li> <li>Leaflet Map</li> <li>Map Chart</li> <li>Calendar</li> <li>Section Header</li> <li>Paragraph</li> <li>Video</li> <li>View</li> </ul>"));
		paragraph_2_text.propertie().add("type","text").add("name","p_paragraph_2_text").add("maxlength","4000");
		
		infopanel_3_title = new TextField(model,"infopanel_3_title");
		infopanel_3_title.setLabel(gt("Title"));
		infopanel_3_title.setValue(gt("Fields in components"));
		infopanel_3_title.propertie().add("name","p_infopanel_3_title").add("type","text").add("maxlength","4000");
		
		infopanel_3_val = new TextField(model,"infopanel_3_val");
		infopanel_3_val.setLabel(gt("Value"));
		infopanel_3_val.setValue(gt(""));
		infopanel_3_val.propertie().add("name","p_infopanel_3_val").add("type","text").add("maxlength","4000");
		
		infopanel_3_url = new LinkField(model,"infopanel_3_url");
		infopanel_3_url.setLabel(gt(""));
		infopanel_3_url.setValue(new Config().getResolveUrl("catalogo_igrp","Components_that_need_fields","index"));
		infopanel_3_url.propertie().add("name","p_infopanel_3_url").add("type","link").add("maxlength","4000");
		
		infopanel_3_bg = new TextField(model,"infopanel_3_bg");
		infopanel_3_bg.setLabel(gt("Background"));
		infopanel_3_bg.setValue(gt("cp-magenta"));
		infopanel_3_bg.propertie().add("name","p_infopanel_3_bg").add("type","text").add("maxlength","4000");
		
		infopanel_3_icn = new TextField(model,"infopanel_3_icn");
		infopanel_3_icn.setLabel(gt("Icon"));
		infopanel_3_icn.setValue(gt("fa-info"));
		infopanel_3_icn.propertie().add("name","p_infopanel_3_icn").add("type","text").add("maxlength","4000");
		
		img_1 = new TextField(model,"img_1");
		img_1.setLabel(gt("Img"));
		img_1.setValue(gt("/IGRP/images/IGRP/IGRP2.3/assets/img/tutorial/drop_field.png"));
		img_1.propertie().add("name","p_img_1").add("type","img").add("width","").add("height","").add("croppie","false").add("rounded","false").add("maxlength","250").add("placeholder",gt("")).add("autoupload","false").add("desclabel","false");
		
		paragraph_4_text = new TextField(model,"paragraph_4_text");
		paragraph_4_text.setLabel(gt(""));
		paragraph_4_text.setValue(gt("<ul> <li>Form</li> <li>Form List</li> <li>Separator List</li> <li>Table</li> </ul>"));
		paragraph_4_text.propertie().add("type","text").add("name","p_paragraph_4_text").add("maxlength","4000");
		


		
	}
		
	@Override
	public void render(){
		
		paragraph_1.addField(paragraph_1_text);



		infopanel_1.addField(infopanel_1_title);
		infopanel_1.addField(infopanel_1_val);
		infopanel_1.addField(infopanel_1_url);
		infopanel_1.addField(infopanel_1_bg);
		infopanel_1.addField(infopanel_1_icn);


		infopanel_2.addField(infopanel_2_title);
		infopanel_2.addField(infopanel_2_val);
		infopanel_2.addField(infopanel_2_url);
		infopanel_2.addField(infopanel_2_bg);
		infopanel_2.addField(infopanel_2_icn);

		form_1.addField(img);

		paragraph_3.addField(paragraph_3_text);

		paragraph_2.addField(paragraph_2_text);

		infopanel_3.addField(infopanel_3_title);
		infopanel_3.addField(infopanel_3_val);
		infopanel_3.addField(infopanel_3_url);
		infopanel_3.addField(infopanel_3_bg);
		infopanel_3.addField(infopanel_3_icn);

		form_2.addField(img_1);

		paragraph_4.addField(paragraph_4_text);

		this.addToPage(paragraph_1);
		this.addToPage(box_1);
		this.addToPage(box_3);
		this.addToPage(infopanel_1);
		this.addToPage(box_2);
		this.addToPage(infopanel_2);
		this.addToPage(form_1);
		this.addToPage(paragraph_3);
		this.addToPage(paragraph_2);
		this.addToPage(infopanel_3);
		this.addToPage(form_2);
		this.addToPage(paragraph_4);
	}
		
	@Override
	public void setModel(Model model) {
			

		}
}
