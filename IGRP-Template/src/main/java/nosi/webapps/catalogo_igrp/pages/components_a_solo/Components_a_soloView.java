package nosi.webapps.catalogo_igrp.pages.components_a_solo;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;
import nosi.core.webapp.Core;

public class Components_a_soloView extends View {

	public Field circlestatbox_1_title;
	public Field circlestatbox_1_lbl;
	public Field circlestatbox_1_val;
	public Field circlestatbox_1_desc;
	public Field circlestatbox_1_url;
	public Field circlestatbox_1_bg;
	public Field quickbuttonbox_1_title;
	public Field quickbuttonbox_1_val;
	public Field quickbuttonbox_1_url;
	public Field quickbuttonbox_1_bg;
	public Field quickbuttonbox_1_icn;
	public Field smallbox_1_title;
	public Field smallbox_1_val;
	public Field smallbox_1_url;
	public Field smallbox_1_lbl;
	public Field smallbox_1_bg;
	public Field smallbox_1_icn;
	public Field calendar_1_lang;
	public Field calendar_1_add;
	public Field calendar_1_view;
	public Field calendar_1_date;
	public Field calendar_1_title;
	public Field calendar_1_description;
	public Field calendar_1_id;
	public Field calendar_1_start;
	public Field calendar_1_end;
	public Field calendar_1_color;
	public Field calendar_1_allday;
	public Field carousel_1_label;
	public Field carousel_1_img;
	public Field iframe_1_src;
	public Field sectionheader_1_text;
	public Field paragraph_1_text;
	public Field video_1_text;
	public Field leafletmap_1_title;
	public Field leafletmap_1_info;
	public Field leafletmap_1_lat;
	public Field leafletmap_1_lng;
	public Field leafletmap_1_icon;
	public Field infopanel_1_title;
	public Field infopanel_1_val;
	public Field infopanel_1_url;
	public Field infopanel_1_bg;
	public Field infopanel_1_icn;
	public Field statbox_1_title;
	public Field statbox_1_val;
	public Field statbox_1_txt;
	public Field statbox_1_url;
	public Field statbox_1_bg;
	public Field statbox_1_icn;
	public Field timeline_1_icon;
	public Field timeline_1_hd;
	public Field timeline_1_date;
	public Field timeline_1_text;
	public Field timeline_1_btn;
	public Field mapchart_1_basemap;
	public Field mapchart_1_data;
	public Field mapchart_1_config;
	public Field mapchart_1_dt_label;
	public Field fingerprint_1_link;
	public Field fingerprint_1_photo;
	public Field fingerprint_1_fingerright;
	public Field fingerprint_1_fingerleft;
	public Field fingerprint_1_signature;
	public Field fingerprint_1_self;
	public Field fingerprint_1_start;
	public Field fingerprint_1_process;
	public Field map_os_1_data;
	public IGRPCircleStatBox circlestatbox_1;
	public IGRPQuickButtonBox quickbuttonbox_1;
	public IGRPSmallBox smallbox_1;
	public IGRPForm calendar_1;
	public IGRPTable calendar_1_events;
	public IGRPTable carousel_1;
	public IGRPChart chart_1;
	public IGRPIframe iframe_1;
	public IGRPSectionHeader sectionheader_1;
	public IGRPParagraph paragraph_1;
	public IGRPVideo video_1;
	public IGRPForm leafletmap_1;
	public IGRPTable leafletmap_1_markers;
	public IGRPForm infopanel_1;
	public IGRPStatBox statbox_1;
	public IGRPTimeline timeline_1;
	public IGRPForm mapchart_1;
	public IGRPFingerPrint fingerprint_1;
	public IGRPForm map_os_1;


