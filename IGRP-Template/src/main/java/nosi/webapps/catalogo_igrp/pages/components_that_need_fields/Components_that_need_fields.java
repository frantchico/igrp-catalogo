package nosi.webapps.catalogo_igrp.pages.components_that_need_fields;

import nosi.core.gui.components.IGRPLink;
import nosi.core.webapp.Report;
import nosi.core.gui.components.IGRPTable;
import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import nosi.core.gui.components.IGRPSeparatorList.Pair;
import nosi.core.webapp.SeparatorList;
import java.util.ArrayList;
import java.util.List;
import nosi.core.webapp.uploadfile.UploadFile;
import javax.validation.Valid;
public class Components_that_need_fields extends Model{		

	@RParam(rParamName = "p_form_1_checkbox_1")
	private int form_1_checkbox_1;
	@RParam(rParamName = "p_form_1_checkbox_1_check")
	private int form_1_checkbox_1_check;

	@RParam(rParamName = "p_form_1_checkboxlist_1")
	private String[] form_1_checkboxlist_1;

	@RParam(rParamName = "p_form_1_color_1")
	private String form_1_color_1;

	@RParam(rParamName = "p_form_1_date_1")
	private String form_1_date_1;

	@RParam(rParamName = "p_form_1_email_1")
	private String form_1_email_1;

	@RParam(rParamName = "p_hyperlink")
	private IGRPLink hyperlink;
	@RParam(rParamName = "p_hyperlink_desc")
	private String hyperlink_desc;

	@RParam(rParamName = "p_form_1_img_1")
	private String form_1_img_1;
	@RParam(rParamName = "p_form_1_img_1_uuid")
	private String form_1_img_1_uuid;

	@RParam(rParamName = "p_form_1_lookup_1")
	private String form_1_lookup_1;

	@RParam(rParamName = "p_form_1_number_1")
	private Integer form_1_number_1;

	@RParam(rParamName = "p_form_1_password_1")
	private String form_1_password_1;

	@RParam(rParamName = "p_form_1_plaintext_1")
	private String form_1_plaintext_1;

	@RParam(rParamName = "p_form_1_radio_1")
	private Integer form_1_radio_1;
	@RParam(rParamName = "p_form_1_radio_1_check")
	private Integer form_1_radio_1_check;

	@RParam(rParamName = "p_form_1_radiolist_1")
	private Integer form_1_radiolist_1;

	@RParam(rParamName = "p_form_1_range_1")
	private Integer form_1_range_1;

	@RParam(rParamName = "p_form_1_select_1")
	private String form_1_select_1;

	@RParam(rParamName = "p_form_1_separator_1")
	private String form_1_separator_1;

	@RParam(rParamName = "p_form_1_text_1")
	private String form_1_text_1;

	@RParam(rParamName = "p_form_1_textarea_1")
	private String form_1_textarea_1;

	@RParam(rParamName = "p_form_1_texteditor_1")
	private String form_1_texteditor_1;

	@RParam(rParamName = "p_form_1_time_1")
	private String form_1_time_1;

	@RParam(rParamName = "p_form_1_file_1")
	private UploadFile[] form_1_file_1;

	@RParam(rParamName = "p_form_1_virtualkeyboard_1")
	private String form_1_virtualkeyboard_1;

	@RParam(rParamName = "p_hidden_tag_1")
	private String hidden_tag_1;

	@RParam(rParamName = "p_view_1_number_1")
	private Integer view_1_number_1;

	@RParam(rParamName = "p_view_1_text_1")
	private String view_1_text_1;

	@RParam(rParamName = "p_view_1_email_1")
	private String view_1_email_1;

	@RParam(rParamName = "p_view_1_date_1")
	private String view_1_date_1;

	@RParam(rParamName = "p_view_1_img")
	private String view_1_img;
	
