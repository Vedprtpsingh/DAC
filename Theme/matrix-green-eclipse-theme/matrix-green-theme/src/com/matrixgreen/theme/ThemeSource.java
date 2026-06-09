// ─────────────────────────────────────────────────────────────────────────────
// File: src/com/matrixgreen/theme/Activator.java
// ─────────────────────────────────────────────────────────────────────────────
package com.matrixgreen.theme;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * Bundle activator for the Matrix Green theme plugin.
 */
public class Activator extends AbstractUIPlugin {

    public static final String PLUGIN_ID = "com.matrixgreen.theme";
    private static Activator plugin;

    @Override
    public void start(BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        plugin = null;
        super.stop(context);
    }

    public static Activator getDefault() {
        return plugin;
    }
}


// ─────────────────────────────────────────────────────────────────────────────
// File: src/com/matrixgreen/theme/MatrixGreenPreferenceInitializer.java
// ─────────────────────────────────────────────────────────────────────────────
package com.matrixgreen.theme;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.internal.themes.ThemeElementHelper;

/**
 * Sets Matrix Green as the default E4 CSS theme on first launch.
 *
 * Key preference: "themeid" in org.eclipse.e4.ui.css.swt.theme
 */
@SuppressWarnings("restriction")
public class MatrixGreenPreferenceInitializer extends AbstractPreferenceInitializer {

    private static final String THEME_PREF_NODE  = "org.eclipse.e4.ui.css.swt.theme";
    private static final String THEME_ID_KEY      = "themeid";
    private static final String MATRIX_THEME_ID   = "com.matrixgreen.theme.css";

    @Override
    public void initializeDefaultPreferences() {
        // Set the default E4 theme to Matrix Green
        org.eclipse.core.runtime.preferences.DefaultScope.INSTANCE
            .getNode(THEME_PREF_NODE)
            .put(THEME_ID_KEY, MATRIX_THEME_ID);
    }
}


// ─────────────────────────────────────────────────────────────────────────────
// File: src/com/matrixgreen/theme/ConsoleColorInitializer.java
// ─────────────────────────────────────────────────────────────────────────────
package com.matrixgreen.theme;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.core.runtime.preferences.DefaultScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;

/**
 * Initialises the Eclipse Console with Matrix Green colour scheme.
 *
 * Console preference node:  org.eclipse.debug.ui
 * Editor  preference node:  org.eclipse.ui.editors
 * JDT UI  preference node:  org.eclipse.jdt.ui
 */
public class ConsoleColorInitializer extends AbstractPreferenceInitializer {

    // RGB helper  ──────────────────────────────────────────────────────────────
    private static String rgb(int r, int g, int b) {
        return r + "," + g + "," + b;
    }