	public Components_a_soloView(){

		this.setPageTitle("Components a solo");
			
		circlestatbox_1 = new IGRPCircleStatBox("circlestatbox_1","");

		quickbuttonbox_1 = new IGRPQuickButtonBox("quickbuttonbox_1","");

		smallbox_1 = new IGRPSmallBox("smallbox_1","");

		calendar_1 = new IGRPForm("calendar_1","Calendar");

		calendar_1_events = new IGRPTable("calendar_1_events","");

		carousel_1 = new IGRPTable("carousel_1","Carousel");

		chart_1 = new IGRPChart("chart_1","Chart");

		iframe_1 = new IGRPIframe("iframe_1","Iframe");

		sectionheader_1 = new IGRPSectionHeader("sectionheader_1","");

		paragraph_1 = new IGRPParagraph("paragraph_1","");

		video_1 = new IGRPVideo("video_1","");

		leafletmap_1 = new IGRPForm("leafletmap_1","");

		leafletmap_1_markers = new IGRPTable("leafletmap_1_markers","");

		infopanel_1 = new IGRPForm("infopanel_1","");

		statbox_1 = new IGRPStatBox("statbox_1","");

		timeline_1 = new IGRPTimeline("timeline_1","");

		mapchart_1 = new IGRPForm("mapchart_1","Mapchart");

		fingerprint_1 = new IGRPFingerPrint("fingerprint_1","Fingerprint");

		map_os_1 = new IGRPForm("map_os_1","");

		circlestatbox_1_title = new TextField(model,"circlestatbox_1_title");
		circlestatbox_1_title.setLabel(gt("Circle Box Title"));
		circlestatbox_1_title.propertie().add("name","p_circlestatbox_1_title").add("type","text").add("maxlength","4000");
		
		circlestatbox_1_lbl = new TextField(model,"circlestatbox_1_lbl");
		circlestatbox_1_lbl.setLabel(gt("Percent Text"));
		circlestatbox_1_lbl.propertie().add("name","p_circlestatbox_1_lbl").add("type","text").add("maxlength","4000");
		
		circlestatbox_1_val = new TextField(model,"circlestatbox_1_val");
		circlestatbox_1_val.setLabel(gt("Percent Value"));
		circlestatbox_1_val.propertie().add("name","p_circlestatbox_1_val").add("type","text").add("maxlength","4000");
		
		circlestatbox_1_desc = new TextField(model,"circlestatbox_1_desc");
		circlestatbox_1_desc.setLabel(gt("Description"));
		circlestatbox_1_desc.propertie().add("name","p_circlestatbox_1_desc").add("type","text").add("maxlength","4000");
		
		circlestatbox_1_url = new TextField(model,"circlestatbox_1_url");
		circlestatbox_1_url.setLabel(gt("Link"));
		circlestatbox_1_url.propertie().add("name","p_circlestatbox_1_url").add("type","text").add("maxlength","4000");
		
		circlestatbox_1_bg = new TextField(model,"circlestatbox_1_bg");
		circlestatbox_1_bg.setLabel(gt("Background"));
		circlestatbox_1_bg.propertie().add("name","p_circlestatbox_1_bg").add("type","text").add("maxlength","4000");
		
		quickbuttonbox_1_title = new TextField(model,"quickbuttonbox_1_title");
		quickbuttonbox_1_title.setLabel(gt("Title"));
		quickbuttonbox_1_title.propertie().add("name","p_quickbuttonbox_1_title").add("type","text").add("maxlength","4000");
		
		quickbuttonbox_1_val = new TextField(model,"quickbuttonbox_1_val");
		quickbuttonbox_1_val.setLabel(gt("Value"));
		quickbuttonbox_1_val.propertie().add("name","p_quickbuttonbox_1_val").add("type","text").add("maxlength","4000");
		
		quickbuttonbox_1_url = new LinkField(model,"quickbuttonbox_1_url");
		quickbuttonbox_1_url.setLabel(gt(""));
		quickbuttonbox_1_url.setValue(Core.getIGRPLink("catalogo_igrp","Components_a_solo","index"));
		quickbuttonbox_1_url.propertie().add("name","p_quickbuttonbox_1_url").add("type","link").add("maxlength","4000");
		
		quickbuttonbox_1_bg = new TextField(model,"quickbuttonbox_1_bg");
		quickbuttonbox_1_bg.setLabel(gt("Background"));
		quickbuttonbox_1_bg.propertie().add("name","p_quickbuttonbox_1_bg").add("type","text").add("maxlength","4000");
		
		quickbuttonbox_1_icn = new TextField(model,"quickbuttonbox_1_icn");
		quickbuttonbox_1_icn.setLabel(gt("Icon"));
		quickbuttonbox_1_icn.propertie().add("name","p_quickbuttonbox_1_icn").add("type","text").add("maxlength","4000");
		
		smallbox_1_title = new TextField(model,"smallbox_1_title");
		smallbox_1_title.setLabel(gt("Small Box Title"));
		smallbox_1_title.propertie().add("name","p_smallbox_1_title").add("type","text").add("maxlength","4000");
		
		smallbox_1_val = new TextField(model,"smallbox_1_val");
		smallbox_1_val.setLabel(gt("Value"));
		smallbox_1_val.propertie().add("name","p_smallbox_1_val").add("type","text").add("maxlength","4000");
		
		smallbox_1_url = new TextField(model,"smallbox_1_url");
		smallbox_1_url.setLabel(gt("Url"));
		smallbox_1_url.propertie().add("name","p_smallbox_1_url").add("type","text").add("maxlength","4000");
		
		smallbox_1_lbl = new TextField(model,"smallbox_1_lbl");
		smallbox_1_lbl.setLabel(gt("Url label"));
		smallbox_1_lbl.propertie().add("name","p_smallbox_1_lbl").add("type","text").add("maxlength","4000");
		
		smallbox_1_bg = new TextField(model,"smallbox_1_bg");
		smallbox_1_bg.setLabel(gt("Background"));
		smallbox_1_bg.propertie().add("name","p_smallbox_1_bg").add("type","text").add("maxlength","4000");
		
		smallbox_1_icn = new TextField(model,"smallbox_1_icn");
		smallbox_1_icn.setLabel(gt("Icon"));
		smallbox_1_icn.propertie().add("name","p_smallbox_1_icn").add("type","text").add("maxlength","4000");
		
		calendar_1_lang = new TextField(model,"calendar_1_lang");
		calendar_1_lang.setLabel(gt("Linguagem"));
		calendar_1_lang.propertie().add("name","p_calendar_1_lang").add("type","text").add("maxlength","30");
		
		calendar_1_add = new LinkField(model,"calendar_1_add");
		calendar_1_add.setLabel(gt("add Eventos"));
		calendar_1_add.propertie().add("name","p_calendar_1_add").add("type","link").add("maxlength","4000");
		
		calendar_1_view = new TextField(model,"calendar_1_view");
		calendar_1_view.setLabel(gt("Default View"));
		calendar_1_view.propertie().add("name","p_calendar_1_view").add("type","text").add("maxlength","30");
		
		calendar_1_date = new DateField(model,"calendar_1_date");
		calendar_1_date.setLabel(gt("Default View"));
		calendar_1_date.propertie().add("name","p_calendar_1_date").add("type","date").add("maxlength","30");
		
		calendar_1_title = new TextField(model,"calendar_1_title");
		calendar_1_title.setLabel(gt("Título do Evento"));
		calendar_1_title.propertie().add("name","p_calendar_1_title").add("type","text").add("maxlength","200");
		
		calendar_1_description = new TextField(model,"calendar_1_description");
		calendar_1_description.setLabel(gt("Descrição do evento"));
		calendar_1_description.propertie().add("name","p_calendar_1_description").add("type","text").add("maxlength","400");
		
		calendar_1_id = new TextField(model,"calendar_1_id");
		calendar_1_id.setLabel(gt("ID do Evento"));
		calendar_1_id.propertie().add("name","p_calendar_1_id").add("type","text").add("maxlength","30");
		
		calendar_1_start = new DateField(model,"calendar_1_start");
		calendar_1_start.setLabel(gt("Data Inicio do Evento"));
		calendar_1_start.propertie().add("name","p_calendar_1_start").add("type","date").add("maxlength","30");
		
		calendar_1_end = new DateField(model,"calendar_1_end");
		calendar_1_end.setLabel(gt("Data Fim do Evento"));
		calendar_1_end.propertie().add("type","date").add("maxlength","30");
		
		calendar_1_color = new TextField(model,"calendar_1_color");
		calendar_1_color.setLabel(gt("Cor de Fundo do Evento simboliza prioridade"));
		calendar_1_color.propertie().add("name","p_calendar_1_color").add("type","text").add("maxlength","30");
		
		calendar_1_allday = new TextField(model,"calendar_1_allday");
		calendar_1_allday.setLabel(gt("Evento Dia Todo (value Boolean)"));
		calendar_1_allday.propertie().add("name","p_calendar_1_allday").add("type","text").add("maxlength","30");
		
		carousel_1_label = new TextField(model,"carousel_1_label");
		carousel_1_label.setLabel(gt("Title"));
		carousel_1_label.propertie().add("name","p_carousel_1_label").add("type","text").add("maxlength","200");
		
		carousel_1_img = new TextField(model,"carousel_1_img");
		carousel_1_img.setLabel(gt("Image"));
		carousel_1_img.propertie().add("name","p_carousel_1_img").add("type","text").add("maxlength","200");
		
		iframe_1_src = new TextField(model,"iframe_1_src");
		iframe_1_src.setLabel(gt("Iframe Source"));
		iframe_1_src.propertie().add("name","p_iframe_1_src").add("type","text").add("maxlength","4000");
		
		sectionheader_1_text = new TextField(model,"sectionheader_1_text");
		sectionheader_1_text.setLabel(gt(""));
		sectionheader_1_text.setValue(gt("<h2 style='font-style:italic;'><strong><span style='color:#e74c3c;'><span style='font-size:18px;'><span style='font-family:Comic Sans MS,cursive;'>Sectionheader</span></span></span></strong></h2>"));
		sectionheader_1_text.propertie().add("type","text").add("name","p_sectionheader_1_text").add("maxlength","4000");
		
		paragraph_1_text = new TextField(model,"paragraph_1_text");
		paragraph_1_text.setLabel(gt(""));
		paragraph_1_text.setValue(gt("<p><em><u>L<span style='font-size:14px;'><span style='font-family:Lucida Sans Unicode,Lucida Grande,sans-serif;'>orem ipsum dolor sit a</span></span></u></em></p> <ol> <li>met, consectetur a</li> <li>dipisicing elit, sed</li> </ol> <ul> <li>do eiusmodtempor incididunt ut lab</li> <li>ore et dolore magna aliqua. Ut enim</li> </ul> <p>ad minim veniam,quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>"));
		paragraph_1_text.propertie().add("type","text").add("name","p_paragraph_1_text").add("maxlength","4000");
		
		video_1_text = new TextField(model,"video_1_text");
		video_1_text.setLabel(gt(""));
		video_1_text.setValue(gt("https://www.youtube.com/embed/nbcj8C_FQEw"));
		video_1_text.propertie().add("type","text").add("name","p_video_1_text").add("maxlength","4000");
		
		leafletmap_1_title = new TextField(model,"leafletmap_1_title");
		leafletmap_1_title.setLabel(gt("Titulo"));
		leafletmap_1_title.propertie().add("name","p_leafletmap_1_title").add("type","text").add("maxlength","200");
		
		leafletmap_1_info = new TextField(model,"leafletmap_1_info");
		leafletmap_1_info.setLabel(gt("Info"));
		leafletmap_1_info.propertie().add("name","p_leafletmap_1_info").add("type","text").add("maxlength","800");
		
		leafletmap_1_lat = new TextField(model,"leafletmap_1_lat");
		leafletmap_1_lat.setLabel(gt("Latitude"));
		leafletmap_1_lat.propertie().add("name","p_leafletmap_1_lat").add("type","text").add("maxlength","200");
		
		leafletmap_1_lng = new TextField(model,"leafletmap_1_lng");
		leafletmap_1_lng.setLabel(gt("Longitude"));
		leafletmap_1_lng.propertie().add("name","p_leafletmap_1_lng").add("type","text").add("maxlength","200");
		
		leafletmap_1_icon = new TextField(model,"leafletmap_1_icon");
		leafletmap_1_icon.setLabel(gt("Icon"));
		leafletmap_1_icon.propertie().add("name","p_leafletmap_1_icon").add("type","text").add("maxlength","200");
		
		infopanel_1_title = new TextField(model,"infopanel_1_title");
		infopanel_1_title.setLabel(gt("Title"));
		infopanel_1_title.propertie().add("name","p_infopanel_1_title").add("type","text").add("maxlength","4000");
		
		infopanel_1_val = new TextField(model,"infopanel_1_val");
		infopanel_1_val.setLabel(gt("Value"));
		infopanel_1_val.propertie().add("name","p_infopanel_1_val").add("type","text").add("maxlength","4000");
		
		infopanel_1_url = new LinkField(model,"infopanel_1_url");
		infopanel_1_url.setLabel(gt(""));
		infopanel_1_url.propertie().add("name","p_infopanel_1_url").add("type","link").add("maxlength","4000");
		
		infopanel_1_bg = new TextField(model,"infopanel_1_bg");
		infopanel_1_bg.setLabel(gt("Background"));
		infopanel_1_bg.propertie().add("name","p_infopanel_1_bg").add("type","text").add("maxlength","4000");
		
		infopanel_1_icn = new TextField(model,"infopanel_1_icn");
		infopanel_1_icn.setLabel(gt("Icon"));
		infopanel_1_icn.propertie().add("name","p_infopanel_1_icn").add("type","text").add("maxlength","4000");
		
		statbox_1_title = new TextField(model,"statbox_1_title");
		statbox_1_title.setLabel(gt("Box Title"));
		statbox_1_title.propertie().add("name","p_statbox_1_title").add("type","text").add("maxlength","4000");
		
		statbox_1_val = new TextField(model,"statbox_1_val");
		statbox_1_val.setLabel(gt("Value"));
		statbox_1_val.propertie().add("name","p_statbox_1_val").add("type","text").add("maxlength","4000");
		
		statbox_1_txt = new TextField(model,"statbox_1_txt");
		statbox_1_txt.setLabel(gt("Url Text"));
		statbox_1_txt.propertie().add("name","p_statbox_1_txt").add("type","text").add("maxlength","4000");
		
		statbox_1_url = new TextField(model,"statbox_1_url");
		statbox_1_url.setLabel(gt("Url"));
		statbox_1_url.propertie().add("name","p_statbox_1_url").add("type","text").add("maxlength","4000");
		
		statbox_1_bg = new TextField(model,"statbox_1_bg");
		statbox_1_bg.setLabel(gt("Background"));
		statbox_1_bg.propertie().add("name","p_statbox_1_bg").add("type","text").add("maxlength","4000");
		
		statbox_1_icn = new TextField(model,"statbox_1_icn");
		statbox_1_icn.setLabel(gt("Icon"));
		statbox_1_icn.setValue(gt("fa-check"));
		statbox_1_icn.propertie().add("name","p_statbox_1_icn").add("type","text").add("maxlength","4000");
		
		timeline_1_icon = new TextField(model,"timeline_1_icon");
		timeline_1_icon.setLabel(gt("Icon"));
		timeline_1_icon.propertie().add("type","img").add("maxlength","30");
		
		timeline_1_hd = new TextField(model,"timeline_1_hd");
		timeline_1_hd.setLabel(gt("Header"));
		timeline_1_hd.propertie().add("type","text").add("maxlength","40");
		
		timeline_1_date = new DateField(model,"timeline_1_date");
		timeline_1_date.setLabel(gt("Date"));
		timeline_1_date.propertie().add("type","date").add("maxlength","40");
		
		timeline_1_text = new TextField(model,"timeline_1_text");
		timeline_1_text.setLabel(gt("Content"));
		timeline_1_text.propertie().add("type","text").add("maxlength","4000");
		
		timeline_1_btn = new LinkField(model,"timeline_1_btn");
		timeline_1_btn.setLabel(gt("Button"));
		timeline_1_btn.propertie().add("type","link").add("target","_self").add("maxlength","4000");
		
		mapchart_1_basemap = new TextField(model,"mapchart_1_basemap");
		mapchart_1_basemap.setLabel(gt("Basemap"));
		mapchart_1_basemap.propertie().add("name","p_mapchart_1_basemap").add("type","text").add("maxlength","4000");
		
		mapchart_1_data = new TextField(model,"mapchart_1_data");
		mapchart_1_data.setLabel(gt("Data"));
		mapchart_1_data.propertie().add("name","p_mapchart_1_data").add("type","text").add("maxlength","4000");
		
		mapchart_1_config = new TextField(model,"mapchart_1_config");
		mapchart_1_config.setLabel(gt("Configuration"));
		mapchart_1_config.propertie().add("name","p_mapchart_1_config").add("type","text").add("maxlength","4000");
		
		mapchart_1_dt_label = new TextField(model,"mapchart_1_dt_label");
		mapchart_1_dt_label.setLabel(gt("Basemap Label"));
		mapchart_1_dt_label.setValue(gt("name"));
		mapchart_1_dt_label.propertie().add("name","p_mapchart_1_dt_label").add("type","text").add("maxlength","4000");
		
		fingerprint_1_link = new LinkField(model,"fingerprint_1_link");
		fingerprint_1_link.setLabel(gt("link"));
		fingerprint_1_link.propertie().add("name","p_fingerprint_1_link").add("type","link").add("maxlength","4000");
		
		fingerprint_1_photo = new LinkField(model,"fingerprint_1_photo");
		fingerprint_1_photo.setLabel(gt("Photo"));
		fingerprint_1_photo.propertie().add("name","p_fingerprint_1_photo").add("type","link").add("maxlength","4000");
		
		fingerprint_1_fingerright = new LinkField(model,"fingerprint_1_fingerright");
		fingerprint_1_fingerright.setLabel(gt("Finger Right"));
		fingerprint_1_fingerright.propertie().add("name","p_fingerprint_1_fingerright").add("type","link").add("maxlength","4000");
		
		fingerprint_1_fingerleft = new LinkField(model,"fingerprint_1_fingerleft");
		fingerprint_1_fingerleft.setLabel(gt("Finger Left"));
		fingerprint_1_fingerleft.propertie().add("name","p_fingerprint_1_fingerleft").add("type","link").add("maxlength","4000");
		
		fingerprint_1_signature = new LinkField(model,"fingerprint_1_signature");
		fingerprint_1_signature.setLabel(gt("Signature"));
		fingerprint_1_signature.propertie().add("name","p_fingerprint_1_signature").add("type","link").add("maxlength","4000");
		
		fingerprint_1_self = new LinkField(model,"fingerprint_1_self");
		fingerprint_1_self.setLabel(gt("Self Service"));
		fingerprint_1_self.propertie().add("name","p_fingerprint_1_self").add("type","link").add("maxlength","4000");
		
		fingerprint_1_start = new LinkField(model,"fingerprint_1_start");
		fingerprint_1_start.setLabel(gt("Process Start"));
		fingerprint_1_start.propertie().add("name","p_fingerprint_1_start").add("type","link").add("maxlength","4000");
		
		fingerprint_1_process = new NumberField(model,"fingerprint_1_process");
		fingerprint_1_process.setLabel(gt("Number Process"));
		fingerprint_1_process.propertie().add("type","number").add("maxlength","30").add("name","p_number_process");
		
		map_os_1_data = new TextField(model,"map_os_1_data");
		map_os_1_data.setLabel(gt("Map Data"));
		map_os_1_data.setValue(gt("{\"groupLayers\":[],\"baseMaps\":[{\"name\":\"Wikimedia\",\"default\":true},{\"name\":\"OpenStreetMap\",\"default\":false},{\"name\":\"GoogleSatellite\",\"default\":false},{\"name\":\"Esri.WorldImagery\",\"default\":false}],\"widgets\":[]}"));
		map_os_1_data.propertie().add("type","text").add("name","p_map_os_1_data").add("maxlength","8000");
		


		
		chart_1.setCaption("");
		chart_1.setChart_type("stackedarea");
		chart_1.setXaxys("Eixo de X");
		chart_1.setYaxys("Eixo de Y");
		chart_1.setUrl("#");
		chart_1.addColor("#6b1e2c").addColor("#8bc4e6").addColor("#331316").addColor("#628950");

	}
		