	@SeparatorList(name = Formlist_1.class)
	@Valid
	private List<Formlist_1> formlist_1 = new ArrayList<>();	
	public void setFormlist_1(List<Formlist_1> formlist_1){
		this.formlist_1 = formlist_1;
	}
	public List<Formlist_1> getFormlist_1(){
		return this.formlist_1;
	}
	@RParam(rParamName = "p_formlist_1_id")
	private String[] p_formlist_1_id;
	@RParam(rParamName = "p_formlist_1_del")
	private String[] p_formlist_1_del;
	@RParam(rParamName = "p_formlist_1_edit")
	private String[] p_formlist_1_edit;
	
	public void setP_formlist_1_id(String[] p_formlist_1_id){
		this.p_formlist_1_id = p_formlist_1_id;
	}
	public String[] getP_formlist_1_id(){
		return this.p_formlist_1_id;
	}
	
	public void setP_formlist_1_del(String[] p_formlist_1_del){
		this.p_formlist_1_del = p_formlist_1_del;
	}
	public String[] getP_formlist_1_del(){
		return this.p_formlist_1_del;
	}
	
	public void setP_formlist_1_edit(String[] p_formlist_1_edit){
		this.p_formlist_1_edit = p_formlist_1_edit;
	}
	public String[] getP_formlist_1_edit(){
		return this.p_formlist_1_edit;
	}
	
	@SeparatorList(name = Formlist_2.class)
	@Valid
	private List<Formlist_2> formlist_2 = new ArrayList<>();	
	public void setFormlist_2(List<Formlist_2> formlist_2){
		this.formlist_2 = formlist_2;
	}
	public List<Formlist_2> getFormlist_2(){
		return this.formlist_2;
	}
	@RParam(rParamName = "p_formlist_2_id")
	private String[] p_formlist_2_id;
	@RParam(rParamName = "p_formlist_2_del")
	private String[] p_formlist_2_del;
	@RParam(rParamName = "p_formlist_2_edit")
	private String[] p_formlist_2_edit;
	
	public void setP_formlist_2_id(String[] p_formlist_2_id){
		this.p_formlist_2_id = p_formlist_2_id;
	}
	public String[] getP_formlist_2_id(){
		return this.p_formlist_2_id;
	}
	
	public void setP_formlist_2_del(String[] p_formlist_2_del){
		this.p_formlist_2_del = p_formlist_2_del;
	}
	public String[] getP_formlist_2_del(){
		return this.p_formlist_2_del;
	}
	
	public void setP_formlist_2_edit(String[] p_formlist_2_edit){
		this.p_formlist_2_edit = p_formlist_2_edit;
	}
	public String[] getP_formlist_2_edit(){
		return this.p_formlist_2_edit;
	}
	
	@SeparatorList(name = Separatorlist_1.class)
	@Valid
	private List<Separatorlist_1> separatorlist_1 = new ArrayList<>();	
	public void setSeparatorlist_1(List<Separatorlist_1> separatorlist_1){
		this.separatorlist_1 = separatorlist_1;
	}
	public List<Separatorlist_1> getSeparatorlist_1(){
		return this.separatorlist_1;
	}
	@RParam(rParamName = "p_separatorlist_1_id")
	private String[] p_separatorlist_1_id;
	@RParam(rParamName = "p_separatorlist_1_del")
	private String[] p_separatorlist_1_del;
	@RParam(rParamName = "p_separatorlist_1_edit")
	private String[] p_separatorlist_1_edit;
	
	public void setP_separatorlist_1_id(String[] p_separatorlist_1_id){
		this.p_separatorlist_1_id = p_separatorlist_1_id;
	}
	public String[] getP_separatorlist_1_id(){
		return this.p_separatorlist_1_id;
	}
	
	public void setP_separatorlist_1_del(String[] p_separatorlist_1_del){
		this.p_separatorlist_1_del = p_separatorlist_1_del;
	}
	public String[] getP_separatorlist_1_del(){
		return this.p_separatorlist_1_del;
	}
	
	public void setP_separatorlist_1_edit(String[] p_separatorlist_1_edit){
		this.p_separatorlist_1_edit = p_separatorlist_1_edit;
	}
	public String[] getP_separatorlist_1_edit(){
		return this.p_separatorlist_1_edit;
	}
	
