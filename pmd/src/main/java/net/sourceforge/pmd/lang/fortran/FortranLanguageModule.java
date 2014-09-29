package net.sourceforge.pmd.lang.fortran;

import net.sourceforge.pmd.lang.BaseLanguageModule;
import net.sourceforge.pmd.lang.ecmascript.rule.EcmascriptRuleChainVisitor;

/**
 * Created by christoferdutz on 20.09.14.
 */
public class FortranLanguageModule extends BaseLanguageModule {

    public static final String NAME = "Fortran";
    public static final String TERSE_NAME = "fortran";

    public FortranLanguageModule() {
        super(NAME, null, TERSE_NAME, EcmascriptRuleChainVisitor.class, "for", "f", "f66", "f77", "f90");
        addVersion("", null, true);
    }

}
