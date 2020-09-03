package nosi.webapps.catalogo_igrp.pages.home;

import nosi.core.gui.components.IGRPLink;
import nosi.core.webapp.Report;
import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

public class Home extends Model{		

	@RParam(rParamName = "p_paragraph_1_text")
	private String paragraph_1_text;

	@RParam(rParamName = "p_infopanel_1_title")
	private String infopanel_1_title;

	@RParam(rParamName = "p_infopanel_1_val")
	private String infopanel_1_val;

	@RParam(rParamName = "p_infopanel_1_url")
	private IGRPLink infopanel_1_url;
	@RParam(rParamName = "p_infopanel_1_url_desc")
	private String infopanel_1_url_desc;

	@RParam(rParamName = "p_infopanel_1_bg")
	private String infopanel_1_bg;

	@RParam(rParamName = "p_infopanel_1_icn")
	private String infopanel_1_icn;

	@RParam(rParamName = "p_infopanel_2_title")
	private String infopanel_2_title;

	@RParam(rParamName = "p_infopanel_2_val")
	private String infopanel_2_val;

	@RParam(rParamName = "p_infopanel_2_url")
	private IGRPLink infopanel_2_url;
	@RParam(rParamName = "p_infopanel_2_url_desc")
	private String infopanel_2_url_desc;

	@RParam(rParamName = "p_infopanel_2_bg")
	private String infopanel_2_bg;

	@RParam(rParamName = "p_infopanel_2_icn")
	private String infopanel_2_icn;

	@RParam(rParamName = "p_img")
	private String img;

	@RParam(rParamName = "p_paragraph_3_text")
	private String paragraph_3_text;

	@RParam(rParamName = "p_paragraph_2_text")
	private String paragraph_2_text;

	@RParam(rParamName = "p_infopanel_3_title")
	private String infopanel_3_title;

	@RParam(rParamName = "p_infopanel_3_val")
	private String infopanel_3_val;

	@RParam(rParamName = "p_infopanel_3_url")
	private IGRPLink infopanel_3_url;
	@RParam(rParamName = "p_infopanel_3_url_desc")
	private String infopanel_3_url_desc;

	@RParam(rParamName = "p_infopanel_3_bg")
	private String infopanel_3_bg;

	@RParam(rParamName = "p_infopanel_3_icn")
	private String infopanel_3_icn;

	@RParam(rParamName = "p_img_1")
	private String img_1;

	@RParam(rParamName = "p_paragraph_4_text")
	private String paragraph_4_text;
	
	public void setParagraph_1_text(String paragraph_1_text){
		this.paragraph_1_text = paragraph_1_text;
	}
	public String getParagraph_1_text(){
		return this.paragraph_1_text;
	}
	
	public void setInfopanel_1_title(String infopanel_1_title){
		this.infopanel_1_title = infopanel_1_title;
	}
	public String getInfopanel_1_title(){
		return this.infopanel_1_title;
	}
	
	public void setInfopanel_1_val(String infopanel_1_val){
		this.infopanel_1_val = infopanel_1_val;
	}
	public String getInfopanel_1_val(){
		return this.infopanel_1_val;
	}
	
	public IGRPLink setInfopanel_1_url(String app,String page,String action){
		this.infopanel_1_url = new IGRPLink(app,page,action);
		return this.infopanel_1_url;
	}
	public IGRPLink getInfopanel_1_url(){
		return this.infopanel_1_url;
	}
	public void setInfopanel_1_url_desc(String infopanel_1_url_desc){
		this.infopanel_1_url_desc = infopanel_1_url_desc;
	}
	public String getInfopanel_1_url_desc(){
		return this.infopanel_1_url_desc;
	}
	public IGRPLink setInfopanel_1_url(String link){
		this.infopanel_1_url = new IGRPLink(link);
		return this.infopanel_1_url;
	}
	public IGRPLink setInfopanel_1_url(Report link){
		this.infopanel_1_url = new IGRPLink(link);
		return this.infopanel_1_url;
	}
	
	public void setInfopanel_1_bg(String infopanel_1_bg){
		this.infopanel_1_bg = infopanel_1_bg;
	}
	public String getInfopanel_1_bg(){
		return this.infopanel_1_bg;
	}
	
	public void setInfopanel_1_icn(String infopanel_1_icn){
		this.infopanel_1_icn = infopanel_1_icn;
	}
	public String getInfopanel_1_icn(){
		return this.infopanel_1_icn;
	}
	