	private List<Table_1> table_1 = new ArrayList<>();	
	public void setTable_1(List<Table_1> table_1){
		this.table_1 = table_1;
	}
	public List<Table_1> getTable_1(){
		return this.table_1;
	}

	
	private List<Table_2> table_2 = new ArrayList<>();	
	public void setTable_2(List<Table_2> table_2){
		this.table_2 = table_2;
	}
	public List<Table_2> getTable_2(){
		return this.table_2;
	}

	
	public void setForm_1_checkbox_1(int form_1_checkbox_1){
		this.form_1_checkbox_1 = form_1_checkbox_1;
	}
	public int getForm_1_checkbox_1(){
		return this.form_1_checkbox_1;
	}
	public void setForm_1_checkbox_1_check(int form_1_checkbox_1_check){
		this.form_1_checkbox_1_check = form_1_checkbox_1_check;
	}
	public int getForm_1_checkbox_1_check(){
		return this.form_1_checkbox_1_check;
	}
	
	public void setForm_1_checkboxlist_1(String[] form_1_checkboxlist_1){
		this.form_1_checkboxlist_1 = form_1_checkboxlist_1;
	}
	public String[] getForm_1_checkboxlist_1(){
		return this.form_1_checkboxlist_1;
	}
	
	public void setForm_1_color_1(String form_1_color_1){
		this.form_1_color_1 = form_1_color_1;
	}
	public String getForm_1_color_1(){
		return this.form_1_color_1;
	}
	
	public void setForm_1_date_1(String form_1_date_1){
		this.form_1_date_1 = form_1_date_1;
	}
	public String getForm_1_date_1(){
		return this.form_1_date_1;
	}
	
	public void setForm_1_email_1(String form_1_email_1){
		this.form_1_email_1 = form_1_email_1;
	}
	public String getForm_1_email_1(){
		return this.form_1_email_1;
	}
	
	public IGRPLink setHyperlink(String app,String page,String action){
		this.hyperlink = new IGRPLink(app,page,action);
		return this.hyperlink;
	}
	public IGRPLink getHyperlink(){
		return this.hyperlink;
	}
	public void setHyperlink_desc(String hyperlink_desc){
		this.hyperlink_desc = hyperlink_desc;
	}
	public String getHyperlink_desc(){
		return this.hyperlink_desc;
	}
	public IGRPLink setHyperlink(String link){
		this.hyperlink = new IGRPLink(link);
		return this.hyperlink;
	}
	public IGRPLink setHyperlink(Report link){
		this.hyperlink = new IGRPLink(link);
		return this.hyperlink;
	}
	
	public void setForm_1_img_1(String form_1_img_1){
		this.form_1_img_1 = form_1_img_1;
	}
	public String getForm_1_img_1(){
		return this.form_1_img_1;
	}
	public void setForm_1_img_1_uuid(String form_1_img_1_uuid){
		this.form_1_img_1_uuid = form_1_img_1_uuid;
	}
	public String getForm_1_img_1_uuid(){
		return this.form_1_img_1_uuid;
	}
	
	public void setForm_1_lookup_1(String form_1_lookup_1){
		this.form_1_lookup_1 = form_1_lookup_1;
	}
	public String getForm_1_lookup_1(){
		return this.form_1_lookup_1;
	}
	
	public void setForm_1_number_1(Integer form_1_number_1){
		this.form_1_number_1 = form_1_number_1;
	}
	public Integer getForm_1_number_1(){
		return this.form_1_number_1;
	}
	
	public void setForm_1_password_1(String form_1_password_1){
		this.form_1_password_1 = form_1_password_1;
	}
	public String getForm_1_password_1(){
		return this.form_1_password_1;
	}
	
	public void setForm_1_plaintext_1(String form_1_plaintext_1){
		this.form_1_plaintext_1 = form_1_plaintext_1;
	}
	public String getForm_1_plaintext_1(){
		return this.form_1_plaintext_1;
	}
	
