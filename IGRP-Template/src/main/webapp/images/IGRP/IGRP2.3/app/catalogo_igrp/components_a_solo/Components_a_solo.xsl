<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0"><xsl:output method="html" omit-xml-declaration="yes" encoding="utf-8" indent="yes" doctype-system="about:legacy-compat"/><xsl:template match="/"><html><head><xsl:call-template name="IGRP-head"/><link rel="stylesheet" type="text/css" href="{$path}/plugins/circlestatbox/circlestatbox.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/plugins/quickbuttonbox/quickbuttonbox.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/plugins/smallbox/smallbox.css?v={$version}"/><link media="print" rel="stylesheet" type="text/css" href="{$path}/core/calendar/3.0.1/css/fullcalendar.print.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/core/calendar/3.0.1/css/fullcalendar.min.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/core/calendar/3.0.1/css/igrp.calendar.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/plugins/highcharts/igrp.charts.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/plugins/leaflet/library/css/leaflet.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/plugins/infopanel/infopanel.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/plugins/statbox/statbox.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/plugins/timeline/timeline.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/plugins/highcharts/highmaps/highmap.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/plugins/fingerprint/fingerprint.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/plugins/gis/styles/igrp.gis.css?v={$version}"/><style/></head><body class="{$bodyClass} sidebar-off"><xsl:call-template name="IGRP-topmenu"/><form method="POST" class="IGRP-form" name="formular_default" enctype="multipart/form-data"><div class="container-fluid"><div class="row"><xsl:call-template name="IGRP-sidebar"/><div class="col-sm-9 col-md-10 col-md-offset-2 col-sm-offset-3 main" id="igrp-contents"><div class="content"><div class="row row-msg"><div class="gen-column col-md-12"><div class="gen-inner"><xsl:apply-templates mode="igrp-messages" select="rows/content/messages"/></div></div></div><div class="row " id="row-64f432f3"><div class="gen-column col-sm-4"><div class="gen-inner"><xsl:if test="rows/content/circlestatbox_1"><div class="circlestatbox-container csb-small gen-container-item " gen-class="" item-name="circlestatbox_1"><xsl:apply-templates mode="form-hidden-fields" select="rows/content/circlestatbox_1/fields"/><div class="circlestatbox {rows/content/circlestatbox_1/fields/circlestatbox_1_bg/value}"><div class="header"><xsl:value-of select="rows/content/circlestatbox_1/fields/circlestatbox_1_title/value"/></div><span class="percent"><xsl:value-of select="rows/content/circlestatbox_1/fields/circlestatbox_1_lbl/value"/></span><div class="circleStat"><input type="text" value="{rows/content/circlestatbox_1/fields/circlestatbox_1_val/value}" size="small" class="circlestats-chart" readonly="readonly"/></div><xsl:if test="rows/content/circlestatbox_1/fields/circlestatbox_1_desc/value != ''"><div class="footer"><a class="clickable" target="modal" style="display: block;" href="{rows/content/circlestatbox_1/fields/circlestatbox_1_url/value}"><span class="description"><xsl:value-of select="rows/content/circlestatbox_1/fields/circlestatbox_1_desc/value"/></span></a></div></xsl:if></div></div></xsl:if></div></div><div class="gen-column col-sm-4"><div class="gen-inner"><xsl:if test="rows/content/quickbuttonbox_1"><div class="quick-button-box gen-container-item " gen-class="" item-name="quickbuttonbox_1"><xsl:apply-templates mode="form-hidden-fields" select="rows/content/quickbuttonbox_1/fields"/><a href="{rows/content/quickbuttonbox_1/fields/quickbuttonbox_1_url/value}" target="modal" class="quick-button metro {rows/content/quickbuttonbox_1/fields/quickbuttonbox_1_bg/value}"><i class="fa {rows/content/quickbuttonbox_1/fields/quickbuttonbox_1_icn/value}" aria-hidden="true"/><p><xsl:value-of select="rows/content/quickbuttonbox_1/fields/quickbuttonbox_1_title/value"/></p><span class="badge"><xsl:value-of select="rows/content/quickbuttonbox_1/fields/quickbuttonbox_1_val/value"/></span></a></div></xsl:if></div></div><div class="gen-column col-sm-4"><div class="gen-inner"><xsl:if test="rows/content/smallbox_1"><div class="small-box panel {rows/content/smallbox_1/fields/smallbox_1_bg/value} gen-container-item " gen-class="" item-name="smallbox_1"><xsl:apply-templates mode="form-hidden-fields" select="rows/content/smallbox_1/fields"/><div class="panel-heading clearfix"><div class="sb-icon"><i class="fa {rows/content/smallbox_1/fields/smallbox_1_icn/value} fa-3x"/></div><div class="col-xs-12 text-right pull-right sb-contents"><div class="huge"><xsl:value-of select="rows/content/smallbox_1/fields/smallbox_1_val/value"/></div><div><xsl:value-of select="rows/content/smallbox_1/fields/smallbox_1_title/value"/></div></div></div><xsl:if test="rows/content/smallbox_1/fields/smallbox_1_lbl/value != ''"><a href="{rows/content/smallbox_1/fields/smallbox_1_url/value}" target="modal" class="{rows/content/smallbox_1/fields/smallbox_1_bg/value}-text"><div class="panel-footer"><span class="pull-left"><xsl:value-of select="rows/content/smallbox_1/fields/smallbox_1_lbl/value"/></span><span class="pull-right"><i class="fa fa-arrow-circle-right"/></span><div class="clearfix"/></div></a></xsl:if></div></xsl:if></div></div></div><div class="row " id="row-0a15fb3b"><div class="gen-column col-sm-6"><div class="gen-inner"><xsl:if test="rows/content/calendar_1"><div class="box gen-container-item " gen-class="" item-name="calendar_1"><xsl:call-template name="box-header"><xsl:with-param name="title" select="rows/content/calendar_1/@title"/><xsl:with-param name="collapsible" select="'true'"/><xsl:with-param name="collapsed" select="'false'"/></xsl:call-template><div class="box-body"><xsl:apply-templates mode="IGRP-calendar" select="rows/content/calendar_1"><xsl:with-param name="id" select="'calendar_1'"/><xsl:with-param name="lang" select="rows/content/calendar_1/fields/calendar_1_lang/value"/><xsl:with-param name="editevents" select="'catalogo_igrp.nosi.webapps.catalogo_igrp.pages'"/><xsl:with-param name="addevents" select="rows/content/calendar_1/fields/calendar_1_add/value"/><xsl:with-param name="alleditevents" select="rows/content/calendar_1/fields/calendar_1_edit/value"/><xsl:with-param name="defaultview" select="rows/content/calendar_1/fields/calendar_1_view/value"/><xsl:with-param name="defaultdate" select="rows/content/calendar_1/fields/calendar_1_date/value"/><xsl:with-param name="views" select="''"/><xsl:with-param name="header" select="''"/></xsl:apply-templates></div></div></xsl:if><xsl:if test="rows/content/carousel_1"><div class="box gen-container-item " gen-class="" item-name="carousel_1"><xsl:call-template name="box-header"><xsl:with-param name="title" select="rows/content/carousel_1/@title"/><xsl:with-param name="collapsible" select="'true'"/><xsl:with-param name="collapsed" select="'false'"/></xsl:call-template><div class="box-body" style="padding:0"><div id="carousel_1" class="carousel slide" data-ride="carousel" gen-fields=".carousel-inner .item"><xsl:apply-templates select="rows/content/carousel_1" mode="igrp-carousel"><xsl:with-param name="id" select="'carousel_1'"/></xsl:apply-templates></div></div></div></xsl:if><xsl:if test="rows/content/chart_1"><div class="box gen-container-item " gen-structure="graphic" gen-class="" item-name="chart_1"><xsl:call-template name="box-header"><xsl:with-param name="title" select="rows/content/chart_1/@title"/><xsl:with-param name="collapsible" select="'true'"/><xsl:with-param name="collapsed" select="'false'"/></xsl:call-template><div class="box-body"><xsl:call-template name="igrp-graph"><xsl:with-param name="table" select="rows/content/chart_1"/><xsl:with-param name="chart_type" select="rows/content/chart_1/chart_type"/><xsl:with-param name="height" select="'250'"/><xsl:with-param name="title" select="'Chart'"/><xsl:with-param name="url" select="rows/content/chart_1/url"/><xsl:with-param name="filter" select="'true'"/><xsl:with-param name="filter_type" select="''"/></xsl:call-template></div></div></xsl:if><xsl:if test="rows/content/iframe_1"><div class="igrp-iframe box gen-container-item " gen-class="" item-name="iframe_1"><xsl:call-template name="box-header"><xsl:with-param name="title" select="rows/content/iframe_1/@title"/><xsl:with-param name="collapsible" select="'true'"/><xsl:with-param name="collapsed" select="'true'"/></xsl:call-template><div class="box-body"><iframe id="id-iframe_1" style="min-height:250px" src="{rows/content/iframe_1/fields/iframe_1_src/value}"/></div></div></xsl:if><xsl:if test="rows/content/sectionheader_1"><section class="content-header gen-container-item " gen-class="" item-name="sectionheader_1"><h2 class="disable-output-escaping"><xsl:value-of disable-output-escaping="yes" select="rows/content/sectionheader_1/fields/sectionheader_1_text/value"/></h2></section></xsl:if><xsl:if test="rows/content/paragraph_1"><div class=" igrp-paragraph gen-container-item " gen-class="" item-name="paragraph_1"><div class="box-body disable-output-escaping"><xsl:value-of disable-output-escaping="yes" select="rows/content/paragraph_1/fields/paragraph_1_text/value"/></div></div></xsl:if><xsl:if test="rows/content/video_1"><div class="gen-container-item " gen-class="" item-name="video_1"><div class="box-body"><iframe style="height:300px" src="{rows/content/video_1/fields/video_1_text/value}" frameborder="0" allowfullscreen=""/></div></div></xsl:if><xsl:if test="rows/content/leafletmap_1"><div class="box gen-container-item " gen-class="" item-name="leafletmap_1"><div class="box-body" style="padding:0"><div id="leaflet-leafletmap_1" class="igrp-leaflet-map" style="min-height: 400px;"><xsl:if test="rows/content/leafletmap_1_markers"><xsl:attribute name="markers-data"><xsl:call-template name="igrp-leaflet-markers-json"><xsl:with-param name="tag" select="'leafletmap_1'"/><xsl:with-param name="data" select="rows/content/leafletmap_1_markers"/></xsl:call-template></xsl:attribute></xsl:if></div></div></div></xsl:if></div></div><div class="gen-column col-sm-6"><div class="gen-inner"><xsl:if test="rows/content/infopanel_1"><div class="igrp-infopanel gen-container-item " gen-class="" item-name="infopanel_1"><a href="{rows/content/infopanel_1/fields/infopanel_1_url/value}" target="modal" class="quick-stats__item {rows/content/infopanel_1/fields/infopanel_1_bg/value}"><div class="quick-stats__info"><h2><xsl:value-of select="rows/content/infopanel_1/fields/infopanel_1_val/value"/></h2><small><xsl:value-of select="rows/content/infopanel_1/fields/infopanel_1_title/value"/></small></div><div class="quick-stats__icon"><i class="fa {rows/content/infopanel_1/fields/infopanel_1_icn/value} fa-3x"/></div></a></div></xsl:if><xsl:if test="rows/content/statbox_1"><div class="statbox_container gen-container-item " gen-class="" item-name="statbox_1"><xsl:apply-templates mode="form-hidden-fields" select="rows/content/statbox_1/fields"/><div class="statbox {rows/content/statbox_1/fields/statbox_1_bg/value}"><div class="boxchart"><canvas/></div><div class="number"><xsl:value-of select="rows/content/statbox_1/fields/statbox_1_val/value"/><i class="fa {rows/content/statbox_1/fields/statbox_1_icn/value}" aria-hidden="true"/></div><div class="title"><xsl:value-of select="rows/content/statbox_1/fields/statbox_1_title/value"/></div><div class="footer"><a href="{rows/content/statbox_1/fields/statbox_1_url/value}" target="modal"><xsl:value-of select="rows/content/statbox_1/fields/statbox_1_txt/value"/></a></div></div></div></xsl:if><xsl:if test="rows/content/timeline_1"><div class="time-line box clean gen-container-item " gen-structure="timeline" gen-class="" item-name="timeline_1"><xsl:apply-templates mode="IGRP-timeline" select="rows/content/timeline_1"><xsl:with-param name="themes" select="'hexa-theme'"/><xsl:with-param name="bg" select="'cp-vermillion'"/></xsl:apply-templates></div></xsl:if><xsl:if test="rows/content/mapchart_1"><div class="box gen-container-item " gen-class="" item-name="mapchart_1"><xsl:call-template name="box-header"><xsl:with-param name="title" select="rows/content/mapchart_1/@title"/><xsl:with-param name="collapsible" select="'true'"/><xsl:with-param name="collapsed" select="'false'"/></xsl:call-template><div class="box-body"><div id="highmap-mapchart_1" class="igrp-highmaps" map-height="420" basemap="{rows/content/mapchart_1/fields/mapchart_1_basemap/value}" data="{rows/content/mapchart_1/fields/mapchart_1_data/value}" config="{rows/content/mapchart_1/fields/mapchart_1_config/value}" data-labels="{rows/content/mapchart_1/fields/mapchart_1_dt_label/value}" tooltip="true" legend-position="bottom" legend-size="2" export="true" style="margin: 0 auto"><tooltip-format>
				{point.name}: {point.value}
			</tooltip-format></div></div></div></xsl:if><xsl:if test="rows/content/fingerprint_1"><div class="fingerprint box gen-container-item " gen-structure="fingerprint" gen-class="" item-name="fingerprint_1"><xsl:call-template name="box-header"><xsl:with-param name="title" select="rows/content/fingerprint_1/@title"/><xsl:with-param name="collapsible" select="'false'"/><xsl:with-param name="collapsed" select="'false'"/></xsl:call-template><xsl:call-template name="fingerprint"><xsl:with-param name="fp" select="rows/content/fingerprint_1/fields"/></xsl:call-template></div></xsl:if></div></div></div><div class="row " id="row-04d36e31"><div class="gen-column col-sm-12"><div class="gen-inner"><xsl:if test="rows/content/map_os_1"><div gen-fields=".layer-group" id="map_os_1-wrapper" gen-class="" class="gen-container-item " item-name="map_os_1"><xsl:call-template name="gis-map-view"><xsl:with-param name="id" select="'map_os_1'"/><xsl:with-param name="data" select="rows/content/map_os_1/fields/map_os_1_data/value"/></xsl:call-template></div></xsl:if></div></div></div></div></div></div></div><xsl:call-template name="IGRP-bottom"/></form><script type="text/javascript" src="{$path}/plugins/circlestatbox/jquery.knob.modified.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/circlestatbox/igrp.circlestatbox.init.js?v={$version}"/><script type="text/javascript" src="{$path}/core/moment/moment.min.js?v={$version}"/><script charset="UTF-8" type="text/javascript" src="{$path}/core/calendar/3.0.1/js/fullcalendar.min.js?v={$version}"/><script charset="UTF-8" type="text/javascript" src="{$path}/core/calendar/3.0.1/js/locale-all.js?v={$version}"/><script type="text/javascript" src="{$path}/core/igrp/table/table.contextmenu.js?v={$version}"/><script type="text/javascript" src="{$path}/core/calendar/3.0.1/js/igrp.calendar.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/highcharts/highcharts.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/highcharts/highcharts-more.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/highcharts/exporting.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/highcharts/funnel.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/highcharts/heatmap.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/highcharts/treemap.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/highcharts/igrp.charts.js?v={$version}"/><script type="text/javascript" src="{$path}/core/igrp/iframenav/com.iframe.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/leaflet/library/js/leaflet.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/leaflet/library/js/leaflet.ajax.min.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/leaflet/library/js/proj4.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/leaflet/library/js/proj4leaflet.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/leaflet/igrp.leaflet.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/canvg.js/rgbcolor.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/canvg.js/StackBlur.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/canvg.js/canvg.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/canvas2blob/canvas-to-blob.min.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/html2canvas/html2canvas.min.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/html2canvas/html2canvas.svg.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/filesaver/FileSaver.min.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/highcharts/highmaps/map.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/highcharts/highmaps/data.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/highcharts/highmaps/drilldown.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/highcharts/highmaps/highmap.controller.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/fingerprint/fingerprint.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/leaflet/library/plugins/basemap-provider/leaflet-providers.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/leaflet/library/plugins/ajax/leaflet.ajax.min.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/leaflet/library/plugins/proj4leaflet/proj4.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/leaflet/library/plugins/proj4leaflet/proj4leaflet.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/handlebars/handlebars-v4.1.1.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/gis/v2/gis.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/gis/v2/modules/gis.utils.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/gis/v2/modules/gis.templates.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/gis/v2/modules/gis.map.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/gis/v2/modules/gis.basemaps.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/gis/v2/modules/gis.query.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/gis/v2/modules/gis.layers.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/gis/v2/modules/gis.layer.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/gis/v2/modules/gis.widgets.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/gis/v2/modules/gis.widget.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/gis/v2/modules/gis.panels.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/gis/v2/modules/gis.graphics.js?v={$version}"/></body></html></xsl:template><xsl:include href="../../../xsl/tmpl/IGRP-functions.tmpl.xsl?v=16"/><xsl:include href="../../../xsl/tmpl/IGRP-variables.tmpl.xsl?v=16"/><xsl:include href="../../../xsl/tmpl/IGRP-home-include.tmpl.xsl?v=16"/><xsl:include href="../../../xsl/tmpl/IGRP-utils.tmpl.xsl?v=16"/><xsl:include href="../../../xsl/tmpl/IGRP-calendar.tmpl.xsl?v=16"/><xsl:include href="../../../xsl/tmpl/IGRP-carousel.tmpl.xsl?v=16"/><xsl:include href="../../../xsl/tmpl/IGRP-charts.tmpl.xsl?v=16"/><xsl:include href="../../../xsl/tmpl/IGRP-leaflet.tmpl.xsl?v=16"/><xsl:include href="../../../xsl/tmpl/IGRP-timeline.tmpl.xsl?v=16"/><xsl:include href="../../../xsl/tmpl/IGRP-fingerprint.tmpl.xsl?v=16"/><xsl:include href="../../../xsl/tmpl/IGRP-gis.map.tmpl.xsl?v=16"/></xsl:stylesheet>
