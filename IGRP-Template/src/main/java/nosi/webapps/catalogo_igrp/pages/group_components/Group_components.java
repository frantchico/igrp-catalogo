package nosi.webapps.catalogo_igrp.pages.group_components;

import nosi.core.gui.components.IGRPLink;
import nosi.core.webapp.Report;
import nosi.core.gui.components.IGRPTable;
import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import java.util.ArrayList;
import java.util.List;

public class Group_components extends Model{		
	@RParam(rParamName = "p_template_tab_default")
	private String template_tab_default;
	@RParam(rParamName = "p_segundo_return_11")
	private String segundo_return_11;
	@RParam(rParamName = "p_terceiro_tab_3")
	private String terceiro_tab_3;
	@RParam(rParamName = "p_template_accordion")
	private String template_accordion;
	@RParam(rParamName = "p_segundo_return_13")
	private String segundo_return_13;
	@RParam(rParamName = "p_terceiro_tab")
	private String terceiro_tab;
	@RParam(rParamName = "p_panels_1_button_1")
	private String button_1;
	@RParam(rParamName = "p_d2_painel")
	private String d2_painel;
	@RParam(rParamName = "p_acertou_3_panel")
	private String acertou_3_panel;
	@RParam(rParamName = "")
	private String treelist_1_uid;
	@RParam(rParamName = "")
	private String treelist_1_title;
	@RParam(rParamName = "")
	private String treelist_1_link;
	@RParam(rParamName = "")
	private String treelist_1_target;
	@RParam(rParamName = "")
	private String treelist_1_icon;
	@RParam(rParamName = "")
	private String treelist_1_parent;
	@RParam(rParamName = "p_template_navbar")
	private String template_navbar;
	@RParam(rParamName = "p_segundo_return_1")
	private String segundo_return_1;
	@RParam(rParamName = "p_terceiro_tab_1")
	private String terceiro_tab_1;
	
	private List<Treemenu_1> treemenu_1 = new ArrayList<>();	
	public void setTreemenu_1(List<Treemenu_1> treemenu_1){
		this.treemenu_1 = treemenu_1;
	}
	public List<Treemenu_1> getTreemenu_1(){
		return this.treemenu_1;
	}

	
	public void setTemplate_tab_default(String template_tab_default){
		this.template_tab_default = template_tab_default;
	}
	public String getTemplate_tab_default(){
		return this.template_tab_default;
	}
	
	public void setSegundo_return_11(String segundo_return_11){
		this.segundo_return_11 = segundo_return_11;
	}
	public String getSegundo_return_11(){
		return this.segundo_return_11;
	}
	
	public void setTerceiro_tab_3(String terceiro_tab_3){
		this.terceiro_tab_3 = terceiro_tab_3;
	}
	public String getTerceiro_tab_3(){
		return this.terceiro_tab_3;
	}
	
	public void setTemplate_accordion(String template_accordion){
		this.template_accordion = template_accordion;
	}
	public String getTemplate_accordion(){
		return this.template_accordion;
	}
	
	public void setSegundo_return_13(String segundo_return_13){
		this.segundo_return_13 = segundo_return_13;
	}
	public String getSegundo_return_13(){
		return this.segundo_return_13;
	}
	
	public void setTerceiro_tab(String terceiro_tab){
		this.terceiro_tab = terceiro_tab;
	}
	public String getTerceiro_tab(){
		return this.terceiro_tab;
	}
	
	public void setButton_1(String button_1){
		this.button_1 = button_1;
	}
	public String getButton_1(){
		return this.button_1;
	}
	
	public void setD2_painel(String d2_painel){
		this.d2_painel = d2_painel;
	}
	public String getD2_painel(){
		return this.d2_painel;
	}
	
	public void setAcertou_3_panel(String acertou_3_panel){
		this.acertou_3_panel = acertou_3_panel;
	}
	public String getAcertou_3_panel(){
		return this.acertou_3_panel;
	}
	
	public void setTreelist_1_uid(String treelist_1_uid){
		this.treelist_1_uid = treelist_1_uid;
	}
	public String getTreelist_1_uid(){
		return this.treelist_1_uid;
	}
	