	public void setForm_1_radio_1(Integer form_1_radio_1){
		this.form_1_radio_1 = form_1_radio_1;
	}
	public Integer getForm_1_radio_1(){
		return this.form_1_radio_1;
	}
	public void setForm_1_radio_1_check(Integer form_1_radio_1_check){
		this.form_1_radio_1_check = form_1_radio_1_check;
	}
	public Integer getForm_1_radio_1_check(){
		return this.form_1_radio_1_check;
	}
	
	public void setForm_1_radiolist_1(Integer form_1_radiolist_1){
		this.form_1_radiolist_1 = form_1_radiolist_1;
	}
	public Integer getForm_1_radiolist_1(){
		return this.form_1_radiolist_1;
	}
	
	public void setForm_1_range_1(Integer form_1_range_1){
		this.form_1_range_1 = form_1_range_1;
	}
	public Integer getForm_1_range_1(){
		return this.form_1_range_1;
	}
	
	public void setForm_1_select_1(String form_1_select_1){
		this.form_1_select_1 = form_1_select_1;
	}
	public String getForm_1_select_1(){
		return this.form_1_select_1;
	}
	
	public void setForm_1_separator_1(String form_1_separator_1){
		this.form_1_separator_1 = form_1_separator_1;
	}
	public String getForm_1_separator_1(){
		return this.form_1_separator_1;
	}
	
	public void setForm_1_text_1(String form_1_text_1){
		this.form_1_text_1 = form_1_text_1;
	}
	public String getForm_1_text_1(){
		return this.form_1_text_1;
	}
	
	public void setForm_1_textarea_1(String form_1_textarea_1){
		this.form_1_textarea_1 = form_1_textarea_1;
	}
	public String getForm_1_textarea_1(){
		return this.form_1_textarea_1;
	}
	
	public void setForm_1_texteditor_1(String form_1_texteditor_1){
		this.form_1_texteditor_1 = form_1_texteditor_1;
	}
	public String getForm_1_texteditor_1(){
		return this.form_1_texteditor_1;
	}
	
	public void setForm_1_time_1(String form_1_time_1){
		this.form_1_time_1 = form_1_time_1;
	}
	public String getForm_1_time_1(){
		return this.form_1_time_1;
	}
	
	public void setForm_1_file_1(UploadFile[] form_1_file_1){
		this.form_1_file_1 = form_1_file_1;
	}
	public UploadFile[] getForm_1_file_1(){
		return this.form_1_file_1;
	}
	
	public void setForm_1_virtualkeyboard_1(String form_1_virtualkeyboard_1){
		this.form_1_virtualkeyboard_1 = form_1_virtualkeyboard_1;
	}
	public String getForm_1_virtualkeyboard_1(){
		return this.form_1_virtualkeyboard_1;
	}
	
	public void setHidden_tag_1(String hidden_tag_1){
		this.hidden_tag_1 = hidden_tag_1;
	}
	public String getHidden_tag_1(){
		return this.hidden_tag_1;
	}
	
	public void setView_1_number_1(Integer view_1_number_1){
		this.view_1_number_1 = view_1_number_1;
	}
	public Integer getView_1_number_1(){
		return this.view_1_number_1;
	}
	
	public void setView_1_text_1(String view_1_text_1){
		this.view_1_text_1 = view_1_text_1;
	}
	public String getView_1_text_1(){
		return this.view_1_text_1;
	}
	
	public void setView_1_email_1(String view_1_email_1){
		this.view_1_email_1 = view_1_email_1;
	}
	public String getView_1_email_1(){
		return this.view_1_email_1;
	}
	
	public void setView_1_date_1(String view_1_date_1){
		this.view_1_date_1 = view_1_date_1;
	}
	public String getView_1_date_1(){
		return this.view_1_date_1;
	}
	
	public void setView_1_img(String view_1_img){
		this.view_1_img = view_1_img;
	}
	public String getView_1_img(){
		return this.view_1_img;
	}


