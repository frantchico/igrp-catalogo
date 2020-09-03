package nosi.webapps.catalogo_igrp.pages.components_a_solo;

import nosi.core.gui.components.IGRPLink;
import nosi.core.webapp.Report;
import nosi.core.gui.components.IGRPTable;
import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import java.util.ArrayList;
import java.util.List;
import nosi.core.gui.components.IGRPChart3D;

public class Components_a_solo extends Model{		

	@RParam(rParamName = "p_circlestatbox_1_title")
	private String circlestatbox_1_title;

	@RParam(rParamName = "p_circlestatbox_1_lbl")
	private String circlestatbox_1_lbl;

	@RParam(rParamName = "p_circlestatbox_1_val")
	private String circlestatbox_1_val;

	@RParam(rParamName = "p_circlestatbox_1_desc")
	private String circlestatbox_1_desc;

	@RParam(rParamName = "p_circlestatbox_1_url")
	private String circlestatbox_1_url;

	@RParam(rParamName = "p_circlestatbox_1_bg")
	private String circlestatbox_1_bg;

	@RParam(rParamName = "p_quickbuttonbox_1_title")
	private String quickbuttonbox_1_title;

	@RParam(rParamName = "p_quickbuttonbox_1_val")
	private String quickbuttonbox_1_val;

	@RParam(rParamName = "p_quickbuttonbox_1_url")
	private IGRPLink quickbuttonbox_1_url;
	@RParam(rParamName = "p_quickbuttonbox_1_url_desc")
	private String quickbuttonbox_1_url_desc;

	@RParam(rParamName = "p_quickbuttonbox_1_bg")
	private String quickbuttonbox_1_bg;

	@RParam(rParamName = "p_quickbuttonbox_1_icn")
	private String quickbuttonbox_1_icn;

	@RParam(rParamName = "p_smallbox_1_title")
	private String smallbox_1_title;

	@RParam(rParamName = "p_smallbox_1_val")
	private String smallbox_1_val;

	@RParam(rParamName = "p_smallbox_1_url")
	private String smallbox_1_url;

	@RParam(rParamName = "p_smallbox_1_lbl")
	private String smallbox_1_lbl;

	@RParam(rParamName = "p_smallbox_1_bg")
	private String smallbox_1_bg;

	@RParam(rParamName = "p_smallbox_1_icn")
	private String smallbox_1_icn;

	@RParam(rParamName = "p_calendar_1_lang")
	private String calendar_1_lang;

	@RParam(rParamName = "p_calendar_1_add")
	private IGRPLink calendar_1_add;
	@RParam(rParamName = "p_calendar_1_add_desc")
	private String calendar_1_add_desc;

	@RParam(rParamName = "p_calendar_1_view")
	private String calendar_1_view;

	@RParam(rParamName = "p_calendar_1_date")
	private String calendar_1_date;

	@RParam(rParamName = "p_carousel_1_label")
	private String carousel_1_label;

	@RParam(rParamName = "p_carousel_1_img")
	private String carousel_1_img;

	@RParam(rParamName = "p_iframe_1_src")
	private String iframe_1_src;

	@RParam(rParamName = "p_sectionheader_1_text")
	private String sectionheader_1_text;

	@RParam(rParamName = "p_paragraph_1_text")
	private String paragraph_1_text;

	@RParam(rParamName = "p_video_1_text")
	private String video_1_text;

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

	@RParam(rParamName = "p_statbox_1_title")
	private String statbox_1_title;

	@RParam(rParamName = "p_statbox_1_val")
	private String statbox_1_val;

	@RParam(rParamName = "p_statbox_1_txt")
	private String statbox_1_txt;

	@RParam(rParamName = "p_statbox_1_url")
	private String statbox_1_url;

	@RParam(rParamName = "p_statbox_1_bg")
	private String statbox_1_bg;

	@RParam(rParamName = "p_statbox_1_icn")
	private String statbox_1_icn;

	@RParam(rParamName = "")
	private String timeline_1_icon;
	@RParam(rParamName = "_uuid")
	private String timeline_1_icon_uuid;

	@RParam(rParamName = "")
	private String timeline_1_hd;

	@RParam(rParamName = "")
	private String timeline_1_date;