	public void setTreelist_1_title(String treelist_1_title){
		this.treelist_1_title = treelist_1_title;
	}
	public String getTreelist_1_title(){
		return this.treelist_1_title;
	}
	
	public void setTreelist_1_link(String treelist_1_link){
		this.treelist_1_link = treelist_1_link;
	}
	public String getTreelist_1_link(){
		return this.treelist_1_link;
	}
	
	public void setTreelist_1_target(String treelist_1_target){
		this.treelist_1_target = treelist_1_target;
	}
	public String getTreelist_1_target(){
		return this.treelist_1_target;
	}
	
	public void setTreelist_1_icon(String treelist_1_icon){
		this.treelist_1_icon = treelist_1_icon;
	}
	public String getTreelist_1_icon(){
		return this.treelist_1_icon;
	}
	
	public void setTreelist_1_parent(String treelist_1_parent){
		this.treelist_1_parent = treelist_1_parent;
	}
	public String getTreelist_1_parent(){
		return this.treelist_1_parent;
	}
	
	public void setTemplate_navbar(String template_navbar){
		this.template_navbar = template_navbar;
	}
	public String getTemplate_navbar(){
		return this.template_navbar;
	}
	
	public void setSegundo_return_1(String segundo_return_1){
		this.segundo_return_1 = segundo_return_1;
	}
	public String getSegundo_return_1(){
		return this.segundo_return_1;
	}
	
	public void setTerceiro_tab_1(String terceiro_tab_1){
		this.terceiro_tab_1 = terceiro_tab_1;
	}
	public String getTerceiro_tab_1(){
		return this.terceiro_tab_1;
	}


	public static class Treemenu_1 extends IGRPTable.Table{
		private IGRPLink treemenu_1_link;
		private String treemenu_1_link_desc;
		private String treemenu_1_tmid;
		private Integer treemenu_1_parent;
		private String treemenu_1_icon;
		private String treemenu_1_child;
		private String treemenu_1_active;
		public IGRPLink setTreemenu_1_link(String app,String page,String action){
			this.treemenu_1_link = new IGRPLink(app,page,action);
			return this.treemenu_1_link;
		}
		public IGRPLink getTreemenu_1_link(){
			return this.treemenu_1_link;
		}
		public void setTreemenu_1_link_desc(String treemenu_1_link_desc){
			this.treemenu_1_link_desc = treemenu_1_link_desc;
		}
		public String getTreemenu_1_link_desc(){
			return this.treemenu_1_link_desc;
		}
	public IGRPLink setTreemenu_1_link(String link){
		this.treemenu_1_link = new IGRPLink(link);
		return this.treemenu_1_link;
	}
	public IGRPLink setTreemenu_1_link(Report link){
		this.treemenu_1_link = new IGRPLink(link);
		return this.treemenu_1_link;
	}

		public void setTreemenu_1_tmid(String treemenu_1_tmid){
			this.treemenu_1_tmid = treemenu_1_tmid;
		}
		public String getTreemenu_1_tmid(){
			return this.treemenu_1_tmid;
		}

		public void setTreemenu_1_parent(Integer treemenu_1_parent){
			this.treemenu_1_parent = treemenu_1_parent;
		}
		public Integer getTreemenu_1_parent(){
			return this.treemenu_1_parent;
		}

		public void setTreemenu_1_icon(String treemenu_1_icon){
			this.treemenu_1_icon = treemenu_1_icon;
		}
		public String getTreemenu_1_icon(){
			return this.treemenu_1_icon;
		}

		public void setTreemenu_1_child(String treemenu_1_child){
			this.treemenu_1_child = treemenu_1_child;
		}
		public String getTreemenu_1_child(){
			return this.treemenu_1_child;
		}

		public void setTreemenu_1_active(String treemenu_1_active){
			this.treemenu_1_active = treemenu_1_active;
		}
		public String getTreemenu_1_active(){
			return this.treemenu_1_active;
		}

	}

	public void loadTreemenu_1(BaseQueryInterface query) {
		this.setTreemenu_1(this.loadTable(query,Treemenu_1.class));
	}

}
