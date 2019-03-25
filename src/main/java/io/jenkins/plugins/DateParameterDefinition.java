package io.jenkins.plugins;

import hudson.model.ParameterDefinition;
import hudson.model.ParameterValue;
import net.sf.json.JSONObject;
import org.kohsuke.stapler.StaplerRequest;

import javax.annotation.CheckForNull;


public class DateParameterDefinition extends ParameterDefinition {

    public DateParameterDefinition(String name) {
        super(name);
    }

    public DateParameterDefinition(String name, String description) {
        super(name, description);
    }

    @CheckForNull
    @Override
    public ParameterValue createValue(StaplerRequest staplerRequest, JSONObject jsonObject) {
        return null;
    }

    @CheckForNull
    @Override
    public ParameterValue createValue(StaplerRequest staplerRequest) {
        return null;
    }
}
