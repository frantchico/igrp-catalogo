package nosi.webapps.catalogo_igrp.pages.group_components;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;
import nosi.core.config.Config;

public class Group_componentsView extends View {

	public Field template_tab_default;
	public Field segundo_return_11;
	public Field terceiro_tab_3;
	public Field template_accordion;
	public Field segundo_return_13;
	public Field terceiro_tab;
	public Field button_1;
	public Field d2_painel;
	public Field acertou_3_panel;
	public Field treelist_1_uid;
	public Field treelist_1_title;
	public Field treelist_1_link;
	public Field treelist_1_target;
	public Field treelist_1_icon;
	public Field treelist_1_parent;
	public Field treemenu_1_link;
	public Field treemenu_1_link_desc;
	public Field treemenu_1_tmid;
	public Field treemenu_1_parent;
	public Field treemenu_1_icon;
	public Field treemenu_1_child;
	public Field treemenu_1_active;
	public Field template_navbar;
	public Field segundo_return_1;
	public Field terceiro_tab_1;
	public IGRPBox box_1;
	public IGRPTabContent tabcontent_1;
	public IGRPTabContent tabcontent_3;
	public IGRPPanel panels_1;
	public IGRPForm treelist_1;
	public IGRPTreeMenu treemenu_1;
	public IGRPTabContent tabcontent_2;

	public IGRPToolsBar toolsbar_2;
	public IGRPVerticalMenu verticalmenu_1;
	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_primero1;
	public IGRPButton btn_segundo;
	public IGRPButton btn_terceiro;
	public IGRPButton btn_quarto_boton;
	public IGRPButton btn_primeiro;
	public IGRPButton btn_segundovertical;
	public IGRPButton btn_verticalmenu_1_button_1;
	public IGRPButton btn_toolbar_button_1;
	public IGRPButton btn_tools_button_2;

