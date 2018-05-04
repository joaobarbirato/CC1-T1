package t1;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.atn.ATN;

public class LuaLexer extends Lexer{

    public LuaLexer(ANTLRInputStream input) {
    }

    public String[] getRuleNames() {
        return new String[0];
    }

    public String getGrammarFileName() {
        return null;
    }

    public ATN getATN() {
        return null;
    }
}