	@RParam(rParamName = "")
	private String timeline_1_text;

	@RParam(rParamName = "")
	private IGRPLink timeline_1_btn;
	@RParam(rParamName = "_desc")
	private String timeline_1_btn_desc;

	@RParam(rParamName = "p_mapchart_1_basemap")
	private String mapchart_1_basemap;

	@RParam(rParamName = "p_mapchart_1_data")
	private String mapchart_1_data;

	@RParam(rParamName = "p_mapchart_1_config")
	private String mapchart_1_config;

	@RParam(rParamName = "p_mapchart_1_dt_label")
	private String mapchart_1_dt_label;

	@RParam(rParamName = "p_fingerprint_1_link")
	private IGRPLink fingerprint_1_link;
	@RParam(rParamName = "p_fingerprint_1_link_desc")
	private String fingerprint_1_link_desc;

	@RParam(rParamName = "p_fingerprint_1_photo")
	private IGRPLink fingerprint_1_photo;
	@RParam(rParamName = "p_fingerprint_1_photo_desc")
	private String fingerprint_1_photo_desc;

	@RParam(rParamName = "p_fingerprint_1_fingerright")
	private IGRPLink fingerprint_1_fingerright;
	@RParam(rParamName = "p_fingerprint_1_fingerright_desc")
	private String fingerprint_1_fingerright_desc;

	@RParam(rParamName = "p_fingerprint_1_fingerleft")
	private IGRPLink fingerprint_1_fingerleft;
	@RParam(rParamName = "p_fingerprint_1_fingerleft_desc")
	private String fingerprint_1_fingerleft_desc;

	@RParam(rParamName = "p_fingerprint_1_signature")
	private IGRPLink fingerprint_1_signature;
	@RParam(rParamName = "p_fingerprint_1_signature_desc")
	private String fingerprint_1_signature_desc;

	@RParam(rParamName = "p_fingerprint_1_self")
	private IGRPLink fingerprint_1_self;
	@RParam(rParamName = "p_fingerprint_1_self_desc")
	private String fingerprint_1_self_desc;

	@RParam(rParamName = "p_fingerprint_1_start")
	private IGRPLink fingerprint_1_start;
	@RParam(rParamName = "p_fingerprint_1_start_desc")
	private String fingerprint_1_start_desc;

	@RParam(rParamName = "p_number_process")
	private Integer fingerprint_1_process;

	@RParam(rParamName = "p_map_os_1_data")
	private String map_os_1_data;
	
	private List<Calendar_1_events> calendar_1_events = new ArrayList<>();	
	public void setCalendar_1_events(List<Calendar_1_events> calendar_1_events){
		this.calendar_1_events = calendar_1_events;
	}
	public List<Calendar_1_events> getCalendar_1_events(){
		return this.calendar_1_events;
	}

	
	private List<Carousel_1> carousel_1 = new ArrayList<>();	
	public void setCarousel_1(List<Carousel_1> carousel_1){
		this.carousel_1 = carousel_1;
	}
	public List<Carousel_1> getCarousel_1(){
		return this.carousel_1;
	}

	
	private List<Chart_1> chart_1 = new ArrayList<>();	
	public void setChart_1(List<Chart_1> chart_1){
		this.chart_1 = chart_1;
	}
	public List<Chart_1> getChart_1(){
		return this.chart_1;
	}

	
	private List<Leafletmap_1_markers> leafletmap_1_markers = new ArrayList<>();	
	public void setLeafletmap_1_markers(List<Leafletmap_1_markers> leafletmap_1_markers){
		this.leafletmap_1_markers = leafletmap_1_markers;
	}
	public List<Leafletmap_1_markers> getLeafletmap_1_markers(){
		return this.leafletmap_1_markers;
	}

	
	private List<Timeline_1> timeline_1 = new ArrayList<>();	
	public void setTimeline_1(List<Timeline_1> timeline_1){
		this.timeline_1 = timeline_1;
	}
	public List<Timeline_1> getTimeline_1(){
		return this.timeline_1;
	}

	
	public void setCirclestatbox_1_title(String circlestatbox_1_title){
		this.circlestatbox_1_title = circlestatbox_1_title;
	}
	public String getCirclestatbox_1_title(){
		return this.circlestatbox_1_title;
	}
	
