package t1;

import org.antlr.v4.runtime.*;

public class LuaLexer implements TokenSource {
    public LuaLexer(ANTLRInputStream input) {
    }

    public Token nextToken() {
        return null;
    }

    public int getLine() {
        return 0;
    }

    public int getCharPositionInLine() {
        return 0;
    }

    public CharStream getInputStream() {
        return null;
    }

    public String getSourceName() {
        return null;
    }

    public void setTokenFactory(TokenFactory<?> tokenFactory) {

    }

    public TokenFactory<?> getTokenFactory() {
        return null;
    }
}
