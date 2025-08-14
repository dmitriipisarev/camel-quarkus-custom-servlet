package com.github.dmitriipisarev.camel.quarkus.custom.servlet.deployment;

import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.FeatureBuildItem;

class CamelQuarkusCustomServletProcessor {

    private static final String FEATURE = "camel-quarkus-custom-servlet";

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(FEATURE);
    }
}
