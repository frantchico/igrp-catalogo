<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0"><xsl:output method="html" omit-xml-declaration="yes" encoding="utf-8" indent="yes" doctype-system="about:legacy-compat"/><xsl:template match="/"><html><head><xsl:call-template name="IGRP-head"/><link rel="stylesheet" type="text/css" href="{$path}/plugins/tabs/igrp.tabs.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/plugins/select2/select2.min.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/plugins/select2/select2.style.css?v={$version}"/><style>.box{    box-shadow: 0 0px 0px rgba(0,0,0,0.1);}</style></head><body class="{$bodyClass} sidebar-off"><xsl:call-template name="IGRP-topmenu"/><form method="POST" class="IGRP-form" name="formular_default" enctype="multipart/form-data"><div class="container-fluid"><div class="row"><xsl:call-template name="IGRP-sidebar"/><div class="col-sm-9 col-md-10 col-md-offset-2 col-sm-offset-3 main" id="igrp-contents"><div class="content"><div class="row row-msg"><div class="gen-column col-md-12"><div class="gen-inner"><xsl:apply-templates mode="igrp-messages" select="rows/content/messages"/></div></div></div><div class="row " id="row-6b30783e"><div class="gen-column col-md-12"><div class="gen-inner"><xsl:if test="rows/content/sectionheader_1"><section class="content-header gen-container-item " gen-class="" item-name="sectionheader_1"><h2><xsl:value-of select="rows/content/sectionheader_1/fields/sectionheader_1_text/value"/></h2></section></xsl:if><div class="gen-tab-holder nav-tabs-custom    gen-container-item " tab-template="default" gen-class="" item-name="tabcontent_1"><ul class="nav nav-tabs"><xsl:if test="rows/content/tabcontent_1/fields/importar_aplicacao"><li item-name="importar_aplicacao" class=" gen-fields-holder" rel="tab-tabcontent_1-importar_aplicacao"><xsl:call-template name="get-active-tab"><xsl:with-param name="value" select="rows/content/tabcontent_1/fields/importar_aplicacao/value"/></xsl:call-template><a active-text-color="primary" data-toggle="tab" aria-expanded="true" href="#tab-tabcontent_1-importar_aplicacao"><i class="fa fa-cloud-upload"/><span><xsl:value-of select="rows/content/tabcontent_1/fields/importar_aplicacao/label"/></span></a></li></xsl:if><xsl:if test="rows/content/tabcontent_1/fields/importar_pagina"><li item-name="importar_pagina" class=" gen-fields-holder" rel="tab-tabcontent_1-importar_pagina"><xsl:call-template name="get-active-tab"><xsl:with-param name="value" select="rows/content/tabcontent_1/fields/importar_pagina/value"/></xsl:call-template><a active-text-color="primary" data-toggle="tab" aria-expanded="true" href="#tab-tabcontent_1-importar_pagina"><i class="fa fa-cloud-upload"/><span><xsl:value-of select="rows/content/tabcontent_1/fields/importar_pagina/label"/></span></a></li></xsl:if><xsl:if test="rows/content/tabcontent_1/fields/importar_jar_file"><li item-name="importar_jar_file" class=" gen-fields-holder" rel="tab-tabcontent_1-importar_jar_file"><xsl:call-template name="get-active-tab"><xsl:with-param name="value" select="rows/content/tabcontent_1/fields/importar_jar_file/value"/></xsl:call-template><a active-text-color="primary" data-toggle="tab" aria-expanded="true" href="#tab-tabcontent_1-importar_jar_file"><i class="fa fa-cloud-upload"/><span><xsl:value-of select="rows/content/tabcontent_1/fields/importar_jar_file/label"/></span></a></li></xsl:if><xsl:if test="rows/content/tabcontent_1/fields/importar_sql_script"><li item-name="importar_sql_script" class=" gen-fields-holder" rel="tab-tabcontent_1-importar_sql_script"><xsl:call-template name="get-active-tab"><xsl:with-param name="value" select="rows/content/tabcontent_1/fields/importar_sql_script/value"/></xsl:call-template><a active-text-color="primary" data-toggle="tab" aria-expanded="true" href="#tab-tabcontent_1-importar_sql_script"><i class="fa fa-cloud-upload"/><span><xsl:value-of select="rows/content/tabcontent_1/fields/importar_sql_script/label"/></span></a></li></xsl:if></ul><div class="tab-content"><xsl:if test="rows/content/tabcontent_1/fields/importar_aplicacao"><div class="tab-pane gen-rows-holder " id="tab-tabcontent_1-importar_aplicacao" rel="tab-tabcontent_1-importar_aplicacao" item-name="importar_aplicacao"><xsl:call-template name="get-active-tab"><xsl:with-param name="value" select="rows/content/tabcontent_1/fields/importar_aplicacao/value"/><xsl:with-param name="class" select="'tab-pane'"/></xsl:call-template><div class="row " id="row-945c14c6"><div class="gen-column col-sm-12"><div class="gen-inner"><xsl:if test="rows/content/sectionheader_2"><section class="content-header gen-container-item " gen-class="" item-name="sectionheader_2"><h2><xsl:value-of select="rows/content/sectionheader_2/fields/sectionheader_2_text/value"/></h2></section></xsl:if><xsl:if test="rows/content/form_2"><div class="box igrp-forms gen-container-item " gen-class="" item-name="form_2"><div class="box-body"><div role="form"><xsl:apply-templates mode="form-hidden-fields" select="rows/content/form_2/fields"/><xsl:if test="rows/content/form_2/fields/arquivo_aplicacao"><div class="form-group col-sm-4  gen-fields-holder" item-name="arquivo_aplicacao" item-type="file" required="required"><label for="{rows/content/form_2/fields/arquivo_aplicacao/@name}"><span><xsl:value-of select="rows/content/form_2/fields/arquivo_aplicacao/label"/></span></label><div class="input-group"><input type="text" class="form-control not-form" readonly=""/><span class="input-group-btn"><span class="btn btn-primary file-btn-holder"><i class="fa fa-upload"/><input id="{rows/content/form_2/fields/arquivo_aplicacao/@name}" name="{rows/content/form_2/fields/arquivo_aplicacao/@name}" required="required" value="{rows/content/form_2/fields/arquivo_aplicacao/value}" target-rend="" class="transparent " type="file" accept=""><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_2/fields/arquivo_aplicacao"/></xsl:call-template></input></span></span></div></div></xsl:if></div></div><xsl:apply-templates select="rows/content/form_2/tools-bar" mode="form-buttons"/></div></xsl:if></div></div></div></div></xsl:if><xsl:if test="rows/content/tabcontent_1/fields/importar_pagina"><div class="tab-pane gen-rows-holder " id="tab-tabcontent_1-importar_pagina" rel="tab-tabcontent_1-importar_pagina" item-name="importar_pagina"><xsl:call-template name="get-active-tab"><xsl:with-param name="value" select="rows/content/tabcontent_1/fields/importar_pagina/value"/><xsl:with-param name="class" select="'tab-pane'"/></xsl:call-template><div class="row " id="row-7bbb35df"><div class="gen-column col-sm-12"><div class="gen-inner"><xsl:if test="rows/content/sectionheader_3"><section class="content-header gen-container-item " gen-class="" item-name="sectionheader_3"><h2><xsl:value-of select="rows/content/sectionheader_3/fields/sectionheader_3_text/value"/></h2></section></xsl:if><xsl:if test="rows/content/form_1"><div class="box igrp-forms gen-container-item " gen-class="" item-name="form_1"><div class="box-body"><div role="form"><xsl:apply-templates mode="form-hidden-fields" select="rows/content/form_1/fields"/><xsl:if test="rows/content/form_1/fields/list_aplicacao"><div class="col-sm-4 form-group  gen-fields-holder" item-name="list_aplicacao" item-type="select" required="required"><label for="{rows/content/form_1/fields/list_aplicacao/@name}"><xsl:value-of select="rows/content/form_1/fields/list_aplicacao/label"/></label><select class="form-control select2 " id="form_1_list_aplicacao" name="{rows/content/form_1/fields/list_aplicacao/@name}" required="required"><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_1/fields/list_aplicacao"/></xsl:call-template><xsl:for-each select="rows/content/form_1/fields/list_aplicacao/list/option"><option value="{value}" label="{text}"><xsl:if test="@selected='true'"><xsl:attribute name="selected">selected</xsl:attribute></xsl:if><span><xsl:value-of select="text"/></span></option></xsl:for-each></select></div></xsl:if><xsl:if test="rows/content/form_1/fields/arquivo_pagina"><div class="form-group col-sm-3  gen-fields-holder" item-name="arquivo_pagina" item-type="file" required="required"><label for="{rows/content/form_1/fields/arquivo_pagina/@name}"><span><xsl:value-of select="rows/content/form_1/fields/arquivo_pagina/label"/></span></label><div class="input-group"><input type="text" class="form-control not-form" readonly=""/><span class="input-group-btn"><span class="btn btn-primary file-btn-holder"><i class="fa fa-upload"/><input id="{rows/content/form_1/fields/arquivo_pagina/@name}" name="{rows/content/form_1/fields/arquivo_pagina/@name}" required="required" value="{rows/content/form_1/fields/arquivo_pagina/value}" target-rend="" class="transparent " type="file" accept=""><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_1/fields/arquivo_pagina"/></xsl:call-template></input></span></span></div></div></xsl:if></div></div><xsl:apply-templates select="rows/content/form_1/tools-bar" mode="form-buttons"/></div></xsl:if></div></div></div></div></xsl:if><xsl:if test="rows/content/tabcontent_1/fields/importar_jar_file"><div class="tab-pane gen-rows-holder " id="tab-tabcontent_1-importar_jar_file" rel="tab-tabcontent_1-importar_jar_file" item-name="importar_jar_file"><xsl:call-template name="get-active-tab"><xsl:with-param name="value" select="rows/content/tabcontent_1/fields/importar_jar_file/value"/><xsl:with-param name="class" select="'tab-pane'"/></xsl:call-template><div class="row " id="row-23311ce9"><div class="gen-column col-sm-12"><div class="gen-inner"><xsl:if test="rows/content/sectionheader_4"><section class="content-header gen-container-item " gen-class="" item-name="sectionheader_4"><h2><xsl:value-of select="rows/content/sectionheader_4/fields/sectionheader_4_text/value"/></h2></section></xsl:if><xsl:if test="rows/content/form_3"><div class="box igrp-forms gen-container-item " gen-class="" item-name="form_3"><div class="box-body"><div role="form"><xsl:apply-templates mode="form-hidden-fields" select="rows/content/form_3/fields"/><xsl:if test="rows/content/form_3/fields/jar_file"><div class="form-group col-sm-4  gen-fields-holder" item-name="jar_file" item-type="file" required="required"><label for="{rows/content/form_3/fields/jar_file/@name}"><span><xsl:value-of select="rows/content/form_3/fields/jar_file/label"/></span></label><div class="input-group"><input type="text" class="form-control not-form" readonly=""/><span class="input-group-btn"><span class="btn btn-primary file-btn-holder"><i class="fa fa-upload"/><input id="{rows/content/form_3/fields/jar_file/@name}" name="{rows/content/form_3/fields/jar_file/@name}" required="required" value="{rows/content/form_3/fields/jar_file/value}" target-rend="" class="transparent " type="file" multiple="multiple" accept=".jar"><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_3/fields/jar_file"/></xsl:call-template></input></span></span></div></div></xsl:if></div></div><xsl:apply-templates select="rows/content/form_3/tools-bar" mode="form-buttons"/></div></xsl:if></div></div></div></div></xsl:if><xsl:if test="rows/content/tabcontent_1/fields/importar_sql_script"><div class="tab-pane gen-rows-holder " id="tab-tabcontent_1-importar_sql_script" rel="tab-tabcontent_1-importar_sql_script" item-name="importar_sql_script"><xsl:call-template name="get-active-tab"><xsl:with-param name="value" select="rows/content/tabcontent_1/fields/importar_sql_script/value"/><xsl:with-param name="class" select="'tab-pane'"/></xsl:call-template><div class="row " id="row-9703e1da"><div class="gen-column col-sm-12"><div class="gen-inner"><xsl:if test="rows/content/sectionheader_5"><section class="content-header gen-container-item " gen-class="" item-name="sectionheader_5"><h2><xsl:value-of select="rows/content/sectionheader_5/fields/sectionheader_5_text/value"/></h2></section></xsl:if><xsl:if test="rows/content/form_4"><div class="box igrp-forms gen-container-item " gen-class="" item-name="form_4"><div class="box-body"><div role="form"><xsl:apply-templates mode="form-hidden-fields" select="rows/content/form_4/fields"/><xsl:if test="rows/content/form_4/fields/aplicacao_script"><div class="col-sm-3 form-group  gen-fields-holder" item-name="aplicacao_script" item-type="select" required="required"><label for="{rows/content/form_4/fields/aplicacao_script/@name}"><xsl:value-of select="rows/content/form_4/fields/aplicacao_script/label"/></label><select class="form-control select2 IGRP_change" id="form_4_aplicacao_script" name="{rows/content/form_4/fields/aplicacao_script/@name}" required="required"><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_4/fields/aplicacao_script"/></xsl:call-template><xsl:for-each select="rows/content/form_4/fields/aplicacao_script/list/option"><option value="{value}" label="{text}"><xsl:if test="@selected='true'"><xsl:attribute name="selected">selected</xsl:attribute></xsl:if><span><xsl:value-of select="text"/></span></option></xsl:for-each></select></div></xsl:if><xsl:if test="rows/content/form_4/fields/data_source"><div class="col-sm-3 form-group  gen-fields-holder" item-name="data_source" item-type="select" required="required"><label for="{rows/content/form_4/fields/data_source/@name}"><xsl:value-of select="rows/content/form_4/fields/data_source/label"/></label><select class="form-control select2 " id="form_4_data_source" name="{rows/content/form_4/fields/data_source/@name}" required="required"><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_4/fields/data_source"/></xsl:call-template><xsl:for-each select="rows/content/form_4/fields/data_source/list/option"><option value="{value}" label="{text}"><xsl:if test="@selected='true'"><xsl:attribute name="selected">selected</xsl:attribute></xsl:if><span><xsl:value-of select="text"/></span></option></xsl:for-each></select></div></xsl:if><xsl:if test="rows/content/form_4/fields/sql_script"><div class="form-group col-sm-3  gen-fields-holder" item-name="sql_script" item-type="file" required="required"><label for="{rows/content/form_4/fields/sql_script/@name}"><span><xsl:value-of select="rows/content/form_4/fields/sql_script/label"/></span></label><div class="input-group"><input type="text" class="form-control not-form" readonly=""/><span class="input-group-btn"><span class="btn btn-primary file-btn-holder"><i class="fa fa-upload"/><input id="{rows/content/form_4/fields/sql_script/@name}" name="{rows/content/form_4/fields/sql_script/@name}" required="required" value="{rows/content/form_4/fields/sql_script/value}" target-rend="" class="transparent " type="file" accept=""><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_4/fields/sql_script"/></xsl:call-template></input></span></span></div></div></xsl:if></div></div><xsl:apply-templates select="rows/content/form_4/tools-bar" mode="form-buttons"/></div></xsl:if></div></div></div></div></xsl:if></div></div></div></div></div></div></div></div></div><xsl:call-template name="IGRP-bottom"/></form><script type="text/javascript" src="{$path}/plugins/tabs/igrp.tabs.js?v={$version}"/><script type="text/javascript" src="{$path}/core/igrp/form/igrp.forms.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/select2/select2.full.min.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/select2/select2.init.js?v={$version}"/></body></html></xsl:template><xsl:include href="../../../xsl/tmpl/IGRP-functions.tmpl.xsl?v=1530533364070"/><xsl:include href="../../../xsl/tmpl/IGRP-variables.tmpl.xsl?v=1530533364070"/><xsl:include href="../../../xsl/tmpl/IGRP-home-include.tmpl.xsl?v=1530533364070"/><xsl:include href="../../../xsl/tmpl/IGRP-utils.tmpl.xsl?v=1530533364070"/><xsl:include href="../../../xsl/tmpl/IGRP-form-utils.tmpl.xsl?v=1530533364070"/></xsl:stylesheet>
