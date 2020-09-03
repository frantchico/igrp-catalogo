<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0"><xsl:output method="html" omit-xml-declaration="yes" encoding="utf-8" indent="yes" doctype-system="about:legacy-compat"/><xsl:template match="/"><html><head><xsl:call-template name="IGRP-head"/><link rel="stylesheet" type="text/css" href="{$path}/plugins/tabs/igrp.tabs.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/plugins/panels/igrp.panels.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/core/igrp/toolsbar/toolsbar.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/plugins/treelist/treelist.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/plugins/treemenu/treemenu.css?v={$version}"/><style/></head><body class="{$bodyClass} sidebar-off"><xsl:call-template name="IGRP-topmenu"/><form method="POST" class="IGRP-form" name="formular_default" enctype="multipart/form-data"><div class="container-fluid"><div class="row"><xsl:call-template name="IGRP-sidebar"/><div class="col-sm-9 col-md-10 col-md-offset-2 col-sm-offset-3 main" id="igrp-contents"><div class="content"><div class="row row-msg"><div class="gen-column col-md-12"><div class="gen-inner"><xsl:apply-templates mode="igrp-messages" select="rows/content/messages"/></div></div></div><div class="row " id="row-b32c6081"><div class="gen-column col-sm-6"><div class="gen-inner"><xsl:if test="rows/content/box_1"><div class="box igrp-box-holder gen-container-item " gen-class="" item-name="box_1"><xsl:call-template name="box-header"><xsl:with-param name="title" select="rows/content/box_1/@title"/><xsl:with-param name="collapsible" select="'true'"/><xsl:with-param name="collapsed" select="'false'"/></xsl:call-template><div class="box-body" gen-preserve-content="true"><xsl:apply-templates mode="form-hidden-fields" select="rows/content/box_1/fields"/><div><div class="row " id="row-2b1515ac"><div class="gen-column col-sm-12"><div class="gen-inner"/></div></div></div></div></div></xsl:if><div class="gen-tab-holder nav-tabs-custom     gen-container-item " tab-template="default" gen-class="" item-name="tabcontent_1"><ul class="nav nav-tabs"><xsl:if test="rows/content/tabcontent_1/fields/template_tab_default"><li item-name="template_tab_default" class=" gen-fields-holder" rel="tab-tabcontent_1-template_tab_default"><xsl:call-template name="get-active-tab"><xsl:with-param name="value" select="rows/content/tabcontent_1/fields/template_tab_default/value"/></xsl:call-template><a active-text-color="primary" data-toggle="tab" aria-expanded="true" href="#tab-tabcontent_1-template_tab_default"><i class="fa fa-bar-chart-o"/><span><xsl:value-of select="rows/content/tabcontent_1/fields/template_tab_default/label"/></span></a></li></xsl:if><xsl:if test="rows/content/tabcontent_1/fields/segundo_return_11"><li item-name="segundo_return_11" class=" gen-fields-holder" rel="tab-tabcontent_1-segundo_return_11"><xsl:call-template name="get-active-tab"><xsl:with-param name="value" select="rows/content/tabcontent_1/fields/segundo_return_11/value"/></xsl:call-template><a active-text-color="primary" data-toggle="tab" aria-expanded="true" href="#tab-tabcontent_1-segundo_return_11"><i class="fa fa-wheelchair-alt"/><span><xsl:value-of select="rows/content/tabcontent_1/fields/segundo_return_11/label"/></span></a></li></xsl:if><xsl:if test="rows/content/tabcontent_1/fields/terceiro_tab_3"><li item-name="terceiro_tab_3" class=" gen-fields-holder" rel="tab-tabcontent_1-terceiro_tab_3"><xsl:call-template name="get-active-tab"><xsl:with-param name="value" select="rows/content/tabcontent_1/fields/terceiro_tab_3/value"/></xsl:call-template><a active-text-color="primary" data-toggle="tab" aria-expanded="true" href="#tab-tabcontent_1-terceiro_tab_3"><i class="fa fa-btc"/><span><xsl:value-of select="rows/content/tabcontent_1/fields/terceiro_tab_3/label"/></span></a></li></xsl:if></ul><div class="tab-content"><xsl:if test="rows/content/tabcontent_1/fields/template_tab_default"><div class="tab-pane gen-rows-holder " id="tab-tabcontent_1-template_tab_default" rel="tab-tabcontent_1-template_tab_default" item-name="template_tab_default"><xsl:call-template name="get-active-tab"><xsl:with-param name="value" select="rows/content/tabcontent_1/fields/template_tab_default/value"/><xsl:with-param name="class" select="'tab-pane'"/></xsl:call-template><div class="row " id="row-e6e72c45"><div class="gen-column col-sm-12"><div class="gen-inner"/></div></div></div></xsl:if><xsl:if test="rows/content/tabcontent_1/fields/segundo_return_11"><div class="tab-pane gen-rows-holder " id="tab-tabcontent_1-segundo_return_11" rel="tab-tabcontent_1-segundo_return_11" item-name="segundo_return_11"><xsl:call-template name="get-active-tab"><xsl:with-param name="value" select="rows/content/tabcontent_1/fields/segundo_return_11/value"/><xsl:with-param name="class" select="'tab-pane'"/></xsl:call-template><div class="row " id="row-0342615e"><div class="gen-column col-sm-12"><div class="gen-inner"/></div></div></div></xsl:if><xsl:if test="rows/content/tabcontent_1/fields/terceiro_tab_3"><div class="tab-pane gen-rows-holder " id="tab-tabcontent_1-terceiro_tab_3" rel="tab-tabcontent_1-terceiro_tab_3" item-name="terceiro_tab_3"><xsl:call-template name="get-active-tab"><xsl:with-param name="value" select="rows/content/tabcontent_1/fields/terceiro_tab_3/value"/><xsl:with-param name="class" select="'tab-pane'"/></xsl:call-template><div class="row " id="row-b0faebc5"><div class="gen-column col-sm-12"><div class="gen-inner"/></div></div></div></xsl:if></div></div><div class="gen-tab-holder nav-tabs-custom     gen-container-item " tab-template="accordion" gen-class="" item-name="tabcontent_3"><ul class="nav nav-tabs"><xsl:if test="rows/content/tabcontent_3/fields/template_accordion"><li item-name="template_accordion" class=" gen-fields-holder" rel="tab-tabcontent_3-template_accordion"><xsl:call-template name="get-active-tab"><xsl:with-param name="value" select="rows/content/tabcontent_3/fields/template_accordion/value"/></xsl:call-template><a active-text-color="primary" data-toggle="tab" aria-expanded="true" href="#tab-tabcontent_3-template_accordion"><i class="fa fa-bar-chart-o"/><span><xsl:value-of select="rows/content/tabcontent_3/fields/template_accordion/label"/></span></a></li></xsl:if><xsl:if test="rows/content/tabcontent_3/fields/segundo_return_13"><li item-name="segundo_return_13" class=" gen-fields-holder" rel="tab-tabcontent_3-segundo_return_13"><xsl:call-template name="get-active-tab"><xsl:with-param name="value" select="rows/content/tabcontent_3/fields/segundo_return_13/value"/></xsl:call-template><a active-text-color="primary" data-toggle="tab" aria-expanded="true" href="#tab-tabcontent_3-segundo_return_13"><i class="fa fa-wheelchair-alt"/><span><xsl:value-of select="rows/content/tabcontent_3/fields/segundo_return_13/label"/></span></a></li></xsl:if><xsl:if test="rows/content/tabcontent_3/fields/terceiro_tab"><li item-name="terceiro_tab" class=" gen-fields-holder" rel="tab-tabcontent_3-terceiro_tab"><xsl:call-template name="get-active-tab"><xsl:with-param name="value" select="rows/content/tabcontent_3/fields/terceiro_tab/value"/></xsl:call-template><a active-text-color="primary" data-toggle="tab" aria-expanded="true" href="#tab-tabcontent_3-terceiro_tab"><i class="fa fa-btc"/><span><xsl:value-of select="rows/content/tabcontent_3/fields/terceiro_tab/label"/></span></a></li></xsl:if></ul><div class="tab-content"><xsl:if test="rows/content/tabcontent_3/fields/template_accordion"><div class="tab-pane gen-rows-holder " id="tab-tabcontent_3-template_accordion" rel="tab-tabcontent_3-template_accordion" item-name="template_accordion"><xsl:call-template name="get-active-tab"><xsl:with-param name="value" select="rows/content/tabcontent_3/fields/template_accordion/value"/><xsl:with-param name="class" select="'tab-pane'"/></xsl:call-template><div class="row " id="row-adfdb6ee"><div class="gen-column col-sm-12"><div class="gen-inner"/></div></div></div></xsl:if><xsl:if test="rows/content/tabcontent_3/fields/segundo_return_13"><div class="tab-pane gen-rows-holder " id="tab-tabcontent_3-segundo_return_13" rel="tab-tabcontent_3-segundo_return_13" item-name="segundo_return_13"><xsl:call-template name="get-active-tab"><xsl:with-param name="value" select="rows/content/tabcontent_3/fields/segundo_return_13/value"/><xsl:with-param name="class" select="'tab-pane'"/></xsl:call-template><div class="row " id="row-387a4089"><div class="gen-column col-sm-12"><div class="gen-inner"/></div></div></div></xsl:if><xsl:if test="rows/content/tabcontent_3/fields/terceiro_tab"><div class="tab-pane gen-rows-holder " id="tab-tabcontent_3-terceiro_tab" rel="tab-tabcontent_3-terceiro_tab" item-name="terceiro_tab"><xsl:call-template name="get-active-tab"><xsl:with-param name="value" select="rows/content/tabcontent_3/fields/terceiro_tab/value"/><xsl:with-param name="class" select="'tab-pane'"/></xsl:call-template><div class="row " id="row-38e076b9"><div class="gen-column col-sm-12"><div class="gen-inner"/></div></div></div></xsl:if></div></div><div class="panel-group gen-container-item " id="panels_1" template="igrp-accordion-group" gen-class="" item-name="panels_1"><xsl:if test="rows/content/panels_1/fields/button_1"><div class="panel panel-default no-shadow "><div class="panel-heading gen-fields-holder" rel="pnl-panels_1-button_1"><h4 class="panel-title"><a data-toggle="collapse" data-parent="#panels_1" href="#panels_1-button_1" class="collapse-icon-ctrl "><span><xsl:value-of select="rows/content/panels_1/fields/button_1/label"/></span><i class="fa fa-angle-right" text-color="1"/></a></h4></div><div id="panels_1-button_1" class="panel-collapse collapse "><div class="panel-body"><div class="gen-rows-holder" rel="pnl-panels_1-button_1"><div class="row " id="row-639a5156"><div class="gen-column col-sm-12"><div class="gen-inner"/></div></div></div></div></div></div></xsl:if><xsl:if test="rows/content/panels_1/fields/d2_painel"><div class="panel panel-default no-shadow "><div class="panel-heading gen-fields-holder" rel="pnl-panels_1-d2_painel"><h4 class="panel-title"><a data-toggle="collapse" data-parent="#panels_1" href="#panels_1-d2_painel" class="collapse-icon-ctrl collapsed"><span><xsl:value-of select="rows/content/panels_1/fields/d2_painel/label"/></span><i class="fa fa-angle-right" text-color="1"/></a></h4></div><div id="panels_1-d2_painel" class="panel-collapse collapse "><div class="panel-body"><div class="gen-rows-holder" rel="pnl-panels_1-d2_painel"><div class="row " id="row-7ef30142"><div class="gen-column col-sm-12"><div class="gen-inner"/></div></div></div></div></div></div></xsl:if><xsl:if test="rows/content/panels_1/fields/acertou_3_panel"><div class="panel panel-default no-shadow "><div class="panel-heading gen-fields-holder" rel="pnl-panels_1-acertou_3_panel"><h4 class="panel-title"><a data-toggle="collapse" data-parent="#panels_1" href="#panels_1-acertou_3_panel" class="collapse-icon-ctrl collapsed"><span><xsl:value-of select="rows/content/panels_1/fields/acertou_3_panel/label"/></span><i class="fa fa-angle-right" text-color="1"/></a></h4></div><div id="panels_1-acertou_3_panel" class="panel-collapse collapse "><div class="panel-body"><div class="gen-rows-holder" rel="pnl-panels_1-acertou_3_panel"><div class="row " id="row-a8c6a1a7"><div class="gen-column col-sm-12"><div class="gen-inner"/></div></div></div></div></div></div></xsl:if></div></div></div><div class="gen-column col-sm-6"><div class="gen-inner"><xsl:if test="rows/content/toolsbar_2"><div class="toolsbar-holder default gen-container-item " gen-structure="toolsbar" gen-fields=".btns-holder&gt;a.btn" gen-class="" item-name="toolsbar_2"><div class="btns-holder   pull-right" role="group"><xsl:apply-templates select="rows/content/toolsbar_2" mode="gen-buttons"><xsl:with-param name="vertical" select="'true'"/><xsl:with-param name="outline" select="'false'"/></xsl:apply-templates></div></div></xsl:if><xsl:if test="rows/content/treelist_1"><div class="igrp-treelist box gen-container-item " gen-fields=".h-tst" gen-class="" item-name="treelist_1"><xsl:call-template name="box-header"><xsl:with-param name="title" select="rows/content/treelist_1/@title"/><xsl:with-param name="collapsible" select="'true'"/><xsl:with-param name="collapsed" select="'false'"/></xsl:call-template><xsl:apply-templates select="rows/content/treelist_1" mode="IGRP-treelist"><xsl:with-param name="prefix" select="'treelist_1_'"/></xsl:apply-templates></div></xsl:if><xsl:if test="rows/content/treemenu_1"><div class="treemenu box gen-container-item " gen-structure="treemenu" gen-class="" item-name="treemenu_1"><xsl:call-template name="box-header"><xsl:with-param name="title" select="rows/content/treemenu_1/@title"/><xsl:with-param name="collapsible" select="'true'"/><xsl:with-param name="collapsed" select="'false'"/></xsl:call-template><xsl:apply-templates mode="form-hidden-fields" select="rows/content/treemenu_1/fields"/><xsl:apply-templates select="rows/content/treemenu_1" mode="treemenu"><xsl:with-param name="target" select="'_blank'"/><xsl:with-param name="style" select="'default'"/><xsl:with-param name="tooltip" select="'true'"/></xsl:apply-templates></div></xsl:if><xsl:if test="rows/content/verticalmenu_1"><div class="igrp-vertical-menu gen-container-item " gen-fields=".list-group .btn" template="default" gen-class="" item-name="verticalmenu_1"><xsl:call-template name="box-header"><xsl:with-param name="title" select="rows/content/verticalmenu_1/@title"/><xsl:with-param name="collapsible" select="'false'"/><xsl:with-param name="collapsed" select="''"/></xsl:call-template><div class="list-group"><xsl:apply-templates select="rows/content/verticalmenu_1" mode="gen-buttons"><xsl:with-param name="vertical" select="'true'"/></xsl:apply-templates></div></div></xsl:if><div class="gen-tab-holder nav-tabs-custom     gen-container-item " tab-template="navbar" gen-class="" item-name="tabcontent_2"><ul class="nav nav-tabs"><xsl:if test="rows/content/tabcontent_2/fields/template_navbar"><li item-name="template_navbar" class=" gen-fields-holder" rel="tab-tabcontent_2-template_navbar"><xsl:call-template name="get-active-tab"><xsl:with-param name="value" select="rows/content/tabcontent_2/fields/template_navbar/value"/></xsl:call-template><a active-text-color="primary" data-toggle="tab" aria-expanded="true" href="#tab-tabcontent_2-template_navbar"><i class="fa fa-bar-chart-o"/><span><xsl:value-of select="rows/content/tabcontent_2/fields/template_navbar/label"/></span></a></li></xsl:if><xsl:if test="rows/content/tabcontent_2/fields/segundo_return_1"><li item-name="segundo_return_1" class=" gen-fields-holder" rel="tab-tabcontent_2-segundo_return_1"><xsl:call-template name="get-active-tab"><xsl:with-param name="value" select="rows/content/tabcontent_2/fields/segundo_return_1/value"/></xsl:call-template><a active-text-color="primary" data-toggle="tab" aria-expanded="true" href="#tab-tabcontent_2-segundo_return_1"><i class="fa fa-wheelchair-alt"/><span><xsl:value-of select="rows/content/tabcontent_2/fields/segundo_return_1/label"/></span></a></li></xsl:if><xsl:if test="rows/content/tabcontent_2/fields/terceiro_tab_1"><li item-name="terceiro_tab_1" class=" gen-fields-holder" rel="tab-tabcontent_2-terceiro_tab_1"><xsl:call-template name="get-active-tab"><xsl:with-param name="value" select="rows/content/tabcontent_2/fields/terceiro_tab_1/value"/></xsl:call-template><a active-text-color="primary" data-toggle="tab" aria-expanded="true" href="#tab-tabcontent_2-terceiro_tab_1"><i class="fa fa-btc"/><span><xsl:value-of select="rows/content/tabcontent_2/fields/terceiro_tab_1/label"/></span></a></li></xsl:if></ul><div class="tab-content"><xsl:if test="rows/content/tabcontent_2/fields/template_navbar"><div class="tab-pane gen-rows-holder " id="tab-tabcontent_2-template_navbar" rel="tab-tabcontent_2-template_navbar" item-name="template_navbar"><xsl:call-template name="get-active-tab"><xsl:with-param name="value" select="rows/content/tabcontent_2/fields/template_navbar/value"/><xsl:with-param name="class" select="'tab-pane'"/></xsl:call-template><div class="row " id="row-ae07f5b4"><div class="gen-column col-sm-12"><div class="gen-inner"><xsl:if test="rows/content/toolsbar_1"><div class="toolsbar-holder default gen-container-item " gen-structure="toolsbar" gen-fields=".btns-holder&gt;a.btn" gen-class="" item-name="toolsbar_1"><div class="btns-holder   pull-right" role="group"><xsl:apply-templates select="rows/content/toolsbar_1" mode="gen-buttons"><xsl:with-param name="vertical" select="'true'"/><xsl:with-param name="outline" select="'false'"/></xsl:apply-templates></div></div></xsl:if></div></div></div></div></xsl:if><xsl:if test="rows/content/tabcontent_2/fields/segundo_return_1"><div class="tab-pane gen-rows-holder " id="tab-tabcontent_2-segundo_return_1" rel="tab-tabcontent_2-segundo_return_1" item-name="segundo_return_1"><xsl:call-template name="get-active-tab"><xsl:with-param name="value" select="rows/content/tabcontent_2/fields/segundo_return_1/value"/><xsl:with-param name="class" select="'tab-pane'"/></xsl:call-template><div class="row " id="row-3efaca9e"><div class="gen-column col-sm-12"><div class="gen-inner"/></div></div></div></xsl:if><xsl:if test="rows/content/tabcontent_2/fields/terceiro_tab_1"><div class="tab-pane gen-rows-holder " id="tab-tabcontent_2-terceiro_tab_1" rel="tab-tabcontent_2-terceiro_tab_1" item-name="terceiro_tab_1"><xsl:call-template name="get-active-tab"><xsl:with-param name="value" select="rows/content/tabcontent_2/fields/terceiro_tab_1/value"/><xsl:with-param name="class" select="'tab-pane'"/></xsl:call-template><div class="row " id="row-cf0b3321"><div class="gen-column col-sm-12"><div class="gen-inner"/></div></div></div></xsl:if></div></div></div></div></div></div></div></div></div><xsl:call-template name="IGRP-bottom"/></form><script type="text/javascript" src="{$path}/plugins/tabs/igrp.tabs.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/panels/igrp.panels.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/treemenu/treemenu.js?v={$version}"/></body></html></xsl:template><xsl:include href="../../../xsl/tmpl/IGRP-functions.tmpl.xsl?v=12"/><xsl:include href="../../../xsl/tmpl/IGRP-variables.tmpl.xsl?v=12"/><xsl:include href="../../../xsl/tmpl/IGRP-home-include.tmpl.xsl?v=12"/><xsl:include href="../../../xsl/tmpl/IGRP-utils.tmpl.xsl?v=12"/><xsl:include href="../../../xsl/tmpl/IGRP-treelist.tmpl.xsl?v=12"/><xsl:include href="../../../xsl/tmpl/IGRP-treemenu.tmpl.xsl?v=12"/></xsl:stylesheet>