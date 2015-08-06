// Autogenerated by metajava.py.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../../templates/Exception.java
package com.rethinkdb;

import com.rethinkdb.ast.RqlAst;
import com.rethinkdb.response.Backtrace;
import java.util.*;

public class ReqlUserError extends ReqlRuntimeError {

    Optional<Backtrace> backtrace = Optional.empty();
    Optional<RqlAst> term = Optional.empty();

    public ReqlUserError() {
    }

    public ReqlUserError(String message) {
        super(message);
    }

    public ReqlUserError(String format, Object... args) {
        super(String.format(format, args));
    }

    public ReqlUserError(String message, Throwable cause) {
        super(message, cause);
    }

    public ReqlUserError(Throwable cause) {
        super(cause);
    }

    public ReqlUserError(String msg, RqlAst term, Backtrace bt) {
        super(msg);
        this.backtrace = Optional.ofNullable(bt);
        this.term = Optional.ofNullable(term);
    }

    public ReqlUserError setBacktrace(Backtrace backtrace) {
        this.backtrace = Optional.ofNullable(backtrace);
        return this;
    }

    public Optional<Backtrace> getBacktrace() {
        return backtrace;
    }

    public ReqlUserError setTerm(RqlAst term) {
        this.term = Optional.ofNullable(term);
        return this;
    }

    public Optional<RqlAst> getTerm() {
        return this.term;
    }
}