	public void setInfopanel_2_title(String infopanel_2_title){
		this.infopanel_2_title = infopanel_2_title;
	}
	public String getInfopanel_2_title(){
		return this.infopanel_2_title;
	}
	
	public void setInfopanel_2_val(String infopanel_2_val){
		this.infopanel_2_val = infopanel_2_val;
	}
	public String getInfopanel_2_val(){
		return this.infopanel_2_val;
	}
	
	public IGRPLink setInfopanel_2_url(String app,String page,String action){
		this.infopanel_2_url = new IGRPLink(app,page,action);
		return this.infopanel_2_url;
	}
	public IGRPLink getInfopanel_2_url(){
		return this.infopanel_2_url;
	}
	public void setInfopanel_2_url_desc(String infopanel_2_url_desc){
		this.infopanel_2_url_desc = infopanel_2_url_desc;
	}
	public String getInfopanel_2_url_desc(){
		return this.infopanel_2_url_desc;
	}
	public IGRPLink setInfopanel_2_url(String link){
		this.infopanel_2_url = new IGRPLink(link);
		return this.infopanel_2_url;
	}
	public IGRPLink setInfopanel_2_url(Report link){
		this.infopanel_2_url = new IGRPLink(link);
		return this.infopanel_2_url;
	}
	
	public void setInfopanel_2_bg(String infopanel_2_bg){
		this.infopanel_2_bg = infopanel_2_bg;
	}
	public String getInfopanel_2_bg(){
		return this.infopanel_2_bg;
	}
	
	public void setInfopanel_2_icn(String infopanel_2_icn){
		this.infopanel_2_icn = infopanel_2_icn;
	}
	public String getInfopanel_2_icn(){
		return this.infopanel_2_icn;
	}
	
	public void setImg(String img){
		this.img = img;
	}
	public String getImg(){
		return this.img;
	}
	
	public void setParagraph_3_text(String paragraph_3_text){
		this.paragraph_3_text = paragraph_3_text;
	}
	public String getParagraph_3_text(){
		return this.paragraph_3_text;
	}
	
	public void setParagraph_2_text(String paragraph_2_text){
		this.paragraph_2_text = paragraph_2_text;
	}
	public String getParagraph_2_text(){
		return this.paragraph_2_text;
	}
	
	public void setInfopanel_3_title(String infopanel_3_title){
		this.infopanel_3_title = infopanel_3_title;
	}
	public String getInfopanel_3_title(){
		return this.infopanel_3_title;
	}
	
	public void setInfopanel_3_val(String infopanel_3_val){
		this.infopanel_3_val = infopanel_3_val;
	}
	public String getInfopanel_3_val(){
		return this.infopanel_3_val;
	}
	
	public IGRPLink setInfopanel_3_url(String app,String page,String action){
		this.infopanel_3_url = new IGRPLink(app,page,action);
		return this.infopanel_3_url;
	}
	public IGRPLink getInfopanel_3_url(){
		return this.infopanel_3_url;
	}
	public void setInfopanel_3_url_desc(String infopanel_3_url_desc){
		this.infopanel_3_url_desc = infopanel_3_url_desc;
	}
	public String getInfopanel_3_url_desc(){
		return this.infopanel_3_url_desc;
	}
	public IGRPLink setInfopanel_3_url(String link){
		this.infopanel_3_url = new IGRPLink(link);
		return this.infopanel_3_url;
	}
	public IGRPLink setInfopanel_3_url(Report link){
		this.infopanel_3_url = new IGRPLink(link);
		return this.infopanel_3_url;
	}
	
	public void setInfopanel_3_bg(String infopanel_3_bg){
		this.infopanel_3_bg = infopanel_3_bg;
	}
	public String getInfopanel_3_bg(){
		return this.infopanel_3_bg;
	}
	
	public void setInfopanel_3_icn(String infopanel_3_icn){
		this.infopanel_3_icn = infopanel_3_icn;
	}
	public String getInfopanel_3_icn(){
		return this.infopanel_3_icn;
	}
	
	public void setImg_1(String img_1){
		this.img_1 = img_1;
	}
	public String getImg_1(){
		return this.img_1;
	}
	
	public void setParagraph_4_text(String paragraph_4_text){
		this.paragraph_4_text = paragraph_4_text;
	}
	public String getParagraph_4_text(){
		return this.paragraph_4_text;
	}



}
