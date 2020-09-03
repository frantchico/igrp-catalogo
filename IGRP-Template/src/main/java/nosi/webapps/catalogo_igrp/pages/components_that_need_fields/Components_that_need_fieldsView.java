package nosi.webapps.catalogo_igrp.pages.components_that_need_fields;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;
import nosi.core.webapp.Core;
import java.util.Map;
import java.util.LinkedHashMap;

public class Components_that_need_fieldsView extends View {

	public Field form_1_checkbox_1;
	public Field form_1_checkbox_1_check;
	public Field form_1_checkboxlist_1;
	public Field form_1_color_1;
	public Field form_1_date_1;
	public Field form_1_email_1;
	public Field hyperlink;
	public Field form_1_img_1;
	public Field form_1_lookup_1;
	public Field form_1_number_1;
	public Field form_1_password_1;
	public Field form_1_plaintext_1;
	public Field form_1_radio_1;
	public Field form_1_radio_1_check;
	public Field form_1_radiolist_1;
	public Field form_1_range_1;
	public Field form_1_select_1;
	public Field form_1_separator_1;
	public Field form_1_text_1;
	public Field form_1_textarea_1;
	public Field form_1_texteditor_1;
	public Field form_1_time_1;
	public Field form_1_file_1;
	public Field form_1_virtualkeyboard_1;
	public Field hidden_tag_1;
	public Field formlist_1_button_1;
	public Field formlist_1_checkbox_1;
	public Field formlist_1_checkbox_1_check;
	public Field formlist_1_color_1;
	public Field separatorlist_1_date_1;
	public Field formlist_1_email_1;
	public Field formlist_1_lookup_1;
	public Field formlist_1_link_1;
	public Field formlist_1_link_1_desc;
	public Field formlist_2_number_1;
	public Field formlist_2_password_1;
	public Field formlist_1_hidden_1_desc;
	public Field formlist_1_hidden_1;
	public Field formlist_1_plaintext_1;
	public Field formlist_2_radio_1;
	public Field formlist_2_radio_1_check;
	public Field formlist_2_range_1;
	public Field formlist_2_select_1;
	public Field formlist_2_text_1;
	public Field formlist_2_textarea_1;
	public Field formlist_2_time_1;
	public Field formlist_2_file_1;
	public Field formlist_2_virtualkeyboard_1;
	public Field separatorlist_1_checkbox_1;
	public Field separatorlist_1_checkbox_1_check;
	public Field separatorlist_1_checkboxlist_1;
	public Field separatorlist_1_color_1;
	public Field separatorlist_1_email_1;
	public Field formlist_1_number_1;
	public Field separatorlist_1_select_1;
	public Field separatorlist_1_file_1;
	public Field separatorlist_1_hidden_1;
	public Field table_1_checkbox_1;
	public Field table_1_checkbox_1_check;
	public Field table_1_color_1;
	public Field table_1_date_1;
	public Field table_1_email_1;
	public Field table_1_link_1;
	public Field table_1_link_1_desc;
	public Field table_1_img_1;
	public Field table_1_number_1;
	public Field table_1_password_1;
	public Field table_1_plaintext_1;
	public Field table_1_hidden_1;
	public Field table_1_filter;
	public Field table_2_radio_1;
	public Field table_2_radio_1_check;
	public Field table_2_text_1;
	public Field table_2_textarea_1;
	public Field table_2_time_1;
	public Field view_1_number_1;
	public Field view_1_text_1;
	public Field view_1_email_1;
	public Field view_1_date_1;
	public Field view_1_img;
	public Field view_1_number_1_1;
	public Field view_1_text_1_1;
	public Field view_1_email_1_1;
	public Field view_1_date_1_1;
	public IGRPForm form_1;
	public IGRPFormList formlist_1;
	public IGRPFormList formlist_2;
	public IGRPSeparatorList separatorlist_1;
	public IGRPTable table_1;
	public IGRPTable table_2;
	public IGRPView view_1;
	public IGRPView view_2;


	public Components_that_need_fieldsView(){

		this.setPageTitle("Fields in components");
			
		form_1 = new IGRPForm("form_1","Form");

		formlist_1 = new IGRPFormList("formlist_1","Formlist");

		formlist_2 = new IGRPFormList("formlist_2","Formlist Part 2");

		separatorlist_1 = new IGRPSeparatorList("separatorlist_1","Separatorlist");

		table_1 = new IGRPTable("table_1","Table");

		table_2 = new IGRPTable("table_2","Table Part2");

		view_1 = new IGRPView("view_1","View");

		view_2 = new IGRPView("view_2","View");

		form_1_checkbox_1 = new CheckBoxField(model,"form_1_checkbox_1");
		form_1_checkbox_1.setLabel(gt("Checkbox"));
		form_1_checkbox_1.propertie().add("name","p_form_1_checkbox_1").add("type","checkbox").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("switch","true").add("java-type","int").add("check","true");
		
		form_1_checkboxlist_1 = new CheckBoxListField(model,"form_1_checkboxlist_1");
		form_1_checkboxlist_1.setLabel(gt("Checkboxlist"));
		form_1_checkboxlist_1.propertie().add("name","p_form_1_checkboxlist_1").add("type","checkboxlist").add("domain","Melani").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("child_size","6").add("java-type","");
		
		form_1_color_1 = new ColorField(model,"form_1_color_1");
		form_1_color_1.setLabel(gt("Color"));
		form_1_color_1.propertie().add("name","p_form_1_color_1").add("type","color").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("Pick color")).add("desclabel","false");
		