	public void setCirclestatbox_1_lbl(String circlestatbox_1_lbl){
		this.circlestatbox_1_lbl = circlestatbox_1_lbl;
	}
	public String getCirclestatbox_1_lbl(){
		return this.circlestatbox_1_lbl;
	}
	
	public void setCirclestatbox_1_val(String circlestatbox_1_val){
		this.circlestatbox_1_val = circlestatbox_1_val;
	}
	public String getCirclestatbox_1_val(){
		return this.circlestatbox_1_val;
	}
	
	public void setCirclestatbox_1_desc(String circlestatbox_1_desc){
		this.circlestatbox_1_desc = circlestatbox_1_desc;
	}
	public String getCirclestatbox_1_desc(){
		return this.circlestatbox_1_desc;
	}
	
	public void setCirclestatbox_1_url(String circlestatbox_1_url){
		this.circlestatbox_1_url = circlestatbox_1_url;
	}
	public String getCirclestatbox_1_url(){
		return this.circlestatbox_1_url;
	}
	
	public void setCirclestatbox_1_bg(String circlestatbox_1_bg){
		this.circlestatbox_1_bg = circlestatbox_1_bg;
	}
	public String getCirclestatbox_1_bg(){
		return this.circlestatbox_1_bg;
	}
	
	public void setQuickbuttonbox_1_title(String quickbuttonbox_1_title){
		this.quickbuttonbox_1_title = quickbuttonbox_1_title;
	}
	public String getQuickbuttonbox_1_title(){
		return this.quickbuttonbox_1_title;
	}
	
	public void setQuickbuttonbox_1_val(String quickbuttonbox_1_val){
		this.quickbuttonbox_1_val = quickbuttonbox_1_val;
	}
	public String getQuickbuttonbox_1_val(){
		return this.quickbuttonbox_1_val;
	}
	
	public IGRPLink setQuickbuttonbox_1_url(String app,String page,String action){
		this.quickbuttonbox_1_url = new IGRPLink(app,page,action);
		return this.quickbuttonbox_1_url;
	}
	public IGRPLink getQuickbuttonbox_1_url(){
		return this.quickbuttonbox_1_url;
	}
	public void setQuickbuttonbox_1_url_desc(String quickbuttonbox_1_url_desc){
		this.quickbuttonbox_1_url_desc = quickbuttonbox_1_url_desc;
	}
	public String getQuickbuttonbox_1_url_desc(){
		return this.quickbuttonbox_1_url_desc;
	}
	public IGRPLink setQuickbuttonbox_1_url(String link){
		this.quickbuttonbox_1_url = new IGRPLink(link);
		return this.quickbuttonbox_1_url;
	}
	public IGRPLink setQuickbuttonbox_1_url(Report link){
		this.quickbuttonbox_1_url = new IGRPLink(link);
		return this.quickbuttonbox_1_url;
	}
	
	public void setQuickbuttonbox_1_bg(String quickbuttonbox_1_bg){
		this.quickbuttonbox_1_bg = quickbuttonbox_1_bg;
	}
	public String getQuickbuttonbox_1_bg(){
		return this.quickbuttonbox_1_bg;
	}
	
	public void setQuickbuttonbox_1_icn(String quickbuttonbox_1_icn){
		this.quickbuttonbox_1_icn = quickbuttonbox_1_icn;
	}
	public String getQuickbuttonbox_1_icn(){
		return this.quickbuttonbox_1_icn;
	}
	
	public void setSmallbox_1_title(String smallbox_1_title){
		this.smallbox_1_title = smallbox_1_title;
	}
	public String getSmallbox_1_title(){
		return this.smallbox_1_title;
	}
	
	public void setSmallbox_1_val(String smallbox_1_val){
		this.smallbox_1_val = smallbox_1_val;
	}
	public String getSmallbox_1_val(){
		return this.smallbox_1_val;
	}
	
	public void setSmallbox_1_url(String smallbox_1_url){
		this.smallbox_1_url = smallbox_1_url;
	}
	public String getSmallbox_1_url(){
		return this.smallbox_1_url;
	}
	
	public void setSmallbox_1_lbl(String smallbox_1_lbl){
		this.smallbox_1_lbl = smallbox_1_lbl;
	}
	public String getSmallbox_1_lbl(){
		return this.smallbox_1_lbl;
	}
	
