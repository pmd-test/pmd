/* Generated By:JJTree: Do not edit this line. ASTskip2NextTerminator.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.sourceforge.pmd.lang.plsql.ast;

public
class ASTskip2NextTerminator extends SimpleNode {
  public ASTskip2NextTerminator(int id) {
    super(id);
  }

  public ASTskip2NextTerminator(PLSQLParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(PLSQLParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=5a34cbc21bf9e0e7786e4828be615d4d (do not edit this line) */
