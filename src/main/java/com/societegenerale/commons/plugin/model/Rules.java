package com.societegenerale.commons.plugin.model;

import org.apache.maven.plugins.annotations.Parameter;

import java.util.List;

public class Rules {

  @Parameter(property = "preConfiguredRules")
  private List<String> preConfiguredRules;

  @Parameter(property = "configurableRules")
  private List<ConfigurableRule> configurableRules;

  public List<String> getPreConfiguredRules() {
    return preConfiguredRules;
  }

  public List<ConfigurableRule> getConfigurableRules() {
    return configurableRules;
  }

}