	public Group_componentsView(){

		this.setPageTitle("Group Components and menu");
			
		box_1 = new IGRPBox("box_1","Box");

		tabcontent_1 = new IGRPTabContent("tabcontent_1","");

		tabcontent_3 = new IGRPTabContent("tabcontent_3","");

		panels_1 = new IGRPPanel("panels_1","");

		treelist_1 = new IGRPForm("treelist_1","Treelist");

		treemenu_1 = new IGRPTreeMenu("treemenu_1","Treemenu");

		tabcontent_2 = new IGRPTabContent("tabcontent_2","");

		template_tab_default = new TextField(model,"template_tab_default");
		template_tab_default.setLabel(gt("Template Tab Default"));
		template_tab_default.propertie().add("name","p_template_tab_default").add("type","button").add("request_fields","").add("refresh_submit","false").add("maxlength","50");
		
		segundo_return_11 = new TextField(model,"segundo_return_11");
		segundo_return_11.setLabel(gt("Segundo return"));
		segundo_return_11.propertie().add("name","p_segundo_return_11").add("type","button").add("request_fields","").add("refresh_submit","false").add("maxlength","50");
		
		terceiro_tab_3 = new TextField(model,"terceiro_tab_3");
		terceiro_tab_3.setLabel(gt("Terceiro Tab"));
		terceiro_tab_3.propertie().add("name","p_terceiro_tab_3").add("type","button").add("request_fields","").add("refresh_submit","false").add("maxlength","50");
		
		template_accordion = new TextField(model,"template_accordion");
		template_accordion.setLabel(gt("Template Accordion"));
		template_accordion.propertie().add("name","p_template_accordion").add("type","button").add("request_fields","").add("refresh_submit","false").add("maxlength","50");
		
		segundo_return_13 = new TextField(model,"segundo_return_13");
		segundo_return_13.setLabel(gt("Segundo return"));
		segundo_return_13.propertie().add("name","p_segundo_return_13").add("type","button").add("request_fields","").add("refresh_submit","false").add("maxlength","50");
		
		terceiro_tab = new TextField(model,"terceiro_tab");
		terceiro_tab.setLabel(gt("Terceiro Tab"));
		terceiro_tab.propertie().add("name","p_terceiro_tab").add("type","button").add("request_fields","").add("refresh_submit","false").add("maxlength","50");
		
		button_1 = new TextField(model,"button_1");
		button_1.setLabel(gt("Panel Item 1"));
		button_1.propertie().add("name","p_panels_1_button_1").add("type","button").add("request_fields","").add("refresh_submit","false").add("maxlength","50");
		
		d2_painel = new TextField(model,"d2_painel");
		d2_painel.setLabel(gt("2 Painel"));
		d2_painel.propertie().add("name","p_d2_painel").add("type","button").add("request_fields","").add("refresh_submit","false").add("maxlength","50");
		
		acertou_3_panel = new TextField(model,"acertou_3_panel");
		acertou_3_panel.setLabel(gt("Acertou 3 panel"));
		acertou_3_panel.propertie().add("name","p_acertou_3_panel").add("type","button").add("request_fields","").add("refresh_submit","false").add("maxlength","50");
		
		treelist_1_uid = new TextField(model,"treelist_1_uid");
		treelist_1_uid.setLabel(gt(""));
		treelist_1_uid.propertie();
		
		treelist_1_title = new TextField(model,"treelist_1_title");
		treelist_1_title.setLabel(gt(""));
		treelist_1_title.propertie();
		
		treelist_1_link = new TextField(model,"treelist_1_link");
		treelist_1_link.setLabel(gt(""));
		treelist_1_link.propertie();
		
		treelist_1_target = new TextField(model,"treelist_1_target");
		treelist_1_target.setLabel(gt(""));
		treelist_1_target.propertie();
		
		treelist_1_icon = new TextField(model,"treelist_1_icon");
		treelist_1_icon.setLabel(gt(""));
		treelist_1_icon.propertie();
		
		treelist_1_parent = new TextField(model,"treelist_1_parent");
		treelist_1_parent.setLabel(gt(""));
		treelist_1_parent.propertie();
		
		treemenu_1_link = new LinkField(model,"treemenu_1_link");
		treemenu_1_link.setLabel(gt("Link"));
		treemenu_1_link_desc = new LinkField(model,"treemenu_1_link_desc");
		treemenu_1_link_desc.setLabel(gt("Link"));
		treemenu_1_link.propertie().add("type","link").add("maxlength","4000").add("target","_self").add("desc","true");
		
		treemenu_1_tmid = new TextField(model,"treemenu_1_tmid");
		treemenu_1_tmid.setLabel(gt("ID"));
		treemenu_1_tmid.propertie().add("type","text");
		
		treemenu_1_parent = new NumberField(model,"treemenu_1_parent");
		treemenu_1_parent.setLabel(gt("Parent ID"));
		treemenu_1_parent.propertie().add("type","number").add("java-type","Integer");
		
		treemenu_1_icon = new TextField(model,"treemenu_1_icon");
		treemenu_1_icon.setLabel(gt("Icon"));
		treemenu_1_icon.propertie().add("type","text");
		
		treemenu_1_child = new TextField(model,"treemenu_1_child");
		treemenu_1_child.setLabel(gt("Has child value(0/X)"));
		treemenu_1_child.propertie().add("type","text");
		
		treemenu_1_active = new TextField(model,"treemenu_1_active");
		treemenu_1_active.setLabel(gt("Is Active value(true/false)"));
		treemenu_1_active.propertie().add("type","text");
		
		template_navbar = new TextField(model,"template_navbar");
		template_navbar.setLabel(gt("Template NavBar"));
		template_navbar.propertie().add("name","p_template_navbar").add("type","button").add("request_fields","").add("refresh_submit","false").add("maxlength","50");
		
		segundo_return_1 = new TextField(model,"segundo_return_1");
		segundo_return_1.setLabel(gt("Segundo return"));
		segundo_return_1.propertie().add("name","p_segundo_return_1").add("type","button").add("request_fields","").add("refresh_submit","false").add("maxlength","50");
		
		terceiro_tab_1 = new TextField(model,"terceiro_tab_1");
		terceiro_tab_1.setLabel(gt("Terceiro Tab"));
		terceiro_tab_1.propertie().add("name","p_terceiro_tab_1").add("type","button").add("request_fields","").add("refresh_submit","false").add("maxlength","50");
		

		toolsbar_2 = new IGRPToolsBar("toolsbar_2");
		verticalmenu_1 = new IGRPVerticalMenu("verticalmenu_1");
		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_primero1 = new IGRPButton("Primero","catalogo_igrp","Group_components","primero1","_blank","primary|fa-graduation-cap","","");
		btn_primero1.propertie.add("type","specific").add("rel","primero1");

		btn_segundo = new IGRPButton("Segundo","catalogo_igrp","Group_components","segundo","_blank","warning|fa-font-awesome","","");
		btn_segundo.propertie.add("type","specific").add("rel","segundo");

		btn_terceiro = new IGRPButton("Terceiro","catalogo_igrp","Group_components","terceiro","_blank","danger|fa-heartbeat","","");
		btn_terceiro.propertie.add("type","specific").add("rel","terceiro");

		btn_quarto_boton = new IGRPButton("Quarto boton","catalogo_igrp","Group_components","quarto_boton","_blank","success|fa-bomb","","");
		btn_quarto_boton.propertie.add("type","specific").add("rel","quarto_boton");

		btn_primeiro = new IGRPButton("Primeiro","catalogo_igrp","Group_components","primeiro","_blank","danger|fa-file-movie-o","","");
		btn_primeiro.propertie.add("type","specific").add("rel","primeiro");

		btn_segundovertical = new IGRPButton("SegundoVertical","catalogo_igrp","Group_components","segundovertical","_blank","success|fa-braille","","");
		btn_segundovertical.propertie.add("type","specific").add("rel","segundovertical");

		btn_verticalmenu_1_button_1 = new IGRPButton("Button","catalogo_igrp","Group_components","verticalmenu_1_button_1","_blank","primary|fa-angle-right","","");
		btn_verticalmenu_1_button_1.propertie.add("type","specific").add("rel","verticalmenu_1_button_1");

		btn_toolbar_button_1 = new IGRPButton("Toolbar button 1","catalogo_igrp","Group_components","toolbar_button_1","_blank","primary|fa-youtube-play","","");
		btn_toolbar_button_1.propertie.add("type","specific").add("rel","toolbar_button_1");

		btn_tools_button_2 = new IGRPButton("Tools button 2","catalogo_igrp","Group_components","tools_button_2","_blank","primary|fa-paypal","","");
		btn_tools_button_2.propertie.add("type","specific").add("rel","tools_button_2");

		
	}
		
