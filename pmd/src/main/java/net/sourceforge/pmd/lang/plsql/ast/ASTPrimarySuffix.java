/* Generated By:JJTree: Do not edit this line. ASTPrimarySuffix.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.sourceforge.pmd.lang.plsql.ast;

public
class ASTPrimarySuffix extends SimpleNode {
  public ASTPrimarySuffix(int id) {
    super(id);
  }

  public ASTPrimarySuffix(PLSQLParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(PLSQLParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=98bfc2f2a5fec5e786a4389293109709 (do not edit this line) */