	public void setSmallbox_1_bg(String smallbox_1_bg){
		this.smallbox_1_bg = smallbox_1_bg;
	}
	public String getSmallbox_1_bg(){
		return this.smallbox_1_bg;
	}
	
	public void setSmallbox_1_icn(String smallbox_1_icn){
		this.smallbox_1_icn = smallbox_1_icn;
	}
	public String getSmallbox_1_icn(){
		return this.smallbox_1_icn;
	}
	
	public void setCalendar_1_lang(String calendar_1_lang){
		this.calendar_1_lang = calendar_1_lang;
	}
	public String getCalendar_1_lang(){
		return this.calendar_1_lang;
	}
	
	public IGRPLink setCalendar_1_add(String app,String page,String action){
		this.calendar_1_add = new IGRPLink(app,page,action);
		return this.calendar_1_add;
	}
	public IGRPLink getCalendar_1_add(){
		return this.calendar_1_add;
	}
	public void setCalendar_1_add_desc(String calendar_1_add_desc){
		this.calendar_1_add_desc = calendar_1_add_desc;
	}
	public String getCalendar_1_add_desc(){
		return this.calendar_1_add_desc;
	}
	public IGRPLink setCalendar_1_add(String link){
		this.calendar_1_add = new IGRPLink(link);
		return this.calendar_1_add;
	}
	public IGRPLink setCalendar_1_add(Report link){
		this.calendar_1_add = new IGRPLink(link);
		return this.calendar_1_add;
	}
	
	public void setCalendar_1_view(String calendar_1_view){
		this.calendar_1_view = calendar_1_view;
	}
	public String getCalendar_1_view(){
		return this.calendar_1_view;
	}
	
	public void setCalendar_1_date(String calendar_1_date){
		this.calendar_1_date = calendar_1_date;
	}
	public String getCalendar_1_date(){
		return this.calendar_1_date;
	}
	
	public void setCarousel_1_label(String carousel_1_label){
		this.carousel_1_label = carousel_1_label;
	}
	public String getCarousel_1_label(){
		return this.carousel_1_label;
	}
	
	public void setCarousel_1_img(String carousel_1_img){
		this.carousel_1_img = carousel_1_img;
	}
	public String getCarousel_1_img(){
		return this.carousel_1_img;
	}
	
	public void setIframe_1_src(String iframe_1_src){
		this.iframe_1_src = iframe_1_src;
	}
	public String getIframe_1_src(){
		return this.iframe_1_src;
	}
	
	public void setSectionheader_1_text(String sectionheader_1_text){
		this.sectionheader_1_text = sectionheader_1_text;
	}
	public String getSectionheader_1_text(){
		return this.sectionheader_1_text;
	}
	
	public void setParagraph_1_text(String paragraph_1_text){
		this.paragraph_1_text = paragraph_1_text;
	}
	public String getParagraph_1_text(){
		return this.paragraph_1_text;
	}
	
