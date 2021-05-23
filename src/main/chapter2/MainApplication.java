package main.chapter2;

import java.io.IOException;

public class MainApplication {

    public static void main(String... args) throws IOException {
        final BankStatementAnalyzer2 bankStatementAnalyzer
                = new BankStatementAnalyzer2();

        final BankStatementParser bankStatementParser
                = new BankStatementCSVParser2();

        bankStatementAnalyzer.analyze(args[0], bankStatementParser);
    }
}