    @Override
    public void initializeDefaultPreferences() {

        // ── Console colours ──────────────────────────────────────────────────
        IEclipsePreferences debugPrefs =
            DefaultScope.INSTANCE.getNode("org.eclipse.debug.ui");

        // Background
        debugPrefs.put("org.eclipse.debug.ui.consoleBackground",    rgb(0, 0, 0));

        // Standard output  → Bright Green
        debugPrefs.put("org.eclipse.debug.ui.outColor",             rgb(0, 255, 0));

        // Standard input   → Neon Green
        debugPrefs.put("org.eclipse.debug.ui.inColor",              rgb(57, 255, 20));

        // Standard error   → Red
        debugPrefs.put("org.eclipse.debug.ui.errorColor",           rgb(255, 68, 68));

        // ── Editor colours ───────────────────────────────────────────────────
        IEclipsePreferences editorPrefs =
            DefaultScope.INSTANCE.getNode("org.eclipse.ui.editors");

        editorPrefs.put("AbstractTextEditor.Color.Background",           rgb(0, 0, 0));
        editorPrefs.putBoolean("AbstractTextEditor.Color.Background.SystemDefault", false);

        editorPrefs.put("AbstractTextEditor.Color.Foreground",           rgb(0, 255, 0));
        editorPrefs.putBoolean("AbstractTextEditor.Color.Foreground.SystemDefault", false);

        editorPrefs.put("AbstractTextEditor.Color.SelectionBackground",  rgb(0, 51, 0));
        editorPrefs.putBoolean("AbstractTextEditor.Color.SelectionBackground.SystemDefault", false);

        editorPrefs.put("AbstractTextEditor.Color.SelectionForeground",  rgb(57, 255, 20));
        editorPrefs.putBoolean("AbstractTextEditor.Color.SelectionForeground.SystemDefault", false);

        editorPrefs.put("currentLineColor",  rgb(0, 26, 0));
        editorPrefs.put("occurrenceHighlightColor", rgb(0, 68, 0));
        editorPrefs.put("matchingBracketsColor", rgb(57, 255, 20));
        editorPrefs.putBoolean("matchingBrackets", true);
        editorPrefs.put("printMarginColor", rgb(0, 40, 0));

        // ── JDT Java syntax colours ──────────────────────────────────────────
        IEclipsePreferences jdtPrefs =
            DefaultScope.INSTANCE.getNode("org.eclipse.jdt.ui");

        // Keywords  → Neon Green
        jdtPrefs.put("java_keyword",       rgb(39, 255, 20));
        jdtPrefs.putBoolean("java_keyword_bold", true);

        // Strings  → Lawn Green
        jdtPrefs.put("java_string",        rgb(124, 252, 0));

        // Single-line comments  → Forest Green (italic)
        jdtPrefs.put("java_single_line_comment", rgb(34, 139, 34));
        jdtPrefs.putBoolean("java_single_line_comment_italic", true);

        // Multi-line comments  → Forest Green (italic)
        jdtPrefs.put("java_multi_line_comment", rgb(34, 139, 34));
        jdtPrefs.putBoolean("java_multi_line_comment_italic", true);

        // Javadoc  → Medium Green
        jdtPrefs.put("java_doc_comment",   rgb(0, 170, 0));
        jdtPrefs.putBoolean("java_doc_comment_italic", true);
        jdtPrefs.put("java_doc_tag",       rgb(57, 255, 20));
        jdtPrefs.putBoolean("java_doc_tag_bold", true);

        // Default / identifier  → Bright Green
        jdtPrefs.put("java_default",       rgb(0, 255, 0));

        // Class names  → Lime Green
        jdtPrefs.put("java_type",          rgb(50, 205, 50));
        jdtPrefs.putBoolean("java_type_bold", true);

        // Method declarations  → Green-Yellow
        jdtPrefs.put("java_method_declaration", rgb(173, 255, 47));

        // Annotations
        jdtPrefs.put("java_annotation",    rgb(0, 170, 0));

        // Numbers  → Lawn Green
        jdtPrefs.put("java_number",        rgb(124, 252, 0));

        // Operators
        jdtPrefs.put("java_operator",      rgb(173, 255, 47));
        jdtPrefs.put("java_bracket",       rgb(0, 255, 0));

        // Semantic highlighting — classes
        jdtPrefs.put("semanticHighlighting.class.color", rgb(50, 205, 50));
        jdtPrefs.putBoolean("semanticHighlighting.class.bold", true);
        jdtPrefs.putBoolean("semanticHighlighting.class.enabled", true);

        // Semantic highlighting — methods
        jdtPrefs.put("semanticHighlighting.methodDeclaration.color", rgb(173, 255, 47));
        jdtPrefs.putBoolean("semanticHighlighting.methodDeclaration.enabled", true);

        // Semantic highlighting — fields
        jdtPrefs.put("semanticHighlighting.field.color", rgb(0, 255, 0));
        jdtPrefs.putBoolean("semanticHighlighting.field.italic", true);
        jdtPrefs.putBoolean("semanticHighlighting.field.enabled", true);

        // Line numbers
        jdtPrefs.put("lineNumberColor",    rgb(0, 170, 0));
    }
}
