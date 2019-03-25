package io.jenkins.plugins;

import hudson.model.ParameterValue;
import net.sf.json.JSONObject;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DateParameterDefinitionTest {

    private DateParameterDefinition dateParameterDefinition;

    @BeforeEach
    void setUp() {
        dateParameterDefinition = new DateParameterDefinition("test");
    }

    @AfterEach
    void tearDown() {
    }

    @DisplayName("[createValue(StaplerRequest)] basic")
    @Test
    void createValueWithOneParameter() {
        // Given

        // When
        ParameterValue result = dateParameterDefinition.createValue(null);

        // Then
        assertThat(result).isNull();
    }

    @DisplayName("[createValue(StaplerRequest, JSONObject)] basic")
    @Test
    void createValueWithTwoParameters() {
        // Given
        JSONObject json = new JSONObject();

        // When
        ParameterValue result = dateParameterDefinition.createValue(null, json);

        // Then
        assertThat(result).isNull();
    }
}