	public static class Table_1 extends IGRPTable.Table{
		private int table_1_checkbox_1;
		private int table_1_checkbox_1_check;
		private String table_1_color_1;
		private String table_1_date_1;
		private String table_1_email_1;
		private IGRPLink table_1_link_1;
		private String table_1_link_1_desc= "Link";
		private String table_1_img_1;
		private String table_1_img_1_uuid;
		private Integer table_1_number_1;
		private String table_1_password_1;
		private String table_1_plaintext_1;
		private String table_1_hidden_1;
		private String table_1_filter;
		public void setTable_1_checkbox_1(int table_1_checkbox_1){
			this.table_1_checkbox_1 = table_1_checkbox_1;
		}
		public int getTable_1_checkbox_1(){
			return this.table_1_checkbox_1;
		}
		public void setTable_1_checkbox_1_check(int table_1_checkbox_1_check){
			this.table_1_checkbox_1_check = table_1_checkbox_1_check;
		}
		public int getTable_1_checkbox_1_check(){
			return this.table_1_checkbox_1_check;
		}

		public void setTable_1_color_1(String table_1_color_1){
			this.table_1_color_1 = table_1_color_1;
		}
		public String getTable_1_color_1(){
			return this.table_1_color_1;
		}

		public void setTable_1_date_1(String table_1_date_1){
			this.table_1_date_1 = table_1_date_1;
		}
		public String getTable_1_date_1(){
			return this.table_1_date_1;
		}

		public void setTable_1_email_1(String table_1_email_1){
			this.table_1_email_1 = table_1_email_1;
		}
		public String getTable_1_email_1(){
			return this.table_1_email_1;
		}

		public IGRPLink setTable_1_link_1(String app,String page,String action){
			this.table_1_link_1 = new IGRPLink(app,page,action);
			return this.table_1_link_1;
		}
		public IGRPLink getTable_1_link_1(){
			return this.table_1_link_1;
		}
		public void setTable_1_link_1_desc(String table_1_link_1_desc){
			this.table_1_link_1_desc = table_1_link_1_desc;
		}
		public String getTable_1_link_1_desc(){
			return this.table_1_link_1_desc;
		}
	public IGRPLink setTable_1_link_1(String link){
		this.table_1_link_1 = new IGRPLink(link);
		return this.table_1_link_1;
	}
	public IGRPLink setTable_1_link_1(Report link){
		this.table_1_link_1 = new IGRPLink(link);
		return this.table_1_link_1;
	}

		public void setTable_1_img_1(String table_1_img_1){
			this.table_1_img_1 = table_1_img_1;
		}
		public String getTable_1_img_1(){
			return this.table_1_img_1;
		}
		public void setTable_1_img_1_uuid(String table_1_img_1_uuid){
			this.table_1_img_1_uuid = table_1_img_1_uuid;
		}
		public String getTable_1_img_1_uuid(){
			return this.table_1_img_1_uuid;
		}

		public void setTable_1_number_1(Integer table_1_number_1){
			this.table_1_number_1 = table_1_number_1;
		}
		public Integer getTable_1_number_1(){
			return this.table_1_number_1;
		}

		public void setTable_1_password_1(String table_1_password_1){
			this.table_1_password_1 = table_1_password_1;
		}
		public String getTable_1_password_1(){
			return this.table_1_password_1;
		}

		public void setTable_1_plaintext_1(String table_1_plaintext_1){
			this.table_1_plaintext_1 = table_1_plaintext_1;
		}
		public String getTable_1_plaintext_1(){
			return this.table_1_plaintext_1;
		}

		public void setTable_1_hidden_1(String table_1_hidden_1){
			this.table_1_hidden_1 = table_1_hidden_1;
		}
		public String getTable_1_hidden_1(){
			return this.table_1_hidden_1;
		}

