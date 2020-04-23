/*
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.swift.ast;

import org.antlr.v4.runtime.Token;

import net.sourceforge.pmd.lang.ast.impl.antlr4.AntlrNameDictionary;
import net.sourceforge.pmd.lang.ast.impl.antlr4.PmdAntlrTerminalNode;

public class SwiftTerminalNode extends PmdAntlrTerminalNode implements SwiftNode {

    public SwiftTerminalNode(Token t) {
        super(t, SwiftParser.DICO);
    }
}