	@Override
	public void render(){
		

		tabcontent_1.addField(template_tab_default);
		tabcontent_1.addField(segundo_return_11);
		tabcontent_1.addField(terceiro_tab_3);

		tabcontent_3.addField(template_accordion);
		tabcontent_3.addField(segundo_return_13);
		tabcontent_3.addField(terceiro_tab);

		panels_1.addField(button_1);
		panels_1.addField(d2_painel);
		panels_1.addField(acertou_3_panel);


		treelist_1.addField(treelist_1_uid);
		treelist_1.addField(treelist_1_title);
		treelist_1.addField(treelist_1_link);
		treelist_1.addField(treelist_1_target);
		treelist_1.addField(treelist_1_icon);
		treelist_1.addField(treelist_1_parent);

		treemenu_1.addField(treemenu_1_link);
		treemenu_1.addField(treemenu_1_link_desc);
		treemenu_1.addField(treemenu_1_tmid);
		treemenu_1.addField(treemenu_1_parent);
		treemenu_1.addField(treemenu_1_icon);
		treemenu_1.addField(treemenu_1_child);
		treemenu_1.addField(treemenu_1_active);


		tabcontent_2.addField(template_navbar);
		tabcontent_2.addField(segundo_return_1);
		tabcontent_2.addField(terceiro_tab_1);


		toolsbar_2.addButton(btn_primero1);
		toolsbar_2.addButton(btn_segundo);
		toolsbar_2.addButton(btn_terceiro);
		toolsbar_2.addButton(btn_quarto_boton);
		verticalmenu_1.addButton(btn_primeiro);
		verticalmenu_1.addButton(btn_segundovertical);
		verticalmenu_1.addButton(btn_verticalmenu_1_button_1);
		toolsbar_1.addButton(btn_toolbar_button_1);
		toolsbar_1.addButton(btn_tools_button_2);
		this.addToPage(box_1);
		this.addToPage(tabcontent_1);
		this.addToPage(tabcontent_3);
		this.addToPage(panels_1);
		this.addToPage(treelist_1);
		this.addToPage(treemenu_1);
		this.addToPage(tabcontent_2);
		this.addToPage(toolsbar_2);
		this.addToPage(verticalmenu_1);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		template_tab_default.setValue(model);
		segundo_return_11.setValue(model);
		terceiro_tab_3.setValue(model);
		template_accordion.setValue(model);
		segundo_return_13.setValue(model);
		terceiro_tab.setValue(model);
		button_1.setValue(model);
		d2_painel.setValue(model);
		acertou_3_panel.setValue(model);
		treelist_1_uid.setValue(model);
		treelist_1_title.setValue(model);
		treelist_1_link.setValue(model);
		treelist_1_target.setValue(model);
		treelist_1_icon.setValue(model);
		treelist_1_parent.setValue(model);
		treemenu_1_link.setValue(model);
		treemenu_1_link_desc.setValue(model);
		treemenu_1_tmid.setValue(model);
		treemenu_1_parent.setValue(model);
		treemenu_1_icon.setValue(model);
		treemenu_1_child.setValue(model);
		treemenu_1_active.setValue(model);
		template_navbar.setValue(model);
		segundo_return_1.setValue(model);
		terceiro_tab_1.setValue(model);	

		treemenu_1.loadModel(((Group_components) model).getTreemenu_1());
		}
}