		public void setTable_1_filter(String table_1_filter){
			this.table_1_filter = table_1_filter;
		}
		public String getTable_1_filter(){
			return this.table_1_filter;
		}

	}
	public static class Table_2 extends IGRPTable.Table{
		private Integer table_2_radio_1;
		private Integer table_2_radio_1_check;
		private String table_2_text_1;
		private String table_2_textarea_1;
		private String table_2_time_1;
		public void setTable_2_radio_1(Integer table_2_radio_1){
			this.table_2_radio_1 = table_2_radio_1;
		}
		public Integer getTable_2_radio_1(){
			return this.table_2_radio_1;
		}
		public void setTable_2_radio_1_check(Integer table_2_radio_1_check){
			this.table_2_radio_1_check = table_2_radio_1_check;
		}
		public Integer getTable_2_radio_1_check(){
			return this.table_2_radio_1_check;
		}

		public void setTable_2_text_1(String table_2_text_1){
			this.table_2_text_1 = table_2_text_1;
		}
		public String getTable_2_text_1(){
			return this.table_2_text_1;
		}

		public void setTable_2_textarea_1(String table_2_textarea_1){
			this.table_2_textarea_1 = table_2_textarea_1;
		}
		public String getTable_2_textarea_1(){
			return this.table_2_textarea_1;
		}

		public void setTable_2_time_1(String table_2_time_1){
			this.table_2_time_1 = table_2_time_1;
		}
		public String getTable_2_time_1(){
			return this.table_2_time_1;
		}

	}
	public static class Separatorlist_1{
		private Pair separatorlist_1_id;
private Pair separatorlist_1_checkbox_1;
		private Pair separatorlist_1_checkbox_1_check;
private Pair separatorlist_1_checkboxlist_1;
private Pair separatorlist_1_color_1;
private Pair separatorlist_1_email_1;
private Pair formlist_1_number_1;
private Pair separatorlist_1_select_1;
private Pair separatorlist_1_file_1;
private Pair separatorlist_1_hidden_1;
		public void setSeparatorlist_1_id(Pair separatorlist_1_id){
			this.separatorlist_1_id = separatorlist_1_id;
		}
		public Pair getSeparatorlist_1_id(){
			return this.separatorlist_1_id;
		}
		public void setSeparatorlist_1_checkbox_1(Pair separatorlist_1_checkbox_1){
			this.separatorlist_1_checkbox_1 = separatorlist_1_checkbox_1;
		}
		public Pair getSeparatorlist_1_checkbox_1(){
			return this.separatorlist_1_checkbox_1;
		}
		
		public void setSeparatorlist_1_checkbox_1_check(Pair separatorlist_1_checkbox_1_check){
			this.separatorlist_1_checkbox_1_check = separatorlist_1_checkbox_1_check;
		}
		public Pair getSeparatorlist_1_checkbox_1_check(){
			return this.separatorlist_1_checkbox_1_check;
		}

		public void setSeparatorlist_1_checkboxlist_1(Pair separatorlist_1_checkboxlist_1){
			this.separatorlist_1_checkboxlist_1 = separatorlist_1_checkboxlist_1;
		}
		public Pair getSeparatorlist_1_checkboxlist_1(){
			return this.separatorlist_1_checkboxlist_1;
		}

		public void setSeparatorlist_1_color_1(Pair separatorlist_1_color_1){
			this.separatorlist_1_color_1 = separatorlist_1_color_1;
		}
		public Pair getSeparatorlist_1_color_1(){
			return this.separatorlist_1_color_1;
		}

		public void setSeparatorlist_1_email_1(Pair separatorlist_1_email_1){
			this.separatorlist_1_email_1 = separatorlist_1_email_1;
		}
		public Pair getSeparatorlist_1_email_1(){
			return this.separatorlist_1_email_1;
		}

		public void setFormlist_1_number_1(Pair formlist_1_number_1){
			this.formlist_1_number_1 = formlist_1_number_1;
		}
		public Pair getFormlist_1_number_1(){
			return this.formlist_1_number_1;
		}

		public void setSeparatorlist_1_select_1(Pair separatorlist_1_select_1){
			this.separatorlist_1_select_1 = separatorlist_1_select_1;
		}
		public Pair getSeparatorlist_1_select_1(){
			return this.separatorlist_1_select_1;
		}