		form_1_date_1 = new DateField(model,"form_1_date_1");
		form_1_date_1.setLabel(gt("Date"));
		form_1_date_1.propertie().add("name","p_form_1_date_1").add("type","date").add("range","false").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("class","success").add("desclabel","false");
		
		form_1_email_1 = new EmailField(model,"form_1_email_1");
		form_1_email_1.setLabel(gt("Email"));
		form_1_email_1.propertie().add("name","p_form_1_email_1").add("type","email").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("c")).add("desclabel","false");
		
		hyperlink = new LinkField(model,"hyperlink");
		hyperlink.setLabel(gt("HyperLink"));
		hyperlink.setValue(Core.getIGRPLink("catalogo_igrp","Components_that_need_fields","index"));

									hyperlink.propertie().add("name","p_hyperlink").add("type","link").add("target","_self").add("request_fields","").add("class","black").add("img","fa-link").add("maxlength","250").add("placeholder",gt("")).add("refresh_submit","false").add("desclabel","false").add("refresh_components","");
		
		form_1_img_1 = new TextField(model,"form_1_img_1");
		form_1_img_1.setLabel(gt("Img"));
		form_1_img_1.setValue(gt("/IGRP/images/IGRP/IGRP2.3/assets/img/jon_doe.jpg"));
		form_1_img_1.propertie().add("name","p_form_1_img_1").add("type","img").add("img","/IGRP/images/IGRP/IGRP2.3/assets/img/jon_doe.jpg").add("width","").add("height","").add("croppie","false").add("rounded","false").add("maxlength","250").add("placeholder",gt("")).add("autoupload","false").add("desclabel","false");
		
		form_1_lookup_1 = new LookupField(model,"form_1_lookup_1");
		form_1_lookup_1.setLabel(gt("Lookup"));
		form_1_lookup_1.setLookup("catalogo_igrp","Components_that_need_fields","index");
		form_1_lookup_1.addParam("target","_blank");
		form_1_lookup_1.propertie().add("name","p_form_1_lookup_1").add("type","lookup").add("lookup_type","LOOKUP").add("class","purple").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("lookup_eraser","false").add("desclabel","false");
		
		form_1_number_1 = new NumberField(model,"form_1_number_1");
		form_1_number_1.setLabel(gt("Number"));
		form_1_number_1.propertie().add("name","p_form_1_number_1").add("type","number").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("java-type","").add("min","").add("max","").add("desclabel","false");
		
		form_1_password_1 = new PasswordField(model,"form_1_password_1");
		form_1_password_1.setLabel(gt("Password"));
		form_1_password_1.propertie().add("name","p_form_1_password_1").add("type","password").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		form_1_plaintext_1 = new PlainTextField(model,"form_1_plaintext_1");
		form_1_plaintext_1.setLabel(gt("Plaintext"));
		form_1_plaintext_1.propertie().add("name","p_form_1_plaintext_1").add("type","plaintext").add("clear","false").add("maxlength","250").add("disable_output_escaping","false").add("html_class","");
		
		form_1_radio_1 = new RadioField(model,"form_1_radio_1");
		form_1_radio_1.setLabel(gt("Radio"));
		form_1_radio_1.propertie().add("name","p_form_1_radio_1").add("type","radio").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("java-type","").add("check","true");
		
		form_1_radiolist_1 = new RadioListField(model,"form_1_radiolist_1");
		form_1_radiolist_1.setLabel(gt("Radiolist"));
		form_1_radiolist_1.propertie().add("name","p_form_1_radiolist_1").add("type","radiolist").add("domain","MArcos").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("child_size","6").add("java-type","");
		
		form_1_range_1 = new TextField(model,"form_1_range_1");
		form_1_range_1.setLabel(gt("Range"));
		form_1_range_1.propertie().add("name","p_form_1_range_1").add("type","range").add("rangeMin","0").add("rangeMax","10").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		form_1_select_1 = new ListField(model,"form_1_select_1");
		form_1_select_1.setLabel(gt("Select"));
		form_1_select_1.propertie().add("name","p_form_1_select_1").add("type","select").add("multiple","false").add("tags","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","");
		
		form_1_separator_1 = new SeparatorField(model,"form_1_separator_1");
		form_1_separator_1.setLabel(gt("Separator"));
		form_1_separator_1.propertie().add("name","p_form_1_separator_1").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		
		form_1_text_1 = new TextField(model,"form_1_text_1");
		form_1_text_1.setLabel(gt("Text"));
		form_1_text_1.propertie().add("name","p_form_1_text_1").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("diquei")).add("desclabel","false");
		
		form_1_textarea_1 = new TextAreaField(model,"form_1_textarea_1");
		form_1_textarea_1.setLabel(gt("Textarea"));
		form_1_textarea_1.propertie().add("name","p_form_1_textarea_1").add("type","textarea").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("dica area")).add("desclabel","false");
		
		form_1_texteditor_1 = new TextEditorField(model,"form_1_texteditor_1");
		form_1_texteditor_1.setLabel(gt("Texteditor"));
		form_1_texteditor_1.propertie().add("name","p_form_1_texteditor_1").add("type","texteditor").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		form_1_time_1 = new TextField(model,"form_1_time_1");
		form_1_time_1.setLabel(gt("Time"));
		form_1_time_1.propertie().add("name","p_form_1_time_1").add("type","time").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		form_1_file_1 = new FileField(model,"form_1_file_1");
		form_1_file_1.setLabel(gt("File"));
		form_1_file_1.propertie().add("name","p_form_1_file_1").add("type","file").add("accept","").add("targetrend","").add("multiple","true").add("rendvalue","true").add("maxlength","250").add("required","false").add("disabled","false").add("class","danger");
		
		form_1_virtualkeyboard_1 = new VirtaulKeyboardField(model,"form_1_virtualkeyboard_1");
		form_1_virtualkeyboard_1.setLabel(gt("Virtualkeyboard"));
		form_1_virtualkeyboard_1.propertie().add("name","p_form_1_virtualkeyboard_1").add("type","virtualkeyboard").add("keyType","vkb_aznum").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("Baza dedu")).add("desclabel","false");
		
		hidden_tag_1 = new HiddenField(model,"hidden_tag_1");
		hidden_tag_1.setLabel(gt(""));
		hidden_tag_1.propertie().add("name","p_hidden_tag_1").add("type","hidden").add("maxlength","250").add("java-type","").add("tag","hidden_tag_1");
		
		formlist_1_button_1 = new TextField(model,"formlist_1_button_1");
		formlist_1_button_1.setLabel(gt("Button"));
		formlist_1_button_1.propertie().add("name","p_formlist_1_button_1").add("type","button").add("target","_blank").add("request_fields","").add("service","[object Object]").add("transaction","false").add("class","primary").add("img","fa-rocket").add("maxlength","250").add("list_source","").add("refresh_submit","false").add("refresh_components","").add("desc","true");
		
		formlist_1_checkbox_1 = new CheckBoxField(model,"formlist_1_checkbox_1");
		formlist_1_checkbox_1.setLabel(gt("Checkbox"));
		formlist_1_checkbox_1.propertie().add("name","p_formlist_1_checkbox_1").add("type","checkbox").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("java-type","int").add("check","true").add("desc","true");
		
		formlist_1_checkbox_1_check = new CheckBoxField(model,"formlist_1_checkbox_1_check");
		formlist_1_checkbox_1_check.propertie().add("name","p_formlist_1_checkbox_1").add("type","checkbox").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("java-type","int").add("check","true").add("desc","true");
		
		formlist_1_color_1 = new ColorField(model,"formlist_1_color_1");
		formlist_1_color_1.setLabel(gt("Color"));
		formlist_1_color_1.propertie().add("name","p_formlist_1_color_1").add("type","color").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("desc","true");
		
		separatorlist_1_date_1 = new DateField(model,"separatorlist_1_date_1");
		separatorlist_1_date_1.setLabel(gt("Date"));
		separatorlist_1_date_1.propertie().add("name","p_separatorlist_1_date_1").add("type","date").add("range","false").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("class","primary").add("desclabel","false").add("desc","true");
		
		formlist_1_email_1 = new EmailField(model,"formlist_1_email_1");
		formlist_1_email_1.setLabel(gt("Email"));
		formlist_1_email_1.propertie().add("name","p_formlist_1_email_1").add("type","email").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("desc","true");
		
		formlist_1_lookup_1 = new LookupField(model,"formlist_1_lookup_1");
		formlist_1_lookup_1.setLabel(gt("Lookup"));
		formlist_1_lookup_1.setLookup("catalogo_igrp","Components_that_need_fields","index");
		formlist_1_lookup_1.addParam("target","_blank");
		formlist_1_lookup_1.propertie().add("name","p_formlist_1_lookup_1").add("type","lookup").add("lookup_type","LOOKUP").add("class","primary").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("lookup_eraser","false").add("desclabel","false").add("desc","true");
		
		formlist_1_link_1 = new LinkField(model,"formlist_1_link_1");
		formlist_1_link_1.setLabel(gt("Link"));
		formlist_1_link_1.setValue(Core.getIGRPLink("catalogo_igrp","Group_components","index"));

									formlist_1_link_1_desc = new LinkField(model,"formlist_1_link_1_desc");
		formlist_1_link_1_desc.setLabel(gt("Link"));
		formlist_1_link_1.propertie().add("name","p_formlist_1_link_1").add("type","link").add("target","_self").add("request_fields","").add("class","link").add("img","fa-link").add("maxlength","250").add("placeholder",gt("")).add("list_source","").add("refresh_submit","false").add("desclabel","false").add("refresh_components","").add("desc","true");
		
		formlist_2_number_1 = new NumberField(model,"formlist_2_number_1");
		formlist_2_number_1.setLabel(gt("Number"));
		formlist_2_number_1.propertie().add("name","p_formlist_2_number_1").add("type","number").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("java-type","").add("min","").add("max","").add("desclabel","false").add("total_col","false").add("total_row","false").add("totalrow","false").add("desc","true");
		
		formlist_2_password_1 = new PasswordField(model,"formlist_2_password_1");
		formlist_2_password_1.setLabel(gt("Password"));
		formlist_2_password_1.propertie().add("name","p_formlist_2_password_1").add("type","password").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("desc","true");
		
		formlist_1_hidden_1 = new HiddenField(model,"formlist_1_hidden_1");
		formlist_1_hidden_1.setLabel(gt(""));
		formlist_1_hidden_1.propertie().add("name","p_formlist_1_hidden_1").add("type","hidden").add("maxlength","250").add("java-type","").add("tag","formlist_1_hidden_1").add("desc","true");
		
		formlist_1_plaintext_1 = new PlainTextField(model,"formlist_1_plaintext_1");
		formlist_1_plaintext_1.setLabel(gt("Plaintext"));
		formlist_1_plaintext_1.propertie().add("name","p_formlist_1_plaintext_1").add("type","plaintext").add("maxlength","250").add("disable_output_escaping","false").add("html_class","").add("desc","true");
		
		formlist_2_radio_1 = new RadioField(model,"formlist_2_radio_1");
		formlist_2_radio_1.setLabel(gt("Radio"));
		formlist_2_radio_1.propertie().add("name","p_formlist_2_radio_1").add("type","radio").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("java-type","").add("check","true").add("desc","true");
		
		formlist_2_radio_1_check = new RadioField(model,"formlist_2_radio_1_check");
		formlist_2_radio_1_check.propertie().add("name","p_formlist_2_radio_1").add("type","radio").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("java-type","").add("check","true").add("desc","true");
		
		formlist_2_range_1 = new TextField(model,"formlist_2_range_1");
		formlist_2_range_1.setLabel(gt("Range"));
		formlist_2_range_1.propertie().add("name","p_formlist_2_range_1").add("type","range").add("rangeMin","0").add("rangeMax","10").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("desc","true");
		
		formlist_2_select_1 = new ListField(model,"formlist_2_select_1");
		formlist_2_select_1.setLabel(gt("Select"));
		formlist_2_select_1.propertie().add("name","p_formlist_2_select_1").add("type","select").add("multiple","false").add("tags","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("delimiter",";").add("desc","true");
		
		formlist_2_text_1 = new TextField(model,"formlist_2_text_1");
		formlist_2_text_1.setLabel(gt("Text"));
		formlist_2_text_1.propertie().add("name","p_formlist_2_text_1").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("Hint")).add("desclabel","false").add("desc","true");
		
		formlist_2_textarea_1 = new TextAreaField(model,"formlist_2_textarea_1");
		formlist_2_textarea_1.setLabel(gt("Textarea"));
		formlist_2_textarea_1.propertie().add("name","p_formlist_2_textarea_1").add("type","textarea").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("dica")).add("desclabel","false").add("desc","true");
		
		formlist_2_time_1 = new TextField(model,"formlist_2_time_1");
		formlist_2_time_1.setLabel(gt("Time"));
		formlist_2_time_1.propertie().add("name","p_formlist_2_time_1").add("type","time").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("desc","true");
		
		formlist_2_file_1 = new FileField(model,"formlist_2_file_1");
		formlist_2_file_1.setLabel(gt("File"));
		formlist_2_file_1.propertie().add("name","p_formlist_2_file_1").add("type","file").add("accept","").add("targetrend","").add("multiple","false").add("rendvalue","false").add("maxlength","250").add("required","false").add("disabled","false").add("class","primary").add("desc","true");
		
		formlist_2_virtualkeyboard_1 = new VirtaulKeyboardField(model,"formlist_2_virtualkeyboard_1");
		formlist_2_virtualkeyboard_1.setLabel(gt("Virtualkeyboard"));
		formlist_2_virtualkeyboard_1.propertie().add("name","p_formlist_2_virtualkeyboard_1").add("type","virtualkeyboard").add("keyType","vkb_aznum").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("Digit here")).add("desclabel","false").add("desc","true");
		
		separatorlist_1_checkbox_1 = new CheckBoxField(model,"separatorlist_1_checkbox_1");
		separatorlist_1_checkbox_1.setLabel(gt("Checkbox"));
		separatorlist_1_checkbox_1.propertie().add("name","p_separatorlist_1_checkbox_1").add("type","checkbox").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("java-type","int").add("check","true").add("desc","true");
		
		separatorlist_1_checkbox_1_check = new CheckBoxField(model,"separatorlist_1_checkbox_1_check");
		separatorlist_1_checkbox_1_check.propertie().add("name","p_separatorlist_1_checkbox_1").add("type","checkbox").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("java-type","int").add("check","true").add("desc","true");
		
		separatorlist_1_checkboxlist_1 = new CheckBoxListField(model,"separatorlist_1_checkboxlist_1");
		separatorlist_1_checkboxlist_1.setLabel(gt("Checkboxlist"));
		separatorlist_1_checkboxlist_1.propertie().add("name","p_separatorlist_1_checkboxlist_1").add("type","checkboxlist").add("domain","").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("child_size","12").add("java-type","").add("desc","true");
		
		separatorlist_1_color_1 = new ColorField(model,"separatorlist_1_color_1");
		separatorlist_1_color_1.setLabel(gt("Color"));
		separatorlist_1_color_1.propertie().add("name","p_separatorlist_1_color_1").add("type","color").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("desc","true");
		
		separatorlist_1_email_1 = new EmailField(model,"separatorlist_1_email_1");
		separatorlist_1_email_1.setLabel(gt("Email"));
		separatorlist_1_email_1.propertie().add("name","p_separatorlist_1_email_1").add("type","email").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("desc","true");
		
		formlist_1_number_1 = new NumberField(model,"formlist_1_number_1");
		formlist_1_number_1.setLabel(gt("Number"));
		formlist_1_number_1.propertie().add("name","p_formlist_1_number_1").add("type","number").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("java-type","").add("min","").add("max","").add("desclabel","false").add("desc","true");
		
		separatorlist_1_select_1 = new ListField(model,"separatorlist_1_select_1");
		separatorlist_1_select_1.setLabel(gt("Select"));
		separatorlist_1_select_1.propertie().add("name","p_separatorlist_1_select_1").add("type","select").add("multiple","false").add("tags","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("desc","true");
		
		separatorlist_1_file_1 = new FileField(model,"separatorlist_1_file_1");
		separatorlist_1_file_1.setLabel(gt("File"));
		separatorlist_1_file_1.propertie().add("name","p_separatorlist_1_file_1").add("type","file").add("accept","").add("targetrend","").add("multiple","false").add("rendvalue","false").add("maxlength","250").add("required","false").add("disabled","false").add("class","primary").add("desc","true");
		
		separatorlist_1_hidden_1 = new HiddenField(model,"separatorlist_1_hidden_1");
		separatorlist_1_hidden_1.setLabel(gt(""));
		separatorlist_1_hidden_1.propertie().add("name","p_separatorlist_1_hidden_1").add("type","hidden").add("maxlength","250").add("java-type","").add("tag","separatorlist_1_hidden_1").add("desc","true");
		
		table_1_checkbox_1 = new CheckBoxField(model,"table_1_checkbox_1");
		table_1_checkbox_1.setLabel(gt("Checkbox"));
		table_1_checkbox_1.propertie().add("name","p_table_1_checkbox_1").add("type","checkbox").add("maxlength","30").add("switch","true").add("java-type","int").add("showLabel","true").add("group_in","").add("check","true").add("desc","true");
		
		table_1_checkbox_1_check = new CheckBoxField(model,"table_1_checkbox_1_check");
		table_1_checkbox_1_check.propertie().add("name","p_table_1_checkbox_1").add("type","checkbox").add("maxlength","30").add("switch","true").add("java-type","int").add("showLabel","true").add("group_in","").add("check","true").add("desc","true");
		
		table_1_color_1 = new ColorField(model,"table_1_color_1");
		table_1_color_1.setLabel(gt("Color"));
		table_1_color_1.propertie().add("name","p_table_1_color_1").add("type","color").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		table_1_date_1 = new DateField(model,"table_1_date_1");
		table_1_date_1.setLabel(gt("Date"));
		table_1_date_1.propertie().add("name","p_table_1_date_1").add("type","date").add("range","false").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		table_1_email_1 = new EmailField(model,"table_1_email_1");
		table_1_email_1.setLabel(gt("Email"));
		table_1_email_1.propertie().add("name","p_table_1_email_1").add("type","email").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		table_1_link_1 = new LinkField(model,"table_1_link_1");
		table_1_link_1.setLabel(gt("Link"));
		table_1_link_1.setValue(Core.getIGRPLink("catalogo_igrp","Components_that_need_fields","index"));

									table_1_link_1_desc = new LinkField(model,"table_1_link_1_desc");
		table_1_link_1_desc.setLabel(gt("Link"));
		table_1_link_1.propertie().add("name","p_table_1_link_1").add("type","link").add("target","_self").add("request_fields","").add("class","link").add("img","fa-link").add("maxlength","30").add("show_header","true").add("list_source","").add("refresh_submit","false").add("showLabel","true").add("group_in","").add("refresh_components","").add("desc","true");
		
		table_1_img_1 = new TextField(model,"table_1_img_1");
		table_1_img_1.setLabel(gt("Img"));
		table_1_img_1.setValue(gt(""));
		table_1_img_1.propertie().add("name","p_table_1_img_1").add("type","img").add("img","/IGRP/images/IGRP/IGRP2.3/assets/img/jon_doe.jpg").add("width","").add("height","").add("croppie","false").add("rounded","false").add("maxlength","30").add("autoupload","false").add("showLabel","true").add("group_in","");
		
		table_1_number_1 = new NumberField(model,"table_1_number_1");
		table_1_number_1.setLabel(gt("Number"));
		table_1_number_1.propertie().add("name","p_table_1_number_1").add("type","number").add("min","").add("max","").add("maxlength","30").add("total_footer","false").add("java-type","").add("showLabel","true").add("group_in","");
		
		table_1_password_1 = new PasswordField(model,"table_1_password_1");
		table_1_password_1.setLabel(gt("Password"));
		table_1_password_1.propertie().add("name","p_table_1_password_1").add("type","password").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		table_1_plaintext_1 = new PlainTextField(model,"table_1_plaintext_1");
		table_1_plaintext_1.setLabel(gt("Plaintext"));
		table_1_plaintext_1.propertie().add("name","p_table_1_plaintext_1").add("type","plaintext").add("maxlength","30").add("showLabel","true").add("disable_output_escaping","false").add("html_class","").add("group_in","");
		
		table_1_hidden_1 = new HiddenField(model,"table_1_hidden_1");
		table_1_hidden_1.setLabel(gt(""));
		table_1_hidden_1.propertie().add("name","p_table_1_hidden_1").add("type","hidden").add("maxlength","30").add("java-type","").add("showLabel","true").add("group_in","").add("tag","table_1_hidden_1");
		
		table_1_filter = new TextField(model,"table_1_filter");
		table_1_filter.setLabel(gt(""));
		table_1_filter.propertie().add("name","p_table_1_filter").add("type","text").add("maxlength","100");
		
		table_2_radio_1 = new RadioField(model,"table_2_radio_1");
		table_2_radio_1.setLabel(gt("Radio"));
		table_2_radio_1.propertie().add("name","p_table_2_radio_1").add("type","radio").add("maxlength","30").add("java-type","").add("showLabel","true").add("group_in","").add("check","true").add("desc","true");
		
		table_2_radio_1_check = new RadioField(model,"table_2_radio_1_check");
		table_2_radio_1_check.propertie().add("name","p_table_2_radio_1").add("type","radio").add("maxlength","30").add("java-type","").add("showLabel","true").add("group_in","").add("check","true").add("desc","true");
		
		table_2_text_1 = new TextField(model,"table_2_text_1");
		table_2_text_1.setLabel(gt("Text"));
		table_2_text_1.propertie().add("name","p_table_2_text_1").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		table_2_textarea_1 = new TextAreaField(model,"table_2_textarea_1");
		table_2_textarea_1.setLabel(gt("Textarea"));
		table_2_textarea_1.propertie().add("name","p_table_2_textarea_1").add("type","textarea").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		table_2_time_1 = new TextField(model,"table_2_time_1");
		table_2_time_1.setLabel(gt("Time"));
		table_2_time_1.propertie().add("name","p_table_2_time_1").add("type","time").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		view_1_number_1 = new NumberField(model,"view_1_number_1");
		view_1_number_1.setLabel(gt("Number"));
		view_1_number_1.propertie().add("name","p_view_1_number_1").add("type","number").add("maxlength","30").add("min","").add("max","").add("class","default").add("img","").add("showlabel","true");
		
		view_1_text_1 = new TextField(model,"view_1_text_1");
		view_1_text_1.setLabel(gt("Text"));
		view_1_text_1.propertie().add("name","p_view_1_text_1").add("type","text").add("maxlength","30").add("class","default").add("img","").add("showlabel","true");
		
		view_1_email_1 = new EmailField(model,"view_1_email_1");
		view_1_email_1.setLabel(gt("Email"));
		view_1_email_1.propertie().add("name","p_view_1_email_1").add("type","email").add("maxlength","30").add("class","default").add("img","").add("showlabel","true");
		
		view_1_date_1 = new DateField(model,"view_1_date_1");
		view_1_date_1.setLabel(gt("Date"));
		view_1_date_1.propertie().add("name","p_view_1_date_1").add("type","date").add("range","false").add("maxlength","30").add("class","default").add("img","").add("showlabel","true");
		
		view_1_img = new TextField(model,"view_1_img");
		view_1_img.setLabel(gt(""));
		view_1_img.propertie().add("type","text").add("name","p_view_1_img").add("maxlength","300");
		
		view_1_number_1_1 = new NumberField(model,"view_1_number_1_1");
		view_1_number_1_1.setLabel(gt("Number"));
		view_1_number_1_1.propertie().add("name","p_view_1_number_1").add("type","number").add("maxlength","30").add("min","").add("max","").add("class","default").add("img","").add("showlabel","true");
		
		view_1_text_1_1 = new TextField(model,"view_1_text_1_1");
		view_1_text_1_1.setLabel(gt("Text"));
		view_1_text_1_1.propertie().add("name","p_view_1_text_1").add("type","text").add("maxlength","30").add("class","default").add("img","").add("showlabel","true");
		
		view_1_email_1_1 = new EmailField(model,"view_1_email_1_1");
		view_1_email_1_1.setLabel(gt("Email"));
		view_1_email_1_1.propertie().add("name","p_view_1_email_1").add("type","email").add("maxlength","30").add("class","default").add("img","").add("showlabel","true");
		
		view_1_date_1_1 = new DateField(model,"view_1_date_1_1");
		view_1_date_1_1.setLabel(gt("Date"));
		view_1_date_1_1.propertie().add("name","p_view_1_date_1").add("type","date").add("range","false").add("maxlength","30").add("class","default").add("img","").add("showlabel","true");
		


		
	}
		
	@Override
	public void render(){
		
		form_1.addField(form_1_checkbox_1);
		form_1.addField(form_1_checkboxlist_1);
		form_1.addField(form_1_color_1);
		form_1.addField(form_1_date_1);
		form_1.addField(form_1_email_1);
		form_1.addField(hyperlink);
		form_1.addField(form_1_img_1);
		form_1.addField(form_1_lookup_1);
		form_1.addField(form_1_number_1);
		form_1.addField(form_1_password_1);
		form_1.addField(form_1_plaintext_1);
		form_1.addField(form_1_radio_1);
		form_1.addField(form_1_radiolist_1);
		form_1.addField(form_1_range_1);
		form_1.addField(form_1_select_1);
		form_1.addField(form_1_separator_1);
		form_1.addField(form_1_text_1);
		form_1.addField(form_1_textarea_1);
		form_1.addField(form_1_texteditor_1);
		form_1.addField(form_1_time_1);
		form_1.addField(form_1_file_1);
		form_1.addField(form_1_virtualkeyboard_1);
		form_1.addField(hidden_tag_1);

		formlist_1.addField(formlist_1_button_1);
		formlist_1.addField(formlist_1_checkbox_1);
		formlist_1.addField(formlist_1_checkbox_1_check);
		formlist_1.addField(formlist_1_color_1);
		formlist_1.addField(separatorlist_1_date_1);
		formlist_1.addField(formlist_1_email_1);
		formlist_1.addField(formlist_1_lookup_1);
		formlist_1.addField(formlist_1_link_1);
		formlist_1.addField(formlist_1_link_1_desc);
		formlist_1.addField(formlist_2_number_1);
		formlist_1.addField(formlist_2_password_1);
		formlist_1.addField(formlist_1_hidden_1);

		formlist_2.addField(formlist_1_plaintext_1);
		formlist_2.addField(formlist_2_radio_1);
		formlist_2.addField(formlist_2_radio_1_check);
		formlist_2.addField(formlist_2_range_1);
		formlist_2.addField(formlist_2_select_1);
		formlist_2.addField(formlist_2_text_1);
		formlist_2.addField(formlist_2_textarea_1);
		formlist_2.addField(formlist_2_time_1);
		formlist_2.addField(formlist_2_file_1);
		formlist_2.addField(formlist_2_virtualkeyboard_1);

		separatorlist_1.addField(separatorlist_1_checkbox_1);
		separatorlist_1.addField(separatorlist_1_checkbox_1_check);
		separatorlist_1.addField(separatorlist_1_checkboxlist_1);
		separatorlist_1.addField(separatorlist_1_color_1);
		separatorlist_1.addField(separatorlist_1_email_1);
		separatorlist_1.addField(formlist_1_number_1);
		separatorlist_1.addField(separatorlist_1_select_1);
		separatorlist_1.addField(separatorlist_1_file_1);
		separatorlist_1.addField(separatorlist_1_hidden_1);

		table_1.addField(table_1_checkbox_1);
		table_1.addField(table_1_checkbox_1_check);
		table_1.addField(table_1_color_1);
		table_1.addField(table_1_date_1);
		table_1.addField(table_1_email_1);
		table_1.addField(table_1_link_1);
		table_1.addField(table_1_link_1_desc);
		table_1.addField(table_1_img_1);
		table_1.addField(table_1_number_1);
		table_1.addField(table_1_password_1);
		table_1.addField(table_1_plaintext_1);
		table_1.addField(table_1_hidden_1);
		table_1.addField(table_1_filter);
		/* start table_1 legend colors*/
		Map<Object, Map<String, String>> table_1_colors= new LinkedHashMap<>();
		Map<String, String> color_1_table_1 = new LinkedHashMap<>();
		color_1_table_1.put("#dc2b4c","Cor 1");
		table_1_colors.put("1",color_1_table_1);
		Map<String, String> color_2_table_1 = new LinkedHashMap<>();
		color_2_table_1.put("#ea9126","Cor 2");
		table_1_colors.put("2",color_2_table_1);
		Map<String, String> color_3_table_1 = new LinkedHashMap<>();
		color_3_table_1.put("#95c11f","Cor 3");
		table_1_colors.put("3",color_3_table_1);
		this.table_1.setLegendColors(table_1_colors);
		/* end table_1 legend colors*/
		table_2.addField(table_2_radio_1);
		table_2.addField(table_2_radio_1_check);
		table_2.addField(table_2_text_1);
		table_2.addField(table_2_textarea_1);
		table_2.addField(table_2_time_1);

		view_1.addField(view_1_number_1);
		view_1.addField(view_1_text_1);
		view_1.addField(view_1_email_1);
		view_1.addField(view_1_date_1);
		view_1.addField(view_1_img);

		view_2.addField(view_1_number_1_1);
		view_2.addField(view_1_text_1_1);
		view_2.addField(view_1_email_1_1);
		view_2.addField(view_1_date_1_1);

		this.addToPage(form_1);
		this.addToPage(formlist_1);
		this.addToPage(formlist_2);
		this.addToPage(separatorlist_1);
		this.addToPage(table_1);
		this.addToPage(table_2);
		this.addToPage(view_1);
		this.addToPage(view_2);
	}
		
	@Override
	public void setModel(Model model) {
		
		form_1_checkbox_1.setValue(model);
		form_1_checkboxlist_1.setValue(model);
		form_1_color_1.setValue(model);
		form_1_date_1.setValue(model);
		form_1_email_1.setValue(model);
		hyperlink.setValue(model);
		form_1_lookup_1.setValue(model);
		form_1_number_1.setValue(model);
		form_1_password_1.setValue(model);
		form_1_plaintext_1.setValue(model);
		form_1_radio_1.setValue(model);
		form_1_radiolist_1.setValue(model);
		form_1_range_1.setValue(model);
		form_1_select_1.setValue(model);
		form_1_separator_1.setValue(model);
		form_1_text_1.setValue(model);
		form_1_textarea_1.setValue(model);
		form_1_texteditor_1.setValue(model);
		form_1_time_1.setValue(model);
		form_1_file_1.setValue(model);
		form_1_virtualkeyboard_1.setValue(model);
		hidden_tag_1.setValue(model);
		formlist_1_button_1.setValue(model);
		formlist_1_checkbox_1.setValue(model);
		formlist_1_color_1.setValue(model);
		separatorlist_1_date_1.setValue(model);
		formlist_1_email_1.setValue(model);
		formlist_1_lookup_1.setValue(model);
		formlist_1_link_1.setValue(model);
		formlist_1_link_1_desc.setValue(model);
		formlist_2_number_1.setValue(model);
		formlist_2_password_1.setValue(model);
		formlist_1_hidden_1.setValue(model);
		formlist_1_plaintext_1.setValue(model);
		formlist_2_radio_1.setValue(model);
		formlist_2_range_1.setValue(model);
		formlist_2_select_1.setValue(model);
		formlist_2_text_1.setValue(model);
		formlist_2_textarea_1.setValue(model);
		formlist_2_time_1.setValue(model);
		formlist_2_file_1.setValue(model);
		formlist_2_virtualkeyboard_1.setValue(model);
		separatorlist_1_checkbox_1.setValue(model);
		separatorlist_1_checkboxlist_1.setValue(model);
		separatorlist_1_color_1.setValue(model);
		separatorlist_1_email_1.setValue(model);
		formlist_1_number_1.setValue(model);
		separatorlist_1_select_1.setValue(model);
		separatorlist_1_file_1.setValue(model);
		separatorlist_1_hidden_1.setValue(model);
		table_1_checkbox_1.setValue(model);
		table_1_color_1.setValue(model);
		table_1_date_1.setValue(model);
		table_1_email_1.setValue(model);
		table_1_link_1.setValue(model);
		table_1_link_1_desc.setValue(model);
		table_1_number_1.setValue(model);
		table_1_password_1.setValue(model);
		table_1_plaintext_1.setValue(model);
		table_1_hidden_1.setValue(model);
		table_1_filter.setValue(model);
		table_2_radio_1.setValue(model);
		table_2_text_1.setValue(model);
		table_2_textarea_1.setValue(model);
		table_2_time_1.setValue(model);
		view_1_number_1.setValue(model);
		view_1_text_1.setValue(model);
		view_1_email_1.setValue(model);
		view_1_date_1.setValue(model);
		view_1_img.setValue(model);
		view_1_number_1_1.setValue(model);
		view_1_text_1_1.setValue(model);
		view_1_email_1_1.setValue(model);
		view_1_date_1_1.setValue(model);	

		formlist_1.loadModel(((Components_that_need_fields) model).getFormlist_1());
		formlist_2.loadModel(((Components_that_need_fields) model).getFormlist_2());
		separatorlist_1.loadModel(((Components_that_need_fields) model).getSeparatorlist_1());
		table_1.loadModel(((Components_that_need_fields) model).getTable_1());
		table_2.loadModel(((Components_that_need_fields) model).getTable_2());
		}
}