	public void setVideo_1_text(String video_1_text){
		this.video_1_text = video_1_text;
	}
	public String getVideo_1_text(){
		return this.video_1_text;
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
	
	public void setStatbox_1_title(String statbox_1_title){
		this.statbox_1_title = statbox_1_title;
	}
	public String getStatbox_1_title(){
		return this.statbox_1_title;
	}
	
	public void setStatbox_1_val(String statbox_1_val){
		this.statbox_1_val = statbox_1_val;
	}
	public String getStatbox_1_val(){
		return this.statbox_1_val;
	}
	
	public void setStatbox_1_txt(String statbox_1_txt){
		this.statbox_1_txt = statbox_1_txt;
	}
	public String getStatbox_1_txt(){
		return this.statbox_1_txt;
	}
	
	public void setStatbox_1_url(String statbox_1_url){
		this.statbox_1_url = statbox_1_url;
	}
	public String getStatbox_1_url(){
		return this.statbox_1_url;
	}
	
	public void setStatbox_1_bg(String statbox_1_bg){
		this.statbox_1_bg = statbox_1_bg;
	}
	public String getStatbox_1_bg(){
		return this.statbox_1_bg;
	}
	
	public void setStatbox_1_icn(String statbox_1_icn){
		this.statbox_1_icn = statbox_1_icn;
	}
	public String getStatbox_1_icn(){
		return this.statbox_1_icn;
	}
	
	public void setTimeline_1_icon(String timeline_1_icon){
		this.timeline_1_icon = timeline_1_icon;
	}
	public String getTimeline_1_icon(){
		return this.timeline_1_icon;
	}
	public void setTimeline_1_icon_uuid(String timeline_1_icon_uuid){
		this.timeline_1_icon_uuid = timeline_1_icon_uuid;
	}
	public String getTimeline_1_icon_uuid(){
		return this.timeline_1_icon_uuid;
	}
	
	public void setTimeline_1_hd(String timeline_1_hd){
		this.timeline_1_hd = timeline_1_hd;
	}
	public String getTimeline_1_hd(){
		return this.timeline_1_hd;
	}
	
	public void setTimeline_1_date(String timeline_1_date){
		this.timeline_1_date = timeline_1_date;
	}
	public String getTimeline_1_date(){
		return this.timeline_1_date;
	}
	
	public void setTimeline_1_text(String timeline_1_text){
		this.timeline_1_text = timeline_1_text;
	}
	public String getTimeline_1_text(){
		return this.timeline_1_text;
	}
	
	public IGRPLink setTimeline_1_btn(String app,String page,String action){
		this.timeline_1_btn = new IGRPLink(app,page,action);
		return this.timeline_1_btn;
	}
	public IGRPLink getTimeline_1_btn(){
		return this.timeline_1_btn;
	}
	public void setTimeline_1_btn_desc(String timeline_1_btn_desc){
		this.timeline_1_btn_desc = timeline_1_btn_desc;
	}
	public String getTimeline_1_btn_desc(){
		return this.timeline_1_btn_desc;
	}
	public IGRPLink setTimeline_1_btn(String link){
		this.timeline_1_btn = new IGRPLink(link);
		return this.timeline_1_btn;
	}
	public IGRPLink setTimeline_1_btn(Report link){
		this.timeline_1_btn = new IGRPLink(link);
		return this.timeline_1_btn;
	}
	
	public void setMapchart_1_basemap(String mapchart_1_basemap){
		this.mapchart_1_basemap = mapchart_1_basemap;
	}
	public String getMapchart_1_basemap(){
		return this.mapchart_1_basemap;
	}
	
	public void setMapchart_1_data(String mapchart_1_data){
		this.mapchart_1_data = mapchart_1_data;
	}
	public String getMapchart_1_data(){
		return this.mapchart_1_data;
	}
	
	public void setMapchart_1_config(String mapchart_1_config){
		this.mapchart_1_config = mapchart_1_config;
	}
	public String getMapchart_1_config(){
		return this.mapchart_1_config;
	}
	
	public void setMapchart_1_dt_label(String mapchart_1_dt_label){
		this.mapchart_1_dt_label = mapchart_1_dt_label;
	}
	public String getMapchart_1_dt_label(){
		return this.mapchart_1_dt_label;
	}
	
	public IGRPLink setFingerprint_1_link(String app,String page,String action){
		this.fingerprint_1_link = new IGRPLink(app,page,action);
		return this.fingerprint_1_link;
	}
	public IGRPLink getFingerprint_1_link(){
		return this.fingerprint_1_link;
	}
	public void setFingerprint_1_link_desc(String fingerprint_1_link_desc){
		this.fingerprint_1_link_desc = fingerprint_1_link_desc;
	}
	public String getFingerprint_1_link_desc(){
		return this.fingerprint_1_link_desc;
	}
	public IGRPLink setFingerprint_1_link(String link){
		this.fingerprint_1_link = new IGRPLink(link);
		return this.fingerprint_1_link;
	}
	public IGRPLink setFingerprint_1_link(Report link){
		this.fingerprint_1_link = new IGRPLink(link);
		return this.fingerprint_1_link;
	}
	
	public IGRPLink setFingerprint_1_photo(String app,String page,String action){
		this.fingerprint_1_photo = new IGRPLink(app,page,action);
		return this.fingerprint_1_photo;
	}
	public IGRPLink getFingerprint_1_photo(){
		return this.fingerprint_1_photo;
	}
	public void setFingerprint_1_photo_desc(String fingerprint_1_photo_desc){
		this.fingerprint_1_photo_desc = fingerprint_1_photo_desc;
	}
	public String getFingerprint_1_photo_desc(){
		return this.fingerprint_1_photo_desc;
	}
	public IGRPLink setFingerprint_1_photo(String link){
		this.fingerprint_1_photo = new IGRPLink(link);
		return this.fingerprint_1_photo;
	}
	public IGRPLink setFingerprint_1_photo(Report link){
		this.fingerprint_1_photo = new IGRPLink(link);
		return this.fingerprint_1_photo;
	}
	
	public IGRPLink setFingerprint_1_fingerright(String app,String page,String action){
		this.fingerprint_1_fingerright = new IGRPLink(app,page,action);
		return this.fingerprint_1_fingerright;
	}
	public IGRPLink getFingerprint_1_fingerright(){
		return this.fingerprint_1_fingerright;
	}
	public void setFingerprint_1_fingerright_desc(String fingerprint_1_fingerright_desc){
		this.fingerprint_1_fingerright_desc = fingerprint_1_fingerright_desc;
	}
	public String getFingerprint_1_fingerright_desc(){
		return this.fingerprint_1_fingerright_desc;
	}
	public IGRPLink setFingerprint_1_fingerright(String link){
		this.fingerprint_1_fingerright = new IGRPLink(link);
		return this.fingerprint_1_fingerright;
	}
	public IGRPLink setFingerprint_1_fingerright(Report link){
		this.fingerprint_1_fingerright = new IGRPLink(link);
		return this.fingerprint_1_fingerright;
	}
	
	public IGRPLink setFingerprint_1_fingerleft(String app,String page,String action){
		this.fingerprint_1_fingerleft = new IGRPLink(app,page,action);
		return this.fingerprint_1_fingerleft;
	}
	public IGRPLink getFingerprint_1_fingerleft(){
		return this.fingerprint_1_fingerleft;
	}
	public void setFingerprint_1_fingerleft_desc(String fingerprint_1_fingerleft_desc){
		this.fingerprint_1_fingerleft_desc = fingerprint_1_fingerleft_desc;
	}
	public String getFingerprint_1_fingerleft_desc(){
		return this.fingerprint_1_fingerleft_desc;
	}
	public IGRPLink setFingerprint_1_fingerleft(String link){
		this.fingerprint_1_fingerleft = new IGRPLink(link);
		return this.fingerprint_1_fingerleft;
	}
	public IGRPLink setFingerprint_1_fingerleft(Report link){
		this.fingerprint_1_fingerleft = new IGRPLink(link);
		return this.fingerprint_1_fingerleft;
	}
	
	public IGRPLink setFingerprint_1_signature(String app,String page,String action){
		this.fingerprint_1_signature = new IGRPLink(app,page,action);
		return this.fingerprint_1_signature;
	}
	public IGRPLink getFingerprint_1_signature(){
		return this.fingerprint_1_signature;
	}
	public void setFingerprint_1_signature_desc(String fingerprint_1_signature_desc){
		this.fingerprint_1_signature_desc = fingerprint_1_signature_desc;
	}
	public String getFingerprint_1_signature_desc(){
		return this.fingerprint_1_signature_desc;
	}
	public IGRPLink setFingerprint_1_signature(String link){
		this.fingerprint_1_signature = new IGRPLink(link);
		return this.fingerprint_1_signature;
	}
	public IGRPLink setFingerprint_1_signature(Report link){
		this.fingerprint_1_signature = new IGRPLink(link);
		return this.fingerprint_1_signature;
	}
	
	public IGRPLink setFingerprint_1_self(String app,String page,String action){
		this.fingerprint_1_self = new IGRPLink(app,page,action);
		return this.fingerprint_1_self;
	}
	public IGRPLink getFingerprint_1_self(){
		return this.fingerprint_1_self;
	}
	public void setFingerprint_1_self_desc(String fingerprint_1_self_desc){
		this.fingerprint_1_self_desc = fingerprint_1_self_desc;
	}
	public String getFingerprint_1_self_desc(){
		return this.fingerprint_1_self_desc;
	}
	public IGRPLink setFingerprint_1_self(String link){
		this.fingerprint_1_self = new IGRPLink(link);
		return this.fingerprint_1_self;
	}
	public IGRPLink setFingerprint_1_self(Report link){
		this.fingerprint_1_self = new IGRPLink(link);
		return this.fingerprint_1_self;
	}
	
	public IGRPLink setFingerprint_1_start(String app,String page,String action){
		this.fingerprint_1_start = new IGRPLink(app,page,action);
		return this.fingerprint_1_start;
	}
	public IGRPLink getFingerprint_1_start(){
		return this.fingerprint_1_start;
	}
	public void setFingerprint_1_start_desc(String fingerprint_1_start_desc){
		this.fingerprint_1_start_desc = fingerprint_1_start_desc;
	}
	public String getFingerprint_1_start_desc(){
		return this.fingerprint_1_start_desc;
	}
	public IGRPLink setFingerprint_1_start(String link){
		this.fingerprint_1_start = new IGRPLink(link);
		return this.fingerprint_1_start;
	}
	public IGRPLink setFingerprint_1_start(Report link){
		this.fingerprint_1_start = new IGRPLink(link);
		return this.fingerprint_1_start;
	}
	
	public void setFingerprint_1_process(Integer fingerprint_1_process){
		this.fingerprint_1_process = fingerprint_1_process;
	}
	public Integer getFingerprint_1_process(){
		return this.fingerprint_1_process;
	}
	
	public void setMap_os_1_data(String map_os_1_data){
		this.map_os_1_data = map_os_1_data;
	}
	public String getMap_os_1_data(){
		return this.map_os_1_data;
	}


	public static class Calendar_1_events extends IGRPTable.Table{
		private String calendar_1_title;
		private String calendar_1_description;
		private String calendar_1_id;
		private String calendar_1_start;
		private String calendar_1_end;
		private String calendar_1_color;
		private String calendar_1_allday;
		public void setCalendar_1_title(String calendar_1_title){
			this.calendar_1_title = calendar_1_title;
		}
		public String getCalendar_1_title(){
			return this.calendar_1_title;
		}

		public void setCalendar_1_description(String calendar_1_description){
			this.calendar_1_description = calendar_1_description;
		}
		public String getCalendar_1_description(){
			return this.calendar_1_description;
		}

		public void setCalendar_1_id(String calendar_1_id){
			this.calendar_1_id = calendar_1_id;
		}
		public String getCalendar_1_id(){
			return this.calendar_1_id;
		}

		public void setCalendar_1_start(String calendar_1_start){
			this.calendar_1_start = calendar_1_start;
		}
		public String getCalendar_1_start(){
			return this.calendar_1_start;
		}

		public void setCalendar_1_end(String calendar_1_end){
			this.calendar_1_end = calendar_1_end;
		}
		public String getCalendar_1_end(){
			return this.calendar_1_end;
		}

		public void setCalendar_1_color(String calendar_1_color){
			this.calendar_1_color = calendar_1_color;
		}
		public String getCalendar_1_color(){
			return this.calendar_1_color;
		}

		public void setCalendar_1_allday(String calendar_1_allday){
			this.calendar_1_allday = calendar_1_allday;
		}
		public String getCalendar_1_allday(){
			return this.calendar_1_allday;
		}

	}
	public static class Carousel_1 extends IGRPTable.Table{
		private String carousel_1_label;
		private String carousel_1_img;
		public void setCarousel_1_label(String carousel_1_label){
			this.carousel_1_label = carousel_1_label;
		}
		public String getCarousel_1_label(){
			return this.carousel_1_label;
		}

		public void setCarousel_1_img(String carousel_1_img){
			this.carousel_1_img = carousel_1_img;
		}
		public String getCarousel_1_img(){
			return this.carousel_1_img;
		}

	}
	public static class Leafletmap_1_markers extends IGRPTable.Table{
		private String leafletmap_1_title;
		private String leafletmap_1_info;
		private String leafletmap_1_lat;
		private String leafletmap_1_lng;
		private String leafletmap_1_icon;
		public void setLeafletmap_1_title(String leafletmap_1_title){
			this.leafletmap_1_title = leafletmap_1_title;
		}
		public String getLeafletmap_1_title(){
			return this.leafletmap_1_title;
		}

		public void setLeafletmap_1_info(String leafletmap_1_info){
			this.leafletmap_1_info = leafletmap_1_info;
		}
		public String getLeafletmap_1_info(){
			return this.leafletmap_1_info;
		}

		public void setLeafletmap_1_lat(String leafletmap_1_lat){
			this.leafletmap_1_lat = leafletmap_1_lat;
		}
		public String getLeafletmap_1_lat(){
			return this.leafletmap_1_lat;
		}

		public void setLeafletmap_1_lng(String leafletmap_1_lng){
			this.leafletmap_1_lng = leafletmap_1_lng;
		}
		public String getLeafletmap_1_lng(){
			return this.leafletmap_1_lng;
		}

		public void setLeafletmap_1_icon(String leafletmap_1_icon){
			this.leafletmap_1_icon = leafletmap_1_icon;
		}
		public String getLeafletmap_1_icon(){
			return this.leafletmap_1_icon;
		}

	}
	public static class Timeline_1 extends IGRPTable.Table{
		private String timeline_1_icon;
		private String timeline_1_icon_uuid;
		private String timeline_1_hd;
		private String timeline_1_date;
		private String timeline_1_text;
		private IGRPLink timeline_1_btn;
		private String timeline_1_btn_desc= "Button";
		public void setTimeline_1_icon(String timeline_1_icon){
			this.timeline_1_icon = timeline_1_icon;
		}
		public String getTimeline_1_icon(){
			return this.timeline_1_icon;
		}
		public void setTimeline_1_icon_uuid(String timeline_1_icon_uuid){
			this.timeline_1_icon_uuid = timeline_1_icon_uuid;
		}
		public String getTimeline_1_icon_uuid(){
			return this.timeline_1_icon_uuid;
		}

		public void setTimeline_1_hd(String timeline_1_hd){
			this.timeline_1_hd = timeline_1_hd;
		}
		public String getTimeline_1_hd(){
			return this.timeline_1_hd;
		}

		public void setTimeline_1_date(String timeline_1_date){
			this.timeline_1_date = timeline_1_date;
		}
		public String getTimeline_1_date(){
			return this.timeline_1_date;
		}

		public void setTimeline_1_text(String timeline_1_text){
			this.timeline_1_text = timeline_1_text;
		}
		public String getTimeline_1_text(){
			return this.timeline_1_text;
		}

		public IGRPLink setTimeline_1_btn(String app,String page,String action){
			this.timeline_1_btn = new IGRPLink(app,page,action);
			return this.timeline_1_btn;
		}
		public IGRPLink getTimeline_1_btn(){
			return this.timeline_1_btn;
		}
		public void setTimeline_1_btn_desc(String timeline_1_btn_desc){
			this.timeline_1_btn_desc = timeline_1_btn_desc;
		}
		public String getTimeline_1_btn_desc(){
			return this.timeline_1_btn_desc;
		}
	public IGRPLink setTimeline_1_btn(String link){
		this.timeline_1_btn = new IGRPLink(link);
		return this.timeline_1_btn;
	}
	public IGRPLink setTimeline_1_btn(Report link){
		this.timeline_1_btn = new IGRPLink(link);
		return this.timeline_1_btn;
	}

	}
	public static class Chart_1 extends IGRPChart3D{
		public Chart_1(String eixoX, String eixoY, Object eixoZ) {
			super(eixoX, eixoY,eixoZ);
		}
		public Chart_1() {
		}
	}

	public void loadCalendar_1_events(BaseQueryInterface query) {
		this.setCalendar_1_events(this.loadTable(query,Calendar_1_events.class));
	}

	public void loadCarousel_1(BaseQueryInterface query) {
		this.setCarousel_1(this.loadTable(query,Carousel_1.class));
	}

	public void loadChart_1(BaseQueryInterface query) {
		this.setChart_1(this.loadTable(query,Chart_1.class));
	}

	public void loadLeafletmap_1_markers(BaseQueryInterface query) {
		this.setLeafletmap_1_markers(this.loadTable(query,Leafletmap_1_markers.class));
	}

	public void loadTimeline_1(BaseQueryInterface query) {
		this.setTimeline_1(this.loadTable(query,Timeline_1.class));
	}

}