		public void setSeparatorlist_1_file_1(Pair separatorlist_1_file_1){
			this.separatorlist_1_file_1 = separatorlist_1_file_1;
		}
		public Pair getSeparatorlist_1_file_1(){
			return this.separatorlist_1_file_1;
		}

		public void setSeparatorlist_1_hidden_1(Pair separatorlist_1_hidden_1){
			this.separatorlist_1_hidden_1 = separatorlist_1_hidden_1;
		}
		public Pair getSeparatorlist_1_hidden_1(){
			return this.separatorlist_1_hidden_1;
		}

	}
	public static class Formlist_1{
		private Pair formlist_1_id;
private Pair formlist_1_button_1;
private Pair formlist_1_checkbox_1;
		private Pair formlist_1_checkbox_1_check;
private Pair formlist_1_color_1;
private Pair separatorlist_1_date_1;
private Pair formlist_1_email_1;
private Pair formlist_1_lookup_1;
private Pair formlist_1_link_1;
private Pair formlist_2_number_1;
private Pair formlist_2_password_1;
private Pair formlist_1_hidden_1;
		public void setFormlist_1_id(Pair formlist_1_id){
			this.formlist_1_id = formlist_1_id;
		}
		public Pair getFormlist_1_id(){
			return this.formlist_1_id;
		}
		public void setFormlist_1_button_1(Pair formlist_1_button_1){
			this.formlist_1_button_1 = formlist_1_button_1;
		}
		public Pair getFormlist_1_button_1(){
			return this.formlist_1_button_1;
		}

		public void setFormlist_1_checkbox_1(Pair formlist_1_checkbox_1){
			this.formlist_1_checkbox_1 = formlist_1_checkbox_1;
		}
		public Pair getFormlist_1_checkbox_1(){
			return this.formlist_1_checkbox_1;
		}
		
		public void setFormlist_1_checkbox_1_check(Pair formlist_1_checkbox_1_check){
			this.formlist_1_checkbox_1_check = formlist_1_checkbox_1_check;
		}
		public Pair getFormlist_1_checkbox_1_check(){
			return this.formlist_1_checkbox_1_check;
		}

		public void setFormlist_1_color_1(Pair formlist_1_color_1){
			this.formlist_1_color_1 = formlist_1_color_1;
		}
		public Pair getFormlist_1_color_1(){
			return this.formlist_1_color_1;
		}

		public void setSeparatorlist_1_date_1(Pair separatorlist_1_date_1){
			this.separatorlist_1_date_1 = separatorlist_1_date_1;
		}
		public Pair getSeparatorlist_1_date_1(){
			return this.separatorlist_1_date_1;
		}

		public void setFormlist_1_email_1(Pair formlist_1_email_1){
			this.formlist_1_email_1 = formlist_1_email_1;
		}
		public Pair getFormlist_1_email_1(){
			return this.formlist_1_email_1;
		}

		public void setFormlist_1_lookup_1(Pair formlist_1_lookup_1){
			this.formlist_1_lookup_1 = formlist_1_lookup_1;
		}
		public Pair getFormlist_1_lookup_1(){
			return this.formlist_1_lookup_1;
		}

		public void setFormlist_1_link_1(Pair formlist_1_link_1){
			this.formlist_1_link_1 = formlist_1_link_1;
		}
		public Pair getFormlist_1_link_1(){
			return this.formlist_1_link_1;
		}

		public void setFormlist_2_number_1(Pair formlist_2_number_1){
			this.formlist_2_number_1 = formlist_2_number_1;
		}
		public Pair getFormlist_2_number_1(){
			return this.formlist_2_number_1;
		}

		public void setFormlist_2_password_1(Pair formlist_2_password_1){
			this.formlist_2_password_1 = formlist_2_password_1;
		}
		public Pair getFormlist_2_password_1(){
			return this.formlist_2_password_1;
		}