	@Override
	public void render(){
		
		circlestatbox_1.addField(circlestatbox_1_title);
		circlestatbox_1.addField(circlestatbox_1_lbl);
		circlestatbox_1.addField(circlestatbox_1_val);
		circlestatbox_1.addField(circlestatbox_1_desc);
		circlestatbox_1.addField(circlestatbox_1_url);
		circlestatbox_1.addField(circlestatbox_1_bg);

		quickbuttonbox_1.addField(quickbuttonbox_1_title);
		quickbuttonbox_1.addField(quickbuttonbox_1_val);
		quickbuttonbox_1.addField(quickbuttonbox_1_url);
		quickbuttonbox_1.addField(quickbuttonbox_1_bg);
		quickbuttonbox_1.addField(quickbuttonbox_1_icn);

		smallbox_1.addField(smallbox_1_title);
		smallbox_1.addField(smallbox_1_val);
		smallbox_1.addField(smallbox_1_url);
		smallbox_1.addField(smallbox_1_lbl);
		smallbox_1.addField(smallbox_1_bg);
		smallbox_1.addField(smallbox_1_icn);

		calendar_1.addField(calendar_1_lang);
		calendar_1.addField(calendar_1_add);
		calendar_1.addField(calendar_1_view);
		calendar_1.addField(calendar_1_date);

		calendar_1_events.addField(calendar_1_title);
		calendar_1_events.addField(calendar_1_description);
		calendar_1_events.addField(calendar_1_id);
		calendar_1_events.addField(calendar_1_start);
		calendar_1_events.addField(calendar_1_end);
		calendar_1_events.addField(calendar_1_color);
		calendar_1_events.addField(calendar_1_allday);

		carousel_1.addField(carousel_1_label);
		carousel_1.addField(carousel_1_img);


		iframe_1.addField(iframe_1_src);

		sectionheader_1.addField(sectionheader_1_text);

		paragraph_1.addField(paragraph_1_text);

		video_1.addField(video_1_text);


		leafletmap_1_markers.addField(leafletmap_1_title);
		leafletmap_1_markers.addField(leafletmap_1_info);
		leafletmap_1_markers.addField(leafletmap_1_lat);
		leafletmap_1_markers.addField(leafletmap_1_lng);
		leafletmap_1_markers.addField(leafletmap_1_icon);

		infopanel_1.addField(infopanel_1_title);
		infopanel_1.addField(infopanel_1_val);
		infopanel_1.addField(infopanel_1_url);
		infopanel_1.addField(infopanel_1_bg);
		infopanel_1.addField(infopanel_1_icn);

		statbox_1.addField(statbox_1_title);
		statbox_1.addField(statbox_1_val);
		statbox_1.addField(statbox_1_txt);
		statbox_1.addField(statbox_1_url);
		statbox_1.addField(statbox_1_bg);
		statbox_1.addField(statbox_1_icn);

		timeline_1.addField(timeline_1_icon);
		timeline_1.addField(timeline_1_hd);
		timeline_1.addField(timeline_1_date);
		timeline_1.addField(timeline_1_text);
		timeline_1.addField(timeline_1_btn);

		mapchart_1.addField(mapchart_1_basemap);
		mapchart_1.addField(mapchart_1_data);
		mapchart_1.addField(mapchart_1_config);
		mapchart_1.addField(mapchart_1_dt_label);

		fingerprint_1.addField(fingerprint_1_link);
		fingerprint_1.addField(fingerprint_1_photo);
		fingerprint_1.addField(fingerprint_1_fingerright);
		fingerprint_1.addField(fingerprint_1_fingerleft);
		fingerprint_1.addField(fingerprint_1_signature);
		fingerprint_1.addField(fingerprint_1_self);
		fingerprint_1.addField(fingerprint_1_start);
		fingerprint_1.addField(fingerprint_1_process);

		map_os_1.addField(map_os_1_data);

		this.addToPage(circlestatbox_1);
		this.addToPage(quickbuttonbox_1);
		this.addToPage(smallbox_1);
		this.addToPage(calendar_1);
		this.addToPage(calendar_1_events);
		this.addToPage(carousel_1);
		this.addToPage(chart_1);
		this.addToPage(iframe_1);
		this.addToPage(sectionheader_1);
		this.addToPage(paragraph_1);
		this.addToPage(video_1);
		this.addToPage(leafletmap_1);
		this.addToPage(leafletmap_1_markers);
		this.addToPage(infopanel_1);
		this.addToPage(statbox_1);
		this.addToPage(timeline_1);
		this.addToPage(mapchart_1);
		this.addToPage(fingerprint_1);
		this.addToPage(map_os_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		circlestatbox_1_title.setValue(model);
		circlestatbox_1_lbl.setValue(model);
		circlestatbox_1_val.setValue(model);
		circlestatbox_1_desc.setValue(model);
		circlestatbox_1_url.setValue(model);
		circlestatbox_1_bg.setValue(model);
		quickbuttonbox_1_title.setValue(model);
		quickbuttonbox_1_val.setValue(model);
		quickbuttonbox_1_bg.setValue(model);
		quickbuttonbox_1_icn.setValue(model);
		smallbox_1_title.setValue(model);
		smallbox_1_val.setValue(model);
		smallbox_1_url.setValue(model);
		smallbox_1_lbl.setValue(model);
		smallbox_1_bg.setValue(model);
		smallbox_1_icn.setValue(model);
		calendar_1_lang.setValue(model);
		calendar_1_add.setValue(model);
		calendar_1_view.setValue(model);
		calendar_1_date.setValue(model);
		calendar_1_title.setValue(model);
		calendar_1_description.setValue(model);
		calendar_1_id.setValue(model);
		calendar_1_start.setValue(model);
		calendar_1_end.setValue(model);
		calendar_1_color.setValue(model);
		calendar_1_allday.setValue(model);
		carousel_1_label.setValue(model);
		carousel_1_img.setValue(model);
		iframe_1_src.setValue(model);
		leafletmap_1_title.setValue(model);
		leafletmap_1_info.setValue(model);
		leafletmap_1_lat.setValue(model);
		leafletmap_1_lng.setValue(model);
		leafletmap_1_icon.setValue(model);
		infopanel_1_title.setValue(model);
		infopanel_1_val.setValue(model);
		infopanel_1_url.setValue(model);
		infopanel_1_bg.setValue(model);
		infopanel_1_icn.setValue(model);
		statbox_1_title.setValue(model);
		statbox_1_val.setValue(model);
		statbox_1_txt.setValue(model);
		statbox_1_url.setValue(model);
		statbox_1_bg.setValue(model);
		timeline_1_icon.setValue(model);
		timeline_1_hd.setValue(model);
		timeline_1_date.setValue(model);
		timeline_1_text.setValue(model);
		timeline_1_btn.setValue(model);
		mapchart_1_basemap.setValue(model);
		mapchart_1_data.setValue(model);
		mapchart_1_config.setValue(model);
		fingerprint_1_link.setValue(model);
		fingerprint_1_photo.setValue(model);
		fingerprint_1_fingerright.setValue(model);
		fingerprint_1_fingerleft.setValue(model);
		fingerprint_1_signature.setValue(model);
		fingerprint_1_self.setValue(model);
		fingerprint_1_start.setValue(model);
		fingerprint_1_process.setValue(model);	

		calendar_1_events.loadModel(((Components_a_solo) model).getCalendar_1_events());
		carousel_1.loadModel(((Components_a_solo) model).getCarousel_1());
		chart_1.loadModel(((Components_a_solo) model).getChart_1());
		leafletmap_1_markers.loadModel(((Components_a_solo) model).getLeafletmap_1_markers());
		timeline_1.loadModel(((Components_a_solo) model).getTimeline_1());
		}
}
