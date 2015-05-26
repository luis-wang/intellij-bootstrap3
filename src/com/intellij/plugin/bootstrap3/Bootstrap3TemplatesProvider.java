package com.intellij.plugin.bootstrap3;

/**
 * @author Erik Pragt
 */

import com.intellij.codeInsight.template.impl.DefaultLiveTemplatesProvider;
import org.jetbrains.annotations.Nullable;

public class Bootstrap3TemplatesProvider implements DefaultLiveTemplatesProvider {
    @Override
    public String[] getDefaultLiveTemplateFiles() {
        return new String[]{
                "liveTemplates/Bootstrap3",
                "liveTemplates/Bootstrap3-jade",
                "liveTemplates/FontAwesome",
                "liveTemplates/FontAwesome-jade",
        };
    }

    @Nullable
    @Override
    public String[] getHiddenLiveTemplateFiles() {
        return null;
    }
}