		public void setFormlist_1_hidden_1(Pair formlist_1_hidden_1){
			this.formlist_1_hidden_1 = formlist_1_hidden_1;
		}
		public Pair getFormlist_1_hidden_1(){
			return this.formlist_1_hidden_1;
		}

	}
	public static class Formlist_2{
		private Pair formlist_2_id;
private Pair formlist_1_plaintext_1;
private Pair formlist_2_radio_1;
		private Pair formlist_2_radio_1_check;
private Pair formlist_2_range_1;
private Pair formlist_2_select_1;
private Pair formlist_2_text_1;
private Pair formlist_2_textarea_1;
private Pair formlist_2_time_1;
private Pair formlist_2_file_1;
private Pair formlist_2_virtualkeyboard_1;
		public void setFormlist_2_id(Pair formlist_2_id){
			this.formlist_2_id = formlist_2_id;
		}
		public Pair getFormlist_2_id(){
			return this.formlist_2_id;
		}
		public void setFormlist_1_plaintext_1(Pair formlist_1_plaintext_1){
			this.formlist_1_plaintext_1 = formlist_1_plaintext_1;
		}
		public Pair getFormlist_1_plaintext_1(){
			return this.formlist_1_plaintext_1;
		}

		public void setFormlist_2_radio_1(Pair formlist_2_radio_1){
			this.formlist_2_radio_1 = formlist_2_radio_1;
		}
		public Pair getFormlist_2_radio_1(){
			return this.formlist_2_radio_1;
		}
		
		public void setFormlist_2_radio_1_check(Pair formlist_2_radio_1_check){
			this.formlist_2_radio_1_check = formlist_2_radio_1_check;
		}
		public Pair getFormlist_2_radio_1_check(){
			return this.formlist_2_radio_1_check;
		}

		public void setFormlist_2_range_1(Pair formlist_2_range_1){
			this.formlist_2_range_1 = formlist_2_range_1;
		}
		public Pair getFormlist_2_range_1(){
			return this.formlist_2_range_1;
		}

		public void setFormlist_2_select_1(Pair formlist_2_select_1){
			this.formlist_2_select_1 = formlist_2_select_1;
		}
		public Pair getFormlist_2_select_1(){
			return this.formlist_2_select_1;
		}

		public void setFormlist_2_text_1(Pair formlist_2_text_1){
			this.formlist_2_text_1 = formlist_2_text_1;
		}
		public Pair getFormlist_2_text_1(){
			return this.formlist_2_text_1;
		}

		public void setFormlist_2_textarea_1(Pair formlist_2_textarea_1){
			this.formlist_2_textarea_1 = formlist_2_textarea_1;
		}
		public Pair getFormlist_2_textarea_1(){
			return this.formlist_2_textarea_1;
		}

		public void setFormlist_2_time_1(Pair formlist_2_time_1){
			this.formlist_2_time_1 = formlist_2_time_1;
		}
		public Pair getFormlist_2_time_1(){
			return this.formlist_2_time_1;
		}

		public void setFormlist_2_file_1(Pair formlist_2_file_1){
			this.formlist_2_file_1 = formlist_2_file_1;
		}
		public Pair getFormlist_2_file_1(){
			return this.formlist_2_file_1;
		}

		public void setFormlist_2_virtualkeyboard_1(Pair formlist_2_virtualkeyboard_1){
			this.formlist_2_virtualkeyboard_1 = formlist_2_virtualkeyboard_1;
		}
		public Pair getFormlist_2_virtualkeyboard_1(){
			return this.formlist_2_virtualkeyboard_1;
		}

	}

	public void loadFormlist_1(BaseQueryInterface query) {
		this.setFormlist_1(this.loadFormList(query,Formlist_1.class));
	}

	public void loadFormlist_2(BaseQueryInterface query) {
		this.setFormlist_2(this.loadFormList(query,Formlist_2.class));
	}

	public void loadSeparatorlist_1(BaseQueryInterface query) {
		this.setSeparatorlist_1(this.loadFormList(query,Separatorlist_1.class));
	}

	public void loadTable_1(BaseQueryInterface query) {
		this.setTable_1(this.loadTable(query,Table_1.class));
	}

	public void loadTable_2(BaseQueryInterface query) {
		this.setTable_2(this.loadTable(query,Table_2.class));
	}

}
